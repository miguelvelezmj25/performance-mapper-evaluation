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

package io

import (
	"errors"
	"fmt"
	"io"
	"sync"
	"time"
)

// An implementation of BlockListener to display block information (verbose option
// of the BlockCompressor/BlockDecompressor)

const (
	ENCODING = 0
	DECODING = 1
)

type BlockInfo struct {
	time0      time.Time
	time1      time.Time
	time2      time.Time
	time3      time.Time
	stage0Size int
	stage1Size int
}

type InfoPrinter struct {
	writer     io.Writer
	type_      uint
	map_       map[int]BlockInfo
	thresholds []int
	lock       sync.RWMutex
	level      uint
}

func NewInfoPrinter(infoLevel, type_ uint, writer io.Writer) (*InfoPrinter, error) {
	if writer == nil {
		return nil, errors.New("Invalid null writer parameter")
	}

	this := new(InfoPrinter)
	this.type_ = type_ & 1
	this.level = infoLevel
	this.writer = writer
	this.map_ = make(map[int]BlockInfo)

	if this.type_ == ENCODING {
		this.thresholds = []int{
			EVT_BEFORE_TRANSFORM,
			EVT_AFTER_TRANSFORM,
			EVT_BEFORE_ENTROPY,
			EVT_AFTER_ENTROPY,
		}
	} else {
		this.thresholds = []int{
			EVT_BEFORE_ENTROPY,
			EVT_AFTER_ENTROPY,
			EVT_BEFORE_TRANSFORM,
			EVT_AFTER_TRANSFORM,
		}
	}

	return this, nil
}

func (this *InfoPrinter) ProcessEvent(evt *BlockEvent) {
	currentBlockId := evt.BlockId()

	if evt.EventType() == this.thresholds[0] {
		// Register initial block size
		bi := BlockInfo{time0: evt.Time()}

		if this.type_ == ENCODING {
			bi.stage0Size = evt.BlockSize()
		}

		this.lock.Lock()
		this.map_[currentBlockId] = bi
		this.lock.Unlock()

		if this.level >= 4 {
			fmt.Fprintln(this.writer, evt)
		}
	} else if evt.EventType() == this.thresholds[1] {
		this.lock.RLock()
		bi, exists := this.map_[currentBlockId]
		this.lock.RUnlock()

		if exists == true {
			bi.time1 = evt.Time()

			if this.type_ == DECODING {
				bi.stage0Size = evt.BlockSize()
			}

			this.lock.Lock()
			this.map_[currentBlockId] = bi
			this.lock.Unlock()

			if this.level >= 4 {
				duration_ms := bi.time1.Sub(bi.time0).Nanoseconds() / 1000000
				fmt.Fprintln(this.writer, fmt.Sprintf("%s [%d ms]", evt, duration_ms))
			}
		}
	} else if evt.EventType() == this.thresholds[2] {
		this.lock.RLock()
		bi, exists := this.map_[currentBlockId]
		this.lock.RUnlock()

		if exists == true {
			bi.time2 = evt.Time()
			bi.stage1Size = evt.BlockSize()
			this.lock.Lock()
			this.map_[currentBlockId] = bi
			this.lock.Unlock()

			if this.level >= 4 {
				duration_ms := bi.time2.Sub(bi.time1).Nanoseconds() / 1000000
				fmt.Fprintln(this.writer, fmt.Sprintf("%s [%d ms]", evt, duration_ms))
			}
		}
	} else if evt.EventType() == this.thresholds[3] {
		this.lock.RLock()
		bi, exists := this.map_[currentBlockId]
		this.lock.RUnlock()

		if exists == false || this.level < 2 {
			return
		}

		this.lock.Lock()
		delete(this.map_, currentBlockId)
		this.lock.Unlock()
		bi.time3 = evt.Time()
		duration1_ms := bi.time1.Sub(bi.time0).Nanoseconds() / 1000000
		duration2_ms := bi.time3.Sub(bi.time2).Nanoseconds() / 1000000

		// Get block size after stage 2
		stage2Size := evt.BlockSize()

		// Display block info
		var msg string

		if this.level >= 4 {
			fmt.Fprintln(this.writer, fmt.Sprintf("%s [%d ms]", evt, duration2_ms))
		}

		// Display block info
		if this.level >= 3 {
			msg = fmt.Sprintf("Block %d: %d => %d [%d ms] => %d [%d ms]", currentBlockId,
				bi.stage0Size, bi.stage1Size, duration1_ms, stage2Size, duration2_ms)
		} else {
			msg = fmt.Sprintf("Block %d: %d => %d => %d", currentBlockId,
				bi.stage0Size, bi.stage1Size, stage2Size)
		}

		// Add compression ratio for encoding
		if this.type_ == ENCODING {
			if bi.stage0Size != 0 {
				msg += fmt.Sprintf(" (%d%%)", uint64(stage2Size)*100/uint64(bi.stage0Size))
			}
		}

		// Optionally add hash
		if evt.Hashing() == true {
			msg += fmt.Sprintf("  [%x]", evt.Hash())
		}

		fmt.Fprintln(this.writer, msg)
	}
}
