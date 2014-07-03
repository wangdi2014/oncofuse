/**
 Copyright 2014 Mikhail Shugay (mikhail.shugay@gmail.com)

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */

package es.unav.oncofuse.protein

import es.unav.oncofuse.segments.Transcript

class Pii extends ProteinFeature {
    final Transcript target

    Pii(int aaFrom, int aaTo, Transcript target, ProteinFeatures parent) {
        super(aaFrom, aaTo, "pii", parent)
        this.target = target
    }
}