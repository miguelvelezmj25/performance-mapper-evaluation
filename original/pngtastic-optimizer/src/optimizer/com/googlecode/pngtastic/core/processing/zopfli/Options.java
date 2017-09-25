/*
Copyright 2014 Google Inc. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

Author: eustas.ru@gmail.com (Eugene Klyuchnikov)
*/

package optimizer.com.googlecode.pngtastic.core.processing.zopfli;

public final class Options {
    final int numIterations;
    final BlockSplitting blockSplitting;

    public Options(BlockSplitting blockSplitting, int numIterations) {
        this.blockSplitting = blockSplitting;
        this.numIterations = numIterations;
    }

    public enum BlockSplitting {
        FIRST,
        LAST,
        NONE
    }
}
