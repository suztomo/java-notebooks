/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/notebooks/v1/runtime.proto

package com.google.cloud.notebooks.v1;

public interface VirtualMachineOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.notebooks.v1.VirtualMachine)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The user-friendly name of the Managed Compute Engine instance.
   * </pre>
   *
   * <code>string instance_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The instanceName.
   */
  java.lang.String getInstanceName();
  /**
   *
   *
   * <pre>
   * Output only. The user-friendly name of the Managed Compute Engine instance.
   * </pre>
   *
   * <code>string instance_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for instanceName.
   */
  com.google.protobuf.ByteString getInstanceNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The unique identifier of the Managed Compute Engine instance.
   * </pre>
   *
   * <code>string instance_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The instanceId.
   */
  java.lang.String getInstanceId();
  /**
   *
   *
   * <pre>
   * Output only. The unique identifier of the Managed Compute Engine instance.
   * </pre>
   *
   * <code>string instance_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for instanceId.
   */
  com.google.protobuf.ByteString getInstanceIdBytes();

  /**
   *
   *
   * <pre>
   * Virtual Machine configuration settings.
   * </pre>
   *
   * <code>.google.cloud.notebooks.v1.VirtualMachineConfig virtual_machine_config = 3;</code>
   *
   * @return Whether the virtualMachineConfig field is set.
   */
  boolean hasVirtualMachineConfig();
  /**
   *
   *
   * <pre>
   * Virtual Machine configuration settings.
   * </pre>
   *
   * <code>.google.cloud.notebooks.v1.VirtualMachineConfig virtual_machine_config = 3;</code>
   *
   * @return The virtualMachineConfig.
   */
  com.google.cloud.notebooks.v1.VirtualMachineConfig getVirtualMachineConfig();
  /**
   *
   *
   * <pre>
   * Virtual Machine configuration settings.
   * </pre>
   *
   * <code>.google.cloud.notebooks.v1.VirtualMachineConfig virtual_machine_config = 3;</code>
   */
  com.google.cloud.notebooks.v1.VirtualMachineConfigOrBuilder getVirtualMachineConfigOrBuilder();
}
