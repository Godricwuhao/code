package com.consumer.smartnote.bean;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;

public class Spe extends GeneratedMessageV3 implements SpeOrBuilder {

    private static final long serialVersionUID = 0L;
    public static final int KEY_FIELD_NUMBER = 1;
    private volatile Object key_;
    public static final int START_FIELD_NUMBER = 2;
    private long start_;
    public static final int DURATION_FIELD_NUMBER = 3;
    private long duration_;
    public static final int STATUS_FIELD_NUMBER = 4;
    private int status_;
    public static final int TYPE_FIELD_NUMBER = 5;
    private volatile Object type_;
    public static final int HAS_AJAX_FIELD_NUMBER = 6;
    private boolean hasAjax_;
    public static final int DEBUG_FIELD_NUMBER = 7;
    private volatile Object debug_;
    public static final int CONTEXT_FIELD_NUMBER = 8;
    private volatile Object context_;
    public static final int OPRT_NAME_FIELD_NUMBER = 9;
    private volatile Object oprtName_;

    private Spe(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private Spe() {
        this.key_ = "";
        this.type_ = "";
        this.debug_ = "";
        this.context_ = "";
        this.oprtName_ = "";
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
        return new Spe();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private Spe(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistry == null) {
            throw new NullPointerException();
        }
        UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
        try {
            boolean done = false;
            while (!done) {
                int tag = input.readTag();
                switch (tag) {
                    case 0:
                        done = true;
                        break;
                    case 10:
                        String s = input.readStringRequireUtf8();

                        this.key_ = s;
                        break;
                    case 16:
                        this.start_ = input.readInt64();
                        break;
                    case 24:
                        this.duration_ = input.readInt64();
                        break;
                    case 32:
                        this.status_ = input.readInt32();
                        break;
                    case 42:
                        this.type_ = input.readStringRequireUtf8();
                        break;
                    case 48:
                        this.hasAjax_ = input.readBool();
                        break;
                    case 58:
                        this.debug_ = input.readStringRequireUtf8();
                        break;
                    case 66:
                        this.context_ = input.readStringRequireUtf8();
                        break;
                    case 74:
                        this.oprtName_ = input.readStringRequireUtf8();
                        break;
                    default:
                        if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                            done = true;
                        }
                        break;
                }
            }
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(this);
        } catch (IOException e) {
            throw new InvalidProtocolBufferException(e).setUnfinishedMessage(this);
        } finally {
            this.unknownFields = unknownFields.build();
            makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return ActionOuterClass.internal_static_com_tingyun_proto_Spe_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ActionOuterClass.internal_static_com_tingyun_proto_Spe_fieldAccessorTable.ensureFieldAccessorsInitialized(Spe.class, Builder.class);
    }

    public String getKey() {
        Object ref = this.key_;
        if ((ref instanceof String)) {
            return (String) ref;
        }
        ByteString bs = (ByteString) ref;

        String s = bs.toStringUtf8();
        this.key_ = s;
        return s;
    }

    public ByteString getKeyBytes() {
        Object ref = this.key_;
        if ((ref instanceof String)) {
            ByteString b = ByteString.copyFromUtf8((String) ref);

            this.key_ = b;
            return b;
        }
        return (ByteString) ref;
    }

    public long getStart() {
        return this.start_;
    }

    public long getDuration() {
        return this.duration_;
    }

    public int getStatus() {
        return this.status_;
    }

    public String getType() {
        Object ref = this.type_;
        if ((ref instanceof String)) {
            return (String) ref;
        }
        ByteString bs = (ByteString) ref;

        String s = bs.toStringUtf8();
        this.type_ = s;
        return s;
    }

    public ByteString getTypeBytes() {
        Object ref = this.type_;
        if ((ref instanceof String)) {
            ByteString b = ByteString.copyFromUtf8((String) ref);

            this.type_ = b;
            return b;
        }
        return (ByteString) ref;
    }

    public boolean getHasAjax() {
        return this.hasAjax_;
    }

    public String getDebug() {
        Object ref = this.debug_;
        if ((ref instanceof String)) {
            return (String) ref;
        }
        ByteString bs = (ByteString) ref;

        String s = bs.toStringUtf8();
        this.debug_ = s;
        return s;
    }

    public ByteString getDebugBytes() {
        Object ref = this.debug_;
        if ((ref instanceof String)) {
            ByteString b = ByteString.copyFromUtf8((String) ref);

            this.debug_ = b;
            return b;
        }
        return (ByteString) ref;
    }

    public String getContext() {
        Object ref = this.context_;
        if ((ref instanceof String)) {
            return (String) ref;
        }
        ByteString bs = (ByteString) ref;

        String s = bs.toStringUtf8();
        this.context_ = s;
        return s;
    }

    public ByteString getContextBytes() {
        Object ref = this.context_;
        if ((ref instanceof String)) {
            ByteString b = ByteString.copyFromUtf8((String) ref);

            this.context_ = b;
            return b;
        }
        return (ByteString) ref;
    }

    public String getOprtName() {
        Object ref = this.oprtName_;
        if ((ref instanceof String)) {
            return (String) ref;
        }
        ByteString bs = (ByteString) ref;

        String s = bs.toStringUtf8();
        this.oprtName_ = s;
        return s;
    }

    public ByteString getOprtNameBytes() {
        Object ref = this.oprtName_;
        if ((ref instanceof String)) {
            ByteString b = ByteString.copyFromUtf8((String) ref);

            this.oprtName_ = b;
            return b;
        }
        return (ByteString) ref;
    }

    private byte memoizedIsInitialized = -1;

    public final boolean isInitialized() {
        byte isInitialized = this.memoizedIsInitialized;
        if (isInitialized == 1) {
            return true;
        }
        if (isInitialized == 0) {
            return false;
        }
        this.memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(CodedOutputStream output) throws IOException {
        if (!getKeyBytes().isEmpty()) {
            GeneratedMessageV3.writeString(output, 1, this.key_);
        }
        if (this.start_ != 0L) {
            output.writeInt64(2, this.start_);
        }
        if (this.duration_ != 0L) {
            output.writeInt64(3, this.duration_);
        }
        if (this.status_ != 0) {
            output.writeInt32(4, this.status_);
        }
        if (!getTypeBytes().isEmpty()) {
            GeneratedMessageV3.writeString(output, 5, this.type_);
        }
        if (this.hasAjax_) {
            output.writeBool(6, this.hasAjax_);
        }
        if (!getDebugBytes().isEmpty()) {
            GeneratedMessageV3.writeString(output, 7, this.debug_);
        }
        if (!getContextBytes().isEmpty()) {
            GeneratedMessageV3.writeString(output, 8, this.context_);
        }
        if (!getOprtNameBytes().isEmpty()) {
            GeneratedMessageV3.writeString(output, 9, this.oprtName_);
        }
        this.unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
        int size = this.memoizedSize;
        if (size != -1) {
            return size;
        }
        size = 0;
        if (!getKeyBytes().isEmpty()) {
            size += GeneratedMessageV3.computeStringSize(1, this.key_);
        }
        if (this.start_ != 0L) {
            size = size + CodedOutputStream.computeInt64Size(2, this.start_);
        }
        if (this.duration_ != 0L) {
            size = size + CodedOutputStream.computeInt64Size(3, this.duration_);
        }
        if (this.status_ != 0) {
            size = size + CodedOutputStream.computeInt32Size(4, this.status_);
        }
        if (!getTypeBytes().isEmpty()) {
            size += GeneratedMessageV3.computeStringSize(5, this.type_);
        }
        if (this.hasAjax_) {
            size = size + CodedOutputStream.computeBoolSize(6, this.hasAjax_);
        }
        if (!getDebugBytes().isEmpty()) {
            size += GeneratedMessageV3.computeStringSize(7, this.debug_);
        }
        if (!getContextBytes().isEmpty()) {
            size += GeneratedMessageV3.computeStringSize(8, this.context_);
        }
        if (!getOprtNameBytes().isEmpty()) {
            size += GeneratedMessageV3.computeStringSize(9, this.oprtName_);
        }
        size += this.unknownFields.getSerializedSize();
        this.memoizedSize = size;
        return size;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Spe)) {
            return super.equals(obj);
        }
        Spe other = (Spe) obj;
        if (!getKey().equals(other.getKey())) {
            return false;
        }
        if (getStart() != other.getStart()) {
            return false;
        }
        if (getDuration() != other.getDuration()) {
            return false;
        }
        if (getStatus() != other.getStatus()) {
            return false;
        }
        if (!getType().equals(other.getType())) {
            return false;
        }
        if (getHasAjax() != other.getHasAjax()) {
            return false;
        }
        if (!getDebug().equals(other.getDebug())) {
            return false;
        }
        if (!getContext().equals(other.getContext())) {
            return false;
        }
        if (!getOprtName().equals(other.getOprtName())) {
            return false;
        }
        if (!this.unknownFields.equals(other.unknownFields)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hash = 41;
        hash = 19 * hash + getDescriptor().hashCode();
        hash = 37 * hash + 1;
        hash = 53 * hash + getKey().hashCode();
        hash = 37 * hash + 2;
        hash = 53 * hash + Internal.hashLong(getStart());
        hash = 37 * hash + 3;
        hash = 53 * hash + Internal.hashLong(getDuration());
        hash = 37 * hash + 4;
        hash = 53 * hash + getStatus();
        hash = 37 * hash + 5;
        hash = 53 * hash + getType().hashCode();
        hash = 37 * hash + 6;
        hash = 53 * hash + Internal.hashBoolean(getHasAjax());
        hash = 37 * hash + 7;
        hash = 53 * hash + getDebug().hashCode();
        hash = 37 * hash + 8;
        hash = 53 * hash + getContext().hashCode();
        hash = 37 * hash + 9;
        hash = 53 * hash + getOprtName().hashCode();
        hash = 29 * hash + this.unknownFields.hashCode();
        this.memoizedHashCode = hash;
        return hash;
    }

    public static Spe parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (Spe) PARSER.parseFrom(data);
    }

    public static Spe parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Spe) PARSER.parseFrom(data, extensionRegistry);
    }

    public static Spe parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (Spe) PARSER.parseFrom(data);
    }

    public static Spe parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Spe) PARSER.parseFrom(data, extensionRegistry);
    }

    public static Spe parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (Spe) PARSER.parseFrom(data);
    }

    public static Spe parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Spe) PARSER.parseFrom(data, extensionRegistry);
    }

    public static Spe parseFrom(InputStream input) throws IOException {
        return (Spe) GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static Spe parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Spe) GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static Spe parseDelimitedFrom(InputStream input) throws IOException {
        return (Spe) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static Spe parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Spe) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static Spe parseFrom(CodedInputStream input) throws IOException {
        return (Spe) GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static Spe parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Spe) GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Spe prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder(null) : new Builder(null).mergeFrom(this);
    }

    protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SpeOrBuilder {
        public static final Descriptors.Descriptor getDescriptor() {
            return ActionOuterClass.internal_static_com_tingyun_proto_Spe_descriptor;
        }

        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActionOuterClass.internal_static_com_tingyun_proto_Spe_fieldAccessorTable.ensureFieldAccessorsInitialized(Spe.class, Builder.class);
        }

        private Builder() {
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent parent) {
            super();
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (Spe.alwaysUseFieldBuilders) {
            }
        }

        public Builder clear() {
            super.clear();
            this.key_ = "";

            this.start_ = 0L;

            this.duration_ = 0L;

            this.status_ = 0;

            this.type_ = "";

            this.hasAjax_ = false;

            this.debug_ = "";

            this.context_ = "";

            this.oprtName_ = "";

            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return ActionOuterClass.internal_static_com_tingyun_proto_Spe_descriptor;
        }

        public Spe getDefaultInstanceForType() {
            return Spe.getDefaultInstance();
        }

        public Spe build() {
            Spe result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        public Spe buildPartial() {
            Spe result = new Spe(this);
            result.key_ = this.key_;
            result.start_ = this.start_;
            result.duration_ = this.duration_;
            result.status_ = this.status_;
            result.type_ = this.type_;
            result.hasAjax_ = this.hasAjax_;
            result.debug_ = this.debug_;
            result.context_ = this.context_;
            result.oprtName_ = this.oprtName_;
            onBuilt();
            return result;
        }

        public Builder clone() {
            return (Builder) super.clone();
        }

        public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder) super.setField(field, value);
        }

        public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder) super.clearField(field);
        }

        public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder) super.clearOneof(oneof);
        }

        public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder) super.setRepeatedField(field, index, value);
        }

        public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder) super.addRepeatedField(field, value);
        }

        public Builder mergeFrom(Message other) {
            if ((other instanceof Spe)) {
                return mergeFrom((Spe) other);
            }
            super.mergeFrom(other);
            return this;
        }

        public Builder mergeFrom(Spe other) {
            if (other == Spe.getDefaultInstance()) {
                return this;
            }
            if (!other.getKey().isEmpty()) {
                this.key_ = other.key_;
                onChanged();
            }
            if (other.getStart() != 0L) {
                setStart(other.getStart());
            }
            if (other.getDuration() != 0L) {
                setDuration(other.getDuration());
            }
            if (other.getStatus() != 0) {
                setStatus(other.getStatus());
            }
            if (!other.getType().isEmpty()) {
                this.type_ = other.type_;
                onChanged();
            }
            if (other.getHasAjax()) {
                setHasAjax(other.getHasAjax());
            }
            if (!other.getDebug().isEmpty()) {
                this.debug_ = other.debug_;
                onChanged();
            }
            if (!other.getContext().isEmpty()) {
                this.context_ = other.context_;
                onChanged();
            }
            if (!other.getOprtName().isEmpty()) {
                this.oprtName_ = other.oprtName_;
                onChanged();
            }
            mergeUnknownFields(other.unknownFields);
            onChanged();
            return this;
        }

        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            Spe parsedMessage = null;
            try {
                parsedMessage = (Spe) Spe.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
                parsedMessage = (Spe) e.getUnfinishedMessage();
                throw e.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        private Object key_ = "";
        private long start_;
        private long duration_;
        private int status_;

        public String getKey() {
            Object ref = this.key_;
            if (!(ref instanceof String)) {
                ByteString bs = (ByteString) ref;

                String s = bs.toStringUtf8();
                this.key_ = s;
                return s;
            }
            return (String) ref;
        }

        public ByteString getKeyBytes() {
            Object ref = this.key_;
            if ((ref instanceof String)) {
                ByteString b = ByteString.copyFromUtf8((String) ref);

                this.key_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public Builder setKey(String value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.key_ = value;
            onChanged();
            return this;
        }

        public Builder clearKey() {
            this.key_ = Spe.getDefaultInstance().getKey();
            onChanged();
            return this;
        }

        public Builder setKeyBytes(ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            Spe.checkByteStringIsUtf8(value);

            this.key_ = value;
            onChanged();
            return this;
        }

        public long getStart() {
            return this.start_;
        }

        public Builder setStart(long value) {
            this.start_ = value;
            onChanged();
            return this;
        }

        public Builder clearStart() {
            this.start_ = 0L;
            onChanged();
            return this;
        }

        public long getDuration() {
            return this.duration_;
        }

        public Builder setDuration(long value) {
            this.duration_ = value;
            onChanged();
            return this;
        }

        public Builder clearDuration() {
            this.duration_ = 0L;
            onChanged();
            return this;
        }

        public int getStatus() {
            return this.status_;
        }

        public Builder setStatus(int value) {
            this.status_ = value;
            onChanged();
            return this;
        }

        public Builder clearStatus() {
            this.status_ = 0;
            onChanged();
            return this;
        }

        private Object type_ = "";
        private boolean hasAjax_;

        public String getType() {
            Object ref = this.type_;
            if (!(ref instanceof String)) {
                ByteString bs = (ByteString) ref;

                String s = bs.toStringUtf8();
                this.type_ = s;
                return s;
            }
            return (String) ref;
        }

        public ByteString getTypeBytes() {
            Object ref = this.type_;
            if ((ref instanceof String)) {
                ByteString b = ByteString.copyFromUtf8((String) ref);

                this.type_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public Builder setType(String value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.type_ = value;
            onChanged();
            return this;
        }

        public Builder clearType() {
            this.type_ = Spe.getDefaultInstance().getType();
            onChanged();
            return this;
        }

        public Builder setTypeBytes(ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            Spe.checkByteStringIsUtf8(value);

            this.type_ = value;
            onChanged();
            return this;
        }

        public boolean getHasAjax() {
            return this.hasAjax_;
        }

        public Builder setHasAjax(boolean value) {
            this.hasAjax_ = value;
            onChanged();
            return this;
        }

        public Builder clearHasAjax() {
            this.hasAjax_ = false;
            onChanged();
            return this;
        }

        private Object debug_ = "";

        public String getDebug() {
            Object ref = this.debug_;
            if (!(ref instanceof String)) {
                ByteString bs = (ByteString) ref;

                String s = bs.toStringUtf8();
                this.debug_ = s;
                return s;
            }
            return (String) ref;
        }

        public ByteString getDebugBytes() {
            Object ref = this.debug_;
            if ((ref instanceof String)) {
                ByteString b = ByteString.copyFromUtf8((String) ref);

                this.debug_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public Builder setDebug(String value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.debug_ = value;
            onChanged();
            return this;
        }

        public Builder clearDebug() {
            this.debug_ = Spe.getDefaultInstance().getDebug();
            onChanged();
            return this;
        }

        public Builder setDebugBytes(ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            Spe.checkByteStringIsUtf8(value);

            this.debug_ = value;
            onChanged();
            return this;
        }

        private Object context_ = "";

        public String getContext() {
            Object ref = this.context_;
            if (!(ref instanceof String)) {
                ByteString bs = (ByteString) ref;

                String s = bs.toStringUtf8();
                this.context_ = s;
                return s;
            }
            return (String) ref;
        }

        public ByteString getContextBytes() {
            Object ref = this.context_;
            if ((ref instanceof String)) {
                ByteString b = ByteString.copyFromUtf8((String) ref);

                this.context_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public Builder setContext(String value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.context_ = value;
            onChanged();
            return this;
        }

        public Builder clearContext() {
            this.context_ = Spe.getDefaultInstance().getContext();
            onChanged();
            return this;
        }

        public Builder setContextBytes(ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            Spe.checkByteStringIsUtf8(value);

            this.context_ = value;
            onChanged();
            return this;
        }

        private Object oprtName_ = "";

        public String getOprtName() {
            Object ref = this.oprtName_;
            if (!(ref instanceof String)) {
                ByteString bs = (ByteString) ref;

                String s = bs.toStringUtf8();
                this.oprtName_ = s;
                return s;
            }
            return (String) ref;
        }

        public ByteString getOprtNameBytes() {
            Object ref = this.oprtName_;
            if ((ref instanceof String)) {
                ByteString b = ByteString.copyFromUtf8((String) ref);

                this.oprtName_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public Builder setOprtName(String value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.oprtName_ = value;
            onChanged();
            return this;
        }

        public Builder clearOprtName() {
            this.oprtName_ = Spe.getDefaultInstance().getOprtName();
            onChanged();
            return this;
        }

        public Builder setOprtNameBytes(ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            Spe.checkByteStringIsUtf8(value);

            this.oprtName_ = value;
            onChanged();
            return this;
        }

        public final Builder setUnknownFields(UnknownFieldSet unknownFields) {
            return (Builder) super.setUnknownFields(unknownFields);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
            return (Builder) super.mergeUnknownFields(unknownFields);
        }
    }

    private static final Spe DEFAULT_INSTANCE = new Spe();

    public static Spe getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final Parser<Spe> PARSER = new AbstractParser() {
        public Spe parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new Spe(input, extensionRegistry);
        }
    };

    public static Parser<Spe> parser() {
        return PARSER;
    }

    public Parser<Spe> getParserForType() {
        return PARSER;
    }

    public Spe getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
