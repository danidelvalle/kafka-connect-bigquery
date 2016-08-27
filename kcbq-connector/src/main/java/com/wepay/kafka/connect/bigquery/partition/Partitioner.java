package com.wepay.kafka.connect.bigquery.partition;

/*
 * Copyright 2016 WePay, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */


import java.util.List;

/**
 * Interface for partitioning lists of elements.
 * @param <E> The type of element in the list that will be partitioned.
 */
public interface Partitioner<E> {
  /**
   * @param elements The list of elements to partition.
   * @return A series of lists, which when combined in order is equal to the argument list.
   */
  public List<List<E>> partition(List<E> elements);
}