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
#include <cstdio>
//#include "../util.hpp"
#include "InfoPrinter.hpp"

using namespace kanzi;

//mutex PrintStream::_mutex;

InfoPrinter::InfoPrinter(int infoLevel, InfoPrinter::Type type, OutputStream& os)
    : _os(os)
{
    _level = infoLevel;
    _type = type;

    if (type == InfoPrinter::ENCODING) {
        _thresholds[0] = BlockEvent::BEFORE_TRANSFORM;
        _thresholds[1] = BlockEvent::AFTER_TRANSFORM;
        _thresholds[2] = BlockEvent::BEFORE_ENTROPY;
        _thresholds[3] = BlockEvent::AFTER_ENTROPY;
    }
    else {
        _thresholds[0] = BlockEvent::BEFORE_ENTROPY;
        _thresholds[1] = BlockEvent::AFTER_ENTROPY;
        _thresholds[2] = BlockEvent::BEFORE_TRANSFORM;
        _thresholds[3] = BlockEvent::AFTER_TRANSFORM;
    }
}

void InfoPrinter::processEvent(const BlockEvent& evt)
{
    int currentBlockId = evt.getId();

    if (evt.getType() == _thresholds[0]) {

        // Register initial block size
        BlockInfo* bi = new BlockInfo();
        bi->_clock1.start();

        if (_type == InfoPrinter::ENCODING)
            bi->_stage0Size = evt.getSize();

        {
#ifdef CONCURRENCY_ENABLED
            unique_lock<mutex> lock(_mutex);
#endif
            _map.insert(pair<int, BlockInfo*>(currentBlockId, bi));
        }

        if (_level >= 4) {
//			PrintStream(_os) << evt.toString() << endl;
            _os << evt.toString() << endl;
        }
    }
    else if (evt.getType() == _thresholds[1]) {
        BlockInfo* bi = nullptr;

        {
#ifdef CONCURRENCY_ENABLED
            unique_lock<mutex> lock(_mutex);
#endif
            map<int, BlockInfo*>::iterator it = _map.find(currentBlockId);

            if (it == _map.end())
                return;

            bi = it->second;
        }

        if (_type == InfoPrinter::DECODING)
            bi->_stage0Size = evt.getSize();

        bi->_clock1.stop();

        if (_level >= 4) {
            stringstream ss;
            ss << evt.toString() << " [" << uint(bi->_clock1.elapsed()) << " ms]";
//          PrintStream(_os) << ss.str() << endl;
            _os << ss.str() << endl;
        }

         bi->_clock2.start();
    }
    else if (evt.getType() == _thresholds[2]) {
        BlockInfo* bi = nullptr;

        {
#ifdef CONCURRENCY_ENABLED
            unique_lock<mutex> lock(_mutex);
#endif
            map<int, BlockInfo*>::iterator it = _map.find(currentBlockId);

            if (it == _map.end())
                return;

            bi = it->second;
        }

        bi->_clock2.stop();
        bi->_stage1Size = evt.getSize();

        if (_level >= 4) {
            stringstream ss;
            ss << evt.toString() << " [" << uint(bi->_clock2.elapsed())  << " ms]";
//          PrintStream(_os) << ss.str() << endl;
            _os << ss.str() << endl;
        }

        bi->_clock2.start();
    }
    else if (evt.getType() == _thresholds[3]) {
        BlockInfo* bi = nullptr;
        map<int, BlockInfo*>::iterator it;

        {
#ifdef CONCURRENCY_ENABLED
            unique_lock<mutex> lock(_mutex);
#endif
            it = _map.find(currentBlockId);

            if (it == _map.end())
                return;

            if (_level < 2) {
                delete it->second;
                _map.erase(it);
                return;
            }

            bi = it->second;
        }

        int stage2Size = evt.getSize();
        bi->_clock2.stop();
        stringstream ss;

        if (_level >= 4) {
            ss << evt.toString() << " [" << uint(bi->_clock2.elapsed()) << " ms]" << endl;
        }

        // Display block info
        if (_level >= 3) {
            ss << "Block " << currentBlockId << ": " << bi->_stage0Size << " => ";
            ss << bi->_stage1Size << " [" << uint(bi->_clock1.elapsed()) << " ms] => " << stage2Size;
            ss << " [" << uint(bi->_clock2.elapsed()) << " ms]";
        }
        else {
            ss << "Block " << currentBlockId << ": " << bi->_stage0Size << " => ";
            ss << bi->_stage1Size << " => " << stage2Size;
        }

        // Add compression ratio for encoding
        if (_type == InfoPrinter::ENCODING) {
            if (bi->_stage0Size != 0) {
                char buf[32];
                sprintf(buf, " (%d%%)", uint(stage2Size * (double)100 / (double)bi->_stage0Size));
                ss << buf;
            }
        }

        // Optionally add hash
        if (evt.getHash() != 0) {
            char buf[32];
            sprintf(buf, " [%08X]", evt.getHash());
            ss << buf;
        }

//		  PrintStream(_os) << ss.str() << endl;
        _os << ss.str() << endl;
        delete bi;

        {
#ifdef CONCURRENCY_ENABLED
            unique_lock<mutex> lock(_mutex);
#endif
            _map.erase(it);
        }
    }
}
