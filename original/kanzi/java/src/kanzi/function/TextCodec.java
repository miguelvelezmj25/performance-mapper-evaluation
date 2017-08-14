/*
Copyright 2011-2017 Frederic Langlet
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
you may obtain a copy of the License at

                http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package kanzi.function;

import kanzi.ByteFunction;
import kanzi.SliceByteArray;


// Simple one-pass text codec. Uses a default (small) static dictionary
// or potentially larger custom one. Generates a dynamic dictionary.
// Encoding: tokenize text into words. If word is in dictionary, emit escape
// and word index (varint encode -> max 3 bytes). Otherwise, emit
// word and add entry in dictionary with word position and length.
// Decoding: If symbol is an escape, read word index (varint decode).
// If current word is not in dictionary, add new entry. Otherwise,
// emit current symbol.
public final class TextCodec implements ByteFunction {
    public static final int LOG_HASHES_SIZE = 24; // 16 MB
    public static final byte ESCAPE_TOKEN1 = (byte) 0x0F; // dictionary word preceded by space symbol
    public static final byte ESCAPE_TOKEN2 = (byte) 0x0E; // toggle upper/lower case of first word char
    private static final int THRESHOLD1 = 128;
    private static final int THRESHOLD2 = THRESHOLD1 * 128;
    private static final int HASH1 = 200002979;
    private static final int HASH2 = 50004239;

    private static final boolean[] DELIMITER_CHARS = initDelimiterChars();
    private static final boolean[] TEXT_CHARS = initTextChars();
    // Default dictionary
    // 1024 of the most common English words with at least 2 chars.
    // Each char is 6 bit encoded: 0 to 31. Add 32 to a letter starting a word (MSB).
    // TheBeAndOfInToHaveItThatFor...
    private static final byte[] DICT_EN_1024 = new byte[]
            {
                    (byte) 0xCC, (byte) 0x71, (byte) 0x21, (byte) 0x12, (byte) 0x03, (byte) 0x43, (byte) 0xB8, (byte) 0x5A,
                    (byte) 0x0D, (byte) 0xCC, (byte) 0xE9, (byte) 0xC0, (byte) 0x54, (byte) 0x4A, (byte) 0x13, (byte) 0xCC,
                    (byte) 0x70, (byte) 0x13, (byte) 0x94, (byte) 0xE4, (byte) 0x78, (byte) 0x39, (byte) 0x49, (byte) 0xC4,
                    (byte) 0xD8, (byte) 0x84, (byte) 0xC7, (byte) 0xB8, (byte) 0xDC, (byte) 0x80, (byte) 0x20, (byte) 0x3C,
                    (byte) 0x80, (byte) 0x62, (byte) 0x04, (byte) 0xE1, (byte) 0x51, (byte) 0x3D, (byte) 0x84, (byte) 0x85,
                    (byte) 0x89, (byte) 0xC0, (byte) 0x0F, (byte) 0x31, (byte) 0xC4, (byte) 0x62, (byte) 0x04, (byte) 0xB6,
                    (byte) 0x39, (byte) 0x42, (byte) 0xC3, (byte) 0xD8, (byte) 0x73, (byte) 0xAE, (byte) 0x46, (byte) 0x20,
                    (byte) 0x0D, (byte) 0xB0, (byte) 0x06, (byte) 0x23, (byte) 0x3B, (byte) 0x31, (byte) 0xC8, (byte) 0x4B,
                    (byte) 0x60, (byte) 0x12, (byte) 0xA1, (byte) 0x2B, (byte) 0x14, (byte) 0x08, (byte) 0x78, (byte) 0x0D,
                    (byte) 0x62, (byte) 0x54, (byte) 0x4E, (byte) 0x32, (byte) 0xD3, (byte) 0x93, (byte) 0xC8, (byte) 0x71,
                    (byte) 0x36, (byte) 0x1C, (byte) 0x04, (byte) 0xF3, (byte) 0x1C, (byte) 0x42, (byte) 0x11, (byte) 0xB8,
                    (byte) 0xB0, (byte) 0xE6, (byte) 0x11, (byte) 0x39, (byte) 0x88, (byte) 0x54, (byte) 0x49, (byte) 0xC0,
                    (byte) 0x4A, (byte) 0x04, (byte) 0x44, (byte) 0x9C, (byte) 0x83, (byte) 0x27, (byte) 0x11, (byte) 0x18,
                    (byte) 0x8E, (byte) 0x30, (byte) 0x4B, (byte) 0x18, (byte) 0xB9, (byte) 0x44, (byte) 0x76, (byte) 0x11,
                    (byte) 0x11, (byte) 0x36, (byte) 0x20, (byte) 0xB2, (byte) 0xF2, (byte) 0x38, (byte) 0xC1, (byte) 0x21,
                    (byte) 0x10, (byte) 0x20, (byte) 0x14, (byte) 0x48, (byte) 0x4C, (byte) 0xC7, (byte) 0x11, (byte) 0x11,
                    (byte) 0x33, (byte) 0x1D, (byte) 0x13, (byte) 0x94, (byte) 0x18, (byte) 0x7C, (byte) 0xC4, (byte) 0x2C,
                    (byte) 0xBD, (byte) 0x87, (byte) 0x10, (byte) 0xDD, (byte) 0x8E, (byte) 0x44, (byte) 0xAC, (byte) 0xC7,
                    (byte) 0x10, (byte) 0xCE, (byte) 0x04, (byte) 0x4F, (byte) 0x43, (byte) 0xEE, (byte) 0x58, (byte) 0xDB,
                    (byte) 0x94, (byte) 0x4E, (byte) 0x83, (byte) 0x53, (byte) 0x3A, (byte) 0x95, (byte) 0x12, (byte) 0x4E,
                    (byte) 0x23, (byte) 0x94, (byte) 0x2C, (byte) 0x3B, (byte) 0x95, (byte) 0x11, (byte) 0x1D, (byte) 0x87,
                    (byte) 0x20, (byte) 0x21, (byte) 0xF3, (byte) 0x1C, (byte) 0x83, (byte) 0x4A, (byte) 0x8C, (byte) 0x06,
                    (byte) 0x36, (byte) 0x01, (byte) 0x8C, (byte) 0xC7, (byte) 0x00, (byte) 0xDA, (byte) 0xC8, (byte) 0x28,
                    (byte) 0x4B, (byte) 0x93, (byte) 0x1C, (byte) 0x44, (byte) 0x67, (byte) 0x39, (byte) 0x6C, (byte) 0xC7,
                    (byte) 0x10, (byte) 0xDA, (byte) 0x13, (byte) 0x4A, (byte) 0xF1, (byte) 0x0E, (byte) 0x3C, (byte) 0xB1,
                    (byte) 0x33, (byte) 0x58, (byte) 0xEB, (byte) 0x0E, (byte) 0x44, (byte) 0x4C, (byte) 0xC7, (byte) 0x11,
                    (byte) 0x21, (byte) 0x21, (byte) 0x10, (byte) 0x43, (byte) 0x6D, (byte) 0x39, (byte) 0x6D, (byte) 0x80,
                    (byte) 0x35, (byte) 0x39, (byte) 0x48, (byte) 0x45, (byte) 0x24, (byte) 0xED, (byte) 0x11, (byte) 0x6D,
                    (byte) 0x12, (byte) 0x13, (byte) 0x21, (byte) 0x04, (byte) 0xCC, (byte) 0x83, (byte) 0x04, (byte) 0xB0,
                    (byte) 0x03, (byte) 0x6C, (byte) 0x00, (byte) 0xD6, (byte) 0x33, (byte) 0x1C, (byte) 0x83, (byte) 0x46,
                    (byte) 0xB0, (byte) 0x02, (byte) 0x84, (byte) 0x9C, (byte) 0x44, (byte) 0x44, (byte) 0xD8, (byte) 0x42,
                    (byte) 0xCB, (byte) 0xB8, (byte) 0xD2, (byte) 0xD8, (byte) 0x9C, (byte) 0x84, (byte) 0xB5, (byte) 0x11,
                    (byte) 0x16, (byte) 0x20, (byte) 0x15, (byte) 0x31, (byte) 0x11, (byte) 0xD8, (byte) 0x84, (byte) 0xC7,
                    (byte) 0x39, (byte) 0x44, (byte) 0xE0, (byte) 0x34, (byte) 0xE4, (byte) 0xC7, (byte) 0x11, (byte) 0x1B,
                    (byte) 0x4E, (byte) 0x80, (byte) 0xB2, (byte) 0xE1, (byte) 0x10, (byte) 0xB2, (byte) 0x04, (byte) 0x54,
                    (byte) 0x48, (byte) 0x44, (byte) 0x14, (byte) 0xE4, (byte) 0x44, (byte) 0xB8, (byte) 0x51, (byte) 0x73,
                    (byte) 0x1C, (byte) 0xE5, (byte) 0x06, (byte) 0x1F, (byte) 0x23, (byte) 0xA0, (byte) 0x18, (byte) 0x02,
                    (byte) 0x0D, (byte) 0x49, (byte) 0x3D, (byte) 0x87, (byte) 0x20, (byte) 0xB1, (byte) 0x2B, (byte) 0x01,
                    (byte) 0x24, (byte) 0xF3, (byte) 0x38, (byte) 0xE8, (byte) 0xCE, (byte) 0x58, (byte) 0xDC, (byte) 0xCE,
                    (byte) 0x0C, (byte) 0x06, (byte) 0x32, (byte) 0x00, (byte) 0xC1, (byte) 0x21, (byte) 0x00, (byte) 0x22,
                    (byte) 0xB3, (byte) 0x00, (byte) 0xA1, (byte) 0x24, (byte) 0x00, (byte) 0x21, (byte) 0xE3, (byte) 0x20,
                    (byte) 0x51, (byte) 0x44, (byte) 0x44, (byte) 0x43, (byte) 0x53, (byte) 0xD8, (byte) 0x71, (byte) 0x11,
                    (byte) 0x12, (byte) 0x11, (byte) 0x13, (byte) 0x58, (byte) 0x41, (byte) 0x0D, (byte) 0xCC, (byte) 0x73,
                    (byte) 0x92, (byte) 0x12, (byte) 0x45, (byte) 0x44, (byte) 0x37, (byte) 0x21, (byte) 0x04, (byte) 0x37,
                    (byte) 0x43, (byte) 0x43, (byte) 0x11, (byte) 0x18, (byte) 0x01, (byte) 0x39, (byte) 0x44, (byte) 0xEE,
                    (byte) 0x34, (byte) 0x48, (byte) 0x0B, (byte) 0x48, (byte) 0xE9, (byte) 0x40, (byte) 0x09, (byte) 0x3B,
                    (byte) 0x14, (byte) 0x49, (byte) 0x38, (byte) 0x02, (byte) 0x4D, (byte) 0x40, (byte) 0x0B, (byte) 0x2D,
                    (byte) 0x8B, (byte) 0xD1, (byte) 0x11, (byte) 0x51, (byte) 0x0D, (byte) 0x4E, (byte) 0x45, (byte) 0xCF,
                    (byte) 0x10, (byte) 0x24, (byte) 0xE2, (byte) 0x38, (byte) 0xD4, (byte) 0xC0, (byte) 0x20, (byte) 0xD8,
                    (byte) 0x8E, (byte) 0x34, (byte) 0x21, (byte) 0x11, (byte) 0x36, (byte) 0xC1, (byte) 0x32, (byte) 0x08,
                    (byte) 0x73, (byte) 0x8E, (byte) 0x2F, (byte) 0x81, (byte) 0x00, (byte) 0x47, (byte) 0x32, (byte) 0x0F,
                    (byte) 0xAC, (byte) 0x00, (byte) 0x63, (byte) 0x50, (byte) 0x49, (byte) 0x15, (byte) 0x11, (byte) 0x1C,
                    (byte) 0xCE, (byte) 0x58, (byte) 0x04, (byte) 0x43, (byte) 0x98, (byte) 0x84, (byte) 0x4B, (byte) 0x94,
                    (byte) 0x84, (byte) 0x4C, (byte) 0x98, (byte) 0xB0, (byte) 0x12, (byte) 0x4A, (byte) 0x60, (byte) 0x12,
                    (byte) 0xA8, (byte) 0x41, (byte) 0x0F, (byte) 0xD8, (byte) 0xE4, (byte) 0x4B, (byte) 0x0F, (byte) 0x24,
                    (byte) 0xC8, (byte) 0x2C, (byte) 0xBD, (byte) 0x84, (byte) 0x35, (byte) 0x3C, (byte) 0x87, (byte) 0x39,
                    (byte) 0x42, (byte) 0xC3, (byte) 0xC8, (byte) 0xF1, (byte) 0x0D, (byte) 0x0F, (byte) 0x24, (byte) 0xC0,
                    (byte) 0x18, (byte) 0x48, (byte) 0xCE, (byte) 0x09, (byte) 0x33, (byte) 0x91, (byte) 0xB0, (byte) 0x81,
                    (byte) 0x87, (byte) 0x4E, (byte) 0x93, (byte) 0x81, (byte) 0x98, (byte) 0xE8, (byte) 0x8E, (byte) 0x35,
                    (byte) 0x32, (byte) 0x0D, (byte) 0x50, (byte) 0x49, (byte) 0x15, (byte) 0x11, (byte) 0x16, (byte) 0x0E,
                    (byte) 0x34, (byte) 0x4B, (byte) 0x44, (byte) 0x54, (byte) 0x44, (byte) 0x60, (byte) 0x35, (byte) 0x25,
                    (byte) 0x84, (byte) 0x46, (byte) 0x51, (byte) 0x16, (byte) 0xB0, (byte) 0x40, (byte) 0x0D, (byte) 0x8C,
                    (byte) 0x81, (byte) 0x45, (byte) 0x11, (byte) 0x11, (byte) 0x0D, (byte) 0x08, (byte) 0x4C, (byte) 0xC4,
                    (byte) 0x34, (byte) 0x3B, (byte) 0x44, (byte) 0x10, (byte) 0x3A, (byte) 0xC4, (byte) 0x01, (byte) 0x51,
                    (byte) 0x33, (byte) 0x45, (byte) 0x8B, (byte) 0x48, (byte) 0x08, (byte) 0x49, (byte) 0xCE, (byte) 0x2C,
                    (byte) 0x3C, (byte) 0x8E, (byte) 0x30, (byte) 0x44, (byte) 0xC7, (byte) 0x20, (byte) 0xD1, (byte) 0xA0,
                    (byte) 0x48, (byte) 0xAD, (byte) 0x80, (byte) 0x44, (byte) 0xCA, (byte) 0xC8, (byte) 0x3E, (byte) 0x23,
                    (byte) 0x95, (byte) 0x11, (byte) 0x1A, (byte) 0x12, (byte) 0x49, (byte) 0x41, (byte) 0x27, (byte) 0x00,
                    (byte) 0xF3, (byte) 0xC4, (byte) 0x37, (byte) 0x35, (byte) 0x11, (byte) 0x36, (byte) 0xB3, (byte) 0x8E,
                    (byte) 0x2B, (byte) 0x25, (byte) 0x11, (byte) 0x12, (byte) 0x32, (byte) 0x12, (byte) 0x08, (byte) 0xE5,
                    (byte) 0x44, (byte) 0x46, (byte) 0x52, (byte) 0x06, (byte) 0x1D, (byte) 0x3B, (byte) 0x00, (byte) 0x0E,
                    (byte) 0x32, (byte) 0x11, (byte) 0x10, (byte) 0x24, (byte) 0xC8, (byte) 0x38, (byte) 0xD8, (byte) 0x06,
                    (byte) 0x44, (byte) 0x41, (byte) 0x32, (byte) 0x38, (byte) 0xC1, (byte) 0x0E, (byte) 0x34, (byte) 0x49,
                    (byte) 0x40, (byte) 0x20, (byte) 0xBC, (byte) 0x44, (byte) 0x48, (byte) 0xF1, (byte) 0x02, (byte) 0x4E,
                    (byte) 0xD3, (byte) 0x93, (byte) 0x20, (byte) 0x21, (byte) 0x22, (byte) 0x1C, (byte) 0xE2, (byte) 0x02,
                    (byte) 0x12, (byte) 0x11, (byte) 0x06, (byte) 0x20, (byte) 0xDC, (byte) 0xC7, (byte) 0x44, (byte) 0x41,
                    (byte) 0x32, (byte) 0x61, (byte) 0x24, (byte) 0xC4, (byte) 0x32, (byte) 0xB1, (byte) 0x15, (byte) 0x10,
                    (byte) 0xB9, (byte) 0x44, (byte) 0x10, (byte) 0xBB, (byte) 0x04, (byte) 0x11, (byte) 0x38, (byte) 0x8E,
                    (byte) 0x30, (byte) 0xF0, (byte) 0x0D, (byte) 0x62, (byte) 0x13, (byte) 0x97, (byte) 0xC8, (byte) 0x73,
                    (byte) 0x96, (byte) 0xBC, (byte) 0xB0, (byte) 0x18, (byte) 0xAC, (byte) 0x85, (byte) 0x44, (byte) 0xAC,
                    (byte) 0x44, (byte) 0xD3, (byte) 0x11, (byte) 0x19, (byte) 0x06, (byte) 0x1A, (byte) 0xD5, (byte) 0x0C,
                    (byte) 0x04, (byte) 0x44, (byte) 0x6E, (byte) 0x3C, (byte) 0x43, (byte) 0x6F, (byte) 0x44, (byte) 0xE0,
                    (byte) 0x4B, (byte) 0x10, (byte) 0xC9, (byte) 0x40, (byte) 0x4E, (byte) 0x70, (byte) 0x0D, (byte) 0x0E,
                    (byte) 0xC1, (byte) 0x00, (byte) 0x49, (byte) 0x44, (byte) 0x44, (byte) 0xC1, (byte) 0x41, (byte) 0x12,
                    (byte) 0x4C, (byte) 0x83, (byte) 0x8D, (byte) 0x88, (byte) 0x02, (byte) 0xCB, (byte) 0xC4, (byte) 0x43,
                    (byte) 0x04, (byte) 0x30, (byte) 0x11, (byte) 0x11, (byte) 0x88, (byte) 0x44, (byte) 0x53, (byte) 0x00,
                    (byte) 0x83, (byte) 0x6F, (byte) 0x51, (byte) 0x3B, (byte) 0x44, (byte) 0x5D, (byte) 0x38, (byte) 0x87,
                    (byte) 0x00, (byte) 0x84, (byte) 0x72, (byte) 0x4C, (byte) 0x04, (byte) 0x53, (byte) 0xC5, (byte) 0x43,
                    (byte) 0x71, (byte) 0x00, (byte) 0x84, (byte) 0x84, (byte) 0x98, (byte) 0xE0, (byte) 0x0B, (byte) 0xC4,
                    (byte) 0x40, (byte) 0x0B, (byte) 0x2D, (byte) 0x89, (byte) 0xCE, (byte) 0x30, (byte) 0x4C, (byte) 0xC4,
                    (byte) 0x02, (byte) 0x20, (byte) 0x0D, (byte) 0x0C, (byte) 0x80, (byte) 0xC0, (byte) 0x4C, (byte) 0x4B,
                    (byte) 0x0E, (byte) 0x34, (byte) 0x46, (byte) 0x21, (byte) 0x51, (byte) 0x22, (byte) 0x0D, (byte) 0x11,
                    (byte) 0x24, (byte) 0xB8, (byte) 0x39, (byte) 0x43, (byte) 0x46, (byte) 0x98, (byte) 0xE3, (byte) 0x83,
                    (byte) 0x88, (byte) 0xE5, (byte) 0x11, (byte) 0x4E, (byte) 0x52, (byte) 0x0D, (byte) 0x0E, (byte) 0xA3,
                    (byte) 0x4E, (byte) 0x5A, (byte) 0xA2, (byte) 0x0D, (byte) 0x0E, (byte) 0x71, (byte) 0x0B, (byte) 0x3E,
                    (byte) 0xD2, (byte) 0x06, (byte) 0x1D, (byte) 0x38, (byte) 0x87, (byte) 0x20, (byte) 0xB0, (byte) 0xEB,
                    (byte) 0x39, (byte) 0x3E, (byte) 0x0E, (byte) 0x51, (byte) 0x1D, (byte) 0x12, (byte) 0x91, (byte) 0x81,
                    (byte) 0x38, (byte) 0x11, (byte) 0x2D, (byte) 0x8E, (byte) 0x44, (byte) 0x38, (byte) 0x48, (byte) 0x4F,
                    (byte) 0x50, (byte) 0x0D, (byte) 0xB0, (byte) 0xE3, (byte) 0x53, (byte) 0x1E, (byte) 0x70, (byte) 0x0B,
                    (byte) 0x16, (byte) 0xB3, (byte) 0x96, (byte) 0xB0, (byte) 0x82, (byte) 0xCB, (byte) 0x20, (byte) 0xE3,
                    (byte) 0x67, (byte) 0x20, (byte) 0x61, (byte) 0xEE, (byte) 0x44, (byte) 0x60, (byte) 0x0D, (byte) 0x21,
                    (byte) 0x90, (byte) 0x13, (byte) 0x20, (byte) 0xE3, (byte) 0x71, (byte) 0x10, (byte) 0x39, (byte) 0x91,
                    (byte) 0x10, (byte) 0x43, (byte) 0x61, (byte) 0x2D, (byte) 0x41, (byte) 0x36, (byte) 0x1C, (byte) 0x84,
                    (byte) 0xC4, (byte) 0x84, (byte) 0xB0, (byte) 0x02, (byte) 0x2B, (byte) 0x83, (byte) 0x94, (byte) 0x45,
                    (byte) 0x21, (byte) 0x0B, (byte) 0x16, (byte) 0x42, (byte) 0x06, (byte) 0x1D, (byte) 0x38, (byte) 0x4E,
                    (byte) 0x4C, (byte) 0x7A, (byte) 0xC8, (byte) 0x4D, (byte) 0x32, (byte) 0xC4, (byte) 0x9C, (byte) 0xE5,
                    (byte) 0x12, (byte) 0x12, (byte) 0xB1, (byte) 0x13, (byte) 0x8C, (byte) 0x44, (byte) 0x8F, (byte) 0x21,
                    (byte) 0x31, (byte) 0x2F, (byte) 0x44, (byte) 0xE5, (byte) 0x48, (byte) 0x0C, (byte) 0x4C, (byte) 0x84,
                    (byte) 0x45, (byte) 0x52, (byte) 0x02, (byte) 0x12, (byte) 0x72, (byte) 0x0C, (byte) 0x48, (byte) 0x42,
                    (byte) 0xC5, (byte) 0x95, (byte) 0x12, (byte) 0x04, (byte) 0x34, (byte) 0x38, (byte) 0xC4, (byte) 0x48,
                    (byte) 0x24, (byte) 0x48, (byte) 0x04, (byte) 0x49, (byte) 0x40, (byte) 0x4C, (byte) 0x71, (byte) 0x11,
                    (byte) 0x8C, (byte) 0x45, (byte) 0x44, (byte) 0x2C, (byte) 0xE3, (byte) 0xCC, (byte) 0x10, (byte) 0xD4,
                    (byte) 0xE0, (byte) 0x58, (byte) 0x06, (byte) 0x2A, (byte) 0x20, (byte) 0xB2, (byte) 0xF3, (byte) 0x44,
                    (byte) 0x83, (byte) 0xE7, (byte) 0x39, (byte) 0x44, (byte) 0x66, (byte) 0x00, (byte) 0xC1, (byte) 0x2E,
                    (byte) 0x15, (byte) 0x31, (byte) 0x0D, (byte) 0xBC, (byte) 0xB0, (byte) 0x0D, (byte) 0x4E, (byte) 0xF2,
                    (byte) 0xC0, (byte) 0x08, (byte) 0x49, (byte) 0x0D, (byte) 0x0E, (byte) 0x03, (byte) 0x0E, (byte) 0x34,
                    (byte) 0x6C, (byte) 0x88, (byte) 0x34, (byte) 0x21, (byte) 0x32, (byte) 0x4C, (byte) 0x03, (byte) 0x43,
                    (byte) 0x8C, (byte) 0x44, (byte) 0x88, (byte) 0x18, (byte) 0xDB, (byte) 0xC0, (byte) 0x45, (byte) 0x32,
                    (byte) 0x02, (byte) 0x50, (byte) 0xB0, (byte) 0x11, (byte) 0xC9, (byte) 0x40, (byte) 0xC3, (byte) 0x10,
                    (byte) 0xD2, (byte) 0xD8, (byte) 0xB0, (byte) 0x43, (byte) 0x01, (byte) 0x11, (byte) 0x1B, (byte) 0xC0,
                    (byte) 0x62, (byte) 0xB0, (byte) 0x16, (byte) 0x84, (byte) 0xE3, (byte) 0x8A, (byte) 0xC8, (byte) 0x82,
                    (byte) 0xC4, (byte) 0x34, (byte) 0x21, (byte) 0x20, (byte) 0x2C, (byte) 0xC3, (byte) 0x92, (byte) 0x4E,
                    (byte) 0x83, (byte) 0x42, (byte) 0x2D, (byte) 0x40, (byte) 0xC4, (byte) 0x80, (byte) 0x60, (byte) 0x08,
                    (byte) 0x36, (byte) 0x42, (byte) 0x13, (byte) 0x1C, (byte) 0x44, (byte) 0x73, (byte) 0x38, (byte) 0xE2,
                    (byte) 0xE5, (byte) 0x21, (byte) 0x51, (byte) 0x2E, (byte) 0x34, (byte) 0x21, (byte) 0x2B, (byte) 0x10,
                    (byte) 0x04, (byte) 0x93, (byte) 0x91, (byte) 0x73, (byte) 0xCB, (byte) 0x00, (byte) 0x83, (byte) 0x68,
                    (byte) 0x0C, (byte) 0x43, (byte) 0x53, (byte) 0x20, (byte) 0x56, (byte) 0x34, (byte) 0x35, (byte) 0x32,
                    (byte) 0x0B, (byte) 0xC8, (byte) 0x84, (byte) 0xC4, (byte) 0xB0, (byte) 0x83, (byte) 0x54, (byte) 0x4C,
                    (byte) 0x48, (byte) 0x8E, (byte) 0x50, (byte) 0xF2, (byte) 0xC4, (byte) 0xD8, (byte) 0x41, (byte) 0x0A,
                    (byte) 0xB0, (byte) 0x04, (byte) 0xD3, (byte) 0x11, (byte) 0x18, (byte) 0x51, (byte) 0x20, (byte) 0xD1,
                    (byte) 0xA3, (byte) 0x11, (byte) 0x30, (byte) 0x08, (byte) 0x2E, (byte) 0x83, (byte) 0x45, (byte) 0x39,
                    (byte) 0x13, (byte) 0x00, (byte) 0x4C, (byte) 0x83, (byte) 0x8D, (byte) 0xB4, (byte) 0xE4, (byte) 0xC7,
                    (byte) 0x20, (byte) 0xD1, (byte) 0xA0, (byte) 0x35, (byte) 0x84, (byte) 0xC7, (byte) 0x20, (byte) 0xD1,
                    (byte) 0xA4, (byte) 0x54, (byte) 0x44, (byte) 0x58, (byte) 0x4C, (byte) 0x72, (byte) 0x0D, (byte) 0x1A,
                    (byte) 0x01, (byte) 0x8E, (byte) 0xAC, (byte) 0x40, (byte) 0x03, (byte) 0xC8, (byte) 0xE3, (byte) 0x04,
                    (byte) 0x4C, (byte) 0x83, (byte) 0x04, (byte) 0x4B, (byte) 0x43, (byte) 0x43, (byte) 0x11, (byte) 0x14,
                    (byte) 0x93, (byte) 0x00, (byte) 0xD0, (byte) 0xF6, (byte) 0x1C, (byte) 0x44, (byte) 0xC7, (byte) 0x11,
                    (byte) 0x1B, (byte) 0x40, (byte) 0x4D, (byte) 0x44, (byte) 0x44, (byte) 0xCC, (byte) 0xE1, (byte) 0x84,
                    (byte) 0x4C, (byte) 0x71, (byte) 0x11, (byte) 0x94, (byte) 0xE2, (byte) 0xCB, (byte) 0x39, (byte) 0x6B,
                    (byte) 0xC0, (byte) 0x44, (byte) 0x43, (byte) 0x53, (byte) 0xC9, (byte) 0x33, (byte) 0x8F, (byte) 0xA0,
                    (byte) 0xD0, (byte) 0xC4, (byte) 0x10, (byte) 0x38, (byte) 0xC8, (byte) 0x14, (byte) 0x52, (byte) 0x02,
                    (byte) 0x50, (byte) 0xB4, (byte) 0xEF, (byte) 0x50, (byte) 0x12, (byte) 0xC8, (byte) 0x0A, (byte) 0x02,
                    (byte) 0xD1, (byte) 0x10, (byte) 0x00, (byte) 0xD8, (byte) 0xC8, (byte) 0xF1, (byte) 0x00, (byte) 0x2A,
                    (byte) 0xC0, (byte) 0x08, (byte) 0x35, (byte) 0x30, (byte) 0x08, (byte) 0x37, (byte) 0x11, (byte) 0x0C,
                    (byte) 0x00, (byte) 0x83, (byte) 0x67, (byte) 0x10, (byte) 0x04, (byte) 0x60, (byte) 0x2C, (byte) 0xB3,
                    (byte) 0x96, (byte) 0xB0, (byte) 0x40, (byte) 0xC8, (byte) 0x02, (byte) 0xE1, (byte) 0x45, (byte) 0x20,
                    (byte) 0x21, (byte) 0x21, (byte) 0x10, (byte) 0xD1, (byte) 0x05, (byte) 0x21, (byte) 0x38, (byte) 0xCE,
                    (byte) 0x39, (byte) 0x19, (byte) 0xD4, (byte) 0x1A, (byte) 0xF1, (byte) 0x11, (byte) 0x48, (byte) 0xE3,
                    (byte) 0x6B, (byte) 0x01, (byte) 0x31, (byte) 0x11, (byte) 0x8D, (byte) 0x44, (byte) 0x48, (byte) 0x34,
                    (byte) 0x6D, (byte) 0x80, (byte) 0x46, (byte) 0x72, (byte) 0x12, (byte) 0x4C, (byte) 0xE4, (byte) 0x58,
                    (byte) 0x81, (byte) 0x11, (byte) 0x94, (byte) 0x13, (byte) 0x62, (byte) 0x13, (byte) 0x1C, (byte) 0x83,
                    (byte) 0x72, (byte) 0x11, (byte) 0x38, (byte) 0x11, (byte) 0x4C, (byte) 0x80, (byte) 0x8B, (byte) 0x13,
                    (byte) 0x24, (byte) 0xC0, (byte) 0x4C, (byte) 0x83, (byte) 0x8D, (byte) 0xB0, (byte) 0xE4, (byte) 0x4D,
                    (byte) 0x20, (byte) 0xD1, (byte) 0xB6, (byte) 0x00, (byte) 0xB2, (byte) 0xA4, (byte) 0x54, (byte) 0x43,
                    (byte) 0x53, (byte) 0xD8, (byte) 0x83, (byte) 0x62, (byte) 0x1C, (byte) 0xE3, (byte) 0x92, (byte) 0x12,
                    (byte) 0x11, (byte) 0x07, (byte) 0x01, (byte) 0x52, (byte) 0x0E, (byte) 0x47, (byte) 0x21, (byte) 0xCE,
                    (byte) 0x39, (byte) 0x39, (byte) 0x48, (byte) 0x44, (byte) 0x49, (byte) 0x4E, (byte) 0x38, (byte) 0x3C,
                    (byte) 0xC8, (byte) 0x4C, (byte) 0xB1, (byte) 0x20, (byte) 0x44, (byte) 0xE5, (byte) 0x0D, (byte) 0x0E,
                    (byte) 0x02, (byte) 0x11, (byte) 0xCC, (byte) 0x40, (byte) 0x02, (byte) 0x1C, (byte) 0x44, (byte) 0x66,
                    (byte) 0x00, (byte) 0xFC, (byte) 0x94, (byte) 0x04, (byte) 0x91, (byte) 0x02, (byte) 0x4E, (byte) 0x43,
                    (byte) 0x4E, (byte) 0x50, (byte) 0x61, (byte) 0xEF, (byte) 0x44, (byte) 0xE5, (byte) 0x44, (byte) 0x80,
                    (byte) 0x24, (byte) 0x4E, (byte) 0x49, (byte) 0x28, (byte) 0x0B, (byte) 0x4C, (byte) 0x73, (byte) 0x94,
                    (byte) 0x18, (byte) 0x79, (byte) 0xC4, (byte) 0x00, (byte) 0x39, (byte) 0x4E, (byte) 0x39, (byte) 0x3C,
                    (byte) 0x84, (byte) 0x08, (byte) 0xE3, (byte) 0x43, (byte) 0x84, (byte) 0xE6, (byte) 0x2C, (byte) 0x00,
                    (byte) 0x83, (byte) 0x6B, (byte) 0x20, (byte) 0x48, (byte) 0x01, (byte) 0x2C, (byte) 0x48, (byte) 0x88,
                    (byte) 0x54, (byte) 0x82, (byte) 0xF3, (byte) 0x00, (byte) 0x12, (byte) 0xC4, (byte) 0xAC, (byte) 0xE5,
                    (byte) 0x44, (byte) 0xBD, (byte) 0x13, (byte) 0x82, (byte) 0x11, (byte) 0x24, (byte) 0xAE, (byte) 0x14,
                    (byte) 0x51, (byte) 0x11, (byte) 0xC9, (byte) 0x35, (byte) 0x03, (byte) 0x10, (byte) 0xD4, (byte) 0xE2,
                    (byte) 0x38, (byte) 0xD4, (byte) 0x88, (byte) 0x0C, (byte) 0x44, (byte) 0x60, (byte) 0x3C, (byte) 0xF1,
                    (byte) 0x00, (byte) 0x47, (byte) 0x24, (byte) 0xD4, (byte) 0x0D, (byte) 0x88, (byte) 0x54, (byte) 0x62,
                    (byte) 0xD1, (byte) 0x00, (byte) 0x44, (byte) 0xB6, (byte) 0x27, (byte) 0x50, (byte) 0xC0, (byte) 0x0D,
                    (byte) 0x91, (byte) 0x52, (byte) 0x03, (byte) 0x10, (byte) 0xD0, (byte) 0x84, (byte) 0xCC, (byte) 0x45,
                    (byte) 0xD3, (byte) 0xB0, (byte) 0x44, (byte) 0xC7, (byte) 0x38, (byte) 0x3A, (byte) 0x0D, (byte) 0x08,
                    (byte) 0xB5, (byte) 0x03, (byte) 0x20, (byte) 0xD1, (byte) 0xB2, (byte) 0x10, (byte) 0xD0, (byte) 0xF1,
                    (byte) 0x10, (byte) 0x02, (byte) 0xC8, (byte) 0x64, (byte) 0x4C, (byte) 0x84, (byte) 0x35, (byte) 0x21,
                    (byte) 0x21, (byte) 0x50, (byte) 0x82, (byte) 0xC3, (byte) 0x88, (byte) 0xE3, (byte) 0x53, (byte) 0x44,
                    (byte) 0xE2, (byte) 0xE0, (byte) 0x50, (byte) 0x32, (byte) 0x04, (byte) 0x34, (byte) 0x21, (byte) 0x32,
                    (byte) 0x11, (byte) 0x51, (byte) 0x11, (byte) 0x00, (byte) 0xB8, (byte) 0x94, (byte) 0x4E, (byte) 0x23,
                    (byte) 0x8B, (byte) 0x2C, (byte) 0x41, (byte) 0x84, (byte) 0xA0, (byte) 0xD4, (byte) 0xC4, (byte) 0x44,
                    (byte) 0x44, (byte) 0x93, (byte) 0xC9, (byte) 0x40, (byte) 0x82, (byte) 0x11, (byte) 0x24, (byte) 0xB2,
                    (byte) 0x3C, (byte) 0x40, (byte) 0x88, (byte) 0x00, (byte) 0xBC, (byte) 0x48, (byte) 0x48, (byte) 0xA9,
                    (byte) 0x17, (byte) 0x3C, (byte) 0x44, (byte) 0x48, (byte) 0x10, (byte) 0xD0, (byte) 0x84, (byte) 0x84,
                    (byte) 0x41, (byte) 0xC8, (byte) 0x34, (byte) 0x38, (byte) 0x44, (byte) 0x4D, (byte) 0x31, (byte) 0x11,
                    (byte) 0xC4, (byte) 0x44, (byte) 0x94, (byte) 0x2D, (byte) 0x3C, (byte) 0xD1, (byte) 0x10, (byte) 0x04,
                    (byte) 0xF2, (byte) 0x21, (byte) 0x7C, (byte) 0x44, (byte) 0x2C, (byte) 0x04, (byte) 0xC8, (byte) 0x38,
                    (byte) 0xD4, (byte) 0x87, (byte) 0x20, (byte) 0xF8, (byte) 0x0D, (byte) 0x20, (byte) 0xC0, (byte) 0x0B,
                    (byte) 0xA0, (byte) 0xC3, (byte) 0xD1, (byte) 0x39, (byte) 0x51, (byte) 0x27, (byte) 0x00, (byte) 0x84,
                    (byte) 0x72, (byte) 0x4C, (byte) 0x06, (byte) 0x33, (byte) 0x38, (byte) 0xFC, (byte) 0x44, (byte) 0x0D,
                    (byte) 0x40, (byte) 0x84, (byte) 0xBC, (byte) 0x44, (byte) 0x47, (byte) 0x00, (byte) 0xF4, (byte) 0xAB,
                    (byte) 0x01, (byte) 0x31, (byte) 0x36, (byte) 0x44, (byte) 0x84, (byte) 0xC4, (byte) 0x46, (byte) 0xF2,
                    (byte) 0x02, (byte) 0x2A, (byte) 0x42, (byte) 0xD2, (byte) 0x13, (byte) 0x22, (byte) 0x06, (byte) 0x34,
                    (byte) 0x81, (byte) 0x48, (byte) 0x08, (byte) 0x03, (byte) 0x53, (byte) 0x88, (byte) 0x70, (byte) 0x0D,
                    (byte) 0x08, (byte) 0x49, (byte) 0xCE, (byte) 0x4C, (byte) 0x42, (byte) 0xE6, (byte) 0x10, (byte) 0xD1,
                    (byte) 0x11, (byte) 0x00, (byte) 0xBC, (byte) 0x4E, (byte) 0x08, (byte) 0xAC, (byte) 0x44, (byte) 0x41,
                    (byte) 0x42, (byte) 0x11, (byte) 0x12, (byte) 0x02, (byte) 0xCE, (byte) 0x34, (byte) 0x69, (byte) 0x48,
                    (byte) 0x4F, (byte) 0x31, (byte) 0xC4, (byte) 0x31, (byte) 0x21, (byte) 0x0B, (byte) 0x54, (byte) 0x44,
                    (byte) 0xB1, (byte) 0x10, (byte) 0xF3, (byte) 0x91, (byte) 0x4E, (byte) 0x23, (byte) 0x8D, (byte) 0x0C,
                    (byte) 0x84, (byte) 0xC8, (byte) 0x38, (byte) 0xDC, (byte) 0x44, (byte) 0x00, (byte) 0x21, (byte) 0xF3,
                    (byte) 0x45, (byte) 0x44, (byte) 0xC7, (byte) 0x90, (byte) 0x51, (byte) 0x4E, (byte) 0x45, (byte) 0x38,
                    (byte) 0xC4, (byte) 0x08, (byte) 0x80, (byte) 0xC4, (byte) 0xC4, (byte) 0x04, (byte) 0xC4, (byte) 0x90,
                    (byte) 0x35, (byte) 0x02, (byte) 0x01, (byte) 0x32, (byte) 0x0E, (byte) 0x36, (byte) 0x53, (byte) 0x91,
                    (byte) 0x08, (byte) 0x49, (byte) 0x80, (byte) 0x44, (byte) 0x31, (byte) 0x0D, (byte) 0x8D, (byte) 0x15,
                    (byte) 0x06, (byte) 0xAC, (byte) 0x40, (byte) 0x03, (byte) 0x11, (byte) 0x1D, (byte) 0x4E, (byte) 0x20,
                    (byte) 0x21, (byte) 0x30, (byte) 0x50, (byte) 0x84, (byte) 0xC4, (byte) 0xD8, (byte) 0x73, (byte) 0x8B,
                    (byte) 0x13, (byte) 0x21, (byte) 0x04, (byte) 0x32, (byte) 0xC2, (byte) 0x0D, (byte) 0x0E, (byte) 0x52,
                    (byte) 0x0D, (byte) 0x00, (byte) 0xB2, (byte) 0xD8, (byte) 0xC8, (byte) 0x84, (byte) 0x71, (byte) 0x11,
                    (byte) 0x35, (byte) 0x11, (byte) 0x36, (byte) 0x54, (byte) 0x44, (byte) 0x13, (byte) 0x24, (byte) 0xCE,
                    (byte) 0x45, (byte) 0x8C, (byte) 0x44, (byte) 0x48, (byte) 0xF3, (byte) 0x8D, (byte) 0x0E, (byte) 0xF5,
                    (byte) 0x12, (byte) 0x1E, (byte) 0x00, (byte) 0x82, (byte) 0x39, (byte) 0x10, (byte) 0xC8, (byte) 0x34,
                    (byte) 0x68, (byte) 0x51, (byte) 0x39, (byte) 0x31, (byte) 0xC4, (byte) 0x46, (byte) 0xB1, (byte) 0x00,
                    (byte) 0x44, (byte) 0xDC, (byte) 0x8E, (byte) 0x36, (byte) 0x73, (byte) 0x8F, (byte) 0x12, (byte) 0x31,
                    (byte) 0x15, (byte) 0x10, (byte) 0xB3, (byte) 0x8F, (byte) 0x94, (byte) 0x41, (byte) 0x0B, (byte) 0x20,
                    (byte) 0xD1, (byte) 0xB1, (byte) 0x10, (byte) 0x00, (byte) 0xE2, (byte) 0x01, (byte) 0x14, (byte) 0x58,
                    (byte) 0x8C, (byte) 0x84, (byte) 0x84, (byte) 0x01, (byte) 0x21, (byte) 0x31, (byte) 0x38, (byte) 0x00,
                    (byte) 0xF5, (byte) 0x01, (byte) 0x12, (byte) 0x0E, (byte) 0x51, (byte) 0x28, (byte) 0x40, (byte) 0x2C,
                    (byte) 0xB8, (byte) 0x80, (byte) 0x48, (byte) 0x4B, (byte) 0x8F, (byte) 0x11, (byte) 0x10, (byte) 0x13,
                    (byte) 0x20, (byte) 0xE3, (byte) 0x62, (byte) 0x2C, (byte) 0xE4, (byte) 0x84, (byte) 0xD4, (byte) 0x84,
                    (byte) 0x88, (byte) 0x4F, (byte) 0x11, (byte) 0x02, (byte) 0x10, (byte) 0x85, (byte) 0x44, (byte) 0x85,
                    (byte) 0x42, (byte) 0x0B, (byte) 0x0C, (byte) 0x83, (byte) 0x46, (byte) 0xD4, (byte) 0x02, (byte) 0xD4,
                    (byte) 0x13, (byte) 0x11, (byte) 0x12, (byte) 0x10, (byte) 0x04, (byte) 0x42, (byte) 0x1E, (byte) 0x55,
                    (byte) 0x0B, (byte) 0x2E, (byte) 0xC3, (byte) 0x83, (byte) 0x10, (byte) 0xBA, (byte) 0x4E, (byte) 0x20,
                    (byte) 0xDC, (byte) 0x84, (byte) 0x01, (byte) 0x23, (byte) 0x8D, (byte) 0xCC, (byte) 0x05, (byte) 0xE3,
                    (byte) 0x21, (byte) 0x11, (byte) 0x02, (byte) 0x4C, (byte) 0xE4, (byte) 0x6F, (byte) 0x39, (byte) 0x22,
                    (byte) 0x13, (byte) 0x20, (byte) 0xE3, (byte) 0x6F, (byte) 0x2C, (byte) 0x06, (byte) 0x04, (byte) 0x47,
                    (byte) 0x23, (byte) 0xCE, (byte) 0x45, (byte) 0x39, (byte) 0x11, (byte) 0x44, (byte) 0xE4, (byte) 0x71,
                    (byte) 0x10, (byte) 0x23, (byte) 0x91, (byte) 0x0F, (byte) 0x13, (byte) 0x96, (byte) 0x8C, (byte) 0x04,
                    (byte) 0xC0, (byte) 0xBC, (byte) 0x03, (byte) 0xC4, (byte) 0x47, (byte) 0x31, (byte) 0xC4, (byte) 0x39,
                    (byte) 0x16, (byte) 0x32, (byte) 0x3C, (byte) 0x00, (byte) 0x84, (byte) 0x91, (byte) 0x51, (byte) 0x11,
                    (byte) 0x62, (byte) 0x53, (byte) 0x91, (byte) 0x33, (byte) 0x25, (byte) 0x0F, (byte) 0x3C, (byte) 0xE4,
                    (byte) 0x53, (byte) 0x80, (byte) 0x24, (byte) 0xC8, (byte) 0x38, (byte) 0xDB, (byte) 0x85, (byte) 0x14,
                    (byte) 0x80, (byte) 0x88, (byte) 0x00, (byte) 0xBD, (byte) 0x87, (byte) 0x39, (byte) 0x21, (byte) 0x28,
                    (byte) 0x0C, (byte) 0x40, (byte) 0x27, (byte) 0x00, (byte) 0xF3, (byte) 0xD8, (byte) 0x9C, (byte) 0x40,
                    (byte) 0x11, (byte) 0x4E, (byte) 0x11, (byte) 0x12, (byte) 0x4F, (byte) 0x31, (byte) 0x00, (byte) 0x32,
                    (byte) 0xF4, (byte) 0x4E, (byte) 0x24, (byte) 0x40, (byte) 0x93, (byte) 0x9C, (byte) 0x84, (byte) 0xE1,
                    (byte) 0x01, (byte) 0x21, (byte) 0x31, (byte) 0x10, (byte) 0xF4, (byte) 0x44, (byte) 0x48, (byte) 0x43,
                    (byte) 0x53, (byte) 0xCC, (byte) 0xE5, (byte) 0x8D, (byte) 0xBD, (byte) 0x42, (byte) 0xCB, (byte) 0x85,
                    (byte) 0x44, (byte) 0xAC, (byte) 0x00, (byte) 0xF8, (byte) 0xD1, (byte) 0x62, (byte) 0xC3, (byte) 0x8C,
                    (byte) 0x88, (byte) 0x04, (byte) 0xE3, (byte) 0x00, (byte) 0x3C, (byte) 0x4E, (byte) 0x38, (byte) 0xCC,
                    (byte) 0x8C, (byte) 0x20, (byte) 0xB1, (byte) 0x25, (byte) 0x20, (byte) 0x42, (byte) 0xC3, (byte) 0xA0,
                    (byte) 0xC3, (byte) 0xC0, (byte) 0x09, (byte) 0x39, (byte) 0x54, (byte) 0x34, (byte) 0x3A, (byte) 0xC0,
                    (byte) 0x44, (byte) 0x61, (byte) 0x23, (byte) 0x38, (byte) 0x69, (byte) 0xD4, (byte) 0x18, (byte) 0x4B,
                    (byte) 0xD1, (byte) 0x10, (byte) 0xF0, (byte) 0x11, (byte) 0x12, (byte) 0x43, (byte) 0x55, (byte) 0x21,
                    (byte) 0x13, (byte) 0x8D, (byte) 0x30, (byte) 0x43, (byte) 0x53, (byte) 0x00, (byte) 0xBB, (byte) 0xD1,
                    (byte) 0x38, (byte) 0x35, (byte) 0x02, (byte) 0x12, (byte) 0x71, (byte) 0x11, (byte) 0x48, (byte) 0x42,
                    (byte) 0xC5, (byte) 0xCC, (byte) 0x40, (byte) 0x02, (byte) 0x1E, (byte) 0xE2, (byte) 0x0B, (byte) 0xC9,
                    (byte) 0x40, (byte) 0x87, (byte) 0xC8, (byte) 0x84, (byte) 0xD4, (byte) 0x01, (byte) 0x32, (byte) 0x0E,
                    (byte) 0x37, (byte) 0x32, (byte) 0x04, (byte) 0x88, (byte) 0xE4, (byte) 0x93, (byte) 0xA0, (byte) 0xD0,
                    (byte) 0xD4, (byte) 0x49, (byte) 0x34, (byte) 0x58, (byte) 0xC8, (byte) 0xA2, (byte) 0x0D, (byte) 0xC9,
                    (byte) 0x34, (byte) 0x44, (byte) 0x11, (byte) 0x3A, (byte) 0x0C, (byte) 0x00, (byte) 0x61, (byte) 0x28,
                    (byte) 0x4D, (byte) 0x21, (byte) 0x0B, (byte) 0x16, (byte) 0xF1, (byte) 0xCE, (byte) 0x34, (byte) 0x4B,
                    (byte) 0xD1, (byte) 0x20, (byte) 0x21, (byte) 0x36, (byte) 0x10, (byte) 0x04, (byte) 0x6C, (byte) 0x39,
                    (byte) 0x24, (byte) 0xF2, (byte) 0x50, (byte) 0xDC, (byte) 0x8E, (byte) 0x38, (byte) 0xD8, (byte) 0x8B,
                    (byte) 0x10, (byte) 0x04, (byte) 0x6F, (byte) 0x44, (byte) 0x00, (byte) 0x93, (byte) 0x20, (byte) 0x21,
                    (byte) 0x2F, (byte) 0x20, (byte) 0x40, (byte) 0x84, (byte) 0xD8, (byte) 0x02, (byte) 0x13, (byte) 0xC4,
                    (byte) 0x40, (byte) 0x84, (byte) 0x35, (byte) 0x3A, (byte) 0x0C, (byte) 0x3C, (byte) 0xE4, (byte) 0x53,
                    (byte) 0x00, (byte) 0xD4, (byte) 0xEF, (byte) 0x44, (byte) 0xE0, (byte) 0xD4, (byte) 0x09, (byte) 0x3A,
                    (byte) 0xC4, (byte) 0x15, (byte) 0x3D, (byte) 0x80, (byte) 0x2C, (byte) 0xBC, (byte) 0x84, (byte) 0x44,
                    (byte) 0x81, (byte) 0x12, (byte) 0xB4, (byte) 0x45, (byte) 0x92, (byte) 0xC8, (byte) 0x70, (byte) 0x11,
                    (byte) 0x12, (byte) 0xC3, (byte) 0x95, (byte) 0x20, (byte) 0x4A, (byte) 0x88, (byte) 0x0E, (byte) 0xD3,
                    (byte) 0x91, (byte) 0xC8, (byte) 0x83, (byte) 0x0F, (byte) 0x2D, (byte) 0x8D, (byte) 0x88, (byte) 0x14,
                    (byte) 0x4B, (byte) 0x8D, (byte) 0x4C, (byte) 0xE8, (byte) 0x80, (byte) 0x4C, (byte) 0x21, (byte) 0xEC,
                    (byte) 0x61, (byte) 0x21, (byte) 0x0B, (byte) 0x16, (byte) 0x52, (byte) 0x0D, (byte) 0x12, (byte) 0x23,
                    (byte) 0x8C, (byte) 0x3D, (byte) 0x44, (byte) 0xC4, (byte) 0x47, (byte) 0x23, (byte) 0x8D, (byte) 0x1A,
                    (byte) 0x04, (byte) 0xD3, (byte) 0x10, (byte) 0xD4, (byte) 0xC8, (byte) 0x38, (byte) 0xD8, (byte) 0xD1,
                    (byte) 0x01, (byte) 0x69, (byte) 0x48, (byte) 0x2C, (byte) 0xCC, (byte) 0x44, (byte) 0x3D, (byte) 0x40,
                    (byte) 0x4B, (byte) 0x20, (byte) 0x20, (byte) 0x0D, (byte) 0xC8, (byte) 0x40, (byte) 0x94, (byte) 0x44,
                    (byte) 0x84, (byte) 0xD8, (byte) 0xC8, (byte) 0x23, (byte) 0x91, (byte) 0x13, (byte) 0x31, (byte) 0x12,
                    (byte) 0x4F, (byte) 0x24, (byte) 0xCE, (byte) 0x08, (byte) 0xAB, (byte) 0xCE, (byte) 0x48, (byte) 0x84,
                    (byte) 0xC8, (byte) 0x54, (byte) 0x48, (byte) 0x80, (byte) 0x51, (byte) 0x21, (byte) 0x22, (byte) 0x10,
                    (byte) 0xD4, (byte) 0xD4, (byte) 0x45, (byte) 0x8D, (byte) 0x88, (byte) 0x34, (byte) 0x33, (byte) 0x96,
                    (byte) 0xB0, (byte) 0x43, (byte) 0x0E, (byte) 0x45, (byte) 0x89, (byte) 0x17, (byte) 0x21, (byte) 0x24,
                    (byte) 0xEB, (byte) 0x21, (byte) 0x24, (byte) 0xC4, (byte) 0x37, (byte) 0x24, (byte) 0xD1, (byte) 0x00,
                    (byte) 0x81, (byte) 0x87, (byte) 0x4E, (byte) 0x25, (byte) 0x0B, (byte) 0x4D, (byte) 0x44, (byte) 0x44,
                    (byte) 0x84, (byte) 0x82, (byte) 0xCB, (byte) 0x20, (byte) 0xE3, (byte) 0x65, (byte) 0x39, (byte) 0x13,
                    (byte) 0x04, (byte) 0x46, (byte) 0x31, (byte) 0x02, (byte) 0x21, (byte) 0x22, (byte) 0x0E, (byte) 0x36,
                    (byte) 0x43, (byte) 0x44, (byte) 0x44, (byte) 0x66, (byte) 0x2C, (byte) 0x39, (byte) 0x51, (byte) 0x32,
                    (byte) 0x50, (byte) 0xC3, (byte) 0x04, (byte) 0x47, (byte) 0x63, (byte) 0x8D, (byte) 0x0C, (byte) 0x44,
                    (byte) 0x71, (byte) 0x10, (byte) 0xB0, (byte) 0x13, (byte) 0x12, (byte) 0x05, (byte) 0x40, (byte) 0x20,
                    (byte) 0xB0, (byte) 0x01, (byte) 0x2C, (byte) 0x4A, (byte) 0xC8, (byte) 0x34, (byte) 0x4A, (byte) 0xC8,
                    (byte) 0x28, (byte) 0x42, (byte) 0xD8, (byte) 0xB9, (byte) 0x44, (byte) 0xD2, (byte) 0x20, (byte) 0x31,
                    (byte) 0x32, (byte) 0x1C, (byte) 0xE4, (byte) 0xF2, (byte) 0x1C, (byte) 0xE4, (byte) 0x53, (byte) 0x88,
                    (byte) 0xE5, (byte) 0x0D, (byte) 0x4D, (byte) 0x16, (byte) 0x31, (byte) 0x38, (byte) 0xB1, (byte) 0x20,
                    (byte) 0x44, (byte) 0x40, (byte) 0x32, (byte) 0x20, (byte) 0xD1, (byte) 0x8B, (byte) 0x13, (byte) 0x15,
                    (byte) 0x0B, (byte) 0x12, (byte) 0x30, (byte) 0x14, (byte) 0x18, (byte) 0x74, (byte) 0xC4, (byte) 0x46,
                    (byte) 0xC0, (byte) 0x11, (byte) 0x28, (byte) 0x44, (byte) 0xE8, (byte) 0x34, (byte) 0x32, (byte) 0x02,
                    (byte) 0x01, (byte) 0x31, (byte) 0x2F, (byte) 0x44, (byte) 0x44, (byte) 0x84, (byte) 0x35, (byte) 0x3A,
                    (byte) 0xC0, (byte) 0x34, (byte) 0x38, (byte) 0x80, (byte) 0x30, (byte) 0xF0, (byte) 0x08, (byte) 0x18,
                    (byte) 0xDB, (byte) 0x00, (byte) 0x4C, (byte) 0x44, (byte) 0x48, (byte) 0x00, (byte) 0xBB, (byte) 0xCE,
                    (byte) 0x3D, (byte) 0x42, (byte) 0xC0, (byte) 0x4C, (byte) 0x83, (byte) 0x8D, (byte) 0x90, (byte) 0x23,
                    (byte) 0x8D, (byte) 0x38, (byte) 0xC6, (byte) 0x2C, (byte) 0x10, (byte) 0x32, (byte) 0x02, (byte) 0x00,
                    (byte) 0xB9, (byte) 0xCE, (byte) 0x48, (byte) 0xF2, (byte) 0x13, (byte) 0x00, (byte) 0xB8, (byte) 0x87,
                    (byte) 0x51, (byte) 0x10, (byte) 0x87, (byte) 0x99, (byte) 0x13, (byte) 0x94, (byte) 0x34, (byte) 0x3C,
                    (byte) 0xC7, (byte) 0x39, (byte) 0x44, (byte) 0x80, (byte) 0x34, (byte) 0x38, (byte) 0x14, (byte) 0x4C,
                    (byte) 0x73, (byte) 0x91, (byte) 0x21, (byte) 0x36, (byte) 0x28, (byte) 0x35, (byte) 0x24, (byte) 0xC4,
                    (byte) 0x00, (byte) 0x3C, (byte) 0x44, (byte) 0x08, (byte) 0x43, (byte) 0x53, (byte) 0x2D, (byte) 0x89,
                    (byte) 0x54, (byte) 0x4D, (byte) 0x44, (byte) 0x44, (byte) 0xD9, (byte) 0x13, (byte) 0x8D, (byte) 0x1A,
                    (byte) 0x83, (byte) 0x55, (byte) 0x38, (byte) 0xB5, (byte) 0x44, (byte) 0xAC, (byte) 0x81, (byte) 0x44,
                    (byte) 0x9C, (byte) 0x42, (byte) 0x06, (byte) 0x1D, (byte) 0x3A, (byte) 0x0D, (byte) 0x09, (byte) 0x11,
                    (byte) 0x00, (byte) 0x48, (byte) 0x4C, (byte) 0x48, (byte) 0x18, (byte) 0x74, (byte) 0xE1, (byte) 0x00,
                    (byte) 0xD2, (byte) 0xA2, (byte) 0x50, (byte) 0xB4, (byte) 0xD4, (byte) 0x44, (byte) 0x02, (byte) 0xE2,
                    (byte) 0x11, (byte) 0x14, (byte) 0xC0, (byte) 0x20, (byte) 0xD2, (byte) 0xD8, (byte) 0xD8, (byte) 0x44,
                    (byte) 0x93, (byte) 0x91, (byte) 0x71, (byte) 0x02, (byte) 0x51, (byte) 0x32, (byte) 0x15, (byte) 0x12,
                    (byte) 0x13, (byte) 0x80, (byte) 0x44, (byte) 0x3C, (byte) 0x84, (byte) 0x10, (byte) 0xAA, (byte) 0xCE,
                    (byte) 0x34, (byte) 0x6B, (byte) 0x85, (byte) 0x14, (byte) 0x80, (byte) 0x84, (byte) 0x47, (byte) 0x24,
                    (byte) 0xC0, (byte) 0x4C, (byte) 0x43, (byte) 0x04, (byte) 0x35, (byte) 0x3C, (byte) 0x44, (byte) 0x49,
                    (byte) 0x38, (byte) 0x40, (byte) 0x62, (byte) 0x31, (byte) 0x00, (byte) 0x2F, (byte) 0x63, (byte) 0x91,
                    (byte) 0x28, (byte) 0x44, (byte) 0x71, (byte) 0x11, (byte) 0x23, (byte) 0x94, (byte) 0x44, (byte) 0x21,
                    (byte) 0x33, (byte) 0x1D, (byte) 0x13, (byte) 0x96, (byte) 0x94, (byte) 0xE4, (byte) 0x56, (byte) 0x01,
                    (byte) 0x10, (byte) 0xEF, (byte) 0x38, (byte) 0xB2, (byte) 0x02, (byte) 0x63, (byte) 0x20, (byte) 0x88,
                    (byte) 0x10, (byte) 0xD0, (byte) 0x84, (byte) 0x91, (byte) 0x81, (byte) 0x12, (byte) 0x84, (byte) 0x40,
                    (byte) 0xE8, (byte) 0x4C, (byte) 0x43, (byte) 0x36, (byte) 0x10, (byte) 0x03, (byte) 0xCE, (byte) 0x36,
                    (byte) 0x52, (byte) 0x0B, (byte) 0x2E, (byte) 0xF2, (byte) 0xC0, (byte) 0x36, (byte) 0xC2, (byte) 0x0B,
                    (byte) 0x21, (byte) 0x30, (byte) 0x11, (byte) 0x62, (byte) 0x65, (byte) 0x0D, (byte) 0x9C, (byte) 0xE4,
                    (byte) 0xE7, (byte) 0x10, (byte) 0x04, (byte) 0xE0, (byte) 0x0C, (byte) 0x34, (byte) 0x44, (byte) 0x49,
                    (byte) 0x28, (byte) 0x8E, (byte) 0x2C, (byte) 0x39, (byte) 0x4E, (byte) 0x09, (byte) 0x44, (byte) 0xA5,
                    (byte) 0x39, (byte) 0x11, (byte) 0x08, (byte) 0x18, (byte) 0xDC, (byte) 0xD1, (byte) 0x10, (byte) 0x04,
                    (byte) 0xCC, (byte) 0x10, (byte) 0xD4, (byte) 0xE1, (byte) 0x2C, (byte) 0xE3, (byte) 0x83, (byte) 0xD0,
                    (byte) 0xF3, (byte) 0x8D, (byte) 0x88, (byte) 0xE5, (byte) 0x11, (byte) 0x48, (byte) 0x4C, (byte) 0xC7,
                    (byte) 0x21, (byte) 0x10, (byte) 0xF6, (byte) 0x01, (byte) 0x30, (byte) 0x87, (byte) 0x80, (byte) 0x51,
                    (byte) 0x44, (byte) 0x09, (byte) 0x39, (byte) 0x00, (byte) 0x44, (byte) 0xB6, (byte) 0x32, (byte) 0x4C,
                    (byte) 0xE4, (byte) 0x44, (byte) 0xCC, (byte) 0x75, (byte) 0x12, (byte) 0xC8, (byte) 0xE5, (byte) 0x0D,
                    (byte) 0x0E, (byte) 0x45, (byte) 0x44, (byte) 0x45, (byte) 0x85, (byte) 0x87, (byte) 0x11, (byte) 0x11,
                    (byte) 0x21, (byte) 0x00, (byte) 0x16, (byte) 0x20, (byte) 0x0C, (byte) 0xC2, (byte) 0x0D, (byte) 0x21,
                    (byte) 0x24, (byte) 0xD1, (byte) 0x01, (byte) 0x32, (byte) 0x0E, (byte) 0x36, (byte) 0xC3, (byte) 0x94,
                    (byte) 0x4C, (byte) 0x7B, (byte) 0xC0, (byte) 0x18, (byte) 0x49, (byte) 0x0D, (byte) 0x4C, (byte) 0x44,
                    (byte) 0x6F, (byte) 0x44, (byte) 0xE0, (byte) 0x40, (byte) 0x04, (byte) 0xB6, (byte) 0x2F, (byte) 0x38,
                    (byte) 0x83, (byte) 0x53, (byte) 0xC8, (byte) 0x40, (byte) 0x13, (byte) 0xB4, (byte) 0x04, (byte) 0xD4,
                    (byte) 0x44, (byte) 0x02, (byte) 0xF1, (byte) 0x00, (byte) 0x21, (byte) 0x25, (byte) 0x01, (byte) 0x18,
                    (byte) 0x87, (byte) 0x00, (byte) 0xB2, (byte) 0xC4, (byte) 0x34, (byte) 0x61, (byte) 0x2F, (byte) 0x01,
                    (byte) 0x24, (byte) 0xA0, (byte) 0x3C, (byte) 0xF2, (byte) 0xD8, (byte) 0xB0, (byte) 0x02, (byte) 0x0B,
                    (byte) 0xD1, (byte) 0x25, (byte) 0x00, (byte) 0x2C, (byte) 0xB6, (byte) 0x2C, (byte) 0x21, (byte) 0x7C,
                    (byte) 0xCE, (byte) 0x50, (byte) 0x61, (byte) 0xE2, (byte) 0x2C, (byte) 0x40, (byte) 0x11, (byte) 0x2D,
                    (byte) 0x89, (byte) 0x91, (byte) 0x39, (byte) 0x69, (byte) 0x40, (byte) 0x09, (byte) 0x33, (byte) 0x91,
                    (byte) 0xC9, (byte) 0x30, (byte) 0x13, (byte) 0x12, (byte) 0xB3, (byte) 0x82, (byte) 0x00, (byte) 0xB9,
                    (byte) 0x94, (byte) 0x62, (byte) 0x40, (byte) 0x12, (byte) 0x4F, (byte) 0x20, (byte) 0x15, (byte) 0x13,
                    (byte) 0x23, (byte) 0x94, (byte) 0x4C, (byte) 0x7C, (byte) 0x82, (byte) 0x10, (byte) 0xD1, (byte) 0x2C,
                    (byte) 0x39, (byte) 0x31, (byte) 0xC4, (byte) 0x46, (byte) 0x20, (byte) 0x11, (byte) 0x10, (byte) 0x44,
                    (byte) 0x70, (byte) 0x50, (byte) 0x80, (byte) 0x8A, (byte) 0x2D, (byte) 0x88, (byte) 0x84, (byte) 0x35,
                    (byte) 0x34, (byte) 0x40, (byte) 0x2E, (byte) 0x50, (byte) 0x02, (byte) 0x12, (byte) 0x80, (byte) 0x84,
                    (byte) 0x80, (byte) 0x13, (byte) 0x95, (byte) 0x12, (byte) 0x11, (byte) 0x18, (byte) 0x38, (byte) 0xD0,
                    (byte) 0xEF, (byte) 0x20, (byte) 0x24, (byte) 0xD4, (byte) 0x44, (byte) 0x4B, (byte) 0x44, (byte) 0x4D,
                    (byte) 0x63, (byte) 0x91, (byte) 0x2A, (byte) 0xC0, (byte) 0x0D, (byte) 0x00, (byte) 0x61, (byte) 0x0C,
                    (byte) 0x10, (byte) 0xD4, (byte) 0xE8, (byte) 0x34, (byte) 0x32, (byte) 0x15, (byte) 0x20, (byte) 0x35,
                    (byte) 0x00, (byte) 0x2E, (byte) 0x50, (byte) 0x0D, (byte) 0xC8, (byte) 0x86, (byte) 0x44, (byte) 0xC8,
                    (byte) 0xF1, (byte) 0x04, (byte) 0x0E, (byte) 0x15, (byte) 0x12, (byte) 0x63, (byte) 0x21, (byte) 0x11,
                    (byte) 0x20, (byte) 0xE5, (byte) 0x12, (byte) 0xB8, (byte) 0x20, (byte) 0x94, (byte) 0x46, (byte) 0x00,
                    (byte) 0xC3, (byte) 0xC4, (byte) 0x40, (byte) 0x03, (byte) 0x63, (byte) 0x22, (byte) 0x06, (byte) 0x36,
                    (byte) 0x23, (byte) 0x8B, (byte) 0x2C, (byte) 0x40, (byte) 0x93, (byte) 0x20, (byte) 0xE3, (byte) 0x6B,
                    (byte) 0x21, (byte) 0x24, (byte) 0xE0, (byte) 0x3C, (byte) 0xF4, (byte) 0x4E, (byte) 0x00, (byte) 0x21,
                    (byte) 0xE2, (byte) 0x1C, (byte) 0x04, (byte) 0x46, (byte) 0x13, (byte) 0x05, (byte) 0x00, (byte) 0x2C,
                    (byte) 0x84, (byte) 0xD8, (byte) 0xBD, (byte) 0x11, (byte) 0x12, (byte) 0x49, (byte) 0x44, (byte) 0x44,
                    (byte) 0xD4, (byte) 0xE4, (byte) 0xC4, (byte) 0xB4, (byte) 0xE4, (byte) 0xC4, (byte) 0xBC, (byte) 0x04,
                    (byte) 0x53, (byte) 0xC4, (byte) 0x40, (byte) 0x0B, (byte) 0xD8, (byte) 0x40, (byte) 0x62, (byte) 0x51,
                    (byte) 0x14, (byte) 0x44, (byte) 0x35, (byte) 0x38, (byte) 0xC4, (byte) 0x4C, (byte) 0x44, (byte) 0x4C,
                    (byte) 0x20, (byte) 0xD1, (byte) 0x33, (byte) 0x45, (byte) 0x41, (byte) 0x32, (byte) 0x00, (byte) 0x3D,
                    (byte) 0x87, (byte) 0x01, (byte) 0x31, (byte) 0x15, (byte) 0x11, (byte) 0x18, (byte) 0x51, (byte) 0x10,
                    (byte) 0x02, (byte) 0xB6, (byte) 0x39, (byte) 0x14, (byte) 0x58, (byte) 0x89, (byte) 0x43, (byte) 0xEF,
                    (byte) 0x01, (byte) 0x14, (byte) 0xC8, (byte) 0x09, (byte) 0x42, (byte) 0xC0, (byte) 0x44, (byte) 0xB6,
                    (byte) 0x20, (byte) 0x30, (byte) 0xE5, (byte) 0x0D, (byte) 0x4E, (byte) 0x00, (byte) 0x48, (byte) 0x2C,
                    (byte) 0x84, (byte) 0xD8, (byte) 0x90, (byte) 0x04, (byte) 0xF1, (byte) 0x10, (byte) 0x23, (byte) 0x86,
                    (byte) 0x34, (byte) 0x86, (byte) 0x44, (byte) 0xC8, (byte) 0x84, (byte) 0xE2, (byte) 0x1C, (byte) 0x04,
                    (byte) 0x40, (byte) 0x09, (byte) 0x31, (byte) 0x11, (byte) 0xC8, (byte) 0xE3, (byte) 0x04, (byte) 0x04,
                    (byte) 0xE0, (byte) 0xD8, (byte) 0xAC, (byte) 0xE4, (byte) 0x92, (byte) 0x8C, (byte) 0x41, (byte) 0x91,
                    (byte) 0x10, (byte) 0x49, (byte) 0x05, (byte) 0x14, (byte) 0x40, (byte) 0x93, (byte) 0x81, (byte) 0x34,
                    (byte) 0xC0, (byte) 0x08, (byte) 0xAC, (byte) 0x93, (byte) 0x00, (byte) 0x51, (byte) 0x6C, (byte) 0x20,
                    (byte) 0x30, (byte) 0xCB, (byte) 0x13, (byte) 0x31, (byte) 0x0B, (byte) 0x11, (byte) 0x52, (byte) 0x12,
                    (byte) 0x20, (byte) 0xE3, (byte) 0x76, (byte) 0x1D, (byte) 0x8A, (byte) 0xC4, (byte) 0x18, (byte) 0x02,
                    (byte) 0xE2, (byte) 0x00, (byte) 0xF2, (byte) 0x13, (byte) 0x00, (byte) 0xBC, (byte) 0xD1, (byte) 0x00,
                    (byte) 0x31, (byte) 0x24, (byte) 0x2C, (byte) 0x40, (byte) 0x93, (byte) 0x20, (byte) 0xE3, (byte) 0x64,
                    (byte) 0x54, (byte) 0x44, (byte) 0x58, (byte) 0x04, (byte) 0xE0, (byte) 0xD8, (byte) 0x8D, (byte) 0x13,
                    (byte) 0x8F, (byte) 0xB0, (byte) 0x02, (byte) 0x4E, (byte) 0x47, (byte) 0x52, (byte) 0x04, (byte) 0x5B,
                    (byte) 0x24, (byte) 0xC0, (byte) 0x34, (byte) 0x30, (byte) 0x11, (byte) 0x0E, (byte) 0x12, (byte) 0x0B,
                    (byte) 0x2E, (byte) 0x43, (byte) 0x0F, (byte) 0x2C, (byte) 0xE6, (byte) 0x04, (byte) 0x12, (byte) 0x32,
                    (byte) 0x12, (byte) 0x09, (byte) 0x44, (byte) 0x92, (byte) 0x20, (byte) 0xE3, (byte) 0x6E, (byte) 0x3C,
                    (byte) 0xF3, (byte) 0x91, (byte) 0x4D, (byte) 0x43, (byte) 0x48, (byte) 0x4D, (byte) 0x88, (byte) 0x0D,
                    (byte) 0x00, (byte) 0xB6, (byte) 0x12, (byte) 0x21, (byte) 0x2C, (byte) 0xC4, (byte) 0x37, (byte) 0x25,
                    (byte) 0x06, (byte) 0x18, (byte) 0x44, (byte) 0x93, (byte) 0xAC, (byte) 0x05, (byte) 0x98, (byte) 0x11,
                    (byte) 0x19, (byte) 0xD4, (byte) 0x48, (byte) 0x10, (byte) 0x0D, (byte) 0x0F, (byte) 0x21, (byte) 0x02,
                    (byte) 0x4C, (byte) 0x83, (byte) 0x8D, (byte) 0x84, (byte) 0x40, (byte) 0x8E, (byte) 0x30, (byte) 0x4C,
                    (byte) 0x8A, (byte) 0x20, (byte) 0xB2, (byte) 0xF2, (byte) 0x21, (byte) 0x24, (byte) 0xC4, (byte) 0x47,
                    (byte) 0x24, (byte) 0xD8, (byte) 0x2C, (byte) 0x48, (byte) 0x91, (byte) 0x20, (byte) 0xC1, (byte) 0x2F,
                    (byte) 0x44, (byte) 0xE1, (byte) 0x91, (byte) 0x00, (byte) 0xC8, (byte) 0x8E, (byte) 0x30, (byte) 0xF0,
                    (byte) 0x11, (byte) 0x12, (byte) 0x20, (byte) 0x0F, (byte) 0xB0, (byte) 0x84, (byte) 0x92, (byte) 0x84,
                    (byte) 0x00, (byte) 0xF2, (byte) 0x39, (byte) 0x14, (byte) 0xF3, (byte) 0x44, (byte) 0x02, (byte) 0x0D,
                    (byte) 0x20, (byte) 0xD1, (byte) 0xA4, (byte) 0x01, (byte) 0x26, (byte) 0x2D, (byte) 0x10, (byte) 0x04,
                    (byte) 0x71, (byte) 0x10, (byte) 0x62, (byte) 0x0E, (byte) 0x37, (byte) 0x24, (byte) 0xD1, (byte) 0x01,
                    (byte) 0x31, (byte) 0x06, (byte) 0x62, (byte) 0xF5, (byte) 0x11, (byte) 0x3C, (byte) 0xE4, (byte) 0x84,
                    (byte) 0xBC, (byte) 0x44, (byte) 0x45, (byte) 0x39, (byte) 0x13, (byte) 0x33, (byte) 0x10, (byte) 0x21,
                    (byte) 0xCD, (byte) 0x38, (byte) 0xB3, (byte) 0x86, (byte) 0x62, (byte) 0x40, (byte) 0x8E, (byte) 0x34,
                    (byte) 0xE3, (byte) 0x08, (byte) 0x0A, (byte) 0x15, (byte) 0x03, (byte) 0x18, (byte) 0x44, (byte) 0xE4,
                    (byte) 0x5C, (byte) 0x03, (byte) 0x0F, (byte) 0x2C, (byte) 0x48, (byte) 0x87, (byte) 0x10, (byte) 0x22,
                    (byte) 0xA4, (byte) 0x35, (byte) 0x52, (byte) 0x11, (byte) 0x38, (byte) 0xD3, (byte) 0x04, (byte) 0x35,
                    (byte) 0x3A, (byte) 0xC4, (byte) 0x1A, (byte) 0x30, (byte) 0x11, (byte) 0x2B, (byte) 0x31, (byte) 0x11,
                    (byte) 0x33, (byte) 0x10, (byte) 0x13, (byte) 0x1C, (byte) 0x44, (byte) 0x6B, (byte) 0x01, (byte) 0x41,
                    (byte) 0x87, (byte) 0x99, (byte) 0x41, (byte) 0x12, (byte) 0x4A, (byte) 0x20, (byte) 0x11, (byte) 0xAC,
                    (byte) 0xE5, (byte) 0x84, (byte) 0x46, (byte) 0x70, (byte) 0x0D, (byte) 0x1A, (byte) 0xF0, (byte) 0x12,
                    (byte) 0x4F, (byte) 0x23, (byte) 0x82, (byte) 0x20, (byte) 0x02, (byte) 0xE5, (byte) 0x39, (byte) 0x11,
                    (byte) 0x84, (byte) 0x4E, (byte) 0x75, (byte) 0x0D, (byte) 0x0D, (byte) 0x11, (byte) 0x03, (byte) 0xC4,
                    (byte) 0x43, (byte) 0x0E, (byte) 0x54, (byte) 0x4B, (byte) 0x00, (byte) 0x34, (byte) 0x01, (byte) 0x84,
                    (byte) 0x46, (byte) 0x43, (byte) 0x49, (byte) 0x39, (byte) 0x89, (byte) 0x17, (byte) 0x00, (byte) 0x24,
                    (byte) 0xCB, (byte) 0x62, (byte) 0x32, (byte) 0x04, (byte) 0x94, (byte) 0x83, (byte) 0x40, (byte) 0x2E,
                    (byte) 0xC0, (byte) 0x18, (byte) 0x04, (byte) 0x49, (byte) 0xC4, (byte) 0x00, (byte) 0xB4, (byte) 0xC7,
                    (byte) 0x94, (byte) 0xB3, (byte) 0x8E, (byte) 0x46, (byte) 0x21, (byte) 0xC0, (byte) 0x34, (byte) 0x61,
                    (byte) 0x2B, (byte) 0x01, (byte) 0x8B, (byte) 0xCE, (byte) 0x39, (byte) 0x19, (byte) 0x54, (byte) 0x36,
                    (byte) 0x44, (byte) 0x93, (byte) 0x00, (byte) 0x12, (byte) 0xC8, (byte) 0x48, (byte) 0x7C, (byte) 0xD1,
                    (byte) 0x20, (byte) 0x02, (byte) 0xF2, (byte) 0x3D, (byte) 0x12, (byte) 0x0D, (byte) 0x1A, (byte) 0x32,
                    (byte) 0x0D, (byte) 0x34, (byte) 0x44, (byte) 0x61, (byte) 0x20, (byte) 0x6C, (byte) 0xC7, (byte) 0x00,
                    (byte) 0xD2, (byte) 0xAF, (byte) 0x44, (byte) 0xE4, (byte) 0xC4, (byte) 0x09, (byte) 0x38, (byte) 0x15,
                    (byte) 0x38, (byte) 0x80, (byte) 0xE8, (byte) 0x30, (byte) 0x01, (byte) 0x88, (byte) 0x34, (byte) 0x4C,
                    (byte) 0xCE, (byte) 0x34, (byte) 0x81, (byte) 0x87, (byte) 0x4F, (byte) 0x24, (byte) 0xC0, (byte) 0x46,
                    (byte) 0x04, (byte) 0x4C, (byte) 0x94, (byte) 0x83, (byte) 0x48, (byte) 0x48, (byte) 0x7B, (byte) 0x14,
                    (byte) 0x48, (byte) 0x80, (byte) 0xAE, (byte) 0x58, (byte) 0xD1, (byte) 0x11, (byte) 0x89, (byte) 0x16,
                    (byte) 0x20, (byte) 0x45, (byte) 0x3B, (byte) 0xD1, (byte) 0x21, (byte) 0x50, (byte) 0x13, (byte) 0x12,
                    (byte) 0xE4, (byte) 0xC7, (byte) 0x11, (byte) 0x14, (byte) 0xB2, (byte) 0x20, (byte) 0xC3, (byte) 0xCB,
                    (byte) 0x12, (byte) 0xF3, (byte) 0x8F, (byte) 0x50, (byte) 0xB0, (byte) 0x11, (byte) 0xC4, (byte) 0x41,
                    (byte) 0x4B, (byte) 0x10, (byte) 0x24, (byte) 0xE4, (byte) 0x48, (byte) 0xF1, (byte) 0x02, (byte) 0x20,
                    (byte) 0x02, (byte) 0xCB, (byte) 0x63, (byte) 0x23, (byte) 0x00, (byte) 0x2C, (byte) 0xBA, (byte) 0xC8,
                    (byte) 0x18, (byte) 0x74, (byte) 0xEC, (byte) 0x11, (byte) 0x24, (byte) 0x80, (byte) 0x18, (byte) 0x4C,
                    (byte) 0x93, (byte) 0x10, (byte) 0xFA, (byte) 0x84, (byte) 0x62, (byte) 0xF1, (byte) 0x00, (byte) 0x08,
                    (byte) 0x4B, (byte) 0xD1, (byte) 0x38, (byte) 0x64, (byte) 0x44, (byte) 0x49, (byte) 0x28, (byte) 0x40,
                    (byte) 0x37, (byte) 0x22, (byte) 0x03, (byte) 0x12, (byte) 0x64, (byte) 0x44, (byte) 0x01, (byte) 0x39,
                    (byte) 0x48, (byte) 0x5E, (byte) 0x83, (byte) 0x53, (byte) 0x11, (byte) 0x15, (byte) 0x48, (byte) 0x11,
                    (byte) 0x6B, (byte) 0x00, (byte) 0x34, (byte) 0x01, (byte) 0x84, (byte) 0xB4, (byte) 0x04, (byte) 0xC8,
                    (byte) 0x38, (byte) 0xD0, (byte) 0x0B, (byte) 0x94, (byte) 0x84, (byte) 0x87, (byte) 0xAC, (byte) 0xE4,
                    (byte) 0x84, (byte) 0x88, (byte) 0x03, (byte) 0x04, (byte) 0x44, (byte) 0x08, (byte) 0xC8, (byte) 0x48,
                    (byte) 0x25, (byte) 0x12, (byte) 0x4A, (byte) 0x44, (byte) 0x14, (byte) 0x00, (byte) 0xBD, (byte) 0x84,
                    (byte) 0x20, (byte) 0x61, (byte) 0xD3, (byte) 0xBC, (byte) 0x44, (byte) 0x45, (byte) 0x39, (byte) 0x13,
                    (byte) 0x00, (byte) 0x34, (byte) 0x21, (byte) 0x32, (byte) 0x11, (byte) 0x51, (byte) 0x0D, (byte) 0xD8,
                    (byte) 0x04, (byte) 0xC4, (byte) 0x46, (byte) 0xF4, (byte) 0x4E, (byte) 0x0D, (byte) 0x40, (byte) 0x93,
                    (byte) 0x20, (byte) 0xE3, (byte) 0x6F, (byte) 0x11, (byte) 0x14, (byte) 0x8E, (byte) 0x34, (byte) 0x02,
                    (byte) 0xE2, (byte) 0x10, (byte) 0xB2, (byte) 0xEF, (byte) 0x39, (byte) 0x61, (byte) 0x11, (byte) 0x91,
                    (byte) 0x51, (byte) 0x0D, (byte) 0x20, (byte) 0xD1, (byte) 0xA2, (byte) 0x38, (byte) 0xB3, (byte) 0x91,
                    (byte) 0xA0, (byte) 0xD4, (byte) 0x88, (byte) 0x0C, (byte) 0x48, (byte) 0x40, (byte) 0x47, (byte) 0x43,
                    (byte) 0x48, (byte) 0x4E, (byte) 0xB1, (byte) 0x12, (byte) 0x4A, (byte) 0x00, (byte) 0xD4, (byte) 0x2D,
                    (byte) 0x3D, (byte) 0x88, (byte) 0x0C, (byte) 0x4C, (byte) 0x40, (byte) 0x34, (byte) 0x61, (byte) 0x2C,
                    (byte) 0x10, (byte) 0xD4, (byte) 0xC8, (byte) 0x38, (byte) 0xD8, (byte) 0xC4, (byte) 0x10, (byte) 0xF9,
                    (byte) 0x03, (byte) 0x18, (byte) 0x4C, (byte) 0x93, (byte) 0x44, (byte) 0xE3, (byte) 0x46, (byte) 0x9C,
                    (byte) 0x04, (byte) 0x43, (byte) 0xCD, (byte) 0x13, (byte) 0x94, (byte) 0x04, (byte) 0xB1, (byte) 0x2D,
                    (byte) 0x10, (byte) 0x21, (byte) 0x12, (byte) 0x48, (byte) 0x04, (byte) 0x58, (byte) 0xC8, (byte) 0x01,
                    (byte) 0x44, (byte) 0x88, (byte) 0xE3, (byte) 0x0C, (byte) 0x38, (byte) 0xD9, (byte) 0x44, (byte) 0x01,
                    (byte) 0x19, (byte) 0x40, (byte) 0x30, (byte) 0x82, (byte) 0xD8, (byte) 0xC8, (byte) 0x40, (byte) 0x23,
                    (byte) 0x44, (byte) 0x40, (byte) 0x0C, (byte) 0x88, (byte) 0xE3, (byte) 0x45, (byte) 0x11, (byte) 0x11,
                    (byte) 0x0D, (byte) 0x08, (byte) 0x4C, (byte) 0x44, (byte) 0x3C, (byte) 0xB6, (byte) 0x2F, (byte) 0x44,
                    (byte) 0xE3, (byte) 0xC4, (byte) 0x45, (byte) 0x36, (byte) 0x2C, (byte) 0x10, (byte) 0x44, (byte) 0xC8,
                    (byte) 0x34, (byte) 0x68, (byte) 0x0B, (byte) 0x58, (byte) 0x06, (byte) 0x12, (byte) 0xC9, (byte) 0x35,
                    (byte) 0x05, (byte) 0x16, (byte) 0x01, (byte) 0x84, (byte) 0x34, (byte) 0x26, (byte) 0x23, (byte) 0x10,
                    (byte) 0x04, (byte) 0xC7, (byte) 0x99, (byte) 0x13, (byte) 0x96, (byte) 0x4C, (byte) 0x7C, (byte) 0x84,
                    (byte) 0x2C, (byte) 0xBC, (byte) 0x8E, (byte) 0x2C, (byte) 0x32, (byte) 0x04, (byte) 0x46, (byte) 0x00,
                    (byte) 0x93, (byte) 0x9C, (byte) 0x40, (byte) 0x15, (byte) 0x63, (byte) 0x61, (byte) 0x13, (byte) 0x84,
                    (byte) 0x01, (byte) 0xAC, (byte) 0x01, (byte) 0x14, (byte) 0x48, (byte) 0x00, (byte) 0x61, (byte) 0x23,
                    (byte) 0x10, (byte) 0x00, (byte) 0xF2, (byte) 0x20, (byte) 0xD1, (byte) 0xB1, (byte) 0x21, (byte) 0x21,
                    (byte) 0x23, (byte) 0x10, (byte) 0x20, (byte) 0x03, (byte) 0x13, (byte) 0x61, (byte) 0xCE, (byte) 0x32,
                    (byte) 0x52, (byte) 0x06, (byte) 0x51, (byte) 0x11, (byte) 0x2F, (byte) 0x38, (byte) 0xB2, (byte) 0x02,
                    (byte) 0x12, (byte) 0x13, (byte) 0x83, (byte) 0x62, (byte) 0xC0, (byte) 0x02, (byte) 0x1C, (byte) 0x83,
                    (byte) 0x44, (byte) 0x88, (byte) 0x04, (byte) 0xC4, (byte) 0x18, (byte) 0xE4, (byte) 0x58, (byte) 0x80,
                    (byte) 0x71, (byte) 0x00, (byte) 0x0E, (byte) 0x54, (byte) 0x4E, (byte) 0x35, (byte) 0x38, (byte) 0x80,
                    (byte) 0x44, (byte) 0x4B, (byte) 0x91, (byte) 0x0C, (byte) 0x44, (byte) 0x71, (byte) 0x10, (byte) 0x02,
                    (byte) 0xC8, (byte) 0x4D, (byte) 0x8B, (byte) 0xC0, (byte) 0x45, (byte) 0x33, (byte) 0x44, (byte) 0x47,
                    (byte) 0x80, (byte) 0x11, (byte) 0x0E, (byte) 0x11, (byte) 0x00, (byte) 0x4F, (byte) 0x52, (byte) 0x0E,
                    (byte) 0x2C, (byte) 0x43, (byte) 0x42, (byte) 0x13, (byte) 0x33, (byte) 0x93, (byte) 0x00, (byte) 0xB8,
                    (byte) 0xC4, (byte) 0x14, (byte) 0x43, (byte) 0x52, (byte) 0x13, (byte) 0x64, (byte) 0x48, (byte) 0x4C,
                    (byte) 0x48, (byte) 0x8E, (byte) 0x35, (byte) 0x25, (byte) 0x0C, (byte) 0x11, (byte) 0x18, (byte) 0x84,
                    (byte) 0x35, (byte) 0x31, (byte) 0x11, (byte) 0x99, (byte) 0x13, (byte) 0x94, (byte) 0x3F, (byte) 0x31,
                    (byte) 0xCE, (byte) 0x50, (byte) 0x61, (byte) 0xD3, (byte) 0xB0, (byte) 0xE0, (byte) 0xC4, (byte) 0x44,
                    (byte) 0xDC, (byte) 0xC0, (byte) 0x48, (byte) 0xA8, (byte) 0x8E, (byte) 0x00, (byte) 0x21, (byte) 0xF1,
                    (byte) 0x10, (byte) 0x04, (byte) 0x8E, (byte) 0x36, (byte) 0x01, (byte) 0x84, (byte) 0x94, (byte) 0x83,
                    (byte) 0x46, (byte) 0x11, (byte) 0x1C, (byte) 0x8F, (byte) 0x10, (byte) 0x22, (byte) 0x05, (byte) 0x20,
                    (byte) 0x28, (byte) 0x8E, (byte) 0x34, (byte) 0xD1, (byte) 0x02, (byte) 0x4C, (byte) 0x83, (byte) 0x8D,
                    (byte) 0xD8, (byte) 0x84, (byte) 0x87, (byte) 0xC4, (byte) 0x44, (byte) 0x8F, (byte) 0x38, (byte) 0xD4,
                    (byte) 0x84, (byte) 0xBD, (byte) 0x11, (byte) 0x13, (byte) 0x4D, (byte) 0x8B, (byte) 0x0E, (byte) 0x54,
                    (byte) 0x43, (byte) 0x04, (byte) 0x35, (byte) 0x38, (byte) 0x80, (byte) 0x44, (byte) 0x3A, (byte) 0xCE,
                    (byte) 0x1A, (byte) 0xF1, (byte) 0x0D, (byte) 0xC9, (byte) 0x43, (byte) 0x33, (byte) 0x44, (byte) 0x41,
                    (byte) 0x24, (byte) 0x35, (byte) 0x32, (byte) 0x11, (byte) 0x12, (byte) 0x22, (byte) 0x13, (byte) 0x21,
                    (byte) 0x91, (byte) 0x0D, (byte) 0xCC, (byte) 0x74, (byte) 0x4E, (byte) 0x50, (byte) 0x61, (byte) 0xCE,
                    (byte) 0x51, (byte) 0x3B, (byte) 0xC4, (byte) 0x4F, (byte) 0x22, (byte) 0x0C, (byte) 0x20, (byte) 0xB0,
                    (byte) 0x11, (byte) 0xD4, (byte) 0x80, (byte) 0x93, (byte) 0x20, (byte) 0xCB, (byte) 0x44, (byte) 0x59,
                    (byte) 0x23, (byte) 0xC0, (byte) 0x3C, (byte) 0x44, (byte) 0x73, (byte) 0x1D, (byte) 0x11, (byte) 0x00,
                    (byte) 0x4E, (byte) 0x22, (byte) 0xC0, (byte) 0x49, (byte) 0x2C, (byte) 0x87, (byte) 0x00, (byte) 0xA1,
                    (byte) 0x32, (byte) 0x39, (byte) 0x44, (byte) 0x42, (byte) 0x12, (byte) 0x00, (byte) 0x82, (byte) 0x39,
                    (byte) 0x43, (byte) 0x53, (byte) 0xBC, (byte) 0x02, (byte) 0x0D, (byte) 0x94, (byte) 0x02, (byte) 0xCB,
                    (byte) 0xC4, (byte) 0x80, (byte) 0x87, (byte) 0xBC, (byte) 0xE4, (byte) 0x92, (byte) 0x20, (byte) 0x12,
                    (byte) 0xC4, (byte) 0x80, (byte) 0x20, (byte) 0x84, (byte) 0x3D, (byte) 0x3C, (byte) 0x8E, (byte) 0x2C,
                    (byte) 0x80, (byte) 0xF3, (byte) 0x44, (byte) 0x05, (byte) 0x44, (byte) 0x2F, (byte) 0x30, (byte) 0x0B,
                    (byte) 0x2B, (byte) 0x22, (byte) 0x98, (byte) 0x89, (byte) 0x11, (byte) 0x00, (byte) 0x4C, (byte) 0x4B,
                    (byte) 0x4E, (byte) 0x34, (byte) 0x4B, (byte) 0xCB, (byte) 0x10, (byte) 0xD4, (byte) 0xD8, (byte) 0xBC,
                    (byte) 0x44, (byte) 0x48, (byte) 0x38, (byte) 0x38, (byte) 0xC4, (byte) 0x14, (byte) 0x83, (byte) 0x44,
                    (byte) 0xB4, (byte) 0xE4, (byte) 0x4C, (byte) 0x00, (byte) 0xBC, (byte) 0x44, (byte) 0x54, (byte) 0x40,
                    (byte) 0x0B, (byte) 0x8D, (byte) 0x12, (byte) 0x0D, (byte) 0x2A, (byte) 0x05, (byte) 0x13, (byte) 0x1C,
                    (byte) 0xE4, (byte) 0x72, (byte) 0x11, (byte) 0x15, (byte) 0x44, (byte) 0xB4, (byte) 0x03, (byte) 0x04,
                    (byte) 0xB0, (byte) 0xE3, (byte) 0x04, (byte) 0x35, (byte) 0x38, (byte) 0x06, (byte) 0x10, (byte) 0xD4,
                    (byte) 0xE3, (byte) 0x38, (byte) 0x25, (byte) 0x0C, (byte) 0x10, (byte) 0xD4, (byte) 0xE0, (byte) 0x09,
                    (byte) 0x32, (byte) 0x15, (byte) 0x21, (byte) 0x36, (byte) 0x20, (byte) 0x35, (byte) 0x85, (byte) 0x80,
                    (byte) 0x62, (byte) 0x01, (byte) 0x51, (byte) 0x00, (byte) 0x80, (byte) 0xF3, (byte) 0x60, (byte) 0xF1,
                    (byte) 0x20, (byte) 0x09, (byte) 0x32, (byte) 0x15, (byte) 0x13, (byte) 0x34, (byte) 0x40, (byte) 0x20,
                    (byte) 0xDA, (byte) 0x0D, (byte) 0x4C, (byte) 0x44, (byte) 0x44, (byte) 0x49, (byte) 0x32, (byte) 0x0D,
                    (byte) 0x1B, (byte) 0x10, (byte) 0x03, (byte) 0x20, (byte) 0xE8, (byte) 0xC0, (byte) 0x34, (byte) 0x61,
                    (byte) 0x11, (byte) 0x98, (byte) 0x43, (byte) 0x44, (byte) 0x44, (byte) 0x04, (byte) 0xC8, (byte) 0x38,
                    (byte) 0xDA, (byte) 0xC4, (byte) 0x00, (byte) 0x58, (byte) 0x8E, (byte) 0x3D, (byte) 0x8B, (byte) 0x00,
                    (byte) 0x4C, (byte) 0x21, (byte) 0xE2, (byte) 0x2C, (byte) 0x02, (byte) 0x0C, (byte) 0x80, (byte) 0xD6,
                    (byte) 0x0E, (byte) 0x34, (byte) 0x4C, (byte) 0x8E, (byte) 0x15, (byte) 0x35, (byte) 0x80, (byte) 0x44,
                    (byte) 0x4B, (byte) 0xC0, (byte) 0x45, (byte) 0x36, (byte) 0x23, (byte) 0x11, (byte) 0x52, (byte) 0x02,
                    (byte) 0x12, (byte) 0x23, (byte) 0x83, (byte) 0x12, (byte) 0xB0, (byte) 0x0D, (byte) 0x19, (byte) 0x40,
                    (byte) 0x06, (byte) 0x12, (byte) 0xB2, (byte) 0x0D, (byte) 0x2A, (byte) 0x73, (byte) 0x96, (byte) 0x11,
                    (byte) 0x51, (byte) 0x11, (byte) 0x88, (byte) 0xE3, (byte) 0x45, (byte) 0x21, (byte) 0x13, (byte) 0x22,
                    (byte) 0x38, (byte) 0xC3, (byte) 0x04, (byte) 0x35, (byte) 0x38, (byte) 0x88, (byte) 0x4D, (byte) 0x88,
                    (byte) 0x0D, (byte) 0x61, (byte) 0x61, (byte) 0xC4, (byte) 0x44, (byte) 0x4C, (byte) 0x8E, (byte) 0x30,
                    (byte) 0x45, (byte) 0x84, (byte) 0x1C, (byte) 0x44, (byte) 0x44, (byte) 0x8C, (byte) 0x40, (byte) 0x40,
                    (byte) 0x4C, (byte) 0x48, (byte) 0xD1, (byte) 0x21, (byte) 0x51, (byte) 0x27, (byte) 0x20, (byte) 0x61,
                    (byte) 0xC4, (byte) 0x46, (byte) 0x11, (byte) 0x00, (byte) 0x51, (byte) 0x32, (byte) 0x05, (byte) 0x50,
                    (byte) 0xBB, (byte) 0x8D, (byte) 0x2C, (byte) 0x83, (byte) 0x44, (byte) 0xD8, (byte) 0xE3, (byte) 0x00,
                    (byte) 0x36, (byte) 0xF4, (byte) 0x48, (byte) 0x39, (byte) 0x12, (byte) 0x13, (byte) 0x63, (byte) 0x34,
                    (byte) 0x40, (byte) 0x0C, (byte) 0x84, (byte) 0xC8, (byte) 0x38, (byte) 0xD0, (byte) 0x0B, (byte) 0x94,
                    (byte) 0xE5, (byte) 0x11, (byte) 0x94, (byte) 0x83, (byte) 0x40, (byte) 0x34, (byte) 0x22, (byte) 0x00,
                    (byte) 0x2D, (byte) 0xE7, (byte) 0x9E
            };
    private static final DictEntry[] STATIC_DICTIONARY = new DictEntry[1024];
    private static final int STATIC_DICT_WORDS = createDictionary(unpackDictionary(DICT_EN_1024), STATIC_DICTIONARY, 1024, 0);
    private final DictEntry[] dictMap;
    private final int staticDictSize;
    private final int logHashSize;
    private final int hashMask;
    private DictEntry[] dictList;
    private int dictSize;
    public TextCodec() {
        this(THRESHOLD2 * 4, null, LOG_HASHES_SIZE);
    }
    public TextCodec(int dictSize) {
        this(dictSize, null, LOG_HASHES_SIZE);
    }


    // dictSize (in words) = number of dictionary entries
    public TextCodec(int dictSize, byte[] dict, int logHashSize) {
        if((logHashSize < 10) || (logHashSize > 28)) {
            throw new IllegalArgumentException("The hash table size log must be in [10..28]");
        }

        if((dictSize < STATIC_DICT_WORDS + 128) || (dictSize > (1 << logHashSize))) {
            throw new IllegalArgumentException("The number of words in the dictionary must be in [" +
                    (STATIC_DICT_WORDS + 128) + ".." + (1 << logHashSize) + "]");
        }

        this.logHashSize = logHashSize;
        this.dictMap = new DictEntry[1 << this.logHashSize];
        this.dictList = new DictEntry[dictSize];
        this.dictSize = dictSize;
        this.hashMask = (1 << this.logHashSize) - 1;
        int nbWords;

        // Replace default dictionary ?
        if((dict != null) && (dict != DICT_EN_1024)) {
            // Keep at least 20% space for dynamic dictionary
            nbWords = createDictionary(dict, this.dictList, dictSize * 4 / 5, 0);
        }
        else {
            System.arraycopy(STATIC_DICTIONARY, 0, this.dictList, 0, Math.min(STATIC_DICTIONARY.length, dictSize));
            nbWords = STATIC_DICT_WORDS;
        }

        // Add special entries at end of static dictionary
        this.dictList[nbWords] = new DictEntry(new byte[]{ESCAPE_TOKEN2}, 0, 0, nbWords, 1);
        this.dictList[nbWords + 1] = new DictEntry(new byte[]{ESCAPE_TOKEN1}, 0, 0, nbWords + 1, 1);
        nbWords += 2;

        // Populate hash map
        for(int i = 0; i < nbWords; i++) {
            DictEntry e = this.dictList[i];
            this.dictMap[e.hash & hashMask] = e;
        }

        // Pre-allocate all dictionary entries
        for(int i = nbWords; i < dictSize; i++)
            this.dictList[i] = new DictEntry(null, -1, 0, i, 0);

        this.staticDictSize = nbWords;
    }

    private static boolean[] initDelimiterChars() {
        boolean[] res = new boolean[256];

        for(int i = 0; i < 256; i++) {
            if((i >= ' ') && (i <= '/')) // [ !"#$%&'()*+,-./]
            {
                res[i] = true;
            }
            else if((i >= ':') && (i <= '?')) // [:;<=>?]
            {
                res[i] = true;
            }
            else {
                switch (i) {
                    case '\n':
                    case '\t':
                    case '\r':
                    case '_':
                    case '|':
                    case '{':
                    case '}':
                    case '[':
                    case ']':
                        res[i] = true;
                        break;
                    default:
                        res[i] = false;
                }
            }
        }

        return res;
    }

    private static boolean[] initTextChars() {
        boolean[] res = new boolean[256];

        for(int i = 0; i < 256; i++)
            res[i] = isLowerCase((byte) i) || isUpperCase((byte) i);

        return res;
    }

    private static int emitWordIndex(byte[] dst, int dstIdx, int val) {
        // Emit word index (varint 5 bits + 7 bits + 7 bits)
        if(val >= THRESHOLD1) {
            if(val >= THRESHOLD2) {
                dst[dstIdx++] = (byte) (0xE0 | (val >> 14));
            }

            dst[dstIdx++] = (byte) (0x80 | (val >> 7));
            dst[dstIdx++] = (byte) (0x7F & val);
        }
        else {
            dst[dstIdx++] = (byte) val;
        }

        return dstIdx;
    }

    private static boolean sameWords(DictEntry e, byte[] src, int anchor, int length) {
        final int l = e.pos + length;
        final byte[] buf = e.buf;

        // Skip first position (same result)
        for(int i = e.pos + 1, j = anchor + 2; i < l; i++, j++) {
            if(buf[i] != src[j]) {
                return false;
            }
        }

        return true;
    }

    // Create dictionary from array of words
    private static int createDictionary(byte[] words, DictEntry[] dict, int maxWords, int startWord) {
        int anchor = -1;
        int h = HASH1;
        int nbWords = startWord;

        for(int i = 0; ((i < words.length) && (nbWords < maxWords)); i++) {
            byte cur = words[i];

            if(isText(cur)) {
                h = h * HASH1 ^ cur * HASH2;
                continue;
            }

            if((isDelimiter(cur)) && (nbWords < maxWords) && (i >= anchor + 2)) // At least 2 letters
            {
                dict[nbWords] = new DictEntry(words, anchor + 1, h, nbWords, i - anchor - 1);
                nbWords++;
            }

            anchor = i;
            h = HASH1;
        }

        return nbWords;
    }

    private static boolean isText(byte val) {
        return TEXT_CHARS[val & 0xFF];
    }

    private static boolean isLowerCase(byte val) {
        return (val >= 'a') && (val <= 'z');
    }

    private static boolean isUpperCase(byte val) {
        return (val >= 'A') && (val <= 'Z');
    }

    public static boolean isDelimiter(byte val) {
        return DELIMITER_CHARS[val & 0xFF];
    }

    private static byte[] unpackDictionary(byte[] dict) {
        byte[] buf = new byte[dict.length * 2];
        int d = 0;
        int val = 0;

        // Unpack 3 bytes into 4 6-bit symbols
        for(int i = 0; i < dict.length; i++) {
            val = (val << 8) | (dict[i] & 0xFF);

            if((i % 3) == 2) {
                for(int ii = 18; ii >= 0; ii -= 6) {
                    int c = (val >> ii) & 0x3F;

                    if(c >= 32) {
                        buf[d++] = ' ';
                    }

                    c &= 0x1F;

                    // Ignore padding symbols (> 26 and <= 31)
                    if(c <= 26) {
                        buf[d++] = (byte) (c + 'a');
                    }
                }

                val = 0;
            }
        }

        buf[d] = ' '; // End
        byte[] res = new byte[d];
        System.arraycopy(buf, 1, res, 0, res.length);
        return res;
    }

    @Override
    public boolean forward(SliceByteArray input, SliceByteArray output) {
        if((!SliceByteArray.isValid(input)) || (!SliceByteArray.isValid(output))) {
            return false;
        }

        if(input.array == output.array) {
            return false;
        }

        final int count = input.length;
        final byte[] src = input.array;
        final byte[] dst = output.array;

        if(output.length - output.index < this.getMaxEncodedLength(count)) {
            return false;
        }

        int srcIdx = input.index;
        int dstIdx = output.index;

        if(count <= 1) {
            if(count > 0) {
                dst[dstIdx++] = src[srcIdx++];
            }

            input.index = srcIdx;
            output.index = dstIdx;
            return true;
        }

        final int srcEnd = input.index + count;
        final int dstEnd = dst.length;
        final int dstEnd3 = dstEnd - 3;
        int anchor = isText(src[srcIdx]) ? srcIdx - 1 : srcIdx; // previous delimiter
        int endWordIdx = ~anchor;
        int emitAnchor = input.index; // never less than input.index
        int words = this.staticDictSize;
        int h1 = HASH1;
        int h2 = HASH1;
        boolean isFirstWordChar = true;

        while ((srcIdx < srcEnd) && (dstIdx < dstEnd)) {
            byte cur = src[srcIdx];

            if(isText(cur)) {
                // Compute hashes
                // h1 -> hash of word chars
                // h2 -> hash of word chars with first char case flipped
                if(isFirstWordChar == true) {
                    final int caseFlag = isUpperCase(cur) ? 32 : -32;
                    h1 = h1 * HASH1 ^ cur * HASH2;
                    h2 = h2 * HASH1 ^ (cur + caseFlag) * HASH2;
                    isFirstWordChar = false;
                }
                else {
                    final int hh = cur * HASH2;
                    h1 = h1 * HASH1 ^ hh;
                    h2 = h2 * HASH1 ^ hh;
                }

                srcIdx++;
                continue;
            }

            boolean mustEmit = true;

            if(((srcIdx > anchor + 2)) && (isDelimiter(cur) || (cur == ESCAPE_TOKEN1) || (cur == ESCAPE_TOKEN2))) // At least 2 letters
            {
                // Check word in dictionary
                final int length = srcIdx - anchor - 1;
                DictEntry e1 = this.dictMap[h1 & this.hashMask];
                DictEntry e2 = null;

                // Check for hash collisions
                if((e1 != null) && ((e1.length != length) || (e1.hash != h1))) {
                    e1 = null;
                }

                if(e1 == null) {
                    e2 = this.dictMap[h2 & this.hashMask];

                    if((e2 != null) && ((e2.length != length) || (e2.hash != h2))) {
                        e2 = null;
                    }
                }

                DictEntry e = (e1 != null) ? e1 : e2;

                if(e != null) {
                    if(sameWords(e, src, anchor, length) == false) {
                        e = null;
                    }
                }

                if(e == null) {
                    // Word not found in the dictionary or hash collision: add or replace word
                    if(((length > 3) || ((length > 2) && (words < THRESHOLD2))) && (length < 32768)) {
                        e = this.dictList[words];

                        if(e.idx >= this.staticDictSize) {
                            // Evict and reuse old entry
                            this.dictMap[e.hash & this.hashMask] = null;
                            e.buf = src;
                            e.pos = anchor + 1;
                            e.hash = h1;
                            e.idx = words;
                            e.length = (short) length;
                        }

                        this.dictMap[h1 & this.hashMask] = e;
                        words++;

                        // Dictionary full ? Expand or reset index to end of static dictionary
                        if(words >= this.dictSize) {
                            if(this.expandDictionary() == false) {
                                words = this.staticDictSize;
                            }
                        }
                    }
                }
                else {
                    // Word found in the dictionary
                    // Skip space if only delimiter between 2 word references
                    if((endWordIdx != anchor) || (src[emitAnchor] != ' ')) {
                        dstIdx = this.emitSymbols(src, emitAnchor, dst, dstIdx, anchor + 1, dstEnd);
                    }

                    if(dstIdx >= dstEnd3) {
                        break;
                    }

                    dst[dstIdx++] = (e == e1) ? ESCAPE_TOKEN1 : ESCAPE_TOKEN2;
                    dstIdx = emitWordIndex(dst, dstIdx, e.idx);
                    endWordIdx = srcIdx;
                    mustEmit = false;
                }
            }

            // Emit all symbols since last delimiter
            if(mustEmit == true) {
                dstIdx = this.emitSymbols(src, emitAnchor, dst, dstIdx, srcIdx, dstEnd);
            }

            // Reset delimiter position
            anchor = srcIdx;
            emitAnchor = anchor;
            srcIdx++;
            isFirstWordChar = true;
            h1 = HASH1;
            h2 = HASH1;
        }

        // Emit last symbols
        dstIdx = this.emitSymbols(src, emitAnchor, dst, dstIdx, srcIdx, dstEnd);

        output.index = dstIdx;
        input.index = srcIdx;
        return srcIdx == srcEnd;
    }

    private boolean expandDictionary() {
        if(this.dictSize >= THRESHOLD2 * 32) {
            return false;
        }

        DictEntry[] newDict = new DictEntry[this.dictSize * 2];
        System.arraycopy(this.dictList, 0, newDict, 0, this.dictSize);

        for(int i = this.dictSize; i < this.dictSize * 2; i++)
            newDict[i] = new DictEntry(null, -1, 0, i, 0);

        this.dictList = newDict;
        this.dictSize <<= 1;
        return true;
    }

    private int emitSymbols(byte[] src, final int srcIdx, byte[] dst, int dstIdx, final int srcEnd, final int dstEnd) {
        if(srcIdx >= srcEnd) {
            return 0;
        }

        return (3 * (srcEnd - srcIdx) < (dstEnd - dstIdx)) ?
                this.emit1(src, srcIdx, dst, dstIdx, srcEnd, dstEnd) :
                this.emit2(src, srcIdx, dst, dstIdx, srcEnd, dstEnd);
    }

    private int emit1(byte[] src, final int srcIdx, byte[] dst, int dstIdx, final int srcEnd, final int dstEnd) {
        // Fast path
        if((src[srcIdx] == ESCAPE_TOKEN1) || (src[srcIdx] == ESCAPE_TOKEN2)) {
            // Emit special word
            final int idx = (src[srcIdx] == ESCAPE_TOKEN1) ? this.staticDictSize - 1 : this.staticDictSize - 2;
            dst[dstIdx++] = ESCAPE_TOKEN1;
            dstIdx = emitWordIndex(dst, dstIdx, idx);
        }
        else {
            dst[dstIdx] = src[srcIdx];
            dstIdx++;
        }

        for(int i = srcIdx + 1; i < srcEnd; i++, dstIdx++)
            dst[dstIdx] = src[i];

        return dstIdx;
    }

    private int emit2(byte[] src, final int srcIdx, byte[] dst, int dstIdx, final int srcEnd, final int dstEnd) {
        // Slow path
        for(int i = srcIdx; i < srcEnd; i++) {
            final byte cur = src[i];

            if((cur == ESCAPE_TOKEN1) || (cur == ESCAPE_TOKEN2)) {
                // Emit special word
                final int idx = (cur == ESCAPE_TOKEN1) ? this.staticDictSize - 1 : this.staticDictSize - 2;
                dst[dstIdx] = ESCAPE_TOKEN1;

                if(idx >= THRESHOLD2) {
                    if(dstIdx + 4 > dstEnd) {
                        break;
                    }
                }
                else if(idx >= THRESHOLD1) {
                    if(dstIdx + 3 > dstEnd) {
                        break;
                    }
                }
                else {
                    if(dstIdx + 2 > dstEnd) {
                        break;
                    }
                }

                dstIdx = emitWordIndex(dst, dstIdx, idx);
            }
            else {
                if(dstIdx >= dstEnd) {
                    break;
                }

                dst[dstIdx++] = cur;
            }
        }

        return dstIdx;
    }

    @Override
    public boolean inverse(SliceByteArray input, SliceByteArray output) {
        if((!SliceByteArray.isValid(input)) || (!SliceByteArray.isValid(output))) {
            return false;
        }

        if(input.array == output.array) {
            return false;
        }

        final int count = input.length;
        int srcIdx = input.index;
        int dstIdx = output.index;
        final byte[] src = input.array;
        final byte[] dst = output.array;

        if(count <= 1) {
            if(count > 0) {
                dst[dstIdx++] = src[srcIdx++];
            }

            input.index = srcIdx;
            output.index = dstIdx;
            return true;
        }

        final int srcEnd = input.index + count;
        final int dstEnd = dst.length;
        int anchor = srcIdx - 1;
        int words = this.staticDictSize;
        boolean wordRun = false;

        while ((srcIdx < srcEnd) && (dstIdx < dstEnd)) {
            byte cur = src[srcIdx++];

            if(isText(cur)) {
                dst[dstIdx++] = cur;
                continue;
            }

            if((srcIdx > anchor + 3) && ((cur == ESCAPE_TOKEN1) || (cur == ESCAPE_TOKEN2) || (isDelimiter(cur)))) {
                int length = srcIdx - anchor - 2;
                int h1 = HASH1;

                for(int i = 1; i <= length; i++)
                    h1 = h1 * HASH1 ^ src[anchor + i] * HASH2;

                // Lookup word in dictionary
                DictEntry e = this.dictMap[h1 & this.hashMask];

                // Check for hash collisions
                if((e != null) && ((e.length != length) || (e.hash != h1))) {
                    e = null;
                }

                if(e != null) {
                    if(sameWords(e, src, anchor, length) == false) {
                        e = null;
                    }
                }

                if(e == null) {
                    // Word not found in the dictionary or hash collision: add or replace word
                    if(((length > 3) || ((length > 2) && (words < THRESHOLD2))) && (length < 32768)) {
                        e = this.dictList[words];

                        if(e.idx >= this.staticDictSize) {
                            // Evict and reuse old entry
                            this.dictMap[e.hash & this.hashMask] = null;
                            e.buf = src;
                            e.pos = anchor + 1;
                            e.hash = h1;
                            e.idx = words;
                            e.length = (short) length;
                        }

                        this.dictMap[h1 & this.hashMask] = e;
                        words++;

                        // Dictionary full ? Expand or reset index to end of static dictionary
                        if(words >= this.dictSize) {
                            if(this.expandDictionary() == false) {
                                words = this.staticDictSize;
                            }
                        }
                    }
                }
            }

            if((cur == ESCAPE_TOKEN1) || (cur == ESCAPE_TOKEN2)) {
                // Word in dictionary
                // Read word index (varint 5 bits + 7 bits + 7 bits)
                int idx = src[srcIdx++] & 0xFF;

                if(idx >= 0x80) {
                    idx &= 0x7F;
                    int idx2 = src[srcIdx++] & 0xFF;

                    if(idx2 >= 0x80) {
                        idx2 &= 0x7F;
                        idx &= 0x1F;
                        idx = (idx << 7) | idx2;
                        idx2 = src[srcIdx++] & 0x7F;
                    }

                    idx = (idx << 7) | idx2;

                    if(idx >= this.dictSize) {
                        break;
                    }
                }

                final DictEntry e = this.dictList[idx];

                // Sanity check
                if((e.pos < 0) || (dstIdx + e.length >= dstEnd)) {
                    break;
                }

                // Add space if only delimiter between 2 words (2nd word in dictionary)
                if((wordRun == true) && (idx < this.dictSize)) {
                    dst[dstIdx++] = ' ';
                }

                int flag = 0;

                // Flip case of first character
                if(cur == ESCAPE_TOKEN2) {
                    flag = isUpperCase(e.buf[e.pos]) ? 32 : -32;
                }

                // Emit word
                dst[dstIdx++] = (byte) (e.buf[e.pos] + flag);

                for(int n = e.pos + 1, l = e.pos + e.length; n < l; n++, dstIdx++)
                    dst[dstIdx] = e.buf[n];

                if(e.length > 1) {
                    // Regular word entry
                    wordRun = true;
                    anchor = srcIdx;
                }
                else {
                    // Escape entry
                    wordRun = false;
                    anchor = srcIdx - 1;
                }
            }
            else {
                wordRun = false;
                anchor = srcIdx - 1;
                dst[dstIdx++] = cur;
            }
        }

        output.index = dstIdx;
        input.index = srcIdx;
        return srcIdx == srcEnd;
    }

    @Override
    public int getMaxEncodedLength(int srcLength) {
        // Space needed by destination buffer could be 3 x srcLength (if input data
        // is all delimiters). Limit to 1 x srcLength and ket the caller deal with
        // a failure when the output is not smaller than the input
        return srcLength;
    }

    static class DictEntry {
        int hash; // full hash
        int pos;  // position in text
        int idx; // index in dictionary
        short length; // length in text
        byte[] buf;  // data


        DictEntry(byte[] buf, int pos, int hash, int idx, int length) {
            this.buf = buf;
            this.pos = pos;
            this.hash = hash;
            this.idx = idx;
            this.length = (short) length;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder(this.length);

            for(int i = 0; i < this.length; i++)
                sb.append((char) this.buf[this.pos + i]);

            return sb.toString();
        }
    }
}
