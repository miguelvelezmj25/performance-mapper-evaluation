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

package function

import (
	"errors"
	"kanzi"
)

const (
	TRANSFORM_SKIP_MASK = 0x0F
)

// Encapsulates a sequence of transforms or functions in a function
type ByteTransformSequence struct {
	transforms []kanzi.ByteTransform // transforms or functions
	skipFlags  byte                  // skip transforms: 0b0000yyyy with yyyy=flags
}

func NewByteTransformSequence(transforms []kanzi.ByteTransform) (*ByteTransformSequence, error) {
	if transforms == nil {
		return nil, errors.New("Invalid null transforms parameter")
	}

	if len(transforms) == 0 || len(transforms) > 4 {
		return nil, errors.New("Only 1 to 4 transforms allowed")
	}

	this := new(ByteTransformSequence)
	this.transforms = transforms
	this.skipFlags = 0
	return this, nil
}

func (this *ByteTransformSequence) Forward(src, dst []byte) (uint, uint, error) {
	// Check for null buffers. Let individual transforms decide on buffer equality
	if src == nil {
		return 0, 0, errors.New("Input buffer cannot be null")
	}

	if dst == nil {
		return 0, 0, errors.New("Output buffer cannot be null")
	}

	if len(src) == 0 {
		return 0, 0, nil
	}

	blockSize := len(src)
	length := uint(len(src))
	input := &dst
	output := &src
	requiredSize := this.MaxEncodedLen(blockSize)
	this.skipFlags = 0
	var err error

	for i, t := range this.transforms {
		if input == &src {
			input = &dst

			// Check that the output buffer has enough room. If not, allocate a new one.
			if len(src) < requiredSize {
				src = make([]byte, requiredSize)
			}

			output = &src
		} else {
			input = &src

			// Check that the output buffer has enough room. If not, allocate a new one.
			if len(dst) < requiredSize {
				dst = make([]byte, requiredSize)
			}

			output = &dst
		}

		var err1 error
		var oIdx uint
		in := *input

		// Apply forward transform
		if _, oIdx, err1 = t.Forward(in[0:length], *output); err1 != nil {
			// Transform failed (probably due to lack of space in output). Revert
			if input != output {
				copy(*output, in[0:length])
			}

			oIdx = length
			this.skipFlags |= (1 << (3 - uint(i)))

			if err == nil {
				err = err1
			}
		}

		length = oIdx
	}

	for i := len(this.transforms); i < 4; i++ {
		this.skipFlags |= (1 << (3 - uint(i)))
	}

	if output != &dst {
		copy(dst, src[0:length])
	}

	if this.skipFlags != TRANSFORM_SKIP_MASK {
		err = nil
	}

	return uint(blockSize), length, err
}

func (this *ByteTransformSequence) Inverse(src, dst []byte) (uint, uint, error) {
	if src == nil {
		return 0, 0, errors.New("Input buffer cannot be null")
	}

	if dst == nil {
		return 0, 0, errors.New("Output buffer cannot be null")
	}

	if len(src) == 0 {
		return 0, 0, nil
	}

	blockSize := len(src)
	length := uint(blockSize)

	if this.skipFlags == TRANSFORM_SKIP_MASK {
		if !kanzi.SameByteSlices(src, dst, false) {
			copy(dst, src)
		}

		return length, length, nil
	}

	input := &src
	output := &dst
	var res error

	// Process transforms sequentially in reverse order
	for i := len(this.transforms) - 1; i >= 0; i-- {
		if this.skipFlags&(1<<(3-uint(i))) != 0 {
			continue
		}
		t := this.transforms[i]
		in := *input
		out := *output

		// Apply inverse transform
		_, length, res = t.Inverse(in[0:length], out[0:cap(out)])

		if res != nil {
			break
		}

		if input == &src {
			input = &dst
			output = &src
		} else {
			input = &src
			output = &dst
		}

	}

	if output != &dst {
		copy(dst[0:cap(dst)], src[0:length])
	}

	return uint(blockSize), length, res
}

func (this ByteTransformSequence) MaxEncodedLen(srcLen int) int {
	requiredSize := srcLen

	for _, t := range this.transforms {
		if f, isFunction := t.(kanzi.ByteFunction); isFunction == true {
			reqSize := f.MaxEncodedLen(srcLen)

			if reqSize > requiredSize {
				requiredSize = reqSize
			}
		}
	}

	return requiredSize
}

func (this *ByteTransformSequence) SkipFlags() byte {
	return this.skipFlags
}

func (this *ByteTransformSequence) SetSkipFlags(flags byte) bool {
	this.skipFlags = flags
	return true
}
