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

#ifndef _EntropyCodecFactory_
#define _EntropyCodecFactory_

#include <algorithm>
#include "ANSRangeDecoder.hpp"
#include "ANSRangeEncoder.hpp"
#include "BinaryEntropyDecoder.hpp"
#include "BinaryEntropyEncoder.hpp"
#include "ExpGolombDecoder.hpp"
#include "ExpGolombEncoder.hpp"
#include "HuffmanDecoder.hpp"
#include "HuffmanEncoder.hpp"
#include "NullEntropyDecoder.hpp"
#include "NullEntropyEncoder.hpp"
#include "RangeDecoder.hpp"
#include "RangeEncoder.hpp"
#include "RiceGolombDecoder.hpp"
#include "RiceGolombEncoder.hpp"
#include "CMPredictor.hpp"
#include "FPAQPredictor.hpp"
#include "PAQPredictor.hpp"
#include "TPAQPredictor.hpp"
#include "../IllegalArgumentException.hpp"

namespace kanzi 
{

   class EntropyCodecFactory 
   {
   private:
       static const byte NONE_TYPE = 0; // No compression
       static const byte HUFFMAN_TYPE = 1; // Huffman
       static const byte FPAQ_TYPE = 2; // Fast PAQ (order 0)
       static const byte PAQ_TYPE = 3; // PAQ (stripped from many models for speed)
       static const byte RANGE_TYPE = 4; // Range
       static const byte ANS_TYPE = 5; // Asymmetric Numerical System order 0
       static const byte CM_TYPE = 6; // Context Model
       static const byte TPAQ_TYPE = 7; // Tangelo PAQ

   public:
       static EntropyDecoder* newDecoder(InputBitStream& ibs, short entropyType) THROW;

       static EntropyEncoder* newEncoder(OutputBitStream& obs, short entropyType) THROW;

       static const char* getName(short entropyType) THROW;

       static short getType(const char* name) THROW;
   };

   inline EntropyDecoder* EntropyCodecFactory::newDecoder(InputBitStream& ibs, short entropyType) THROW
   {
       switch (entropyType) {
       // Each block is decoded separately
       // Rebuild the entropy decoder to reset block statistics
       case HUFFMAN_TYPE:
           return new HuffmanDecoder(ibs);

         case ANS_TYPE:
            return new ANSRangeDecoder(ibs);

       case RANGE_TYPE:
           return new RangeDecoder(ibs);

       case PAQ_TYPE:
           return new BinaryEntropyDecoder(ibs, new PAQPredictor());

       case FPAQ_TYPE:
           return new BinaryEntropyDecoder(ibs, new FPAQPredictor());

       case CM_TYPE:
           return new BinaryEntropyDecoder(ibs, new CMPredictor());

       case TPAQ_TYPE:
           return new BinaryEntropyDecoder(ibs, new TPAQPredictor());

       case NONE_TYPE:
           return new NullEntropyDecoder(ibs);

       default:
           throw IllegalArgumentException("Unsupported entropy codec type: " + (char)entropyType);
       }
   }

   inline EntropyEncoder* EntropyCodecFactory::newEncoder(OutputBitStream& obs, short entropyType) THROW
   {
       switch (entropyType) {
       case HUFFMAN_TYPE:
           return new HuffmanEncoder(obs);

       case ANS_TYPE:
           return new ANSRangeEncoder(obs);

       case RANGE_TYPE:
           return new RangeEncoder(obs);

       case PAQ_TYPE:
           return new BinaryEntropyEncoder(obs, new PAQPredictor());

       case FPAQ_TYPE:
           return new BinaryEntropyEncoder(obs, new FPAQPredictor());

       case CM_TYPE:
           return new BinaryEntropyEncoder(obs, new CMPredictor());

       case TPAQ_TYPE:
           return new BinaryEntropyEncoder(obs, new TPAQPredictor());

       case NONE_TYPE:
           return new NullEntropyEncoder(obs);

       default:
           throw IllegalArgumentException("Unknown entropy codec type: " + (char)entropyType);
       }
   }

   inline const char* EntropyCodecFactory::getName(short entropyType) THROW
   {
       switch (entropyType) {
       case HUFFMAN_TYPE:
           return "HUFFMAN";

       case ANS_TYPE:
           return "ANS";

       case RANGE_TYPE:
           return "RANGE";

       case PAQ_TYPE:
           return "PAQ";

       case FPAQ_TYPE:
           return "FPAQ";

       case CM_TYPE:
           return "CM";

       case TPAQ_TYPE:
           return "TPAQ";

       case NONE_TYPE:
           return "NONE";

       default:
           throw IllegalArgumentException("Unknown entropy codec type: " + (char)entropyType);
       }
   }

   inline short EntropyCodecFactory::getType(const char* str) THROW
   {
	   string name = str;
       transform(name.begin(), name.end(), name.begin(), ::toupper);

       if (name == "HUFFMAN")
           return HUFFMAN_TYPE;

       if (name == "ANS")
           return ANS_TYPE;

       if (name == "FPAQ")
           return FPAQ_TYPE;

       if (name == "PAQ")
           return PAQ_TYPE;

       if (name == "RANGE")
           return RANGE_TYPE;

       if (name == "CM")
           return CM_TYPE;

       if (name == "TPAQ")
           return TPAQ_TYPE;

       if (name == "NONE")
           return NONE_TYPE;

       throw IllegalArgumentException("Unsupported entropy codec type: " + name);
   }
}
#endif
