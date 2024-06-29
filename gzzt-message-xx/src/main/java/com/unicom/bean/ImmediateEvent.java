package com.unicom.bean;

import com.google.protobuf.*;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class ImmediateEvent extends GeneratedMessageV3 implements ImmediateEventOrBuilder {

	private static final long serialVersionUID = 0L;
	public static final int NAME_FIELD_NUMBER = 1;
	private volatile Object name_;
	public static final int TIME_FIELD_NUMBER = 2;
	private long time_;
	public static final int STATUS_FIELD_NUMBER = 3;
	private volatile Object status_;
	public static final int MSG_FIELD_NUMBER = 4;
	private volatile Object msg_;
	public static final int CONTEXT_FIELD_NUMBER = 5;
	private volatile Object context_;

	private ImmediateEvent(GeneratedMessageV3.Builder<?> builder) {
		super(builder);
	}

	private ImmediateEvent() {
		this.name_ = "";
		this.status_ = "";
		this.msg_ = "";
		this.context_ = "";
	}

	protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
		return new ImmediateEvent();
	}

	public final UnknownFieldSet getUnknownFields() {
		return this.unknownFields;
	}

	private ImmediateEvent(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
					this.name_ = input.readStringRequireUtf8();
					break;
				case 16:
					this.time_ = input.readInt64();
					break;
				case 26:
					this.status_ = input.readStringRequireUtf8();
					break;
				case 34:
					this.msg_ = input.readStringRequireUtf8();
					break;
				case 42:
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
		return ActionOuterClass.internal_static_com_tingyun_proto_ImmediateEvent_descriptor;
	}

	protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
		return ActionOuterClass.internal_static_com_tingyun_proto_ImmediateEvent_fieldAccessorTable.ensureFieldAccessorsInitialized(ImmediateEvent.class, Builder.class);
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

	public String getStatus() {
		Object ref = this.status_;
		if ((ref instanceof String)) {
			return (String) ref;
		}
		ByteString bs = (ByteString) ref;

		String s = bs.toStringUtf8();
		this.status_ = s;
		return s;
	}

	public ByteString getStatusBytes() {
		Object ref = this.status_;
		if ((ref instanceof String)) {
			ByteString b = ByteString.copyFromUtf8((String) ref);

			this.status_ = b;
			return b;
		}
		return (ByteString) ref;
	}

	public String getMsg() {
		Object ref = this.msg_;
		if ((ref instanceof String)) {
			return (String) ref;
		}
		ByteString bs = (ByteString) ref;

		String s = bs.toStringUtf8();
		this.msg_ = s;
		return s;
	}

	public ByteString getMsgBytes() {
		Object ref = this.msg_;
		if ((ref instanceof String)) {
			ByteString b = ByteString.copyFromUtf8((String) ref);

			this.msg_ = b;
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
		if (!getNameBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 1, this.name_);
		}
		if (this.time_ != 0L) {
			output.writeInt64(2, this.time_);
		}
		if (!getStatusBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 3, this.status_);
		}
		if (!getMsgBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 4, this.msg_);
		}
		if (!getContextBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 5, this.context_);
		}
		this.unknownFields.writeTo(output);
	}

	public int getSerializedSize() {
		int size = this.memoizedSize;
		if (size != -1) {
			return size;
		}
		size = 0;
		if (!getNameBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(1, this.name_);
		}
		if (this.time_ != 0L) {
			size = size + CodedOutputStream.computeInt64Size(2, this.time_);
		}
		if (!getStatusBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(3, this.status_);
		}
		if (!getMsgBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(4, this.msg_);
		}
		if (!getContextBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(5, this.context_);
		}
		size += this.unknownFields.getSerializedSize();
		this.memoizedSize = size;
		return size;
	}

	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (!(obj instanceof ImmediateEvent)) {
			return super.equals(obj);
		}
		ImmediateEvent other = (ImmediateEvent) obj;
		if (!getName().equals(other.getName())) {
			return false;
		}
		if (getTime() != other.getTime()) {
			return false;
		}
		if (!getStatus().equals(other.getStatus())) {
			return false;
		}
		if (!getMsg().equals(other.getMsg())) {
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
		hash = 53 * hash + getName().hashCode();
		hash = 37 * hash + 2;
		hash = 53 * hash + Internal.hashLong(getTime());
		hash = 37 * hash + 3;
		hash = 53 * hash + getStatus().hashCode();
		hash = 37 * hash + 4;
		hash = 53 * hash + getMsg().hashCode();
		hash = 37 * hash + 5;
		hash = 53 * hash + getContext().hashCode();
		hash = 29 * hash + this.unknownFields.hashCode();
		this.memoizedHashCode = hash;
		return hash;
	}

	public static ImmediateEvent parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
		return (ImmediateEvent) PARSER.parseFrom(data);
	}

	public static ImmediateEvent parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
		return (ImmediateEvent) PARSER.parseFrom(data, extensionRegistry);
	}

	public static ImmediateEvent parseFrom(ByteString data) throws InvalidProtocolBufferException {
		return (ImmediateEvent) PARSER.parseFrom(data);
	}

	public static ImmediateEvent parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
		return (ImmediateEvent) PARSER.parseFrom(data, extensionRegistry);
	}

	public static ImmediateEvent parseFrom(byte[] data) throws InvalidProtocolBufferException {
		return (ImmediateEvent) PARSER.parseFrom(data);
	}

	public static ImmediateEvent parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
		return (ImmediateEvent) PARSER.parseFrom(data, extensionRegistry);
	}

	public static ImmediateEvent parseFrom(InputStream input) throws IOException {
		return (ImmediateEvent) GeneratedMessageV3.parseWithIOException(PARSER, input);
	}

	public static ImmediateEvent parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
		return (ImmediateEvent) GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
	}

	public static ImmediateEvent parseDelimitedFrom(InputStream input) throws IOException {
		return (ImmediateEvent) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
	}

	public static ImmediateEvent parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
		return (ImmediateEvent) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
	}

	public static ImmediateEvent parseFrom(CodedInputStream input) throws IOException {
		return (ImmediateEvent) GeneratedMessageV3.parseWithIOException(PARSER, input);
	}

	public static ImmediateEvent parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
		return (ImmediateEvent) GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
	}

	public Builder newBuilderForType() {
		return newBuilder();
	}

	public static Builder newBuilder() {
		return DEFAULT_INSTANCE.toBuilder();
	}

	public static Builder newBuilder(ImmediateEvent prototype) {
		return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
	}

	public Builder toBuilder() {
		return this == DEFAULT_INSTANCE ? new Builder(null) : new Builder(null).mergeFrom(this);
	}

	protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
		Builder builder = new Builder(parent);
		return builder;
	}

	public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ImmediateEventOrBuilder {
		public static final Descriptors.Descriptor getDescriptor() {
			return ActionOuterClass.internal_static_com_tingyun_proto_ImmediateEvent_descriptor;
		}

		protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
			return ActionOuterClass.internal_static_com_tingyun_proto_ImmediateEvent_fieldAccessorTable.ensureFieldAccessorsInitialized(ImmediateEvent.class, Builder.class);
		}

		private Builder() {
			maybeForceBuilderInitialization();
		}

		private Builder(GeneratedMessageV3.BuilderParent parent) {
			super();
			maybeForceBuilderInitialization();
		}

		private void maybeForceBuilderInitialization() {
			if (ImmediateEvent.alwaysUseFieldBuilders) {
			}
		}

		public Builder clear() {
			super.clear();
			this.name_ = "";

			this.time_ = 0L;

			this.status_ = "";

			this.msg_ = "";

			this.context_ = "";

			return this;
		}

		public Descriptors.Descriptor getDescriptorForType() {
			return ActionOuterClass.internal_static_com_tingyun_proto_ImmediateEvent_descriptor;
		}

		public ImmediateEvent getDefaultInstanceForType() {
			return ImmediateEvent.getDefaultInstance();
		}

		public ImmediateEvent build() {
			ImmediateEvent result = buildPartial();
			if (!result.isInitialized()) {
				throw newUninitializedMessageException(result);
			}
			return result;
		}

		public ImmediateEvent buildPartial() {
			ImmediateEvent result = new ImmediateEvent(this);
			result.name_ = this.name_;
			result.time_ = this.time_;
			result.status_ = this.status_;
			result.msg_ = this.msg_;
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
			if ((other instanceof ImmediateEvent)) {
				return mergeFrom((ImmediateEvent) other);
			}
			super.mergeFrom(other);
			return this;
		}

		public Builder mergeFrom(ImmediateEvent other) {
			if (other == ImmediateEvent.getDefaultInstance()) {
				return this;
			}
			if (!other.getName().isEmpty()) {
				this.name_ = other.name_;
				onChanged();
			}
			if (other.getTime() != 0L) {
				setTime(other.getTime());
			}
			if (!other.getStatus().isEmpty()) {
				this.status_ = other.status_;
				onChanged();
			}
			if (!other.getMsg().isEmpty()) {
				this.msg_ = other.msg_;
				onChanged();
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
			ImmediateEvent parsedMessage = null;
			try {
				parsedMessage = (ImmediateEvent) ImmediateEvent.PARSER.parsePartialFrom(input, extensionRegistry);
			} catch (InvalidProtocolBufferException e) {
				parsedMessage = (ImmediateEvent) e.getUnfinishedMessage();
				throw e.unwrapIOException();
			} finally {
				if (parsedMessage != null) {
					mergeFrom(parsedMessage);
				}
			}
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
			this.name_ = ImmediateEvent.getDefaultInstance().getName();
			onChanged();
			return this;
		}

		public Builder setNameBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			ImmediateEvent.checkByteStringIsUtf8(value);

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

		private Object status_ = "";

		public String getStatus() {
			Object ref = this.status_;
			if (!(ref instanceof String)) {
				ByteString bs = (ByteString) ref;

				String s = bs.toStringUtf8();
				this.status_ = s;
				return s;
			}
			return (String) ref;
		}

		public ByteString getStatusBytes() {
			Object ref = this.status_;
			if ((ref instanceof String)) {
				ByteString b = ByteString.copyFromUtf8((String) ref);

				this.status_ = b;
				return b;
			}
			return (ByteString) ref;
		}

		public Builder setStatus(String value) {
			if (value == null) {
				throw new NullPointerException();
			}
			this.status_ = value;
			onChanged();
			return this;
		}

		public Builder clearStatus() {
			this.status_ = ImmediateEvent.getDefaultInstance().getStatus();
			onChanged();
			return this;
		}

		public Builder setStatusBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			ImmediateEvent.checkByteStringIsUtf8(value);

			this.status_ = value;
			onChanged();
			return this;
		}

		private Object msg_ = "";

		public String getMsg() {
			Object ref = this.msg_;
			if (!(ref instanceof String)) {
				ByteString bs = (ByteString) ref;

				String s = bs.toStringUtf8();
				this.msg_ = s;
				return s;
			}
			return (String) ref;
		}

		public ByteString getMsgBytes() {
			Object ref = this.msg_;
			if ((ref instanceof String)) {
				ByteString b = ByteString.copyFromUtf8((String) ref);

				this.msg_ = b;
				return b;
			}
			return (ByteString) ref;
		}

		public Builder setMsg(String value) {
			if (value == null) {
				throw new NullPointerException();
			}
			this.msg_ = value;
			onChanged();
			return this;
		}

		public Builder clearMsg() {
			this.msg_ = ImmediateEvent.getDefaultInstance().getMsg();
			onChanged();
			return this;
		}

		public Builder setMsgBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			ImmediateEvent.checkByteStringIsUtf8(value);

			this.msg_ = value;
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
			this.context_ = ImmediateEvent.getDefaultInstance().getContext();
			onChanged();
			return this;
		}

		public Builder setContextBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			ImmediateEvent.checkByteStringIsUtf8(value);

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

	private static final ImmediateEvent DEFAULT_INSTANCE = new ImmediateEvent();

	public static ImmediateEvent getDefaultInstance() {
		return DEFAULT_INSTANCE;
	}

	private static final Parser<ImmediateEvent> PARSER = new AbstractParser() {
		public ImmediateEvent parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
			return new ImmediateEvent(input, extensionRegistry);
		}
	};

	public static Parser<ImmediateEvent> parser() {
		return PARSER;
	}

	public Parser<ImmediateEvent> getParserForType() {
		return PARSER;
	}

	public ImmediateEvent getDefaultInstanceForType() {
		return DEFAULT_INSTANCE;
	}
}
