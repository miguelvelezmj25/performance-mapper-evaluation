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

#include <sstream>
#include "LZ4Codec.hpp"
#include "../IllegalArgumentException.hpp"

using namespace kanzi;

LZ4Codec::LZ4Codec()
{
    _buffer = new int[1 << HASH_LOG_64K];
}

inline int LZ4Codec::writeLength(byte block[], int length)
{
    int idx = 0;

    while (length >= 0x1FE) {
        block[idx] = (byte)0xFF;
        block[idx + 1] = (byte)0xFF;
        idx += 2;
        length -= 0x1FE;
    }

    if (length >= 0xFF) {
        block[idx] = (byte)0xFF;
        idx++;
        length -= 0xFF;
    }

    block[idx] = (byte)length;
    return idx + 1;
}


int LZ4Codec::writeLastLiterals(byte src[], byte dst[], int runLength)
{
    int dstIdx = 1;

    if (runLength >= RUN_MASK) {
        dst[0] = (byte)(RUN_MASK << ML_BITS);
        dstIdx += writeLength(&dst[1], runLength - RUN_MASK);
    }
    else {
        dst[0] = (byte)(runLength << ML_BITS);
    }

    memcpy(&dst[dstIdx], src, runLength);
    return dstIdx + runLength;
}

// Generates same byte output as LZ4_compress_generic in LZ4 r131 (7/15)
// for a 32 bit architecture.
bool LZ4Codec::forward(SliceArray<byte>& input, SliceArray<byte>& output, int count)
{
    if ((!SliceArray<byte>::isValid(input)) || (!SliceArray<byte>::isValid(output)))
       return false;

    if (input._array == output._array)
        return false;

    const int srcIdx0 = input._index;
    const int dstIdx0 = output._index;
    byte* src = input._array;
    byte* dst = output._array;

    if (output._length - dstIdx0 < getMaxEncodedLength(count))
       return false;

    const int base = 0;
    const int hashLog = (count < LZ4_64K_LIMIT) ? HASH_LOG_64K : HASH_LOG;
    const int hashShift = 32 - hashLog;
    const int srcEnd = srcIdx0 + count;
    const int matchLimit = srcEnd - LAST_LITERALS;
    const int mfLimit = srcEnd - MF_LIMIT;
    int srcIdx = srcIdx0;
    int dstIdx = dstIdx0;
    int anchor = srcIdx0;
    int* table = _buffer; // aliasing

    if (count > MIN_LENGTH) {
        memset(table, 0, sizeof(int) * (size_t(1) << hashLog));

        // First byte
        int h = (Global::readUInt32(&src[srcIdx]) * LZ4_HASH_SEED) >> hashShift;
        table[h] = srcIdx - base;
        srcIdx++;
        h = (Global::readUInt32(&src[srcIdx]) * LZ4_HASH_SEED) >> hashShift;

        while (true) {
            int fwdIdx = srcIdx;
            int step = 1;
            int searchMatchNb = SEARCH_MATCH_NB;
            int match;

            // Find a match
            do {
                srcIdx = fwdIdx;
                fwdIdx += step;

                if (fwdIdx > mfLimit) {
                    // Encode last literals
                    dstIdx += writeLastLiterals(&src[anchor], &dst[dstIdx], srcEnd - anchor);
                    input._index = srcEnd;
                    output._index = dstIdx;
                    return true;
                }

                step = searchMatchNb >> SKIP_STRENGTH;
                searchMatchNb++;
                match = table[h] + base;
                table[h] = srcIdx - base;
                h = (Global::readUInt32(&src[fwdIdx]) * LZ4_HASH_SEED) >> hashShift;
            } while ((differentInts(src, match, srcIdx) == true) || (match <= srcIdx - MAX_DISTANCE));

            // Catch up
            while ((match > 0) && (srcIdx > anchor) && (src[match - 1] == src[srcIdx - 1])) {
                match--;
                srcIdx--;
            }

            // Encode literal length
            const int litLength = srcIdx - anchor;
            int token = dstIdx;
            dstIdx++;

            if (litLength >= RUN_MASK) {
                dst[token] = (byte)(RUN_MASK << ML_BITS);
                dstIdx += writeLength(&dst[dstIdx], litLength - RUN_MASK);
            }
            else {
                dst[token] = (byte)(litLength << ML_BITS);
            }

            // Copy literals
            customArrayCopy(&src[anchor], &dst[dstIdx], litLength);
            dstIdx += litLength;

            // Next match
            do {
                // Encode offset
                dst[dstIdx++] = (byte)(srcIdx - match);
                dst[dstIdx++] = (byte)((srcIdx - match) >> 8);

                // Encode match length
                srcIdx += MIN_MATCH;
                match += MIN_MATCH;
                anchor = srcIdx;

                while ((srcIdx < matchLimit) && (src[srcIdx] == src[match])) {
                    srcIdx++;
                    match++;
                }

                const int matchLength = srcIdx - anchor;

                // Encode match length
                if (matchLength >= ML_MASK) {
                    dst[token] += (byte)ML_MASK;
                    dstIdx += writeLength(&dst[dstIdx], matchLength - ML_MASK);
                }
                else {
                    dst[token] += (byte)matchLength;
                }

                anchor = srcIdx;

                if (srcIdx > mfLimit) {
                    // Encode last literals
                    dstIdx += writeLastLiterals(&src[anchor], &dst[dstIdx], srcEnd - anchor);
                    input._index = srcEnd;
                    output._index = dstIdx;
                    return true;
                }

                // Fill table
                h = (Global::readUInt32(&src[srcIdx - 2]) * LZ4_HASH_SEED) >> hashShift;
                table[h] = srcIdx - 2 - base;

                // Test next position
                h = (Global::readUInt32(&src[srcIdx]) * LZ4_HASH_SEED) >> hashShift;
                match = table[h] + base;
                table[h] = srcIdx - base;

                if ((differentInts(src, match, srcIdx) == true) || (match <= srcIdx - MAX_DISTANCE))
                    break;

                token = dstIdx;
                dstIdx++;
                dst[token] = 0;
            } while (true);

            // Prepare next loop
            srcIdx++;
            h = (Global::readUInt32(&src[srcIdx]) * LZ4_HASH_SEED) >> hashShift;
        }
    }

    // Encode last literals
    dstIdx += writeLastLiterals(&src[anchor], &dst[dstIdx], srcEnd - anchor);
    input._index = srcEnd;
    output._index = dstIdx;
    return true;
}


// Reads same byte input as LZ4_decompress_generic in LZ4 r131 (7/15)
// for a 32 bit architecture.
bool LZ4Codec::inverse(SliceArray<byte>& input, SliceArray<byte>& output, int count)
{
    if ((!SliceArray<byte>::isValid(input)) || (!SliceArray<byte>::isValid(output)))
       return false;

    if (input._array == output._array)
        return false;

    const int srcIdx0 = input._index;
    const int dstIdx0 = output._index;
    byte* src = input._array;
    byte* dst = output._array;
    const int srcEnd = srcIdx0 + count;
    const int dstEnd =  output._length;
    const int srcEnd2 = srcEnd - COPY_LENGTH;
    const int dstEnd2 = dstEnd - COPY_LENGTH;
    int srcIdx = srcIdx0;
    int dstIdx = dstIdx0;

    while (true) {
        // Get literal length
        const int token = src[srcIdx++] & 0xFF;
        int length = token >> ML_BITS;

        if (length == RUN_MASK) {
            byte len;

            while (((len = src[srcIdx++]) == (byte)0xFF) && (srcIdx <= srcEnd))
                length += 0xFF;

            length += (len & 0xFF);

            if (length > MAX_LENGTH) {
                stringstream ss;
                ss << "Invalid length decoded: " << length;
                throw IllegalArgumentException(ss.str());
            }
        }

        // Copy literals
        if ((dstIdx + length > dstEnd2) || (srcIdx + length > srcEnd2)) {
            memcpy(&dst[dstIdx], &src[srcIdx], length);
            srcIdx += length;
            dstIdx += length;
            break;
        }

        customArrayCopy(&src[srcIdx], &dst[dstIdx], length);
        srcIdx += length;
        dstIdx += length;

		  if ((dstIdx > dstEnd2) || (srcIdx > srcEnd2))
		  	  break;

        // Get offset
        const int delta = (src[srcIdx] & 0xFF) | ((src[srcIdx+1] & 0xFF) << 8);
        srcIdx += 2;
        int match = dstIdx - delta;

        if (match < 0)
            break;

        length = token & ML_MASK;

        // Get match length
        if (length == ML_MASK) {
            byte len;

            while (((len = src[srcIdx++]) == (byte)0xFF) && (srcIdx <= srcEnd))
                length += 0xFF;

            length += (len & 0xFF);

            if (length > MAX_LENGTH) {
                stringstream ss;
                ss << "Invalid length decoded: " << length;
                throw IllegalArgumentException(ss.str());
            }
        }

        length += MIN_MATCH;
        const int cpy = dstIdx + length;

        // Copy repeated sequence
        if (cpy > dstEnd2) {
            byte* p1 = &dst[dstIdx];
            byte* p2 = &dst[match];

            for (int i = 0; i < length; i++)
                p1[i] = p2[i];
        }
        else {
            // Unroll loop
            do {
                byte* p1 = &dst[dstIdx];
                byte* p2 = &dst[match];
                p1[0] = p2[0];
                p1[1] = p2[1];
                p1[2] = p2[2];
                p1[3] = p2[3];
                p1[4] = p2[4];
                p1[5] = p2[5];
                p1[6] = p2[6];
                p1[7] = p2[7];
                match += 8;
                dstIdx += 8;
            } while (dstIdx < cpy);
        }

        // Correction
        dstIdx = cpy;
    }

    input._index = srcIdx;
    output._index = dstIdx;
    return srcIdx == srcEnd;
}


inline void LZ4Codec::arrayChunkCopy(byte* pSrc, byte* pDst)
{
    memcpy(pDst, pSrc, 8);
}

inline void LZ4Codec::customArrayCopy(byte src[], byte dst[], int len)
{
    for (int i = 0; i < len; i += 8)
        arrayChunkCopy(&src[i], &dst[i]);
}

inline bool LZ4Codec::differentInts(byte block[], int srcIdx, int dstIdx)
{
    return *((int*)&block[srcIdx]) != *((int*)&block[dstIdx]);
}
