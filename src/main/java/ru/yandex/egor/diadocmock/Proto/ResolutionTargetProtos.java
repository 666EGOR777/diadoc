// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ResolutionTarget.proto

package Diadoc.Api.Proto;

public final class ResolutionTargetProtos {
  private ResolutionTargetProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ResolutionTargetOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Diadoc.Api.Proto.ResolutionTarget)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string Department = 1;</code>
     */
    boolean hasDepartment();
    /**
     * <code>optional string Department = 1;</code>
     */
    java.lang.String getDepartment();
    /**
     * <code>optional string Department = 1;</code>
     */
    com.google.protobuf.ByteString
        getDepartmentBytes();

    /**
     * <code>optional string DepartmentId = 2;</code>
     */
    boolean hasDepartmentId();
    /**
     * <code>optional string DepartmentId = 2;</code>
     */
    java.lang.String getDepartmentId();
    /**
     * <code>optional string DepartmentId = 2;</code>
     */
    com.google.protobuf.ByteString
        getDepartmentIdBytes();

    /**
     * <code>optional string User = 3;</code>
     */
    boolean hasUser();
    /**
     * <code>optional string User = 3;</code>
     */
    java.lang.String getUser();
    /**
     * <code>optional string User = 3;</code>
     */
    com.google.protobuf.ByteString
        getUserBytes();

    /**
     * <code>optional string UserId = 4;</code>
     */
    boolean hasUserId();
    /**
     * <code>optional string UserId = 4;</code>
     */
    java.lang.String getUserId();
    /**
     * <code>optional string UserId = 4;</code>
     */
    com.google.protobuf.ByteString
        getUserIdBytes();
  }
  /**
   * Protobuf type {@code Diadoc.Api.Proto.ResolutionTarget}
   */
  public static final class ResolutionTarget extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:Diadoc.Api.Proto.ResolutionTarget)
      ResolutionTargetOrBuilder {
    // Use ResolutionTarget.newBuilder() to construct.
    private ResolutionTarget(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ResolutionTarget(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ResolutionTarget defaultInstance;
    public static ResolutionTarget getDefaultInstance() {
      return defaultInstance;
    }

    public ResolutionTarget getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ResolutionTarget(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              department_ = bs;
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              departmentId_ = bs;
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              user_ = bs;
              break;
            }
            case 34: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000008;
              userId_ = bs;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Diadoc.Api.Proto.ResolutionTargetProtos.internal_static_Diadoc_Api_Proto_ResolutionTarget_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Diadoc.Api.Proto.ResolutionTargetProtos.internal_static_Diadoc_Api_Proto_ResolutionTarget_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Diadoc.Api.Proto.ResolutionTargetProtos.ResolutionTarget.class, Diadoc.Api.Proto.ResolutionTargetProtos.ResolutionTarget.Builder.class);
    }

    public static com.google.protobuf.Parser<ResolutionTarget> PARSER =
        new com.google.protobuf.AbstractParser<ResolutionTarget>() {
      public ResolutionTarget parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ResolutionTarget(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ResolutionTarget> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int DEPARTMENT_FIELD_NUMBER = 1;
    private java.lang.Object department_;
    /**
     * <code>optional string Department = 1;</code>
     */
    public boolean hasDepartment() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string Department = 1;</code>
     */
    public java.lang.String getDepartment() {
      java.lang.Object ref = department_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          department_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string Department = 1;</code>
     */
    public com.google.protobuf.ByteString
        getDepartmentBytes() {
      java.lang.Object ref = department_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        department_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int DEPARTMENTID_FIELD_NUMBER = 2;
    private java.lang.Object departmentId_;
    /**
     * <code>optional string DepartmentId = 2;</code>
     */
    public boolean hasDepartmentId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string DepartmentId = 2;</code>
     */
    public java.lang.String getDepartmentId() {
      java.lang.Object ref = departmentId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          departmentId_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string DepartmentId = 2;</code>
     */
    public com.google.protobuf.ByteString
        getDepartmentIdBytes() {
      java.lang.Object ref = departmentId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        departmentId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int USER_FIELD_NUMBER = 3;
    private java.lang.Object user_;
    /**
     * <code>optional string User = 3;</code>
     */
    public boolean hasUser() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string User = 3;</code>
     */
    public java.lang.String getUser() {
      java.lang.Object ref = user_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          user_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string User = 3;</code>
     */
    public com.google.protobuf.ByteString
        getUserBytes() {
      java.lang.Object ref = user_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        user_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int USERID_FIELD_NUMBER = 4;
    private java.lang.Object userId_;
    /**
     * <code>optional string UserId = 4;</code>
     */
    public boolean hasUserId() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional string UserId = 4;</code>
     */
    public java.lang.String getUserId() {
      java.lang.Object ref = userId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          userId_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string UserId = 4;</code>
     */
    public com.google.protobuf.ByteString
        getUserIdBytes() {
      java.lang.Object ref = userId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      department_ = "";
      departmentId_ = "";
      user_ = "";
      userId_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getDepartmentBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getDepartmentIdBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getUserBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, getUserIdBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getDepartmentBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getDepartmentIdBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getUserBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getUserIdBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static Diadoc.Api.Proto.ResolutionTargetProtos.ResolutionTarget parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.ResolutionTargetProtos.ResolutionTarget parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.ResolutionTargetProtos.ResolutionTarget parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.ResolutionTargetProtos.ResolutionTarget parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.ResolutionTargetProtos.ResolutionTarget parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static Diadoc.Api.Proto.ResolutionTargetProtos.ResolutionTarget parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static Diadoc.Api.Proto.ResolutionTargetProtos.ResolutionTarget parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static Diadoc.Api.Proto.ResolutionTargetProtos.ResolutionTarget parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static Diadoc.Api.Proto.ResolutionTargetProtos.ResolutionTarget parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static Diadoc.Api.Proto.ResolutionTargetProtos.ResolutionTarget parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(Diadoc.Api.Proto.ResolutionTargetProtos.ResolutionTarget prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Diadoc.Api.Proto.ResolutionTarget}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Diadoc.Api.Proto.ResolutionTarget)
        Diadoc.Api.Proto.ResolutionTargetProtos.ResolutionTargetOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Diadoc.Api.Proto.ResolutionTargetProtos.internal_static_Diadoc_Api_Proto_ResolutionTarget_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Diadoc.Api.Proto.ResolutionTargetProtos.internal_static_Diadoc_Api_Proto_ResolutionTarget_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Diadoc.Api.Proto.ResolutionTargetProtos.ResolutionTarget.class, Diadoc.Api.Proto.ResolutionTargetProtos.ResolutionTarget.Builder.class);
      }

      // Construct using Diadoc.Api.Proto.ResolutionTargetProtos.ResolutionTarget.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        department_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        departmentId_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        user_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        userId_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Diadoc.Api.Proto.ResolutionTargetProtos.internal_static_Diadoc_Api_Proto_ResolutionTarget_descriptor;
      }

      public Diadoc.Api.Proto.ResolutionTargetProtos.ResolutionTarget getDefaultInstanceForType() {
        return Diadoc.Api.Proto.ResolutionTargetProtos.ResolutionTarget.getDefaultInstance();
      }

      public Diadoc.Api.Proto.ResolutionTargetProtos.ResolutionTarget build() {
        Diadoc.Api.Proto.ResolutionTargetProtos.ResolutionTarget result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public Diadoc.Api.Proto.ResolutionTargetProtos.ResolutionTarget buildPartial() {
        Diadoc.Api.Proto.ResolutionTargetProtos.ResolutionTarget result = new Diadoc.Api.Proto.ResolutionTargetProtos.ResolutionTarget(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.department_ = department_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.departmentId_ = departmentId_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.user_ = user_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.userId_ = userId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Diadoc.Api.Proto.ResolutionTargetProtos.ResolutionTarget) {
          return mergeFrom((Diadoc.Api.Proto.ResolutionTargetProtos.ResolutionTarget)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Diadoc.Api.Proto.ResolutionTargetProtos.ResolutionTarget other) {
        if (other == Diadoc.Api.Proto.ResolutionTargetProtos.ResolutionTarget.getDefaultInstance()) return this;
        if (other.hasDepartment()) {
          bitField0_ |= 0x00000001;
          department_ = other.department_;
          onChanged();
        }
        if (other.hasDepartmentId()) {
          bitField0_ |= 0x00000002;
          departmentId_ = other.departmentId_;
          onChanged();
        }
        if (other.hasUser()) {
          bitField0_ |= 0x00000004;
          user_ = other.user_;
          onChanged();
        }
        if (other.hasUserId()) {
          bitField0_ |= 0x00000008;
          userId_ = other.userId_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Diadoc.Api.Proto.ResolutionTargetProtos.ResolutionTarget parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Diadoc.Api.Proto.ResolutionTargetProtos.ResolutionTarget) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object department_ = "";
      /**
       * <code>optional string Department = 1;</code>
       */
      public boolean hasDepartment() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional string Department = 1;</code>
       */
      public java.lang.String getDepartment() {
        java.lang.Object ref = department_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            department_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string Department = 1;</code>
       */
      public com.google.protobuf.ByteString
          getDepartmentBytes() {
        java.lang.Object ref = department_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          department_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string Department = 1;</code>
       */
      public Builder setDepartment(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        department_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string Department = 1;</code>
       */
      public Builder clearDepartment() {
        bitField0_ = (bitField0_ & ~0x00000001);
        department_ = getDefaultInstance().getDepartment();
        onChanged();
        return this;
      }
      /**
       * <code>optional string Department = 1;</code>
       */
      public Builder setDepartmentBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        department_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object departmentId_ = "";
      /**
       * <code>optional string DepartmentId = 2;</code>
       */
      public boolean hasDepartmentId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional string DepartmentId = 2;</code>
       */
      public java.lang.String getDepartmentId() {
        java.lang.Object ref = departmentId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            departmentId_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string DepartmentId = 2;</code>
       */
      public com.google.protobuf.ByteString
          getDepartmentIdBytes() {
        java.lang.Object ref = departmentId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          departmentId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string DepartmentId = 2;</code>
       */
      public Builder setDepartmentId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        departmentId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string DepartmentId = 2;</code>
       */
      public Builder clearDepartmentId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        departmentId_ = getDefaultInstance().getDepartmentId();
        onChanged();
        return this;
      }
      /**
       * <code>optional string DepartmentId = 2;</code>
       */
      public Builder setDepartmentIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        departmentId_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object user_ = "";
      /**
       * <code>optional string User = 3;</code>
       */
      public boolean hasUser() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional string User = 3;</code>
       */
      public java.lang.String getUser() {
        java.lang.Object ref = user_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            user_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string User = 3;</code>
       */
      public com.google.protobuf.ByteString
          getUserBytes() {
        java.lang.Object ref = user_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          user_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string User = 3;</code>
       */
      public Builder setUser(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        user_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string User = 3;</code>
       */
      public Builder clearUser() {
        bitField0_ = (bitField0_ & ~0x00000004);
        user_ = getDefaultInstance().getUser();
        onChanged();
        return this;
      }
      /**
       * <code>optional string User = 3;</code>
       */
      public Builder setUserBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        user_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object userId_ = "";
      /**
       * <code>optional string UserId = 4;</code>
       */
      public boolean hasUserId() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional string UserId = 4;</code>
       */
      public java.lang.String getUserId() {
        java.lang.Object ref = userId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            userId_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string UserId = 4;</code>
       */
      public com.google.protobuf.ByteString
          getUserIdBytes() {
        java.lang.Object ref = userId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          userId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string UserId = 4;</code>
       */
      public Builder setUserId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        userId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string UserId = 4;</code>
       */
      public Builder clearUserId() {
        bitField0_ = (bitField0_ & ~0x00000008);
        userId_ = getDefaultInstance().getUserId();
        onChanged();
        return this;
      }
      /**
       * <code>optional string UserId = 4;</code>
       */
      public Builder setUserIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        userId_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:Diadoc.Api.Proto.ResolutionTarget)
    }

    static {
      defaultInstance = new ResolutionTarget(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:Diadoc.Api.Proto.ResolutionTarget)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Diadoc_Api_Proto_ResolutionTarget_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Diadoc_Api_Proto_ResolutionTarget_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026ResolutionTarget.proto\022\020Diadoc.Api.Pro" +
      "to\"Z\n\020ResolutionTarget\022\022\n\nDepartment\030\001 \001" +
      "(\t\022\024\n\014DepartmentId\030\002 \001(\t\022\014\n\004User\030\003 \001(\t\022\016" +
      "\n\006UserId\030\004 \001(\tB\030B\026ResolutionTargetProtos"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_Diadoc_Api_Proto_ResolutionTarget_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Diadoc_Api_Proto_ResolutionTarget_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_Diadoc_Api_Proto_ResolutionTarget_descriptor,
        new java.lang.String[] { "Department", "DepartmentId", "User", "UserId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}