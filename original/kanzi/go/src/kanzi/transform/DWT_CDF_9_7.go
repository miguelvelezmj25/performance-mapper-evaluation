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

package transform

import (
	"errors"
	"fmt"
	"kanzi"
)

// Discrete Wavelet Transform Cohen-Daubechies-Fauveau 9/7 for 2D signals
const (
	SHIFT_1  = 12
	ADJUST_1 = 1 << (SHIFT_1 - 1)
	SHIFT_2  = SHIFT_1 - 1
	ADJUST_2 = 1 << (SHIFT_2 - 1)

	PREDICT1 = 6497 // 1.586134342  * 1<<SHIFT1
	UPDATE1  = 217  // 0.0529801185 * 1<<SHIFT1
	PREDICT2 = 3616 // 0.8829110762 * 1<<SHIFT1
	UPDATE2  = 1817 // 0.4435068522 * 1<<SHIFT1
	SCALING1 = 4709 // 1.149604398  * 1<<SHIFT1
	SCALING2 = 3562 // 0.869864452  * 1<<SHIFT1
)

type DWT_CDF_9_7 struct {
	width  uint  // at least 8
	height uint  // at least 8
	steps  uint  // at least 1
	data   []int // width * height
}

func NewDWT(width, height, steps uint) (*DWT_CDF_9_7, error) {
	if width < 8 {
		return nil, errors.New("Invalid transform width (must be at least 8)")
	}

	if height < 8 {
		return nil, errors.New("Invalid transform height (must be at least 8)")
	}

	if steps < 1 {
		return nil, errors.New("Invalid number of iterations (must be at least 1)")
	}

	if (width >> steps) < 4 {
		return nil, errors.New("Invalid width for band L0 (must) be at least 4)")
	}

	if (height >> steps) < 4 {
		return nil, errors.New("Invalid height for band L0 (must) be at least 4)")
	}

	if (width>>steps)<<steps != width {
		return nil, errors.New("The width is not equal to 2^steps")
	}

	if (height>>steps)<<steps != height {
		return nil, errors.New("The height is not equal to 2^steps")
	}

	this := new(DWT_CDF_9_7)
	this.data = make([]int, width*height)
	this.width = width
	this.height = height
	this.steps = steps
	return this, nil
}

func (this *DWT_CDF_9_7) Forward(src, dst []int) (uint, uint, error) {
	if src == nil {
		return 0, 0, errors.New("Input buffer cannot be null")
	}

	if dst == nil {
		return 0, 0, errors.New("Output buffer cannot be null")
	}

	count := len(src)

	if count != int(this.width*this.height) {
		errMsg := fmt.Sprintf("Input buffer size must be %v", this.width*this.height)
		return 0, 0, errors.New(errMsg)
	}

	if len(dst) < count {
		return 0, 0, errors.New("The output buffer is too small")
	}

	if kanzi.SameIntSlices(src, dst, false) == false {
		copy(dst, src)
	}

	for i := uint(0); i < this.steps; i++ {
		// First, vertical transform
		this.computeForward(dst, this.width, 1, this.width>>i, this.height>>i)

		// Then horizontal transform on the updated signal
		this.computeForward(dst, 1, this.width, this.height>>i, this.width>>i)
	}

	return this.width * this.height, this.width * this.height, nil
}

func (this *DWT_CDF_9_7) computeForward(block []int, stride, inc, dim1, dim2 uint) {
	stride2 := stride << 1
	endOffs := dim1 * inc
	half := stride * (dim2 >> 1)

	for offset := uint(0); offset < endOffs; offset += inc {
		end := offset + (dim2-2)*stride
		prev := block[offset]

		// First lifting stage : Predict 1
		for i := offset + stride; i < end; i += stride2 {
			next := block[i+stride]
			val := ((PREDICT1 * (prev + next)) + ADJUST_1) >> SHIFT_1
			block[i] -= val
			prev = next
		}

		block[end+stride] -= (((PREDICT1 * block[end]) + ADJUST_2) >> SHIFT_2)
		prev = block[offset+stride]

		// Second lifting stage : Update 1
		for i := offset + stride2; i <= end; i += stride2 {
			next := block[i+stride]
			val := ((UPDATE1 * (prev + next)) + ADJUST_1) >> SHIFT_1
			block[i] -= val
			prev = next
		}

		block[offset] -= (((UPDATE1 * block[offset+stride]) + ADJUST_2) >> SHIFT_2)
		prev = block[offset]

		// Third lifting stage : Predict 2
		for i := offset + stride; i < end; i += stride2 {
			next := block[i+stride]
			val := ((PREDICT2 * (prev + next)) + ADJUST_1) >> SHIFT_1
			block[i] += val
			prev = next
		}

		block[end+stride] += (((PREDICT2 * block[end]) + ADJUST_2) >> SHIFT_2)
		prev = block[offset+stride]

		// Fourth lifting stage : Update 2
		for i := offset + stride2; i <= end; i += stride2 {
			next := block[i+stride]
			val := ((UPDATE2 * (prev + next)) + ADJUST_1) >> SHIFT_1
			block[i] += val
			prev = next
		}

		block[offset] += (((UPDATE2 * block[offset+stride]) + ADJUST_2) >> SHIFT_2)

		// Scale
		for i := offset; i <= end; i += stride2 {
			block[i] = ((block[i] * SCALING1) + ADJUST_1) >> SHIFT_1
			block[i+stride] = ((block[i+stride] * SCALING2) + ADJUST_1) >> SHIFT_1
		}

		// De-interleave sub-bands
		endj := offset + half
		i := offset

		for j := offset; j < endj; j += stride {
			this.data[j] = block[i]
			this.data[half+j] = block[i+stride]
			i += stride2
		}

		block[end+stride] = this.data[end+stride]

		for i := offset; i <= end; i += stride {
			block[i] = this.data[i]
		}
	}

}

func (this *DWT_CDF_9_7) Inverse(src, dst []int) (uint, uint, error) {
	if src == nil {
		return 0, 0, errors.New("Input buffer cannot be null")
	}

	if dst == nil {
		return 0, 0, errors.New("Output buffer cannot be null")
	}

	count := len(src)

	if count != int(this.width*this.height) {
		errMsg := fmt.Sprintf("Input buffer size must be %v", this.width*this.height)
		return 0, 0, errors.New(errMsg)
	}

	if len(dst) < count {
		return 0, 0, errors.New("The output buffer is too small")
	}

	if kanzi.SameIntSlices(src, dst, false) == false {
		copy(dst, src)
	}

	i := this.steps - 1

	for {
		// First horizontal transform
		this.computeInverse(dst, 1, this.width, this.height>>i, this.width>>i)

		// Then vertical transform on the updated signal
		this.computeInverse(dst, this.width, 1, this.width>>i, this.height>>i)

		if i == 0 {
			break
		}

		i--
	}

	return this.width * this.height, this.width * this.height, nil
}

func (this *DWT_CDF_9_7) computeInverse(block []int, stride, inc, dim1, dim2 uint) {
	stride2 := stride << 1
	endOffs := dim1 * inc
	half := stride * (dim2 >> 1)

	for offset := uint(0); offset < endOffs; offset += inc {
		end := offset + (dim2-2)*stride
		endj := offset + half

		// Interleave sub-bands
		for i := offset; i <= end; i += stride {
			this.data[i] = block[i]
		}

		this.data[end+stride] = block[end+stride]
		i := offset

		for j := offset; j < endj; j += stride {
			block[i] = this.data[j]
			block[i+stride] = this.data[half+j]
			i += stride2
		}

		// Reverse scale
		for i := offset; i <= end; i += stride2 {
			block[i] = ((block[i] * SCALING2) + ADJUST_1) >> SHIFT_1
			block[i+stride] = ((block[i+stride] * SCALING1) + ADJUST_1) >> SHIFT_1
		}

		// Reverse Update 2
		prev := block[offset+stride]

		for i := offset + stride2; i <= end; i += stride2 {
			next := block[i+stride]
			val := ((UPDATE2 * (prev + next)) + ADJUST_1) >> SHIFT_1
			block[i] -= val
			prev = next
		}

		block[offset] -= (((UPDATE2 * block[offset+stride]) + ADJUST_2) >> SHIFT_2)
		prev = block[offset]

		// Reverse Predict 2
		for i := offset + stride; i < end; i += stride2 {
			next := block[i+stride]
			val := ((PREDICT2 * (prev + next)) + ADJUST_1) >> SHIFT_1
			block[i] -= val
			prev = next
		}

		block[end+stride] -= (((PREDICT2 * block[end]) + ADJUST_2) >> SHIFT_2)
		prev = block[offset+stride]

		// Reverse Update 1
		for i := offset + stride2; i <= end; i += stride2 {
			next := block[i+stride]
			val := ((UPDATE1 * (prev + next)) + ADJUST_1) >> SHIFT_1
			block[i] += val
			prev = next
		}

		block[offset] += (((UPDATE1 * block[offset+stride]) + ADJUST_2) >> SHIFT_2)
		prev = block[offset]

		// Reverse Predict 1
		for i := offset + stride; i < end; i += stride2 {
			next := block[i+stride]
			val := ((PREDICT1 * (prev + next)) + ADJUST_1) >> SHIFT_1
			block[i] += val
			prev = next
		}

		block[end+stride] += (((PREDICT1 * block[end]) + ADJUST_2) >> SHIFT_2)
	}
}
