package com.consumer.smartnote.bean;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.google.protobuf.AbstractMessageLite;
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
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;

public class CrossPage extends GeneratedMessageV3 implements CrossPageOrBuilder {
	
	private static final long serialVersionUID = 0L;
	public static final int START_FIELD_NUMBER = 1;
	private long start_;
	public static final int END_FIELD_NUMBER = 2;
	private long end_;
	public static final int URL_FIELD_NUMBER = 3;
	private volatile Object url_;
	public static final int PF_FIELD_NUMBER = 4;
	private Pf pf_;
	public static final int AJAXES_FIELD_NUMBER = 5;
	private List<Ajax> ajaxes_;
	public static final int TIMERS_FIELD_NUMBER = 6;
	private List<Timer> timers_;
	public static final int IFRAMES_FIELD_NUMBER = 7;
	private List<Iframe> iframes_;
	public static final int STATE_FIELD_NUMBER = 8;
	private int state_;

	private CrossPage(GeneratedMessageV3.Builder<?> builder) {
		super(builder);
	}

	private CrossPage() {
		this.url_ = "";
		this.ajaxes_ = Collections.emptyList();
		this.timers_ = Collections.emptyList();
		this.iframes_ = Collections.emptyList();
		this.state_ = 0;
	}

	protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
		return new CrossPage();
	}

	public final UnknownFieldSet getUnknownFields() {
		return this.unknownFields;
	}

	private CrossPage(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
		this();
		if (extensionRegistry == null) {
			throw new NullPointerException();
		}
		int mutable_bitField0_ = 0;

		UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
		try {
			boolean done = false;
			while (!done) {
				int tag = input.readTag();
				switch (tag) {
				case 0:
					done = true;
					break;
				case 8:
					this.start_ = input.readInt64();
					break;
				case 16:
					this.end_ = input.readInt64();
					break;
				case 26:
					String s = input.readStringRequireUtf8();

					this.url_ = s;
					break;
				case 34:
					Pf.Builder subBuilder = null;
					if (this.pf_ != null) {
						subBuilder = this.pf_.toBuilder();
					}
					this.pf_ = ((Pf) input.readMessage(Pf.parser(), extensionRegistry));
					if (subBuilder != null) {
						subBuilder.mergeFrom(this.pf_);
						this.pf_ = subBuilder.buildPartial();
					}
					break;
				case 42:
					if ((mutable_bitField0_ & 0x1) == 0) {
						this.ajaxes_ = new ArrayList();
						mutable_bitField0_ |= 0x1;
					}
					this.ajaxes_.add(input.readMessage(Ajax.parser(), extensionRegistry));
					break;
				case 50:
					if ((mutable_bitField0_ & 0x2) == 0) {
						this.timers_ = new ArrayList();
						mutable_bitField0_ |= 0x2;
					}
					this.timers_.add(input.readMessage(Timer.parser(), extensionRegistry));
					break;
				case 58:
					if ((mutable_bitField0_ & 0x4) == 0) {
						this.iframes_ = new ArrayList();
						mutable_bitField0_ |= 0x4;
					}
					this.iframes_.add(input.readMessage(Iframe.parser(), extensionRegistry));
					break;
				case 64:
					int rawValue = input.readEnum();

					this.state_ = rawValue;
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
			if ((mutable_bitField0_ & 0x1) != 0) {
				this.ajaxes_ = Collections.unmodifiableList(this.ajaxes_);
			}
			if ((mutable_bitField0_ & 0x2) != 0) {
				this.timers_ = Collections.unmodifiableList(this.timers_);
			}
			if ((mutable_bitField0_ & 0x4) != 0) {
				this.iframes_ = Collections.unmodifiableList(this.iframes_);
			}
			this.unknownFields = unknownFields.build();
			makeExtensionsImmutable();
		}
	}

	public static final Descriptors.Descriptor getDescriptor() {
		return ActionOuterClass.internal_static_com_tingyun_proto_CrossPage_descriptor;
	}

	protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
		return ActionOuterClass.internal_static_com_tingyun_proto_CrossPage_fieldAccessorTable.ensureFieldAccessorsInitialized(CrossPage.class, Builder.class);
	}

	public long getStart() {
		return this.start_;
	}

	public long getEnd() {
		return this.end_;
	}

	public String getUrl() {
		Object ref = this.url_;
		if ((ref instanceof String)) {
			return (String) ref;
		}
		ByteString bs = (ByteString) ref;

		String s = bs.toStringUtf8();
		this.url_ = s;
		return s;
	}

	public ByteString getUrlBytes() {
		Object ref = this.url_;
		if ((ref instanceof String)) {
			ByteString b = ByteString.copyFromUtf8((String) ref);

			this.url_ = b;
			return b;
		}
		return (ByteString) ref;
	}

	public boolean hasPf() {
		return this.pf_ != null;
	}

	public Pf getPf() {
		return this.pf_ == null ? Pf.getDefaultInstance() : this.pf_;
	}

	public PfOrBuilder getPfOrBuilder() {
		return getPf();
	}

	public List<Ajax> getAjaxesList() {
		return this.ajaxes_;
	}

	public List<? extends AjaxOrBuilder> getAjaxesOrBuilderList() {
		return this.ajaxes_;
	}

	public int getAjaxesCount() {
		return this.ajaxes_.size();
	}

	public Ajax getAjaxes(int index) {
		return (Ajax) this.ajaxes_.get(index);
	}

	public AjaxOrBuilder getAjaxesOrBuilder(int index) {
		return (AjaxOrBuilder) this.ajaxes_.get(index);
	}

	public List<Timer> getTimersList() {
		return this.timers_;
	}

	public List<? extends TimerOrBuilder> getTimersOrBuilderList() {
		return this.timers_;
	}

	public int getTimersCount() {
		return this.timers_.size();
	}

	public Timer getTimers(int index) {
		return (Timer) this.timers_.get(index);
	}

	public TimerOrBuilder getTimersOrBuilder(int index) {
		return (TimerOrBuilder) this.timers_.get(index);
	}

	public List<Iframe> getIframesList() {
		return this.iframes_;
	}

	public List<? extends IframeOrBuilder> getIframesOrBuilderList() {
		return this.iframes_;
	}

	public int getIframesCount() {
		return this.iframes_.size();
	}

	public Iframe getIframes(int index) {
		return (Iframe) this.iframes_.get(index);
	}

	public IframeOrBuilder getIframesOrBuilder(int index) {
		return (IframeOrBuilder) this.iframes_.get(index);
	}

	public int getStateValue() {
		return this.state_;
	}

	public ActionState getState() {
		ActionState result = ActionState.valueOf(this.state_);
		return result == null ? ActionState.UNRECOGNIZED : result;
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
		if (this.start_ != 0L) {
			output.writeInt64(1, this.start_);
		}
		if (this.end_ != 0L) {
			output.writeInt64(2, this.end_);
		}
		if (!getUrlBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 3, this.url_);
		}
		if (this.pf_ != null) {
			output.writeMessage(4, getPf());
		}
		for (int i = 0; i < this.ajaxes_.size(); i++) {
			output.writeMessage(5, (MessageLite) this.ajaxes_.get(i));
		}
		for (int i = 0; i < this.timers_.size(); i++) {
			output.writeMessage(6, (MessageLite) this.timers_.get(i));
		}
		for (int i = 0; i < this.iframes_.size(); i++) {
			output.writeMessage(7, (MessageLite) this.iframes_.get(i));
		}
		if (this.state_ != ActionState.FINISH.getNumber()) {
			output.writeEnum(8, this.state_);
		}
		this.unknownFields.writeTo(output);
	}

	public int getSerializedSize() {
		int size = this.memoizedSize;
		if (size != -1) {
			return size;
		}
		size = 0;
		if (this.start_ != 0L) {
			size = size + CodedOutputStream.computeInt64Size(1, this.start_);
		}
		if (this.end_ != 0L) {
			size = size + CodedOutputStream.computeInt64Size(2, this.end_);
		}
		if (!getUrlBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(3, this.url_);
		}
		if (this.pf_ != null) {
			size = size + CodedOutputStream.computeMessageSize(4, getPf());
		}
		for (int i = 0; i < this.ajaxes_.size(); i++) {
			size = size + CodedOutputStream.computeMessageSize(5, (MessageLite) this.ajaxes_.get(i));
		}
		for (int i = 0; i < this.timers_.size(); i++) {
			size = size + CodedOutputStream.computeMessageSize(6, (MessageLite) this.timers_.get(i));
		}
		for (int i = 0; i < this.iframes_.size(); i++) {
			size = size + CodedOutputStream.computeMessageSize(7, (MessageLite) this.iframes_.get(i));
		}
		if (this.state_ != ActionState.FINISH.getNumber()) {
			size = size + CodedOutputStream.computeEnumSize(8, this.state_);
		}
		size += this.unknownFields.getSerializedSize();
		this.memoizedSize = size;
		return size;
	}

	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (!(obj instanceof CrossPage)) {
			return super.equals(obj);
		}
		CrossPage other = (CrossPage) obj;
		if (getStart() != other.getStart()) {
			return false;
		}
		if (getEnd() != other.getEnd()) {
			return false;
		}
		if (!getUrl().equals(other.getUrl())) {
			return false;
		}
		if (hasPf() != other.hasPf()) {
			return false;
		}
		if (hasPf()) {
			if (!getPf().equals(other.getPf())) {
				return false;
			}
		}
		if (!getAjaxesList().equals(other.getAjaxesList())) {
			return false;
		}
		if (!getTimersList().equals(other.getTimersList())) {
			return false;
		}
		if (!getIframesList().equals(other.getIframesList())) {
			return false;
		}
		if (this.state_ != other.state_) {
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
		hash = 53 * hash + Internal.hashLong(getStart());
		hash = 37 * hash + 2;
		hash = 53 * hash + Internal.hashLong(getEnd());
		hash = 37 * hash + 3;
		hash = 53 * hash + getUrl().hashCode();
		if (hasPf()) {
			hash = 37 * hash + 4;
			hash = 53 * hash + getPf().hashCode();
		}
		if (getAjaxesCount() > 0) {
			hash = 37 * hash + 5;
			hash = 53 * hash + getAjaxesList().hashCode();
		}
		if (getTimersCount() > 0) {
			hash = 37 * hash + 6;
			hash = 53 * hash + getTimersList().hashCode();
		}
		if (getIframesCount() > 0) {
			hash = 37 * hash + 7;
			hash = 53 * hash + getIframesList().hashCode();
		}
		hash = 37 * hash + 8;
		hash = 53 * hash + this.state_;
		hash = 29 * hash + this.unknownFields.hashCode();
		this.memoizedHashCode = hash;
		return hash;
	}

	public static CrossPage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
		return (CrossPage) PARSER.parseFrom(data);
	}

	public static CrossPage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
		return (CrossPage) PARSER.parseFrom(data, extensionRegistry);
	}

	public static CrossPage parseFrom(ByteString data) throws InvalidProtocolBufferException {
		return (CrossPage) PARSER.parseFrom(data);
	}

	public static CrossPage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
		return (CrossPage) PARSER.parseFrom(data, extensionRegistry);
	}

	public static CrossPage parseFrom(byte[] data) throws InvalidProtocolBufferException {
		return (CrossPage) PARSER.parseFrom(data);
	}

	public static CrossPage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
		return (CrossPage) PARSER.parseFrom(data, extensionRegistry);
	}

	public static CrossPage parseFrom(InputStream input) throws IOException {
		return (CrossPage) GeneratedMessageV3.parseWithIOException(PARSER, input);
	}

	public static CrossPage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
		return (CrossPage) GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
	}

	public static CrossPage parseDelimitedFrom(InputStream input) throws IOException {
		return (CrossPage) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
	}

	public static CrossPage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
		return (CrossPage) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
	}

	public static CrossPage parseFrom(CodedInputStream input) throws IOException {
		return (CrossPage) GeneratedMessageV3.parseWithIOException(PARSER, input);
	}

	public static CrossPage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
		return (CrossPage) GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
	}

	public Builder newBuilderForType() {
		return newBuilder();
	}

	public static Builder newBuilder() {
		return DEFAULT_INSTANCE.toBuilder();
	}

	public static Builder newBuilder(CrossPage prototype) {
		return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
	}

	public Builder toBuilder() {
		return this == DEFAULT_INSTANCE ? new Builder(null) : new Builder(null).mergeFrom(this);
	}

	protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
		Builder builder = new Builder(parent);
		return builder;
	}

	public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CrossPageOrBuilder {
		private int bitField0_;
		private long start_;
		private long end_;

		public static final Descriptors.Descriptor getDescriptor() {
			return ActionOuterClass.internal_static_com_tingyun_proto_CrossPage_descriptor;
		}

		protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
			return ActionOuterClass.internal_static_com_tingyun_proto_CrossPage_fieldAccessorTable.ensureFieldAccessorsInitialized(CrossPage.class, Builder.class);
		}

		private Builder() {
			maybeForceBuilderInitialization();
		}

		private Builder(GeneratedMessageV3.BuilderParent parent) {
			super();
			maybeForceBuilderInitialization();
		}

		private void maybeForceBuilderInitialization() {
			if (CrossPage.alwaysUseFieldBuilders) {
				getAjaxesFieldBuilder();
				getTimersFieldBuilder();
				getIframesFieldBuilder();
			}
		}

		public Builder clear() {
			super.clear();
			this.start_ = 0L;

			this.end_ = 0L;

			this.url_ = "";
			if (this.pfBuilder_ == null) {
				this.pf_ = null;
			} else {
				this.pf_ = null;
				this.pfBuilder_ = null;
			}
			if (this.ajaxesBuilder_ == null) {
				this.ajaxes_ = Collections.emptyList();
				this.bitField0_ &= 0xFFFFFFFE;
			} else {
				this.ajaxesBuilder_.clear();
			}
			if (this.timersBuilder_ == null) {
				this.timers_ = Collections.emptyList();
				this.bitField0_ &= 0xFFFFFFFD;
			} else {
				this.timersBuilder_.clear();
			}
			if (this.iframesBuilder_ == null) {
				this.iframes_ = Collections.emptyList();
				this.bitField0_ &= 0xFFFFFFFB;
			} else {
				this.iframesBuilder_.clear();
			}
			this.state_ = 0;

			return this;
		}

		public Descriptors.Descriptor getDescriptorForType() {
			return ActionOuterClass.internal_static_com_tingyun_proto_CrossPage_descriptor;
		}

		public CrossPage getDefaultInstanceForType() {
			return CrossPage.getDefaultInstance();
		}

		public CrossPage build() {
			CrossPage result = buildPartial();
			if (!result.isInitialized()) {
				throw newUninitializedMessageException(result);
			}
			return result;
		}

		public CrossPage buildPartial() {
			CrossPage result = new CrossPage(this);
			int from_bitField0_ = this.bitField0_;
			result.start_ = this.start_;
			result.end_ = this.end_;
			result.url_ = this.url_;
			if (this.pfBuilder_ == null) {
				result.pf_ = this.pf_;
			} else {
				result.pf_ = ((Pf) this.pfBuilder_.build());
			}
			if (this.ajaxesBuilder_ == null) {
				if ((this.bitField0_ & 0x1) != 0) {
					this.ajaxes_ = Collections.unmodifiableList(this.ajaxes_);
					this.bitField0_ &= 0xFFFFFFFE;
				}
				result.ajaxes_ = this.ajaxes_;
			} else {
				result.ajaxes_ = this.ajaxesBuilder_.build();
			}
			if (this.timersBuilder_ == null) {
				if ((this.bitField0_ & 0x2) != 0) {
					this.timers_ = Collections.unmodifiableList(this.timers_);
					this.bitField0_ &= 0xFFFFFFFD;
				}
				result.timers_ = this.timers_;
			} else {
				result.timers_ = this.timersBuilder_.build();
			}
			if (this.iframesBuilder_ == null) {
				if ((this.bitField0_ & 0x4) != 0) {
					this.iframes_ = Collections.unmodifiableList(this.iframes_);
					this.bitField0_ &= 0xFFFFFFFB;
				}
				result.iframes_ = this.iframes_;
			} else {
				result.iframes_ = this.iframesBuilder_.build();
			}
			result.state_ = this.state_;
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
			if ((other instanceof CrossPage)) {
				return mergeFrom((CrossPage) other);
			}
			super.mergeFrom(other);
			return this;
		}

		public Builder mergeFrom(CrossPage other) {
			if (other == CrossPage.getDefaultInstance()) {
				return this;
			}
			if (other.getStart() != 0L) {
				setStart(other.getStart());
			}
			if (other.getEnd() != 0L) {
				setEnd(other.getEnd());
			}
			if (!other.getUrl().isEmpty()) {
				this.url_ = other.url_;
				onChanged();
			}
			if (other.hasPf()) {
				mergePf(other.getPf());
			}
			if (this.ajaxesBuilder_ == null) {
				if (!other.ajaxes_.isEmpty()) {
					if (this.ajaxes_.isEmpty()) {
						this.ajaxes_ = other.ajaxes_;
						this.bitField0_ &= 0xFFFFFFFE;
					} else {
						ensureAjaxesIsMutable();
						this.ajaxes_.addAll(other.ajaxes_);
					}
					onChanged();
				}
			} else if (!other.ajaxes_.isEmpty()) {
				if (this.ajaxesBuilder_.isEmpty()) {
					this.ajaxesBuilder_.dispose();
					this.ajaxesBuilder_ = null;
					this.ajaxes_ = other.ajaxes_;
					this.bitField0_ &= 0xFFFFFFFE;

					this.ajaxesBuilder_ = (CrossPage.alwaysUseFieldBuilders ? getAjaxesFieldBuilder() : null);
				} else {
					this.ajaxesBuilder_.addAllMessages(other.ajaxes_);
				}
			}
			if (this.timersBuilder_ == null) {
				if (!other.timers_.isEmpty()) {
					if (this.timers_.isEmpty()) {
						this.timers_ = other.timers_;
						this.bitField0_ &= 0xFFFFFFFD;
					} else {
						ensureTimersIsMutable();
						this.timers_.addAll(other.timers_);
					}
					onChanged();
				}
			} else if (!other.timers_.isEmpty()) {
				if (this.timersBuilder_.isEmpty()) {
					this.timersBuilder_.dispose();
					this.timersBuilder_ = null;
					this.timers_ = other.timers_;
					this.bitField0_ &= 0xFFFFFFFD;

					this.timersBuilder_ = (CrossPage.alwaysUseFieldBuilders ? getTimersFieldBuilder() : null);
				} else {
					this.timersBuilder_.addAllMessages(other.timers_);
				}
			}
			if (this.iframesBuilder_ == null) {
				if (!other.iframes_.isEmpty()) {
					if (this.iframes_.isEmpty()) {
						this.iframes_ = other.iframes_;
						this.bitField0_ &= 0xFFFFFFFB;
					} else {
						ensureIframesIsMutable();
						this.iframes_.addAll(other.iframes_);
					}
					onChanged();
				}
			} else if (!other.iframes_.isEmpty()) {
				if (this.iframesBuilder_.isEmpty()) {
					this.iframesBuilder_.dispose();
					this.iframesBuilder_ = null;
					this.iframes_ = other.iframes_;
					this.bitField0_ &= 0xFFFFFFFB;

					this.iframesBuilder_ = (CrossPage.alwaysUseFieldBuilders ? getIframesFieldBuilder() : null);
				} else {
					this.iframesBuilder_.addAllMessages(other.iframes_);
				}
			}
			if (other.state_ != 0) {
				setStateValue(other.getStateValue());
			}
			mergeUnknownFields(other.unknownFields);
			onChanged();
			return this;
		}

		public final boolean isInitialized() {
			return true;
		}

		public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
			CrossPage parsedMessage = null;
			try {
				parsedMessage = (CrossPage) CrossPage.PARSER.parsePartialFrom(input, extensionRegistry);
			} catch (InvalidProtocolBufferException e) {
				parsedMessage = (CrossPage) e.getUnfinishedMessage();
				throw e.unwrapIOException();
			} finally {
				if (parsedMessage != null) {
					mergeFrom(parsedMessage);
				}
			}
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

		public long getEnd() {
			return this.end_;
		}

		public Builder setEnd(long value) {
			this.end_ = value;
			onChanged();
			return this;
		}

		public Builder clearEnd() {
			this.end_ = 0L;
			onChanged();
			return this;
		}

		private Object url_ = "";
		private Pf pf_;
		private SingleFieldBuilderV3<Pf, Pf.Builder, PfOrBuilder> pfBuilder_;

		public String getUrl() {
			Object ref = this.url_;
			if (!(ref instanceof String)) {
				ByteString bs = (ByteString) ref;

				String s = bs.toStringUtf8();
				this.url_ = s;
				return s;
			}
			return (String) ref;
		}

		public ByteString getUrlBytes() {
			Object ref = this.url_;
			if ((ref instanceof String)) {
				ByteString b = ByteString.copyFromUtf8((String) ref);

				this.url_ = b;
				return b;
			}
			return (ByteString) ref;
		}

		public Builder setUrl(String value) {
			if (value == null) {
				throw new NullPointerException();
			}
			this.url_ = value;
			onChanged();
			return this;
		}

		public Builder clearUrl() {
			this.url_ = CrossPage.getDefaultInstance().getUrl();
			onChanged();
			return this;
		}

		public Builder setUrlBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			CrossPage.checkByteStringIsUtf8(value);

			this.url_ = value;
			onChanged();
			return this;
		}

		public boolean hasPf() {
			return (this.pfBuilder_ != null) || (this.pf_ != null);
		}

		public Pf getPf() {
			if (this.pfBuilder_ == null) {
				return this.pf_ == null ? Pf.getDefaultInstance() : this.pf_;
			}
			return (Pf) this.pfBuilder_.getMessage();
		}

		public Builder setPf(Pf value) {
			if (this.pfBuilder_ == null) {
				if (value == null) {
					throw new NullPointerException();
				}
				this.pf_ = value;
				onChanged();
			} else {
				this.pfBuilder_.setMessage(value);
			}
			return this;
		}

		public Builder setPf(Pf.Builder builderForValue) {
			if (this.pfBuilder_ == null) {
				this.pf_ = builderForValue.build();
				onChanged();
			} else {
				this.pfBuilder_.setMessage(builderForValue.build());
			}
			return this;
		}

		public Builder mergePf(Pf value) {
			if (this.pfBuilder_ == null) {
				if (this.pf_ != null) {
					this.pf_ = Pf.newBuilder(this.pf_).mergeFrom(value).buildPartial();
				} else {
					this.pf_ = value;
				}
				onChanged();
			} else {
				this.pfBuilder_.mergeFrom(value);
			}
			return this;
		}

		public Builder clearPf() {
			if (this.pfBuilder_ == null) {
				this.pf_ = null;
				onChanged();
			} else {
				this.pf_ = null;
				this.pfBuilder_ = null;
			}
			return this;
		}

		public Pf.Builder getPfBuilder() {
			onChanged();
			return (Pf.Builder) getPfFieldBuilder().getBuilder();
		}

		public PfOrBuilder getPfOrBuilder() {
			if (this.pfBuilder_ != null) {
				return (PfOrBuilder) this.pfBuilder_.getMessageOrBuilder();
			}
			return this.pf_ == null ? Pf.getDefaultInstance() : this.pf_;
		}

		private SingleFieldBuilderV3<Pf, Pf.Builder, PfOrBuilder> getPfFieldBuilder() {
			if (this.pfBuilder_ == null) {
				this.pfBuilder_ = new SingleFieldBuilderV3(getPf(), getParentForChildren(), isClean());
				this.pf_ = null;
			}
			return this.pfBuilder_;
		}

		private List<Ajax> ajaxes_ = Collections.emptyList();
		private RepeatedFieldBuilderV3<Ajax, Ajax.Builder, AjaxOrBuilder> ajaxesBuilder_;

		private void ensureAjaxesIsMutable() {
			if ((this.bitField0_ & 0x1) == 0) {
				this.ajaxes_ = new ArrayList(this.ajaxes_);
				this.bitField0_ |= 0x1;
			}
		}

		public List<Ajax> getAjaxesList() {
			if (this.ajaxesBuilder_ == null) {
				return Collections.unmodifiableList(this.ajaxes_);
			}
			return this.ajaxesBuilder_.getMessageList();
		}

		public int getAjaxesCount() {
			if (this.ajaxesBuilder_ == null) {
				return this.ajaxes_.size();
			}
			return this.ajaxesBuilder_.getCount();
		}

		public Ajax getAjaxes(int index) {
			if (this.ajaxesBuilder_ == null) {
				return (Ajax) this.ajaxes_.get(index);
			}
			return (Ajax) this.ajaxesBuilder_.getMessage(index);
		}

		public Builder setAjaxes(int index, Ajax value) {
			if (this.ajaxesBuilder_ == null) {
				if (value == null) {
					throw new NullPointerException();
				}
				ensureAjaxesIsMutable();
				this.ajaxes_.set(index, value);
				onChanged();
			} else {
				this.ajaxesBuilder_.setMessage(index, value);
			}
			return this;
		}

		public Builder setAjaxes(int index, Ajax.Builder builderForValue) {
			if (this.ajaxesBuilder_ == null) {
				ensureAjaxesIsMutable();
				this.ajaxes_.set(index, builderForValue.build());
				onChanged();
			} else {
				this.ajaxesBuilder_.setMessage(index, builderForValue.build());
			}
			return this;
		}

		public Builder addAjaxes(Ajax value) {
			if (this.ajaxesBuilder_ == null) {
				if (value == null) {
					throw new NullPointerException();
				}
				ensureAjaxesIsMutable();
				this.ajaxes_.add(value);
				onChanged();
			} else {
				this.ajaxesBuilder_.addMessage(value);
			}
			return this;
		}

		public Builder addAjaxes(int index, Ajax value) {
			if (this.ajaxesBuilder_ == null) {
				if (value == null) {
					throw new NullPointerException();
				}
				ensureAjaxesIsMutable();
				this.ajaxes_.add(index, value);
				onChanged();
			} else {
				this.ajaxesBuilder_.addMessage(index, value);
			}
			return this;
		}

		public Builder addAjaxes(Ajax.Builder builderForValue) {
			if (this.ajaxesBuilder_ == null) {
				ensureAjaxesIsMutable();
				this.ajaxes_.add(builderForValue.build());
				onChanged();
			} else {
				this.ajaxesBuilder_.addMessage(builderForValue.build());
			}
			return this;
		}

		public Builder addAjaxes(int index, Ajax.Builder builderForValue) {
			if (this.ajaxesBuilder_ == null) {
				ensureAjaxesIsMutable();
				this.ajaxes_.add(index, builderForValue.build());
				onChanged();
			} else {
				this.ajaxesBuilder_.addMessage(index, builderForValue.build());
			}
			return this;
		}

		public Builder addAllAjaxes(Iterable<? extends Ajax> values) {
			if (this.ajaxesBuilder_ == null) {
				ensureAjaxesIsMutable();
				AbstractMessageLite.Builder.addAll(values, this.ajaxes_);

				onChanged();
			} else {
				this.ajaxesBuilder_.addAllMessages(values);
			}
			return this;
		}

		public Builder clearAjaxes() {
			if (this.ajaxesBuilder_ == null) {
				this.ajaxes_ = Collections.emptyList();
				this.bitField0_ &= 0xFFFFFFFE;
				onChanged();
			} else {
				this.ajaxesBuilder_.clear();
			}
			return this;
		}

		public Builder removeAjaxes(int index) {
			if (this.ajaxesBuilder_ == null) {
				ensureAjaxesIsMutable();
				this.ajaxes_.remove(index);
				onChanged();
			} else {
				this.ajaxesBuilder_.remove(index);
			}
			return this;
		}

		public Ajax.Builder getAjaxesBuilder(int index) {
			return (Ajax.Builder) getAjaxesFieldBuilder().getBuilder(index);
		}

		public AjaxOrBuilder getAjaxesOrBuilder(int index) {
			if (this.ajaxesBuilder_ == null) {
				return (AjaxOrBuilder) this.ajaxes_.get(index);
			}
			return (AjaxOrBuilder) this.ajaxesBuilder_.getMessageOrBuilder(index);
		}

		public List<? extends AjaxOrBuilder> getAjaxesOrBuilderList() {
			if (this.ajaxesBuilder_ != null) {
				return this.ajaxesBuilder_.getMessageOrBuilderList();
			}
			return Collections.unmodifiableList(this.ajaxes_);
		}

		public Ajax.Builder addAjaxesBuilder() {
			return (Ajax.Builder) getAjaxesFieldBuilder().addBuilder(Ajax.getDefaultInstance());
		}

		public Ajax.Builder addAjaxesBuilder(int index) {
			return (Ajax.Builder) getAjaxesFieldBuilder().addBuilder(index, Ajax.getDefaultInstance());
		}

		public List<Ajax.Builder> getAjaxesBuilderList() {
			return getAjaxesFieldBuilder().getBuilderList();
		}

		private RepeatedFieldBuilderV3<Ajax, Ajax.Builder, AjaxOrBuilder> getAjaxesFieldBuilder() {
			if (this.ajaxesBuilder_ == null) {
				this.ajaxesBuilder_ = new RepeatedFieldBuilderV3(this.ajaxes_, (this.bitField0_ & 0x1) != 0, getParentForChildren(), isClean());
				this.ajaxes_ = null;
			}
			return this.ajaxesBuilder_;
		}

		private List<Timer> timers_ = Collections.emptyList();
		private RepeatedFieldBuilderV3<Timer, Timer.Builder, TimerOrBuilder> timersBuilder_;

		private void ensureTimersIsMutable() {
			if ((this.bitField0_ & 0x2) == 0) {
				this.timers_ = new ArrayList(this.timers_);
				this.bitField0_ |= 0x2;
			}
		}

		public List<Timer> getTimersList() {
			if (this.timersBuilder_ == null) {
				return Collections.unmodifiableList(this.timers_);
			}
			return this.timersBuilder_.getMessageList();
		}

		public int getTimersCount() {
			if (this.timersBuilder_ == null) {
				return this.timers_.size();
			}
			return this.timersBuilder_.getCount();
		}

		public Timer getTimers(int index) {
			if (this.timersBuilder_ == null) {
				return (Timer) this.timers_.get(index);
			}
			return (Timer) this.timersBuilder_.getMessage(index);
		}

		public Builder setTimers(int index, Timer value) {
			if (this.timersBuilder_ == null) {
				if (value == null) {
					throw new NullPointerException();
				}
				ensureTimersIsMutable();
				this.timers_.set(index, value);
				onChanged();
			} else {
				this.timersBuilder_.setMessage(index, value);
			}
			return this;
		}

		public Builder setTimers(int index, Timer.Builder builderForValue) {
			if (this.timersBuilder_ == null) {
				ensureTimersIsMutable();
				this.timers_.set(index, builderForValue.build());
				onChanged();
			} else {
				this.timersBuilder_.setMessage(index, builderForValue.build());
			}
			return this;
		}

		public Builder addTimers(Timer value) {
			if (this.timersBuilder_ == null) {
				if (value == null) {
					throw new NullPointerException();
				}
				ensureTimersIsMutable();
				this.timers_.add(value);
				onChanged();
			} else {
				this.timersBuilder_.addMessage(value);
			}
			return this;
		}

		public Builder addTimers(int index, Timer value) {
			if (this.timersBuilder_ == null) {
				if (value == null) {
					throw new NullPointerException();
				}
				ensureTimersIsMutable();
				this.timers_.add(index, value);
				onChanged();
			} else {
				this.timersBuilder_.addMessage(index, value);
			}
			return this;
		}

		public Builder addTimers(Timer.Builder builderForValue) {
			if (this.timersBuilder_ == null) {
				ensureTimersIsMutable();
				this.timers_.add(builderForValue.build());
				onChanged();
			} else {
				this.timersBuilder_.addMessage(builderForValue.build());
			}
			return this;
		}

		public Builder addTimers(int index, Timer.Builder builderForValue) {
			if (this.timersBuilder_ == null) {
				ensureTimersIsMutable();
				this.timers_.add(index, builderForValue.build());
				onChanged();
			} else {
				this.timersBuilder_.addMessage(index, builderForValue.build());
			}
			return this;
		}

		public Builder addAllTimers(Iterable<? extends Timer> values) {
			if (this.timersBuilder_ == null) {
				ensureTimersIsMutable();
				AbstractMessageLite.Builder.addAll(values, this.timers_);

				onChanged();
			} else {
				this.timersBuilder_.addAllMessages(values);
			}
			return this;
		}

		public Builder clearTimers() {
			if (this.timersBuilder_ == null) {
				this.timers_ = Collections.emptyList();
				this.bitField0_ &= 0xFFFFFFFD;
				onChanged();
			} else {
				this.timersBuilder_.clear();
			}
			return this;
		}

		public Builder removeTimers(int index) {
			if (this.timersBuilder_ == null) {
				ensureTimersIsMutable();
				this.timers_.remove(index);
				onChanged();
			} else {
				this.timersBuilder_.remove(index);
			}
			return this;
		}

		public Timer.Builder getTimersBuilder(int index) {
			return (Timer.Builder) getTimersFieldBuilder().getBuilder(index);
		}

		public TimerOrBuilder getTimersOrBuilder(int index) {
			if (this.timersBuilder_ == null) {
				return (TimerOrBuilder) this.timers_.get(index);
			}
			return (TimerOrBuilder) this.timersBuilder_.getMessageOrBuilder(index);
		}

		public List<? extends TimerOrBuilder> getTimersOrBuilderList() {
			if (this.timersBuilder_ != null) {
				return this.timersBuilder_.getMessageOrBuilderList();
			}
			return Collections.unmodifiableList(this.timers_);
		}

		public Timer.Builder addTimersBuilder() {
			return (Timer.Builder) getTimersFieldBuilder().addBuilder(Timer.getDefaultInstance());
		}

		public Timer.Builder addTimersBuilder(int index) {
			return (Timer.Builder) getTimersFieldBuilder().addBuilder(index, Timer.getDefaultInstance());
		}

		public List<Timer.Builder> getTimersBuilderList() {
			return getTimersFieldBuilder().getBuilderList();
		}

		private RepeatedFieldBuilderV3<Timer, Timer.Builder, TimerOrBuilder> getTimersFieldBuilder() {
			if (this.timersBuilder_ == null) {
				this.timersBuilder_ = new RepeatedFieldBuilderV3(this.timers_, (this.bitField0_ & 0x2) != 0, getParentForChildren(), isClean());
				this.timers_ = null;
			}
			return this.timersBuilder_;
		}

		private List<Iframe> iframes_ = Collections.emptyList();
		private RepeatedFieldBuilderV3<Iframe, Iframe.Builder, IframeOrBuilder> iframesBuilder_;

		private void ensureIframesIsMutable() {
			if ((this.bitField0_ & 0x4) == 0) {
				this.iframes_ = new ArrayList(this.iframes_);
				this.bitField0_ |= 0x4;
			}
		}

		public List<Iframe> getIframesList() {
			if (this.iframesBuilder_ == null) {
				return Collections.unmodifiableList(this.iframes_);
			}
			return this.iframesBuilder_.getMessageList();
		}

		public int getIframesCount() {
			if (this.iframesBuilder_ == null) {
				return this.iframes_.size();
			}
			return this.iframesBuilder_.getCount();
		}

		public Iframe getIframes(int index) {
			if (this.iframesBuilder_ == null) {
				return (Iframe) this.iframes_.get(index);
			}
			return (Iframe) this.iframesBuilder_.getMessage(index);
		}

		public Builder setIframes(int index, Iframe value) {
			if (this.iframesBuilder_ == null) {
				if (value == null) {
					throw new NullPointerException();
				}
				ensureIframesIsMutable();
				this.iframes_.set(index, value);
				onChanged();
			} else {
				this.iframesBuilder_.setMessage(index, value);
			}
			return this;
		}

		public Builder setIframes(int index, Iframe.Builder builderForValue) {
			if (this.iframesBuilder_ == null) {
				ensureIframesIsMutable();
				this.iframes_.set(index, builderForValue.build());
				onChanged();
			} else {
				this.iframesBuilder_.setMessage(index, builderForValue.build());
			}
			return this;
		}

		public Builder addIframes(Iframe value) {
			if (this.iframesBuilder_ == null) {
				if (value == null) {
					throw new NullPointerException();
				}
				ensureIframesIsMutable();
				this.iframes_.add(value);
				onChanged();
			} else {
				this.iframesBuilder_.addMessage(value);
			}
			return this;
		}

		public Builder addIframes(int index, Iframe value) {
			if (this.iframesBuilder_ == null) {
				if (value == null) {
					throw new NullPointerException();
				}
				ensureIframesIsMutable();
				this.iframes_.add(index, value);
				onChanged();
			} else {
				this.iframesBuilder_.addMessage(index, value);
			}
			return this;
		}

		public Builder addIframes(Iframe.Builder builderForValue) {
			if (this.iframesBuilder_ == null) {
				ensureIframesIsMutable();
				this.iframes_.add(builderForValue.build());
				onChanged();
			} else {
				this.iframesBuilder_.addMessage(builderForValue.build());
			}
			return this;
		}

		public Builder addIframes(int index, Iframe.Builder builderForValue) {
			if (this.iframesBuilder_ == null) {
				ensureIframesIsMutable();
				this.iframes_.add(index, builderForValue.build());
				onChanged();
			} else {
				this.iframesBuilder_.addMessage(index, builderForValue.build());
			}
			return this;
		}

		public Builder addAllIframes(Iterable<? extends Iframe> values) {
			if (this.iframesBuilder_ == null) {
				ensureIframesIsMutable();
				AbstractMessageLite.Builder.addAll(values, this.iframes_);

				onChanged();
			} else {
				this.iframesBuilder_.addAllMessages(values);
			}
			return this;
		}

		public Builder clearIframes() {
			if (this.iframesBuilder_ == null) {
				this.iframes_ = Collections.emptyList();
				this.bitField0_ &= 0xFFFFFFFB;
				onChanged();
			} else {
				this.iframesBuilder_.clear();
			}
			return this;
		}

		public Builder removeIframes(int index) {
			if (this.iframesBuilder_ == null) {
				ensureIframesIsMutable();
				this.iframes_.remove(index);
				onChanged();
			} else {
				this.iframesBuilder_.remove(index);
			}
			return this;
		}

		public Iframe.Builder getIframesBuilder(int index) {
			return (Iframe.Builder) getIframesFieldBuilder().getBuilder(index);
		}

		public IframeOrBuilder getIframesOrBuilder(int index) {
			if (this.iframesBuilder_ == null) {
				return (IframeOrBuilder) this.iframes_.get(index);
			}
			return (IframeOrBuilder) this.iframesBuilder_.getMessageOrBuilder(index);
		}

		public List<? extends IframeOrBuilder> getIframesOrBuilderList() {
			if (this.iframesBuilder_ != null) {
				return this.iframesBuilder_.getMessageOrBuilderList();
			}
			return Collections.unmodifiableList(this.iframes_);
		}

		public Iframe.Builder addIframesBuilder() {
			return (Iframe.Builder) getIframesFieldBuilder().addBuilder(Iframe.getDefaultInstance());
		}

		public Iframe.Builder addIframesBuilder(int index) {
			return (Iframe.Builder) getIframesFieldBuilder().addBuilder(index, Iframe.getDefaultInstance());
		}

		public List<Iframe.Builder> getIframesBuilderList() {
			return getIframesFieldBuilder().getBuilderList();
		}

		private RepeatedFieldBuilderV3<Iframe, Iframe.Builder, IframeOrBuilder> getIframesFieldBuilder() {
			if (this.iframesBuilder_ == null) {
				this.iframesBuilder_ = new RepeatedFieldBuilderV3(this.iframes_, (this.bitField0_ & 0x4) != 0, getParentForChildren(), isClean());
				this.iframes_ = null;
			}
			return this.iframesBuilder_;
		}

		private int state_ = 0;

		public int getStateValue() {
			return this.state_;
		}

		public Builder setStateValue(int value) {
			this.state_ = value;
			onChanged();
			return this;
		}

		public ActionState getState() {
			ActionState result = ActionState.valueOf(this.state_);
			return result == null ? ActionState.UNRECOGNIZED : result;
		}

		public Builder setState(ActionState value) {
			if (value == null) {
				throw new NullPointerException();
			}
			this.state_ = value.getNumber();
			onChanged();
			return this;
		}

		public Builder clearState() {
			this.state_ = 0;
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

	private static final CrossPage DEFAULT_INSTANCE = new CrossPage();

	public static CrossPage getDefaultInstance() {
		return DEFAULT_INSTANCE;
	}

	private static final Parser<CrossPage> PARSER = new AbstractParser() {
		public CrossPage parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
			return new CrossPage(input, extensionRegistry);
		}
	};

	public static Parser<CrossPage> parser() {
		return PARSER;
	}

	public Parser<CrossPage> getParserForType() {
		return PARSER;
	}

	public CrossPage getDefaultInstanceForType() {
		return DEFAULT_INSTANCE;
	}
}
