// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DemoString.proto

package com.owl.zookeeper.use.protocbuf;

public final class DemoIntStringA {
  private DemoIntStringA() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface DemoStringOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required string name = 1;
    /**
     * <code>required string name = 1;</code>
     */
    boolean hasName();
    /**
     * <code>required string name = 1;</code>
     */
    String getName();
    /**
     * <code>required string name = 1;</code>
     */
    com.google.protobuf.ByteString
        getNameBytes();

    // repeated string names = 2;
    /**
     * <code>repeated string names = 2;</code>
     */
    java.util.List<String>
    getNamesList();
    /**
     * <code>repeated string names = 2;</code>
     */
    int getNamesCount();
    /**
     * <code>repeated string names = 2;</code>
     */
    String getNames(int index);
    /**
     * <code>repeated string names = 2;</code>
     */
    com.google.protobuf.ByteString
        getNamesBytes(int index);
  }
  /**
   * Protobuf type {@code DemoString}
   */
  public static final class DemoString extends
      com.google.protobuf.GeneratedMessage
      implements DemoStringOrBuilder {
    // Use DemoString.newBuilder() to construct.
    private DemoString(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private DemoString(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final DemoString defaultInstance;
    public static DemoString getDefaultInstance() {
      return defaultInstance;
    }

    public DemoString getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private DemoString(
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
              bitField0_ |= 0x00000001;
              name_ = input.readBytes();
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                names_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000002;
              }
              names_.add(input.readBytes());
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
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          names_ = new com.google.protobuf.UnmodifiableLazyStringList(names_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return DemoIntStringA.internal_static_DemoString_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return DemoIntStringA.internal_static_DemoString_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              DemoString.class, Builder.class);
    }

    public static com.google.protobuf.Parser<DemoString> PARSER =
        new com.google.protobuf.AbstractParser<DemoString>() {
      public DemoString parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DemoString(input, extensionRegistry);
      }
    };

    @Override
    public com.google.protobuf.Parser<DemoString> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required string name = 1;
    public static final int NAME_FIELD_NUMBER = 1;
    private Object name_;
    /**
     * <code>required string name = 1;</code>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string name = 1;</code>
     */
    public String getName() {
      Object ref = name_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // repeated string names = 2;
    public static final int NAMES_FIELD_NUMBER = 2;
    private com.google.protobuf.LazyStringList names_;
    /**
     * <code>repeated string names = 2;</code>
     */
    public java.util.List<String>
        getNamesList() {
      return names_;
    }
    /**
     * <code>repeated string names = 2;</code>
     */
    public int getNamesCount() {
      return names_.size();
    }
    /**
     * <code>repeated string names = 2;</code>
     */
    public String getNames(int index) {
      return names_.get(index);
    }
    /**
     * <code>repeated string names = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNamesBytes(int index) {
      return names_.getByteString(index);
    }

    private void initFields() {
      name_ = "";
      names_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getNameBytes());
      }
      for (int i = 0; i < names_.size(); i++) {
        output.writeBytes(2, names_.getByteString(i));
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
          .computeBytesSize(1, getNameBytes());
      }
      {
        int dataSize = 0;
        for (int i = 0; i < names_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeBytesSizeNoTag(names_.getByteString(i));
        }
        size += dataSize;
        size += 1 * getNamesList().size();
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @Override
    protected Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static DemoString parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static DemoString parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static DemoString parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static DemoString parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static DemoString parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static DemoString parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static DemoString parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static DemoString parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static DemoString parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static DemoString parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(DemoString prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code DemoString}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements DemoStringOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return DemoIntStringA.internal_static_DemoString_descriptor;
      }

      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return DemoIntStringA.internal_static_DemoString_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                DemoString.class, Builder.class);
      }

      // Construct using com.owl.zookeeper.use.protocbuf.DemoIntStringA.DemoString.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
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
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        names_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return DemoIntStringA.internal_static_DemoString_descriptor;
      }

      public DemoString getDefaultInstanceForType() {
        return DemoString.getDefaultInstance();
      }

      public DemoString build() {
        DemoString result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public DemoString buildPartial() {
        DemoString result = new DemoString(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.name_ = name_;
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          names_ = new com.google.protobuf.UnmodifiableLazyStringList(
              names_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.names_ = names_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof DemoString) {
          return mergeFrom((DemoString)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(DemoString other) {
        if (other == DemoString.getDefaultInstance()) return this;
        if (other.hasName()) {
          bitField0_ |= 0x00000001;
          name_ = other.name_;
          onChanged();
        }
        if (!other.names_.isEmpty()) {
          if (names_.isEmpty()) {
            names_ = other.names_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureNamesIsMutable();
            names_.addAll(other.names_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasName()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        DemoString parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (DemoString) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required string name = 1;
      private Object name_ = "";
      /**
       * <code>required string name = 1;</code>
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string name = 1;</code>
       */
      public String getName() {
        Object ref = name_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>required string name = 1;</code>
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string name = 1;</code>
       */
      public Builder setName(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string name = 1;</code>
       */
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>required string name = 1;</code>
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }

      // repeated string names = 2;
      private com.google.protobuf.LazyStringList names_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureNamesIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          names_ = new com.google.protobuf.LazyStringArrayList(names_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated string names = 2;</code>
       */
      public java.util.List<String>
          getNamesList() {
        return java.util.Collections.unmodifiableList(names_);
      }
      /**
       * <code>repeated string names = 2;</code>
       */
      public int getNamesCount() {
        return names_.size();
      }
      /**
       * <code>repeated string names = 2;</code>
       */
      public String getNames(int index) {
        return names_.get(index);
      }
      /**
       * <code>repeated string names = 2;</code>
       */
      public com.google.protobuf.ByteString
          getNamesBytes(int index) {
        return names_.getByteString(index);
      }
      /**
       * <code>repeated string names = 2;</code>
       */
      public Builder setNames(
          int index, String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureNamesIsMutable();
        names_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string names = 2;</code>
       */
      public Builder addNames(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureNamesIsMutable();
        names_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string names = 2;</code>
       */
      public Builder addAllNames(
          Iterable<String> values) {
        ensureNamesIsMutable();
        super.addAll(values, names_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string names = 2;</code>
       */
      public Builder clearNames() {
        names_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string names = 2;</code>
       */
      public Builder addNamesBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureNamesIsMutable();
        names_.add(value);
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:DemoString)
    }

    static {
      defaultInstance = new DemoString(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:DemoString)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_DemoString_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_DemoString_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\020DemoString.proto\")\n\nDemoString\022\014\n\004name" +
      "\030\001 \002(\t\022\r\n\005names\030\002 \003(\tB1\n\037com.owl.zookeep" +
      "er.use.protocbufB\016DemoIntStringA"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_DemoString_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_DemoString_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_DemoString_descriptor,
              new String[] { "Name", "Names", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
