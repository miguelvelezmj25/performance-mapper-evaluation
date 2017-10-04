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

#ifndef _InfoPrinter_
#define _InfoPrinter_

#include <map>
#include <ostream>
#include "../concurrent.hpp"
#include "../types.hpp"
#include "BlockListener.hpp"
#include "../OutputStream.hpp"
#ifdef CONCURRENCY_ENABLED
#include <mutex>
#endif

using namespace std;

namespace kanzi
{

	class BlockInfo
	{
	public:
		Clock _clock1;
		Clock _clock2;
		uint _stage0Size;
		uint _stage1Size;
	};

	// An implementation of BlockListener to display block information (verbose option
	// of the BlockCompressor/BlockDecompressor)
	class InfoPrinter : public BlockListener
	{
	public:
		enum Type {
			ENCODING,
			DECODING
		};

		InfoPrinter(int infoLevel, InfoPrinter::Type type, OutputStream& os);

		~InfoPrinter() {}

		void processEvent(const BlockEvent& evt);

	private:
		ostream& _os;
		map<int, BlockInfo*> _map;
#ifdef CONCURRENCY_ENABLED
		mutex _mutex;
#endif
		BlockEvent::Type _thresholds[4];
		InfoPrinter::Type _type;
		int _level;
	};

}
#endif
