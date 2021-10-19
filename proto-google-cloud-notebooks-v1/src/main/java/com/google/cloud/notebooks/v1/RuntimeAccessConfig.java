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

/**
 *
 *
 * <pre>
 * Specifies the login configuration for Runtime
 * </pre>
 *
 * Protobuf type {@code google.cloud.notebooks.v1.RuntimeAccessConfig}
 */
public final class RuntimeAccessConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.notebooks.v1.RuntimeAccessConfig)
    RuntimeAccessConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RuntimeAccessConfig.newBuilder() to construct.
  private RuntimeAccessConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RuntimeAccessConfig() {
    accessType_ = 0;
    runtimeOwner_ = "";
    proxyUri_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RuntimeAccessConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private RuntimeAccessConfig(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8:
            {
              int rawValue = input.readEnum();

              accessType_ = rawValue;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              runtimeOwner_ = s;
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              proxyUri_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.notebooks.v1.RuntimeProto
        .internal_static_google_cloud_notebooks_v1_RuntimeAccessConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.notebooks.v1.RuntimeProto
        .internal_static_google_cloud_notebooks_v1_RuntimeAccessConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.notebooks.v1.RuntimeAccessConfig.class,
            com.google.cloud.notebooks.v1.RuntimeAccessConfig.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Possible ways to access runtime. Authentication mode.
   * Currently supports: Single User only.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.notebooks.v1.RuntimeAccessConfig.RuntimeAccessType}
   */
  public enum RuntimeAccessType implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Unspecified access.
     * </pre>
     *
     * <code>RUNTIME_ACCESS_TYPE_UNSPECIFIED = 0;</code>
     */
    RUNTIME_ACCESS_TYPE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Single user login.
     * </pre>
     *
     * <code>SINGLE_USER = 1;</code>
     */
    SINGLE_USER(1),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Unspecified access.
     * </pre>
     *
     * <code>RUNTIME_ACCESS_TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int RUNTIME_ACCESS_TYPE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Single user login.
     * </pre>
     *
     * <code>SINGLE_USER = 1;</code>
     */
    public static final int SINGLE_USER_VALUE = 1;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static RuntimeAccessType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static RuntimeAccessType forNumber(int value) {
      switch (value) {
        case 0:
          return RUNTIME_ACCESS_TYPE_UNSPECIFIED;
        case 1:
          return SINGLE_USER;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<RuntimeAccessType>
        internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<RuntimeAccessType>
        internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<RuntimeAccessType>() {
              public RuntimeAccessType findValueByNumber(int number) {
                return RuntimeAccessType.forNumber(number);
              }
            };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.notebooks.v1.RuntimeAccessConfig.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final RuntimeAccessType[] VALUES = values();

    public static RuntimeAccessType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private RuntimeAccessType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.notebooks.v1.RuntimeAccessConfig.RuntimeAccessType)
  }

  public static final int ACCESS_TYPE_FIELD_NUMBER = 1;
  private int accessType_;
  /**
   *
   *
   * <pre>
   * The type of access mode this instance.
   * </pre>
   *
   * <code>.google.cloud.notebooks.v1.RuntimeAccessConfig.RuntimeAccessType access_type = 1;</code>
   *
   * @return The enum numeric value on the wire for accessType.
   */
  @java.lang.Override
  public int getAccessTypeValue() {
    return accessType_;
  }
  /**
   *
   *
   * <pre>
   * The type of access mode this instance.
   * </pre>
   *
   * <code>.google.cloud.notebooks.v1.RuntimeAccessConfig.RuntimeAccessType access_type = 1;</code>
   *
   * @return The accessType.
   */
  @java.lang.Override
  public com.google.cloud.notebooks.v1.RuntimeAccessConfig.RuntimeAccessType getAccessType() {
    @SuppressWarnings("deprecation")
    com.google.cloud.notebooks.v1.RuntimeAccessConfig.RuntimeAccessType result =
        com.google.cloud.notebooks.v1.RuntimeAccessConfig.RuntimeAccessType.valueOf(accessType_);
    return result == null
        ? com.google.cloud.notebooks.v1.RuntimeAccessConfig.RuntimeAccessType.UNRECOGNIZED
        : result;
  }

  public static final int RUNTIME_OWNER_FIELD_NUMBER = 2;
  private volatile java.lang.Object runtimeOwner_;
  /**
   *
   *
   * <pre>
   * The owner of this runtime after creation. Format: `alias&#64;example.com`
   * Currently supports one owner only.
   * </pre>
   *
   * <code>string runtime_owner = 2;</code>
   *
   * @return The runtimeOwner.
   */
  @java.lang.Override
  public java.lang.String getRuntimeOwner() {
    java.lang.Object ref = runtimeOwner_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      runtimeOwner_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The owner of this runtime after creation. Format: `alias&#64;example.com`
   * Currently supports one owner only.
   * </pre>
   *
   * <code>string runtime_owner = 2;</code>
   *
   * @return The bytes for runtimeOwner.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRuntimeOwnerBytes() {
    java.lang.Object ref = runtimeOwner_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      runtimeOwner_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PROXY_URI_FIELD_NUMBER = 3;
  private volatile java.lang.Object proxyUri_;
  /**
   *
   *
   * <pre>
   * Output only. The proxy endpoint that is used to access the runtime.
   * </pre>
   *
   * <code>string proxy_uri = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The proxyUri.
   */
  @java.lang.Override
  public java.lang.String getProxyUri() {
    java.lang.Object ref = proxyUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      proxyUri_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. The proxy endpoint that is used to access the runtime.
   * </pre>
   *
   * <code>string proxy_uri = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for proxyUri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getProxyUriBytes() {
    java.lang.Object ref = proxyUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      proxyUri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (accessType_
        != com.google.cloud.notebooks.v1.RuntimeAccessConfig.RuntimeAccessType
            .RUNTIME_ACCESS_TYPE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, accessType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(runtimeOwner_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, runtimeOwner_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(proxyUri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, proxyUri_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (accessType_
        != com.google.cloud.notebooks.v1.RuntimeAccessConfig.RuntimeAccessType
            .RUNTIME_ACCESS_TYPE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, accessType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(runtimeOwner_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, runtimeOwner_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(proxyUri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, proxyUri_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.notebooks.v1.RuntimeAccessConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.notebooks.v1.RuntimeAccessConfig other =
        (com.google.cloud.notebooks.v1.RuntimeAccessConfig) obj;

    if (accessType_ != other.accessType_) return false;
    if (!getRuntimeOwner().equals(other.getRuntimeOwner())) return false;
    if (!getProxyUri().equals(other.getProxyUri())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ACCESS_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + accessType_;
    hash = (37 * hash) + RUNTIME_OWNER_FIELD_NUMBER;
    hash = (53 * hash) + getRuntimeOwner().hashCode();
    hash = (37 * hash) + PROXY_URI_FIELD_NUMBER;
    hash = (53 * hash) + getProxyUri().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.notebooks.v1.RuntimeAccessConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.notebooks.v1.RuntimeAccessConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1.RuntimeAccessConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.notebooks.v1.RuntimeAccessConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1.RuntimeAccessConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.notebooks.v1.RuntimeAccessConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1.RuntimeAccessConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.notebooks.v1.RuntimeAccessConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1.RuntimeAccessConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.notebooks.v1.RuntimeAccessConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1.RuntimeAccessConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.notebooks.v1.RuntimeAccessConfig parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.notebooks.v1.RuntimeAccessConfig prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Specifies the login configuration for Runtime
   * </pre>
   *
   * Protobuf type {@code google.cloud.notebooks.v1.RuntimeAccessConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.notebooks.v1.RuntimeAccessConfig)
      com.google.cloud.notebooks.v1.RuntimeAccessConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.notebooks.v1.RuntimeProto
          .internal_static_google_cloud_notebooks_v1_RuntimeAccessConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.notebooks.v1.RuntimeProto
          .internal_static_google_cloud_notebooks_v1_RuntimeAccessConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.notebooks.v1.RuntimeAccessConfig.class,
              com.google.cloud.notebooks.v1.RuntimeAccessConfig.Builder.class);
    }

    // Construct using com.google.cloud.notebooks.v1.RuntimeAccessConfig.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      accessType_ = 0;

      runtimeOwner_ = "";

      proxyUri_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.notebooks.v1.RuntimeProto
          .internal_static_google_cloud_notebooks_v1_RuntimeAccessConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v1.RuntimeAccessConfig getDefaultInstanceForType() {
      return com.google.cloud.notebooks.v1.RuntimeAccessConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v1.RuntimeAccessConfig build() {
      com.google.cloud.notebooks.v1.RuntimeAccessConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v1.RuntimeAccessConfig buildPartial() {
      com.google.cloud.notebooks.v1.RuntimeAccessConfig result =
          new com.google.cloud.notebooks.v1.RuntimeAccessConfig(this);
      result.accessType_ = accessType_;
      result.runtimeOwner_ = runtimeOwner_;
      result.proxyUri_ = proxyUri_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.notebooks.v1.RuntimeAccessConfig) {
        return mergeFrom((com.google.cloud.notebooks.v1.RuntimeAccessConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.notebooks.v1.RuntimeAccessConfig other) {
      if (other == com.google.cloud.notebooks.v1.RuntimeAccessConfig.getDefaultInstance())
        return this;
      if (other.accessType_ != 0) {
        setAccessTypeValue(other.getAccessTypeValue());
      }
      if (!other.getRuntimeOwner().isEmpty()) {
        runtimeOwner_ = other.runtimeOwner_;
        onChanged();
      }
      if (!other.getProxyUri().isEmpty()) {
        proxyUri_ = other.proxyUri_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.notebooks.v1.RuntimeAccessConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.notebooks.v1.RuntimeAccessConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int accessType_ = 0;
    /**
     *
     *
     * <pre>
     * The type of access mode this instance.
     * </pre>
     *
     * <code>.google.cloud.notebooks.v1.RuntimeAccessConfig.RuntimeAccessType access_type = 1;
     * </code>
     *
     * @return The enum numeric value on the wire for accessType.
     */
    @java.lang.Override
    public int getAccessTypeValue() {
      return accessType_;
    }
    /**
     *
     *
     * <pre>
     * The type of access mode this instance.
     * </pre>
     *
     * <code>.google.cloud.notebooks.v1.RuntimeAccessConfig.RuntimeAccessType access_type = 1;
     * </code>
     *
     * @param value The enum numeric value on the wire for accessType to set.
     * @return This builder for chaining.
     */
    public Builder setAccessTypeValue(int value) {

      accessType_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The type of access mode this instance.
     * </pre>
     *
     * <code>.google.cloud.notebooks.v1.RuntimeAccessConfig.RuntimeAccessType access_type = 1;
     * </code>
     *
     * @return The accessType.
     */
    @java.lang.Override
    public com.google.cloud.notebooks.v1.RuntimeAccessConfig.RuntimeAccessType getAccessType() {
      @SuppressWarnings("deprecation")
      com.google.cloud.notebooks.v1.RuntimeAccessConfig.RuntimeAccessType result =
          com.google.cloud.notebooks.v1.RuntimeAccessConfig.RuntimeAccessType.valueOf(accessType_);
      return result == null
          ? com.google.cloud.notebooks.v1.RuntimeAccessConfig.RuntimeAccessType.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * The type of access mode this instance.
     * </pre>
     *
     * <code>.google.cloud.notebooks.v1.RuntimeAccessConfig.RuntimeAccessType access_type = 1;
     * </code>
     *
     * @param value The accessType to set.
     * @return This builder for chaining.
     */
    public Builder setAccessType(
        com.google.cloud.notebooks.v1.RuntimeAccessConfig.RuntimeAccessType value) {
      if (value == null) {
        throw new NullPointerException();
      }

      accessType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The type of access mode this instance.
     * </pre>
     *
     * <code>.google.cloud.notebooks.v1.RuntimeAccessConfig.RuntimeAccessType access_type = 1;
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAccessType() {

      accessType_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object runtimeOwner_ = "";
    /**
     *
     *
     * <pre>
     * The owner of this runtime after creation. Format: `alias&#64;example.com`
     * Currently supports one owner only.
     * </pre>
     *
     * <code>string runtime_owner = 2;</code>
     *
     * @return The runtimeOwner.
     */
    public java.lang.String getRuntimeOwner() {
      java.lang.Object ref = runtimeOwner_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        runtimeOwner_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The owner of this runtime after creation. Format: `alias&#64;example.com`
     * Currently supports one owner only.
     * </pre>
     *
     * <code>string runtime_owner = 2;</code>
     *
     * @return The bytes for runtimeOwner.
     */
    public com.google.protobuf.ByteString getRuntimeOwnerBytes() {
      java.lang.Object ref = runtimeOwner_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        runtimeOwner_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The owner of this runtime after creation. Format: `alias&#64;example.com`
     * Currently supports one owner only.
     * </pre>
     *
     * <code>string runtime_owner = 2;</code>
     *
     * @param value The runtimeOwner to set.
     * @return This builder for chaining.
     */
    public Builder setRuntimeOwner(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      runtimeOwner_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The owner of this runtime after creation. Format: `alias&#64;example.com`
     * Currently supports one owner only.
     * </pre>
     *
     * <code>string runtime_owner = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRuntimeOwner() {

      runtimeOwner_ = getDefaultInstance().getRuntimeOwner();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The owner of this runtime after creation. Format: `alias&#64;example.com`
     * Currently supports one owner only.
     * </pre>
     *
     * <code>string runtime_owner = 2;</code>
     *
     * @param value The bytes for runtimeOwner to set.
     * @return This builder for chaining.
     */
    public Builder setRuntimeOwnerBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      runtimeOwner_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object proxyUri_ = "";
    /**
     *
     *
     * <pre>
     * Output only. The proxy endpoint that is used to access the runtime.
     * </pre>
     *
     * <code>string proxy_uri = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The proxyUri.
     */
    public java.lang.String getProxyUri() {
      java.lang.Object ref = proxyUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        proxyUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The proxy endpoint that is used to access the runtime.
     * </pre>
     *
     * <code>string proxy_uri = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The bytes for proxyUri.
     */
    public com.google.protobuf.ByteString getProxyUriBytes() {
      java.lang.Object ref = proxyUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        proxyUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The proxy endpoint that is used to access the runtime.
     * </pre>
     *
     * <code>string proxy_uri = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The proxyUri to set.
     * @return This builder for chaining.
     */
    public Builder setProxyUri(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      proxyUri_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The proxy endpoint that is used to access the runtime.
     * </pre>
     *
     * <code>string proxy_uri = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearProxyUri() {

      proxyUri_ = getDefaultInstance().getProxyUri();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The proxy endpoint that is used to access the runtime.
     * </pre>
     *
     * <code>string proxy_uri = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The bytes for proxyUri to set.
     * @return This builder for chaining.
     */
    public Builder setProxyUriBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      proxyUri_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.notebooks.v1.RuntimeAccessConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.notebooks.v1.RuntimeAccessConfig)
  private static final com.google.cloud.notebooks.v1.RuntimeAccessConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.notebooks.v1.RuntimeAccessConfig();
  }

  public static com.google.cloud.notebooks.v1.RuntimeAccessConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RuntimeAccessConfig> PARSER =
      new com.google.protobuf.AbstractParser<RuntimeAccessConfig>() {
        @java.lang.Override
        public RuntimeAccessConfig parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new RuntimeAccessConfig(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<RuntimeAccessConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RuntimeAccessConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.notebooks.v1.RuntimeAccessConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
