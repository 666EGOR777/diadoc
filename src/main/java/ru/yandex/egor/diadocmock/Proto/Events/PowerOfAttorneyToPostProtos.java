// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Events/PowerOfAttorneyToPost.proto

package Diadoc.Api.Proto.Events;

public final class PowerOfAttorneyToPostProtos {
  private PowerOfAttorneyToPostProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface PowerOfAttorneyToPostOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Diadoc.Api.Proto.Events.PowerOfAttorneyToPost)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional .Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyFullId FullId = 1;</code>
     */
    boolean hasFullId();
    /**
     * <code>optional .Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyFullId FullId = 1;</code>
     */
    Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneyFullId getFullId();
    /**
     * <code>optional .Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyFullId FullId = 1;</code>
     */
    Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneyFullIdOrBuilder getFullIdOrBuilder();

    /**
     * <code>required bool UseDefault = 2;</code>
     */
    boolean hasUseDefault();
    /**
     * <code>required bool UseDefault = 2;</code>
     */
    boolean getUseDefault();
  }
  /**
   * Protobuf type {@code Diadoc.Api.Proto.Events.PowerOfAttorneyToPost}
   */
  public static final class PowerOfAttorneyToPost extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:Diadoc.Api.Proto.Events.PowerOfAttorneyToPost)
      PowerOfAttorneyToPostOrBuilder {
    // Use PowerOfAttorneyToPost.newBuilder() to construct.
    private PowerOfAttorneyToPost(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private PowerOfAttorneyToPost(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final PowerOfAttorneyToPost defaultInstance;
    public static PowerOfAttorneyToPost getDefaultInstance() {
      return defaultInstance;
    }

    public PowerOfAttorneyToPost getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private PowerOfAttorneyToPost(
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
              Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneyFullId.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = fullId_.toBuilder();
              }
              fullId_ = input.readMessage(Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneyFullId.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(fullId_);
                fullId_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              useDefault_ = input.readBool();
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
      return Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.internal_static_Diadoc_Api_Proto_Events_PowerOfAttorneyToPost_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.internal_static_Diadoc_Api_Proto_Events_PowerOfAttorneyToPost_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.PowerOfAttorneyToPost.class, Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.PowerOfAttorneyToPost.Builder.class);
    }

    public static com.google.protobuf.Parser<PowerOfAttorneyToPost> PARSER =
        new com.google.protobuf.AbstractParser<PowerOfAttorneyToPost>() {
      public PowerOfAttorneyToPost parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PowerOfAttorneyToPost(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<PowerOfAttorneyToPost> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int FULLID_FIELD_NUMBER = 1;
    private Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneyFullId fullId_;
    /**
     * <code>optional .Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyFullId FullId = 1;</code>
     */
    public boolean hasFullId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional .Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyFullId FullId = 1;</code>
     */
    public Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneyFullId getFullId() {
      return fullId_;
    }
    /**
     * <code>optional .Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyFullId FullId = 1;</code>
     */
    public Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneyFullIdOrBuilder getFullIdOrBuilder() {
      return fullId_;
    }

    public static final int USEDEFAULT_FIELD_NUMBER = 2;
    private boolean useDefault_;
    /**
     * <code>required bool UseDefault = 2;</code>
     */
    public boolean hasUseDefault() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required bool UseDefault = 2;</code>
     */
    public boolean getUseDefault() {
      return useDefault_;
    }

    private void initFields() {
      fullId_ = Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneyFullId.getDefaultInstance();
      useDefault_ = false;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasUseDefault()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (hasFullId()) {
        if (!getFullId().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, fullId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBool(2, useDefault_);
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
          .computeMessageSize(1, fullId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, useDefault_);
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

    public static Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.PowerOfAttorneyToPost parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.PowerOfAttorneyToPost parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.PowerOfAttorneyToPost parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.PowerOfAttorneyToPost parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.PowerOfAttorneyToPost parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.PowerOfAttorneyToPost parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.PowerOfAttorneyToPost parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.PowerOfAttorneyToPost parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.PowerOfAttorneyToPost parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.PowerOfAttorneyToPost parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.PowerOfAttorneyToPost prototype) {
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
     * Protobuf type {@code Diadoc.Api.Proto.Events.PowerOfAttorneyToPost}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Diadoc.Api.Proto.Events.PowerOfAttorneyToPost)
        Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.PowerOfAttorneyToPostOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.internal_static_Diadoc_Api_Proto_Events_PowerOfAttorneyToPost_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.internal_static_Diadoc_Api_Proto_Events_PowerOfAttorneyToPost_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.PowerOfAttorneyToPost.class, Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.PowerOfAttorneyToPost.Builder.class);
      }

      // Construct using Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.PowerOfAttorneyToPost.newBuilder()
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
          getFullIdFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (fullIdBuilder_ == null) {
          fullId_ = Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneyFullId.getDefaultInstance();
        } else {
          fullIdBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        useDefault_ = false;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.internal_static_Diadoc_Api_Proto_Events_PowerOfAttorneyToPost_descriptor;
      }

      public Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.PowerOfAttorneyToPost getDefaultInstanceForType() {
        return Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.PowerOfAttorneyToPost.getDefaultInstance();
      }

      public Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.PowerOfAttorneyToPost build() {
        Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.PowerOfAttorneyToPost result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.PowerOfAttorneyToPost buildPartial() {
        Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.PowerOfAttorneyToPost result = new Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.PowerOfAttorneyToPost(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (fullIdBuilder_ == null) {
          result.fullId_ = fullId_;
        } else {
          result.fullId_ = fullIdBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.useDefault_ = useDefault_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.PowerOfAttorneyToPost) {
          return mergeFrom((Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.PowerOfAttorneyToPost)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.PowerOfAttorneyToPost other) {
        if (other == Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.PowerOfAttorneyToPost.getDefaultInstance()) return this;
        if (other.hasFullId()) {
          mergeFullId(other.getFullId());
        }
        if (other.hasUseDefault()) {
          setUseDefault(other.getUseDefault());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasUseDefault()) {
          
          return false;
        }
        if (hasFullId()) {
          if (!getFullId().isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.PowerOfAttorneyToPost parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.PowerOfAttorneyToPost) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneyFullId fullId_ = Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneyFullId.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneyFullId, Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneyFullId.Builder, Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneyFullIdOrBuilder> fullIdBuilder_;
      /**
       * <code>optional .Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyFullId FullId = 1;</code>
       */
      public boolean hasFullId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional .Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyFullId FullId = 1;</code>
       */
      public Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneyFullId getFullId() {
        if (fullIdBuilder_ == null) {
          return fullId_;
        } else {
          return fullIdBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyFullId FullId = 1;</code>
       */
      public Builder setFullId(Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneyFullId value) {
        if (fullIdBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          fullId_ = value;
          onChanged();
        } else {
          fullIdBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyFullId FullId = 1;</code>
       */
      public Builder setFullId(
          Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneyFullId.Builder builderForValue) {
        if (fullIdBuilder_ == null) {
          fullId_ = builderForValue.build();
          onChanged();
        } else {
          fullIdBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyFullId FullId = 1;</code>
       */
      public Builder mergeFullId(Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneyFullId value) {
        if (fullIdBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              fullId_ != Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneyFullId.getDefaultInstance()) {
            fullId_ =
              Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneyFullId.newBuilder(fullId_).mergeFrom(value).buildPartial();
          } else {
            fullId_ = value;
          }
          onChanged();
        } else {
          fullIdBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyFullId FullId = 1;</code>
       */
      public Builder clearFullId() {
        if (fullIdBuilder_ == null) {
          fullId_ = Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneyFullId.getDefaultInstance();
          onChanged();
        } else {
          fullIdBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>optional .Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyFullId FullId = 1;</code>
       */
      public Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneyFullId.Builder getFullIdBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getFullIdFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyFullId FullId = 1;</code>
       */
      public Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneyFullIdOrBuilder getFullIdOrBuilder() {
        if (fullIdBuilder_ != null) {
          return fullIdBuilder_.getMessageOrBuilder();
        } else {
          return fullId_;
        }
      }
      /**
       * <code>optional .Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyFullId FullId = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneyFullId, Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneyFullId.Builder, Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneyFullIdOrBuilder> 
          getFullIdFieldBuilder() {
        if (fullIdBuilder_ == null) {
          fullIdBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneyFullId, Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneyFullId.Builder, Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneyFullIdOrBuilder>(
                  getFullId(),
                  getParentForChildren(),
                  isClean());
          fullId_ = null;
        }
        return fullIdBuilder_;
      }

      private boolean useDefault_ ;
      /**
       * <code>required bool UseDefault = 2;</code>
       */
      public boolean hasUseDefault() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required bool UseDefault = 2;</code>
       */
      public boolean getUseDefault() {
        return useDefault_;
      }
      /**
       * <code>required bool UseDefault = 2;</code>
       */
      public Builder setUseDefault(boolean value) {
        bitField0_ |= 0x00000002;
        useDefault_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bool UseDefault = 2;</code>
       */
      public Builder clearUseDefault() {
        bitField0_ = (bitField0_ & ~0x00000002);
        useDefault_ = false;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:Diadoc.Api.Proto.Events.PowerOfAttorneyToPost)
    }

    static {
      defaultInstance = new PowerOfAttorneyToPost(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:Diadoc.Api.Proto.Events.PowerOfAttorneyToPost)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Diadoc_Api_Proto_Events_PowerOfAttorneyToPost_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Diadoc_Api_Proto_Events_PowerOfAttorneyToPost_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"Events/PowerOfAttorneyToPost.proto\022\027Di" +
      "adoc.Api.Proto.Events\032&PowersOfAttorney/" +
      "PowerOfAttorney.proto\"u\n\025PowerOfAttorney" +
      "ToPost\022H\n\006FullId\030\001 \001(\01328.Diadoc.Api.Prot" +
      "o.PowersOfAttorney.PowerOfAttorneyFullId" +
      "\022\022\n\nUseDefault\030\002 \002(\010B\035B\033PowerOfAttorneyT" +
      "oPostProtos"
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
          Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.getDescriptor(),
        }, assigner);
    internal_static_Diadoc_Api_Proto_Events_PowerOfAttorneyToPost_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Diadoc_Api_Proto_Events_PowerOfAttorneyToPost_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_Diadoc_Api_Proto_Events_PowerOfAttorneyToPost_descriptor,
        new java.lang.String[] { "FullId", "UseDefault", });
    Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}