/*
 * Copyright 2015 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.watson.developer_cloud.tradeoff_analytics.v1.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;

/**
 * Preferable solutions.
 */
public class PreferableSolutions {

  @SerializedName("solution_refs")
  private List<String> solutionRefs;
  private Double score;

  /**
   * Gets the solution keys.
   *
   * @return the keys
   */
  public List<String> getSolutionKeys() {
    return solutionRefs;
  }

  /**
   * Gets the score.
   *
   * @return the score
   */
  public Double getScore() {
    return score;
  }
  
  /**
   * Sets the solution keys.
   *
   * @param keys the solution keys
   */
  public void setSolutionKeys(List<String> keys) {
    this.solutionRefs = keys;
  }

  /**
   * Sets the score.
   *
   * @param score the new score
   */
  public void setScore(Double score) {
    this.score = score;
  }
}
