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
import com.google.protobuf.UnknownFieldSet;

public class Timer extends GeneratedMessageV3 implements TimerOrBuilder {

    private static final long serialVersionUID = 0L;
    public static final int NAME_FIELD_NUMBER = 1;
    private volatile Object name_;
    public static final int START_FIELD_NUMBER = 2;
    private long start_;
    public static final int END_FIELD_NUMBER = 3;
    private long end_;
    public static final int DELAY_FIELD_NUMBER = 4;
    private long delay_;
    public static final int STATE_FIELD_NUMBER = 5;
    private int state_;
    public static final int AJAXES_FIELD_NUMBER = 10;
    private List<Ajax> ajaxes_;
    public static final int TIMERS_FIELD_NUMBER = 11;
    private List<Timer> timers_;
    public static final int IFRAMES_FIELD_NUMBER = 12;
    private List<Iframe> iframes_;
    public static final int CROSSPAGES_FIELD_NUMBER = 13;
    private List<CrossPage> crossPages_;

    private Timer(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private Timer() {
        this.name_ = "";
        this.state_ = 0;
        this.ajaxes_ = Collections.emptyList();
        this.timers_ = Collections.emptyList();
        this.iframes_ = Collections.emptyList();
        this.crossPages_ = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
        return new Timer();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private Timer(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                    case 10:
                        String s = input.readStringRequireUtf8();

                        this.name_ = s;
                        break;
                    case 16:
                        this.start_ = input.readInt64();
                        break;
                    case 24:
                        this.end_ = input.readInt64();
                        break;
                    case 32:
                        this.delay_ = input.readInt64();
                        break;
                    case 40:
                        int rawValue = input.readEnum();

                        this.state_ = rawValue;
                        break;
                    case 82:
                        if ((mutable_bitField0_ & 0x1) == 0) {
                            this.ajaxes_ = new ArrayList();
                            mutable_bitField0_ |= 0x1;
                        }
                        this.ajaxes_.add(input.readMessage(Ajax.parser(), extensionRegistry));
                        break;
                    case 90:
                        if ((mutable_bitField0_ & 0x2) == 0) {
                            this.timers_ = new ArrayList();
                            mutable_bitField0_ |= 0x2;
                        }
                        this.timers_.add(input.readMessage(parser(), extensionRegistry));
                        break;
                    case 98:
                        if ((mutable_bitField0_ & 0x4) == 0) {
                            this.iframes_ = new ArrayList();
                            mutable_bitField0_ |= 0x4;
                        }
                        this.iframes_.add(input.readMessage(Iframe.parser(), extensionRegistry));
                        break;
                    case 106:
                        if ((mutable_bitField0_ & 0x8) == 0) {
                            this.crossPages_ = new ArrayList();
                            mutable_bitField0_ |= 0x8;
                        }
                        this.crossPages_.add(input.readMessage(CrossPage.parser(), extensionRegistry));
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
            if ((mutable_bitField0_ & 0x8) != 0) {
                this.crossPages_ = Collections.unmodifiableList(this.crossPages_);
            }
            this.unknownFields = unknownFields.build();
            makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return ActionOuterClass.internal_static_com_tingyun_proto_Timer_descriptor;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ActionOuterClass.internal_static_com_tingyun_proto_Timer_fieldAccessorTable.ensureFieldAccessorsInitialized(Timer.class, Builder.class);
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

    public long getStart() {
        return this.start_;
    }

    public long getEnd() {
        return this.end_;
    }

    public long getDelay() {
        return this.delay_;
    }

    public int getStateValue() {
        return this.state_;
    }

    public ActionState getState() {
        ActionState result = ActionState.valueOf(this.state_);
        return result == null ? ActionState.UNRECOGNIZED : result;
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

    public List<CrossPage> getCrossPagesList() {
        return this.crossPages_;
    }

    public List<? extends CrossPageOrBuilder> getCrossPagesOrBuilderList() {
        return this.crossPages_;
    }

    public int getCrossPagesCount() {
        return this.crossPages_.size();
    }

    public CrossPage getCrossPages(int index) {
        return (CrossPage) this.crossPages_.get(index);
    }

    public CrossPageOrBuilder getCrossPagesOrBuilder(int index) {
        return (CrossPageOrBuilder) this.crossPages_.get(index);
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
        if (this.start_ != 0L) {
            output.writeInt64(2, this.start_);
        }
        if (this.end_ != 0L) {
            output.writeInt64(3, this.end_);
        }
        if (this.delay_ != 0L) {
            output.writeInt64(4, this.delay_);
        }
        if (this.state_ != ActionState.FINISH.getNumber()) {
            output.writeEnum(5, this.state_);
        }
        for (int i = 0; i < this.ajaxes_.size(); i++) {
            output.writeMessage(10, (MessageLite) this.ajaxes_.get(i));
        }
        for (int i = 0; i < this.timers_.size(); i++) {
            output.writeMessage(11, (MessageLite) this.timers_.get(i));
        }
        for (int i = 0; i < this.iframes_.size(); i++) {
            output.writeMessage(12, (MessageLite) this.iframes_.get(i));
        }
        for (int i = 0; i < this.crossPages_.size(); i++) {
            output.writeMessage(13, (MessageLite) this.crossPages_.get(i));
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
        if (this.start_ != 0L) {
            size = size + CodedOutputStream.computeInt64Size(2, this.start_);
        }
        if (this.end_ != 0L) {
            size = size + CodedOutputStream.computeInt64Size(3, this.end_);
        }
        if (this.delay_ != 0L) {
            size = size + CodedOutputStream.computeInt64Size(4, this.delay_);
        }
        if (this.state_ != ActionState.FINISH.getNumber()) {
            size = size + CodedOutputStream.computeEnumSize(5, this.state_);
        }
        for (int i = 0; i < this.ajaxes_.size(); i++) {
            size = size + CodedOutputStream.computeMessageSize(10, (MessageLite) this.ajaxes_.get(i));
        }
        for (int i = 0; i < this.timers_.size(); i++) {
            size = size + CodedOutputStream.computeMessageSize(11, (MessageLite) this.timers_.get(i));
        }
        for (int i = 0; i < this.iframes_.size(); i++) {
            size = size + CodedOutputStream.computeMessageSize(12, (MessageLite) this.iframes_.get(i));
        }
        for (int i = 0; i < this.crossPages_.size(); i++) {
            size = size + CodedOutputStream.computeMessageSize(13, (MessageLite) this.crossPages_.get(i));
        }
        size += this.unknownFields.getSerializedSize();
        this.memoizedSize = size;
        return size;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Timer)) {
            return super.equals(obj);
        }
        Timer other = (Timer) obj;
        if (!getName().equals(other.getName())) {
            return false;
        }
        if (getStart() != other.getStart()) {
            return false;
        }
        if (getEnd() != other.getEnd()) {
            return false;
        }
        if (getDelay() != other.getDelay()) {
            return false;
        }
        if (this.state_ != other.state_) {
            return false;
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
        if (!getCrossPagesList().equals(other.getCrossPagesList())) {
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
        hash = 53 * hash + Internal.hashLong(getStart());
        hash = 37 * hash + 3;
        hash = 53 * hash + Internal.hashLong(getEnd());
        hash = 37 * hash + 4;
        hash = 53 * hash + Internal.hashLong(getDelay());
        hash = 37 * hash + 5;
        hash = 53 * hash + this.state_;
        if (getAjaxesCount() > 0) {
            hash = 37 * hash + 10;
            hash = 53 * hash + getAjaxesList().hashCode();
        }
        if (getTimersCount() > 0) {
            hash = 37 * hash + 11;
            hash = 53 * hash + getTimersList().hashCode();
        }
        if (getIframesCount() > 0) {
            hash = 37 * hash + 12;
            hash = 53 * hash + getIframesList().hashCode();
        }
        if (getCrossPagesCount() > 0) {
            hash = 37 * hash + 13;
            hash = 53 * hash + getCrossPagesList().hashCode();
        }
        hash = 29 * hash + this.unknownFields.hashCode();
        this.memoizedHashCode = hash;
        return hash;
    }

    public static Timer parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (Timer) PARSER.parseFrom(data);
    }

    public static Timer parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Timer) PARSER.parseFrom(data, extensionRegistry);
    }

    public static Timer parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (Timer) PARSER.parseFrom(data);
    }

    public static Timer parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Timer) PARSER.parseFrom(data, extensionRegistry);
    }

    public static Timer parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (Timer) PARSER.parseFrom(data);
    }

    public static Timer parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Timer) PARSER.parseFrom(data, extensionRegistry);
    }

    public static Timer parseFrom(InputStream input) throws IOException {
        return (Timer) GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static Timer parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Timer) GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static Timer parseDelimitedFrom(InputStream input) throws IOException {
        return (Timer) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static Timer parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Timer) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static Timer parseFrom(CodedInputStream input) throws IOException {
        return (Timer) GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static Timer parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Timer) GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Timer prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder(null) : new Builder(null).mergeFrom(this);
    }

    protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TimerOrBuilder {
        private int bitField0_;

        public static final Descriptors.Descriptor getDescriptor() {
            return ActionOuterClass.internal_static_com_tingyun_proto_Timer_descriptor;
        }

        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ActionOuterClass.internal_static_com_tingyun_proto_Timer_fieldAccessorTable.ensureFieldAccessorsInitialized(Timer.class, Builder.class);
        }

        private Builder() {
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent parent) {
            super();
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (Timer.alwaysUseFieldBuilders) {
                getAjaxesFieldBuilder();
                getTimersFieldBuilder();
                getIframesFieldBuilder();
                getCrossPagesFieldBuilder();
            }
        }

        public Builder clear() {
            super.clear();
            this.name_ = "";

            this.start_ = 0L;

            this.end_ = 0L;

            this.delay_ = 0L;

            this.state_ = 0;
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
            if (this.crossPagesBuilder_ == null) {
                this.crossPages_ = Collections.emptyList();
                this.bitField0_ &= 0xFFFFFFF7;
            } else {
                this.crossPagesBuilder_.clear();
            }
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return ActionOuterClass.internal_static_com_tingyun_proto_Timer_descriptor;
        }

        public Timer getDefaultInstanceForType() {
            return Timer.getDefaultInstance();
        }

        public Timer build() {
            Timer result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        public Timer buildPartial() {
            Timer result = new Timer(this);
            int from_bitField0_ = this.bitField0_;
            result.name_ = this.name_;
            result.start_ = this.start_;
            result.end_ = this.end_;
            result.delay_ = this.delay_;
            result.state_ = this.state_;
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
            if (this.crossPagesBuilder_ == null) {
                if ((this.bitField0_ & 0x8) != 0) {
                    this.crossPages_ = Collections.unmodifiableList(this.crossPages_);
                    this.bitField0_ &= 0xFFFFFFF7;
                }
                result.crossPages_ = this.crossPages_;
            } else {
                result.crossPages_ = this.crossPagesBuilder_.build();
            }
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
            if ((other instanceof Timer)) {
                return mergeFrom((Timer) other);
            }
            super.mergeFrom(other);
            return this;
        }

        public Builder mergeFrom(Timer other) {
            if (other == Timer.getDefaultInstance()) {
                return this;
            }
            if (!other.getName().isEmpty()) {
                this.name_ = other.name_;
                onChanged();
            }
            if (other.getStart() != 0L) {
                setStart(other.getStart());
            }
            if (other.getEnd() != 0L) {
                setEnd(other.getEnd());
            }
            if (other.getDelay() != 0L) {
                setDelay(other.getDelay());
            }
            if (other.state_ != 0) {
                setStateValue(other.getStateValue());
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

                    this.ajaxesBuilder_ = (Timer.alwaysUseFieldBuilders ? getAjaxesFieldBuilder() : null);
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

                    this.timersBuilder_ = (Timer.alwaysUseFieldBuilders ? getTimersFieldBuilder() : null);
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

                    this.iframesBuilder_ = (Timer.alwaysUseFieldBuilders ? getIframesFieldBuilder() : null);
                } else {
                    this.iframesBuilder_.addAllMessages(other.iframes_);
                }
            }
            if (this.crossPagesBuilder_ == null) {
                if (!other.crossPages_.isEmpty()) {
                    if (this.crossPages_.isEmpty()) {
                        this.crossPages_ = other.crossPages_;
                        this.bitField0_ &= 0xFFFFFFF7;
                    } else {
                        ensureCrossPagesIsMutable();
                        this.crossPages_.addAll(other.crossPages_);
                    }
                    onChanged();
                }
            } else if (!other.crossPages_.isEmpty()) {
                if (this.crossPagesBuilder_.isEmpty()) {
                    this.crossPagesBuilder_.dispose();
                    this.crossPagesBuilder_ = null;
                    this.crossPages_ = other.crossPages_;
                    this.bitField0_ &= 0xFFFFFFF7;

                    this.crossPagesBuilder_ = (Timer.alwaysUseFieldBuilders ? getCrossPagesFieldBuilder() : null);
                } else {
                    this.crossPagesBuilder_.addAllMessages(other.crossPages_);
                }
            }
            mergeUnknownFields(other.unknownFields);
            onChanged();
            return this;
        }

        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            Timer parsedMessage = null;
            try {
                parsedMessage = (Timer) Timer.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
                parsedMessage = (Timer) e.getUnfinishedMessage();
                throw e.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        private Object name_ = "";
        private long start_;
        private long end_;
        private long delay_;

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
            this.name_ = Timer.getDefaultInstance().getName();
            onChanged();
            return this;
        }

        public Builder setNameBytes(ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            Timer.checkByteStringIsUtf8(value);

            this.name_ = value;
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

        public long getDelay() {
            return this.delay_;
        }

        public Builder setDelay(long value) {
            this.delay_ = value;
            onChanged();
            return this;
        }

        public Builder clearDelay() {
            this.delay_ = 0L;
            onChanged();
            return this;
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
        private RepeatedFieldBuilderV3<Timer, Builder, TimerOrBuilder> timersBuilder_;

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

        public Builder setTimers(int index, Builder builderForValue) {
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

        public Builder addTimers(Builder builderForValue) {
            if (this.timersBuilder_ == null) {
                ensureTimersIsMutable();
                this.timers_.add(builderForValue.build());
                onChanged();
            } else {
                this.timersBuilder_.addMessage(builderForValue.build());
            }
            return this;
        }

        public Builder addTimers(int index, Builder builderForValue) {
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

        public Builder getTimersBuilder(int index) {
            return (Builder) getTimersFieldBuilder().getBuilder(index);
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

        public Builder addTimersBuilder() {
            return (Builder) getTimersFieldBuilder().addBuilder(Timer.getDefaultInstance());
        }

        public Builder addTimersBuilder(int index) {
            return (Builder) getTimersFieldBuilder().addBuilder(index, Timer.getDefaultInstance());
        }

        public List<Builder> getTimersBuilderList() {
            return getTimersFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<Timer, Builder, TimerOrBuilder> getTimersFieldBuilder() {
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

        private List<CrossPage> crossPages_ = Collections.emptyList();
        private RepeatedFieldBuilderV3<CrossPage, CrossPage.Builder, CrossPageOrBuilder> crossPagesBuilder_;

        private void ensureCrossPagesIsMutable() {
            if ((this.bitField0_ & 0x8) == 0) {
                this.crossPages_ = new ArrayList(this.crossPages_);
                this.bitField0_ |= 0x8;
            }
        }

        public List<CrossPage> getCrossPagesList() {
            if (this.crossPagesBuilder_ == null) {
                return Collections.unmodifiableList(this.crossPages_);
            }
            return this.crossPagesBuilder_.getMessageList();
        }

        public int getCrossPagesCount() {
            if (this.crossPagesBuilder_ == null) {
                return this.crossPages_.size();
            }
            return this.crossPagesBuilder_.getCount();
        }

        public CrossPage getCrossPages(int index) {
            if (this.crossPagesBuilder_ == null) {
                return (CrossPage) this.crossPages_.get(index);
            }
            return (CrossPage) this.crossPagesBuilder_.getMessage(index);
        }

        public Builder setCrossPages(int index, CrossPage value) {
            if (this.crossPagesBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureCrossPagesIsMutable();
                this.crossPages_.set(index, value);
                onChanged();
            } else {
                this.crossPagesBuilder_.setMessage(index, value);
            }
            return this;
        }

        public Builder setCrossPages(int index, CrossPage.Builder builderForValue) {
            if (this.crossPagesBuilder_ == null) {
                ensureCrossPagesIsMutable();
                this.crossPages_.set(index, builderForValue.build());
                onChanged();
            } else {
                this.crossPagesBuilder_.setMessage(index, builderForValue.build());
            }
            return this;
        }

        public Builder addCrossPages(CrossPage value) {
            if (this.crossPagesBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureCrossPagesIsMutable();
                this.crossPages_.add(value);
                onChanged();
            } else {
                this.crossPagesBuilder_.addMessage(value);
            }
            return this;
        }

        public Builder addCrossPages(int index, CrossPage value) {
            if (this.crossPagesBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureCrossPagesIsMutable();
                this.crossPages_.add(index, value);
                onChanged();
            } else {
                this.crossPagesBuilder_.addMessage(index, value);
            }
            return this;
        }

        public Builder addCrossPages(CrossPage.Builder builderForValue) {
            if (this.crossPagesBuilder_ == null) {
                ensureCrossPagesIsMutable();
                this.crossPages_.add(builderForValue.build());
                onChanged();
            } else {
                this.crossPagesBuilder_.addMessage(builderForValue.build());
            }
            return this;
        }

        public Builder addCrossPages(int index, CrossPage.Builder builderForValue) {
            if (this.crossPagesBuilder_ == null) {
                ensureCrossPagesIsMutable();
                this.crossPages_.add(index, builderForValue.build());
                onChanged();
            } else {
                this.crossPagesBuilder_.addMessage(index, builderForValue.build());
            }
            return this;
        }

        public Builder addAllCrossPages(Iterable<? extends CrossPage> values) {
            if (this.crossPagesBuilder_ == null) {
                ensureCrossPagesIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.crossPages_);

                onChanged();
            } else {
                this.crossPagesBuilder_.addAllMessages(values);
            }
            return this;
        }

        public Builder clearCrossPages() {
            if (this.crossPagesBuilder_ == null) {
                this.crossPages_ = Collections.emptyList();
                this.bitField0_ &= 0xFFFFFFF7;
                onChanged();
            } else {
                this.crossPagesBuilder_.clear();
            }
            return this;
        }

        public Builder removeCrossPages(int index) {
            if (this.crossPagesBuilder_ == null) {
                ensureCrossPagesIsMutable();
                this.crossPages_.remove(index);
                onChanged();
            } else {
                this.crossPagesBuilder_.remove(index);
            }
            return this;
        }

        public CrossPage.Builder getCrossPagesBuilder(int index) {
            return (CrossPage.Builder) getCrossPagesFieldBuilder().getBuilder(index);
        }

        public CrossPageOrBuilder getCrossPagesOrBuilder(int index) {
            if (this.crossPagesBuilder_ == null) {
                return (CrossPageOrBuilder) this.crossPages_.get(index);
            }
            return (CrossPageOrBuilder) this.crossPagesBuilder_.getMessageOrBuilder(index);
        }

        public List<? extends CrossPageOrBuilder> getCrossPagesOrBuilderList() {
            if (this.crossPagesBuilder_ != null) {
                return this.crossPagesBuilder_.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.crossPages_);
        }

        public CrossPage.Builder addCrossPagesBuilder() {
            return (CrossPage.Builder) getCrossPagesFieldBuilder().addBuilder(CrossPage.getDefaultInstance());
        }

        public CrossPage.Builder addCrossPagesBuilder(int index) {
            return (CrossPage.Builder) getCrossPagesFieldBuilder().addBuilder(index, CrossPage.getDefaultInstance());
        }

        public List<CrossPage.Builder> getCrossPagesBuilderList() {
            return getCrossPagesFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<CrossPage, CrossPage.Builder, CrossPageOrBuilder> getCrossPagesFieldBuilder() {
            if (this.crossPagesBuilder_ == null) {
                this.crossPagesBuilder_ = new RepeatedFieldBuilderV3(this.crossPages_, (this.bitField0_ & 0x8) != 0, getParentForChildren(), isClean());
                this.crossPages_ = null;
            }
            return this.crossPagesBuilder_;
        }

        public final Builder setUnknownFields(UnknownFieldSet unknownFields) {
            return (Builder) super.setUnknownFields(unknownFields);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
            return (Builder) super.mergeUnknownFields(unknownFields);
        }
    }

    private static final Timer DEFAULT_INSTANCE = new Timer();

    public static Timer getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final Parser<Timer> PARSER = new AbstractParser() {
        public Timer parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new Timer(input, extensionRegistry);
        }
    };

    public static Parser<Timer> parser() {
        return PARSER;
    }

    public Parser<Timer> getParserForType() {
        return PARSER;
    }

    public Timer getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
