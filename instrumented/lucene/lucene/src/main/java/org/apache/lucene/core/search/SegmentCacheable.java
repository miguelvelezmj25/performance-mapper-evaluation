/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.lucene.core.search;

import org.apache.lucene.core.index.DocValues;
import org.apache.lucene.core.index.LeafReader;
import org.apache.lucene.core.index.LeafReaderContext;

/**
 * Interface defining whether or not an object can be cached against a {@link LeafReader}
 *
 * Objects that depend only on segment-immutable structures such as Points or postings lists
 * can just return {@code true} from {@link #isCacheable(LeafReaderContext)}
 *
 * Objects that depend on doc values should return {@link DocValues#isCacheable(LeafReaderContext, String...)}, which
 * will check to see if the doc values fields have been updated.  Updated doc values fields are not suitable
 * for cacheing.
 *
 * Objects that are not segment-immutable, such as those that rely on global statistics or scores,
 * should return {@code false}
 */
public interface SegmentCacheable {

  /**
   * @return {@code true} if the object can be cached against a given leaf
   */
  boolean isCacheable(LeafReaderContext ctx);

}
