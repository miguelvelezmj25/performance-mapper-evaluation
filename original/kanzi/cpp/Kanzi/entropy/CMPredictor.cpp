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


#include "../types.hpp"
#include "CMPredictor.hpp"

using namespace kanzi;

CMPredictor::CMPredictor()
{
    _ctx = 1;
    _run = 1;
    _idx = 8;
    _runMask = 0;
    _c1 = 0;
    _c2 = 0;

    for (int i = 0; i < 256; i++) {
        for (int j = 0; j <= 256; j++)
            _counter1[i][j] = 32768;

        for (int j = 0; j <= 16; j++) {
            _counter2[i + i][j] = j << 12;
            _counter2[i + i + 1][j] = j << 12;
        }

        _counter2[i + i][16] -= 16;
        _counter2[i + i + 1][16] -= 16;
    }
}

// Update the probability model
inline void CMPredictor::update(int bit)
{
    int* counter1_ = _counter1[_ctx];
    _ctx <<= 1;
    int* counter2_ = _counter2[_ctx | _runMask];

    if (bit == 0) {
        counter1_[256] -= (counter1_[256] >> FAST_RATE);
        counter1_[_c1] -= (counter1_[_c1] >> MEDIUM_RATE);
        counter2_[_idx + 1] -= (counter2_[_idx + 1] >> SLOW_RATE);
        counter2_[_idx] -= (counter2_[_idx] >> SLOW_RATE);
    }
    else {
        counter1_[256] += ((counter1_[256] ^ 0xFFFF) >> FAST_RATE);
        counter1_[_c1] += ((counter1_[_c1] ^ 0xFFFF) >> MEDIUM_RATE);
        counter2_[_idx + 1] += ((counter2_[_idx + 1] ^ 0xFFFF) >> SLOW_RATE);
        counter2_[_idx] += ((counter2_[_idx] ^ 0xFFFF) >> SLOW_RATE);
        _ctx++;
    }

    if (_ctx > 255) {
        _c2 = _c1;
        _c1 = _ctx & 0xFF;
        _ctx = 1;

        if (_c1 == _c2) {
            _run++;
            _runMask = ((uint32)(2 - _run)) >> 31;
        }
        else {
            _run = 0;
            _runMask = 0;
        }
    }
}

// Return the split value representing the probability of 1 in the [0..4095] range.
inline int CMPredictor::get()
{
    const int* pc1 = _counter1[_ctx];
    const int p = (7 * (pc1[256] + pc1[_c1]) + (pc1[_c2] << 1)) >> 4;
    _idx = p >> 12;
    const int* pc2 = _counter2[(_ctx << 1) | _runMask];
    const int x1 = pc2[_idx];
    const int x2 = pc2[_idx + 1];
    const int ssep = x1 + (((x2 - x1) * (p & 4095)) >> 12);
    return (p + ssep + ssep + ssep + 32) >> 6; // rescale to [0..4095]
}
