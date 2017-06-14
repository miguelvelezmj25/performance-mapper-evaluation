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

package entropy

import (
	"fmt"
	"kanzi"
	"strings"
)

const (
	NONE_TYPE    = uint16(0) // No compression
	HUFFMAN_TYPE = uint16(1) // Huffman
	FPAQ_TYPE    = uint16(2) // Fast PAQ (order 0)
	PAQ_TYPE     = uint16(3) // PAQ (stripped from many models for speed)
	RANGE_TYPE   = uint16(4) // Range
	ANS_TYPE     = uint16(5) // Asymmetric Numerical System
	CM_TYPE      = uint16(6) // Context Model
	TPAQ_TYPE    = uint16(7) // Tangelo PAQ
)

func NewEntropyDecoder(ibs kanzi.InputBitStream, entropyType uint16) (kanzi.EntropyDecoder, error) {
	switch entropyType {

	case HUFFMAN_TYPE:
		return NewHuffmanDecoder(ibs)

	case ANS_TYPE:
		return NewANSRangeDecoder(ibs)

	case RANGE_TYPE:
		return NewRangeDecoder(ibs)

	case PAQ_TYPE:
		predictor, _ := NewPAQPredictor()
		return NewBinaryEntropyDecoder(ibs, predictor)

	case FPAQ_TYPE:
		predictor, _ := NewFPAQPredictor()
		return NewBinaryEntropyDecoder(ibs, predictor)

	case CM_TYPE:
		predictor, _ := NewCMPredictor()
		return NewBinaryEntropyDecoder(ibs, predictor)

	case TPAQ_TYPE:
		predictor, _ := NewTPAQPredictor()
		return NewBinaryEntropyDecoder(ibs, predictor)

	case NONE_TYPE:
		return NewNullEntropyDecoder(ibs)

	default:
		return nil, fmt.Errorf("Unsupported entropy codec type: '%c'", entropyType)
	}
}

func NewEntropyEncoder(obs kanzi.OutputBitStream, entropyType uint16) (kanzi.EntropyEncoder, error) {
	switch uint16(entropyType) {

	case HUFFMAN_TYPE:
		return NewHuffmanEncoder(obs)

	case ANS_TYPE:
		return NewANSRangeEncoder(obs)

	case RANGE_TYPE:
		return NewRangeEncoder(obs)

	case PAQ_TYPE:
		predictor, _ := NewPAQPredictor()
		return NewBinaryEntropyEncoder(obs, predictor)

	case FPAQ_TYPE:
		predictor, _ := NewFPAQPredictor()
		return NewBinaryEntropyEncoder(obs, predictor)

	case CM_TYPE:
		predictor, _ := NewCMPredictor()
		return NewBinaryEntropyEncoder(obs, predictor)

	case TPAQ_TYPE:
		predictor, _ := NewTPAQPredictor()
		return NewBinaryEntropyEncoder(obs, predictor)

	case NONE_TYPE:
		return NewNullEntropyEncoder(obs)

	default:
		return nil, fmt.Errorf("Unsupported entropy codec type: '%c'", entropyType)
	}
}

func GetEntropyCodecName(entropyType uint16) string {
	switch uint16(entropyType) {

	case HUFFMAN_TYPE:
		return "HUFFMAN"

	case ANS_TYPE:
		return "ANS"

	case RANGE_TYPE:
		return "RANGE"

	case PAQ_TYPE:
		return "PAQ"

	case FPAQ_TYPE:
		return "FPAQ"

	case CM_TYPE:
		return "CM"

	case TPAQ_TYPE:
		return "TPAQ"

	case NONE_TYPE:
		return "NONE"

	default:
		panic(fmt.Errorf("Unsupported entropy codec type: '%c'", entropyType))
	}
}

func GetEntropyCodecType(entropyName string) uint16 {
	switch strings.ToUpper(entropyName) {

	case "HUFFMAN":
		return HUFFMAN_TYPE

	case "ANS":
		return ANS_TYPE

	case "RANGE":
		return RANGE_TYPE

	case "PAQ":
		return PAQ_TYPE

	case "FPAQ":
		return FPAQ_TYPE

	case "CM":
		return CM_TYPE

	case "TPAQ":
		return TPAQ_TYPE

	case "NONE":
		return NONE_TYPE

	default:
		panic(fmt.Errorf("Unsupported entropy codec type: '%s'", entropyName))
	}
}
