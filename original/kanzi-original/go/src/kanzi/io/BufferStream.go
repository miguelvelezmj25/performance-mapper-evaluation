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
	"bytes"
)

type BufferStream struct {
	buf bytes.Buffer
	closed bool
}

func NewBufferStream(buffer []byte) (*BufferStream, error) {
	this := new(BufferStream)
	return this, nil
}

func (this *BufferStream) Write(b []byte) (int, error) {
	if this.closed {
	   return 0, errors.New("Stream closed")
	}
	
	return this.buf.Write(b)
}

func (this *BufferStream) Read(b []byte) (int, error) {
	if this.closed {
	   return 0, errors.New("Stream closed")
	}
	
	return this.buf.Read(b)
}


func (this *BufferStream) Close() error {
	this.closed = true
	return nil
}
