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

#include <cstring>
#include "BWTBlockCodec.hpp"

using namespace kanzi;

// Return true if the compression chain succeeded. In this case, the input data
// may be modified. If the compression failed, the input data is returned unmodified.
bool BWTBlockCodec::forward(SliceArray<byte>& input, SliceArray<byte>& output, int blockSize)
{
    if ((!SliceArray<byte>::isValid(input)) || (!SliceArray<byte>::isValid(output)))
       return false;

    if (input._array == output._array)
        return false;

    if (output._length - output._index < getMaxEncodedLength(blockSize))
        return false;

    byte* p0 = &output._array[output._index];
    int log = 1;

    while (1 << log <= blockSize)
        log++;

    log--;

    // Estimate header size based on block size
    const int headerSizeBytes1 = (2 + log + 7) >> 3;
    output._index += headerSizeBytes1;

    // Apply forward transform
    if (_bwt.forward(input, output, blockSize) == false)
        return false;

    int primaryIndex = _bwt.getPrimaryIndex();
    int pIndexSizeBits = 6;

    while ((1 << pIndexSizeBits) <= primaryIndex)
        pIndexSizeBits++;

    // Compute block size based on primary index
    const int headerSizeBytes2 = (2 + pIndexSizeBits + 7) >> 3;

    if (headerSizeBytes2 != headerSizeBytes1) {
        // Adjust space for header
        memmove(&p0[headerSizeBytes2], &p0[headerSizeBytes1], blockSize);
        output._index = output._index - headerSizeBytes1 + headerSizeBytes2;
    }

    // Write block header (mode + primary index). See top of file for format
    int shift = (headerSizeBytes2 - 1) << 3;
    int blockMode = (pIndexSizeBits + 1) >> 3;
    blockMode = (blockMode << 6) | ((primaryIndex >> shift) & 0x3F);
    p0[0] = (byte)blockMode;

    for (int i = 1; i < headerSizeBytes2; i++) {
        shift -= 8;
        p0[i] = (byte)(primaryIndex >> shift);
    }

    return true;
}

bool BWTBlockCodec::inverse(SliceArray<byte>& input, SliceArray<byte>& output, int blockSize)
{
    if ((!SliceArray<byte>::isValid(input)) || (!SliceArray<byte>::isValid(output)))
       return false;

    if (input._array == output._array)
        return false;

    // Read block header (mode + primary index). See top of file for format
    const int blockMode = input._array[input._index++] & 0xFF;
    const int headerSizeBytes = 1 + ((blockMode >> 6) & 0x03);

    if (blockSize < headerSizeBytes)
        return false;

    if (blockSize == headerSizeBytes)
        return true;

    blockSize -= headerSizeBytes;
    int shift = (headerSizeBytes - 1) << 3;
    int primaryIndex = (blockMode & 0x3F) << shift;

    // Extract BWT primary index
    for (int i = 1; i < headerSizeBytes; i++) {
        shift -= 8;
        primaryIndex |= ((input._array[input._index++] & 0xFF) << shift);
    }

    _bwt.setPrimaryIndex(primaryIndex);

    // Apply inverse Transform
    return _bwt.inverse(input, output, blockSize);
}
