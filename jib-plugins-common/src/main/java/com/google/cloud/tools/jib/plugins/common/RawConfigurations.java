/*
 * Copyright 2018 Google LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.cloud.tools.jib.plugins.common;

import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public interface RawConfigurations {

  @Nullable
  String getFromImage();

  AuthProperty getFromAuth();

  @Nullable
  String getFromCredHelper();

  @Nullable
  List<String> getEntrypoint();

  @Nullable
  List<String> getProgramArguments();

  Map<String, String> getEnvironment();

  List<String> getPorts();

  @Nullable
  String getUser();

  boolean getUseCurrentTimestamp();

  List<String> getJvmFlags();

  @Nullable
  String getMainClass();

  @Nullable
  String getAppRoot();

  @Nullable
  AuthProperty getInferredAuth(String authTarget) throws InferredAuthRetrievalException;
}