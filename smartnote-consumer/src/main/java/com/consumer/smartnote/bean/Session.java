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

public class Session extends GeneratedMessageV3 implements SessionOrBuilder {

    private static final long serialVersionUID = 0L;
    public static final int ID_FIELD_NUMBER = 1;
    private volatile Object id_;
    public static final int NAME_FIELD_NUMBER = 2;
    private volatile Object name_;
    public static final int TIME_FIELD_NUMBER = 3;
    private long time_;
    public static final int CONTEXT_FIELD_NUMBER = 4;
    private volatile Object context_;

    private Session(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private Session() {
        this.id_ = "";
        this.name_ = "";
        this.context_ = "";
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
        return new Session();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private Session(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.id_ = input.readStringRequireUtf8();
                        break;
                    case 18:
                        this.name_ = input.readStringRequireUtf8();
                        break;
                    case 24:
                        this.time_ = input.readInt64();
                        break;
                    case 34:
                        this.context_ = input.readStringRequireUtf8();
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
        return ActionOuterClass.internal_static_com_tingyun_proto_Session_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ActionOuterClass.internal_static_com_tingyun_proto_Session_fieldAccessorTable.ensureFieldAccessorsInitialized(Session.class, Builder.class);
    }

    public String getId() {
        Object ref = this.id_;
        if ((ref instanceof String)) {
            return (String) ref;
        }
        ByteString bs = (ByteString) ref;

        String s = bs.toStringUtf8();
        this.id_ = s;
        return s;
    }

    public ByteString getIdBytes() {
        Object ref = this.id_;
        if ((ref instanceof String)) {
            ByteString b = ByteString.copyFromUtf8((String) ref);

            this.id_ = b;
            return b;
        }
        return (ByteString) ref;
    }

    public String getName() {
        Object ref = this.name_;
        if ((ref instanceof String)) {
            return (String) ref;
        }
        ByteString bs = (ByteString) ref;

        String s = bs.toStringUtf8();
        this.name_ = s;
        return s;
    }

    public ByteString getNameBytes() {
        Object ref = this.name_;
        if ((ref instanceof String)) {
            ByteString b = ByteString.copyFromUtf8((String) ref);

            this.name_ = b;
            return b;
        }
        return (ByteString) ref;
    }

    public long getTime() {
        return this.time_;
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
        if (!getIdBytes().isEmpty()) {
            GeneratedMessageV3.writeString(output, 1, this.id_);
        }
        if (!getNameBytes().isEmpty()) {
            GeneratedMessageV3.writeString(output, 2, this.name_);
        }
        if (this.time_ != 0L) {
            output.writeInt64(3, this.time_);
        }
        if (!getContextBytes().isEmpty()) {
            GeneratedMessageV3.writeString(output, 4, this.context_);
        }
        this.unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
        int size = this.memoizedSize;
        if (size != -1) {
            return size;
        }
        size = 0;
        if (!getIdBytes().isEmpty()) {
            size += GeneratedMessageV3.computeStringSize(1, this.id_);
        }
        if (!getNameBytes().isEmpty()) {
            size += GeneratedMessageV3.computeStringSize(2, this.name_);
        }
        if (this.time_ != 0L) {
            size = size + CodedOutputStream.computeInt64Size(3, this.time_);
        }
        if (!getContextBytes().isEmpty()) {
            size += GeneratedMessageV3.computeStringSize(4, this.context_);
        }
        size += this.unknownFields.getSerializedSize();
        this.memoizedSize = size;
        return size;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Session)) {
            return super.equals(obj);
        }
        Session other = (Session) obj;
        if (!getId().equals(other.getId())) {
            return false;
        }
        if (!getName().equals(other.getName())) {
            return false;
        }
        if (getTime() != other.getTime()) {
            return false;
        }
        if (!getContext().equals(other.getContext())) {
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
        hash = 53 * hash + getId().hashCode();
        hash = 37 * hash + 2;
        hash = 53 * hash + getName().hashCode();
        hash = 37 * hash + 3;
        hash = 53 * hash + Internal.hashLong(getTime());
        hash = 37 * hash + 4;
        hash = 53 * hash + getContext().hashCode();
        hash = 29 * hash + this.unknownFields.hashCode();
        this.memoizedHashCode = hash;
        return hash;
    }

    public static Session parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (Session) PARSER.parseFrom(data);
    }

    public static Session parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Session) PARSER.parseFrom(data, extensionRegistry);
    }

    public static Session parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (Session) PARSER.parseFrom(data);
    }

    public static Session parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Session) PARSER.parseFrom(data, extensionRegistry);
    }

    public static Session parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (Session) PARSER.parseFrom(data);
    }

    public static Session parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Session) PARSER.parseFrom(data, extensionRegistry);
    }

    public static Session parseFrom(InputStream input) throws IOException {
        return (Session) GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static Session parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Session) GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static Session parseDelimitedFrom(InputStream input) throws IOException {
        return (Session) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static Session parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Session) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static Session parseFrom(CodedInputStream input) throws IOException {
        return (Session) GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static Session parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Session) GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Session prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder(null) : new Builder(null).mergeFrom(this);
    }

    protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SessionOrBuilder {
        public static final Descriptors.Descriptor getDescriptor() {
            return ActionOuterClass.internal_static_com_tingyun_proto_Session_descriptor;
        }

        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActionOuterClass.internal_static_com_tingyun_proto_Session_fieldAccessorTable.ensureFieldAccessorsInitialized(Session.class, Builder.class);
        }

        private Builder() {
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent parent) {
            super();
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (Session.alwaysUseFieldBuilders) {
            }
        }

        public Builder clear() {
            super.clear();
            this.id_ = "";

            this.name_ = "";

            this.time_ = 0L;

            this.context_ = "";

            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return ActionOuterClass.internal_static_com_tingyun_proto_Session_descriptor;
        }

        public Session getDefaultInstanceForType() {
            return Session.getDefaultInstance();
        }

        public Session build() {
            Session result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        public Session buildPartial() {
            Session result = new Session(this);
            result.id_ = this.id_;
            result.name_ = this.name_;
            result.time_ = this.time_;
            result.context_ = this.context_;
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
            if ((other instanceof Session)) {
                return mergeFrom((Session) other);
            }
            super.mergeFrom(other);
            return this;
        }

        public Builder mergeFrom(Session other) {
            if (other == Session.getDefaultInstance()) {
                return this;
            }
            if (!other.getId().isEmpty()) {
                this.id_ = other.id_;
                onChanged();
            }
            if (!other.getName().isEmpty()) {
                this.name_ = other.name_;
                onChanged();
            }
            if (other.getTime() != 0L) {
                setTime(other.getTime());
            }
            if (!other.getContext().isEmpty()) {
                this.context_ = other.context_;
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
            Session parsedMessage = null;
            try {
                parsedMessage = (Session) Session.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
                parsedMessage = (Session) e.getUnfinishedMessage();
                throw e.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        private Object id_ = "";

        public String getId() {
            Object ref = this.id_;
            if (!(ref instanceof String)) {
                ByteString bs = (ByteString) ref;

                String s = bs.toStringUtf8();
                this.id_ = s;
                return s;
            }
            return (String) ref;
        }

        public ByteString getIdBytes() {
            Object ref = this.id_;
            if ((ref instanceof String)) {
                ByteString b = ByteString.copyFromUtf8((String) ref);

                this.id_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public Builder setId(String value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.id_ = value;
            onChanged();
            return this;
        }

        public Builder clearId() {
            this.id_ = Session.getDefaultInstance().getId();
            onChanged();
            return this;
        }

        public Builder setIdBytes(ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            Session.checkByteStringIsUtf8(value);

            this.id_ = value;
            onChanged();
            return this;
        }

        private Object name_ = "";
        private long time_;

        public String getName() {
            Object ref = this.name_;
            if (!(ref instanceof String)) {
                ByteString bs = (ByteString) ref;

                String s = bs.toStringUtf8();
                this.name_ = s;
                return s;
            }
            return (String) ref;
        }

        public ByteString getNameBytes() {
            Object ref = this.name_;
            if ((ref instanceof String)) {
                ByteString b = ByteString.copyFromUtf8((String) ref);

                this.name_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public Builder setName(String value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.name_ = value;
            onChanged();
            return this;
        }

        public Builder clearName() {
            this.name_ = Session.getDefaultInstance().getName();
            onChanged();
            return this;
        }

        public Builder setNameBytes(ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            Session.checkByteStringIsUtf8(value);

            this.name_ = value;
            onChanged();
            return this;
        }

        public long getTime() {
            return this.time_;
        }

        public Builder setTime(long value) {
            this.time_ = value;
            onChanged();
            return this;
        }

        public Builder clearTime() {
            this.time_ = 0L;
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
            this.context_ = Session.getDefaultInstance().getContext();
            onChanged();
            return this;
        }

        public Builder setContextBytes(ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            Session.checkByteStringIsUtf8(value);

            this.context_ = value;
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

    private static final Session DEFAULT_INSTANCE = new Session();

    public static Session getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final Parser<Session> PARSER = new AbstractParser() {
        public Session parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new Session(input, extensionRegistry);
        }
    };

    public static Parser<Session> parser() {
        return PARSER;
    }

    public Parser<Session> getParserForType() {
        return PARSER;
    }

    public Session getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
