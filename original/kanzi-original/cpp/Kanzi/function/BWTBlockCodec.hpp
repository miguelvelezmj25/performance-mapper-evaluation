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

#ifndef _BWTBlockCodec_
#define _BWTBlockCodec_

#include "../transform/BWT.hpp"
#include "../Function.hpp"

namespace kanzi 
{

   // Utility class to en/de-code a BWT data block and its associated primary index

   // BWT stream format: Header (m bytes) Data (n bytes)
   // Header: mode (8 bits) + BWT primary index (8, 16 or 24 bits)
   // mode: bits 7-6 contain the size in bits of the primary index :
   //           00: primary index size <=  6 bits (fits in mode byte)
   //           01: primary index size <= 14 bits (1 extra byte)
   //           10: primary index size <= 22 bits (2 extra bytes)
   //           11: primary index size  > 22 bits (3 extra bytes)
   //       bits 5-0 contain 6 most significant bits of primary index
   // primary index: remaining bits (up to 3 bytes)

   class BWTBlockCodec : public Function<byte> {
   public:
       BWTBlockCodec() {}

       ~BWTBlockCodec() {}

       bool forward(SliceArray<byte>& input, SliceArray<byte>& output, int length);

       bool inverse(SliceArray<byte>& input, SliceArray<byte>& output, int length);

       // Required encoding output buffer size
       int getMaxEncodedLength(int srcLen) const
       {
           // Return input buffer size + max header size
           return srcLen + 4;
       }

   private:
       BWT _bwt;
   };

}
#endif
