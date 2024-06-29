package com.unicom.bean;

import com.google.protobuf.*;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Event extends GeneratedMessageV3 implements EventOrBuilder {

	private static final long serialVersionUID = 0L;
	public static final int DURATION_FIELD_NUMBER = 1;
	private long duration_;
	public static final int PATH_FIELD_NUMBER = 2;
	private volatile Object path_;
	public static final int NODE_NAME_FIELD_NUMBER = 3;
	private volatile Object nodeName_;
	public static final int ID_FIELD_NUMBER = 4;
	private volatile Object id_;
	public static final int CLASS_NAME_FIELD_NUMBER = 5;
	private volatile Object className_;
	public static final int VALUE_FIELD_NUMBER = 6;
	private volatile Object value_;
	public static final int TITLE_FIELD_NUMBER = 7;
	private volatile Object title_;
	public static final int TEXT_FIELD_NUMBER = 8;
	private volatile Object text_;
	public static final int SRC_FIELD_NUMBER = 9;
	private volatile Object src_;
	public static final int HREF_FIELD_NUMBER = 10;
	private volatile Object href_;
	public static final int START_FIELD_NUMBER = 11;
	private long start_;
	public static final int END_FIELD_NUMBER = 12;
	private long end_;
	public static final int STATE_FIELD_NUMBER = 13;
	private int state_;
	public static final int AJAXES_FIELD_NUMBER = 14;
	private List<Ajax> ajaxes_;
	public static final int TIMERS_FIELD_NUMBER = 15;
	private List<Timer> timers_;
	public static final int IFRAMES_FIELD_NUMBER = 16;
	private List<Iframe> iframes_;
	public static final int CROSSPAGES_FIELD_NUMBER = 17;
	private List<CrossPage> crossPages_;
	public static final int TRIGGER_FIELD_NUMBER = 18;
	private volatile Object trigger_;
	public static final int RANGE_FIELD_NUMBER = 19;
	private volatile Object range_;
	public static final int EVENT_ID_FIELD_NUMBER = 20;
	private volatile Object eventId_;
	public static final int REF_ID_FIELD_NUMBER = 21;
	private volatile Object refId_;
	public static final int SPE_FIELD_NUMBER = 22;
	private Spe spe_;

	private Event(GeneratedMessageV3.Builder<?> builder) {
		super(builder);
	}

	private Event() {
		this.path_ = "";
		this.nodeName_ = "";
		this.id_ = "";
		this.className_ = "";
		this.value_ = "";
		this.title_ = "";
		this.text_ = "";
		this.src_ = "";
		this.href_ = "";
		this.state_ = 0;
		this.ajaxes_ = Collections.emptyList();
		this.timers_ = Collections.emptyList();
		this.iframes_ = Collections.emptyList();
		this.crossPages_ = Collections.emptyList();
		this.trigger_ = "";
		this.range_ = "";
		this.eventId_ = "";
		this.refId_ = "";
	}

	protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
		return new Event();
	}

	public final UnknownFieldSet getUnknownFields() {
		return this.unknownFields;
	}

	private Event(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
					this.duration_ = input.readInt64();
					break;
				case 18:
					this.path_ = input.readStringRequireUtf8();
					break;
				case 26:
					this.nodeName_ = input.readStringRequireUtf8();
					break;
				case 34:
					this.id_ = input.readStringRequireUtf8();
					break;
				case 42:
					this.className_ = input.readStringRequireUtf8();
					break;
				case 50:
					this.value_ = input.readStringRequireUtf8();
					break;
				case 58:
					this.title_ = input.readStringRequireUtf8();
					break;
				case 66:
					this.text_ = input.readStringRequireUtf8();
					break;
				case 74:
					this.src_ = input.readStringRequireUtf8();
					break;
				case 82:
					this.href_ = input.readStringRequireUtf8();
					break;
				case 88:
					this.start_ = input.readInt64();
					break;
				case 96:
					this.end_ = input.readInt64();
					break;
				case 104:
					int rawValue = input.readEnum();

					this.state_ = rawValue;
					break;
				case 114:
					if ((mutable_bitField0_ & 0x1) == 0) {
						this.ajaxes_ = new ArrayList();
						mutable_bitField0_ |= 0x1;
					}
					this.ajaxes_.add(input.readMessage(Ajax.parser(), extensionRegistry));
					break;
				case 122:
					if ((mutable_bitField0_ & 0x2) == 0) {
						this.timers_ = new ArrayList();
						mutable_bitField0_ |= 0x2;
					}
					this.timers_.add(input.readMessage(Timer.parser(), extensionRegistry));
					break;
				case 130:
					if ((mutable_bitField0_ & 0x4) == 0) {
						this.iframes_ = new ArrayList();
						mutable_bitField0_ |= 0x4;
					}
					this.iframes_.add(input.readMessage(Iframe.parser(), extensionRegistry));
					break;
				case 138:
					if ((mutable_bitField0_ & 0x8) == 0) {
						this.crossPages_ = new ArrayList();
						mutable_bitField0_ |= 0x8;
					}
					this.crossPages_.add(input.readMessage(CrossPage.parser(), extensionRegistry));
					break;
				case 146:
					String s = input.readStringRequireUtf8();

					this.trigger_ = s;
					break;
				case 154:
					this.range_ = input.readStringRequireUtf8();
					break;
				case 162:
					this.eventId_ = input.readStringRequireUtf8();
					break;
				case 170:
					this.refId_ = input.readStringRequireUtf8();
					break;
				case 178:
					Spe.Builder subBuilder = null;
					if (this.spe_ != null) {
						subBuilder = this.spe_.toBuilder();
					}
					this.spe_ = ((Spe) input.readMessage(Spe.parser(), extensionRegistry));
					if (subBuilder != null) {
						subBuilder.mergeFrom(this.spe_);
						this.spe_ = subBuilder.buildPartial();
					}
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
		return ActionOuterClass.internal_static_com_tingyun_proto_Event_descriptor;
	}

	protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
		return ActionOuterClass.internal_static_com_tingyun_proto_Event_fieldAccessorTable.ensureFieldAccessorsInitialized(Event.class, Builder.class);
	}

	public long getDuration() {
		return this.duration_;
	}

	public String getPath() {
		Object ref = this.path_;
		if ((ref instanceof String)) {
			return (String) ref;
		}
		ByteString bs = (ByteString) ref;

		String s = bs.toStringUtf8();
		this.path_ = s;
		return s;
	}

	public ByteString getPathBytes() {
		Object ref = this.path_;
		if ((ref instanceof String)) {
			ByteString b = ByteString.copyFromUtf8((String) ref);

			this.path_ = b;
			return b;
		}
		return (ByteString) ref;
	}

	public String getNodeName() {
		Object ref = this.nodeName_;
		if ((ref instanceof String)) {
			return (String) ref;
		}
		ByteString bs = (ByteString) ref;

		String s = bs.toStringUtf8();
		this.nodeName_ = s;
		return s;
	}

	public ByteString getNodeNameBytes() {
		Object ref = this.nodeName_;
		if ((ref instanceof String)) {
			ByteString b = ByteString.copyFromUtf8((String) ref);

			this.nodeName_ = b;
			return b;
		}
		return (ByteString) ref;
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

	public String getClassName() {
		Object ref = this.className_;
		if ((ref instanceof String)) {
			return (String) ref;
		}
		ByteString bs = (ByteString) ref;

		String s = bs.toStringUtf8();
		this.className_ = s;
		return s;
	}

	public ByteString getClassNameBytes() {
		Object ref = this.className_;
		if ((ref instanceof String)) {
			ByteString b = ByteString.copyFromUtf8((String) ref);

			this.className_ = b;
			return b;
		}
		return (ByteString) ref;
	}

	public String getValue() {
		Object ref = this.value_;
		if ((ref instanceof String)) {
			return (String) ref;
		}
		ByteString bs = (ByteString) ref;

		String s = bs.toStringUtf8();
		this.value_ = s;
		return s;
	}

	public ByteString getValueBytes() {
		Object ref = this.value_;
		if ((ref instanceof String)) {
			ByteString b = ByteString.copyFromUtf8((String) ref);

			this.value_ = b;
			return b;
		}
		return (ByteString) ref;
	}

	public String getTitle() {
		Object ref = this.title_;
		if ((ref instanceof String)) {
			return (String) ref;
		}
		ByteString bs = (ByteString) ref;

		String s = bs.toStringUtf8();
		this.title_ = s;
		return s;
	}

	public ByteString getTitleBytes() {
		Object ref = this.title_;
		if ((ref instanceof String)) {
			ByteString b = ByteString.copyFromUtf8((String) ref);

			this.title_ = b;
			return b;
		}
		return (ByteString) ref;
	}

	public String getText() {
		Object ref = this.text_;
		if ((ref instanceof String)) {
			return (String) ref;
		}
		ByteString bs = (ByteString) ref;

		String s = bs.toStringUtf8();
		this.text_ = s;
		return s;
	}

	public ByteString getTextBytes() {
		Object ref = this.text_;
		if ((ref instanceof String)) {
			ByteString b = ByteString.copyFromUtf8((String) ref);

			this.text_ = b;
			return b;
		}
		return (ByteString) ref;
	}

	public String getSrc() {
		Object ref = this.src_;
		if ((ref instanceof String)) {
			return (String) ref;
		}
		ByteString bs = (ByteString) ref;

		String s = bs.toStringUtf8();
		this.src_ = s;
		return s;
	}

	public ByteString getSrcBytes() {
		Object ref = this.src_;
		if ((ref instanceof String)) {
			ByteString b = ByteString.copyFromUtf8((String) ref);

			this.src_ = b;
			return b;
		}
		return (ByteString) ref;
	}

	public String getHref() {
		Object ref = this.href_;
		if ((ref instanceof String)) {
			return (String) ref;
		}
		ByteString bs = (ByteString) ref;

		String s = bs.toStringUtf8();
		this.href_ = s;
		return s;
	}

	public ByteString getHrefBytes() {
		Object ref = this.href_;
		if ((ref instanceof String)) {
			ByteString b = ByteString.copyFromUtf8((String) ref);

			this.href_ = b;
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

	public String getTrigger() {
		Object ref = this.trigger_;
		if ((ref instanceof String)) {
			return (String) ref;
		}
		ByteString bs = (ByteString) ref;

		String s = bs.toStringUtf8();
		this.trigger_ = s;
		return s;
	}

	public ByteString getTriggerBytes() {
		Object ref = this.trigger_;
		if ((ref instanceof String)) {
			ByteString b = ByteString.copyFromUtf8((String) ref);

			this.trigger_ = b;
			return b;
		}
		return (ByteString) ref;
	}

	public String getRange() {
		Object ref = this.range_;
		if ((ref instanceof String)) {
			return (String) ref;
		}
		ByteString bs = (ByteString) ref;

		String s = bs.toStringUtf8();
		this.range_ = s;
		return s;
	}

	public ByteString getRangeBytes() {
		Object ref = this.range_;
		if ((ref instanceof String)) {
			ByteString b = ByteString.copyFromUtf8((String) ref);

			this.range_ = b;
			return b;
		}
		return (ByteString) ref;
	}

	public String getEventId() {
		Object ref = this.eventId_;
		if ((ref instanceof String)) {
			return (String) ref;
		}
		ByteString bs = (ByteString) ref;

		String s = bs.toStringUtf8();
		this.eventId_ = s;
		return s;
	}

	public ByteString getEventIdBytes() {
		Object ref = this.eventId_;
		if ((ref instanceof String)) {
			ByteString b = ByteString.copyFromUtf8((String) ref);

			this.eventId_ = b;
			return b;
		}
		return (ByteString) ref;
	}

	public String getRefId() {
		Object ref = this.refId_;
		if ((ref instanceof String)) {
			return (String) ref;
		}
		ByteString bs = (ByteString) ref;

		String s = bs.toStringUtf8();
		this.refId_ = s;
		return s;
	}

	public ByteString getRefIdBytes() {
		Object ref = this.refId_;
		if ((ref instanceof String)) {
			ByteString b = ByteString.copyFromUtf8((String) ref);

			this.refId_ = b;
			return b;
		}
		return (ByteString) ref;
	}

	public boolean hasSpe() {
		return this.spe_ != null;
	}

	public Spe getSpe() {
		return this.spe_ == null ? Spe.getDefaultInstance() : this.spe_;
	}

	public SpeOrBuilder getSpeOrBuilder() {
		return getSpe();
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
		if (this.duration_ != 0L) {
			output.writeInt64(1, this.duration_);
		}
		if (!getPathBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 2, this.path_);
		}
		if (!getNodeNameBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 3, this.nodeName_);
		}
		if (!getIdBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 4, this.id_);
		}
		if (!getClassNameBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 5, this.className_);
		}
		if (!getValueBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 6, this.value_);
		}
		if (!getTitleBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 7, this.title_);
		}
		if (!getTextBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 8, this.text_);
		}
		if (!getSrcBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 9, this.src_);
		}
		if (!getHrefBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 10, this.href_);
		}
		if (this.start_ != 0L) {
			output.writeInt64(11, this.start_);
		}
		if (this.end_ != 0L) {
			output.writeInt64(12, this.end_);
		}
		if (this.state_ != ActionState.FINISH.getNumber()) {
			output.writeEnum(13, this.state_);
		}
		for (int i = 0; i < this.ajaxes_.size(); i++) {
			output.writeMessage(14, (MessageLite) this.ajaxes_.get(i));
		}
		for (int i = 0; i < this.timers_.size(); i++) {
			output.writeMessage(15, (MessageLite) this.timers_.get(i));
		}
		for (int i = 0; i < this.iframes_.size(); i++) {
			output.writeMessage(16, (MessageLite) this.iframes_.get(i));
		}
		for (int i = 0; i < this.crossPages_.size(); i++) {
			output.writeMessage(17, (MessageLite) this.crossPages_.get(i));
		}
		if (!getTriggerBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 18, this.trigger_);
		}
		if (!getRangeBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 19, this.range_);
		}
		if (!getEventIdBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 20, this.eventId_);
		}
		if (!getRefIdBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 21, this.refId_);
		}
		if (this.spe_ != null) {
			output.writeMessage(22, getSpe());
		}
		this.unknownFields.writeTo(output);
	}

	public int getSerializedSize() {
		int size = this.memoizedSize;
		if (size != -1) {
			return size;
		}
		size = 0;
		if (this.duration_ != 0L) {
			size = size + CodedOutputStream.computeInt64Size(1, this.duration_);
		}
		if (!getPathBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(2, this.path_);
		}
		if (!getNodeNameBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(3, this.nodeName_);
		}
		if (!getIdBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(4, this.id_);
		}
		if (!getClassNameBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(5, this.className_);
		}
		if (!getValueBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(6, this.value_);
		}
		if (!getTitleBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(7, this.title_);
		}
		if (!getTextBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(8, this.text_);
		}
		if (!getSrcBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(9, this.src_);
		}
		if (!getHrefBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(10, this.href_);
		}
		if (this.start_ != 0L) {
			size = size + CodedOutputStream.computeInt64Size(11, this.start_);
		}
		if (this.end_ != 0L) {
			size = size + CodedOutputStream.computeInt64Size(12, this.end_);
		}
		if (this.state_ != ActionState.FINISH.getNumber()) {
			size = size + CodedOutputStream.computeEnumSize(13, this.state_);
		}
		for (int i = 0; i < this.ajaxes_.size(); i++) {
			size = size + CodedOutputStream.computeMessageSize(14, (MessageLite) this.ajaxes_.get(i));
		}
		for (int i = 0; i < this.timers_.size(); i++) {
			size = size + CodedOutputStream.computeMessageSize(15, (MessageLite) this.timers_.get(i));
		}
		for (int i = 0; i < this.iframes_.size(); i++) {
			size = size + CodedOutputStream.computeMessageSize(16, (MessageLite) this.iframes_.get(i));
		}
		for (int i = 0; i < this.crossPages_.size(); i++) {
			size = size + CodedOutputStream.computeMessageSize(17, (MessageLite) this.crossPages_.get(i));
		}
		if (!getTriggerBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(18, this.trigger_);
		}
		if (!getRangeBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(19, this.range_);
		}
		if (!getEventIdBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(20, this.eventId_);
		}
		if (!getRefIdBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(21, this.refId_);
		}
		if (this.spe_ != null) {
			size = size + CodedOutputStream.computeMessageSize(22, getSpe());
		}
		size += this.unknownFields.getSerializedSize();
		this.memoizedSize = size;
		return size;
	}

	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (!(obj instanceof Event)) {
			return super.equals(obj);
		}
		Event other = (Event) obj;
		if (getDuration() != other.getDuration()) {
			return false;
		}
		if (!getPath().equals(other.getPath())) {
			return false;
		}
		if (!getNodeName().equals(other.getNodeName())) {
			return false;
		}
		if (!getId().equals(other.getId())) {
			return false;
		}
		if (!getClassName().equals(other.getClassName())) {
			return false;
		}
		if (!getValue().equals(other.getValue())) {
			return false;
		}
		if (!getTitle().equals(other.getTitle())) {
			return false;
		}
		if (!getText().equals(other.getText())) {
			return false;
		}
		if (!getSrc().equals(other.getSrc())) {
			return false;
		}
		if (!getHref().equals(other.getHref())) {
			return false;
		}
		if (getStart() != other.getStart()) {
			return false;
		}
		if (getEnd() != other.getEnd()) {
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
		if (!getTrigger().equals(other.getTrigger())) {
			return false;
		}
		if (!getRange().equals(other.getRange())) {
			return false;
		}
		if (!getEventId().equals(other.getEventId())) {
			return false;
		}
		if (!getRefId().equals(other.getRefId())) {
			return false;
		}
		if (hasSpe() != other.hasSpe()) {
			return false;
		}
		if (hasSpe()) {
			if (!getSpe().equals(other.getSpe())) {
				return false;
			}
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
		hash = 53 * hash + Internal.hashLong(getDuration());
		hash = 37 * hash + 2;
		hash = 53 * hash + getPath().hashCode();
		hash = 37 * hash + 3;
		hash = 53 * hash + getNodeName().hashCode();
		hash = 37 * hash + 4;
		hash = 53 * hash + getId().hashCode();
		hash = 37 * hash + 5;
		hash = 53 * hash + getClassName().hashCode();
		hash = 37 * hash + 6;
		hash = 53 * hash + getValue().hashCode();
		hash = 37 * hash + 7;
		hash = 53 * hash + getTitle().hashCode();
		hash = 37 * hash + 8;
		hash = 53 * hash + getText().hashCode();
		hash = 37 * hash + 9;
		hash = 53 * hash + getSrc().hashCode();
		hash = 37 * hash + 10;
		hash = 53 * hash + getHref().hashCode();
		hash = 37 * hash + 11;
		hash = 53 * hash + Internal.hashLong(getStart());
		hash = 37 * hash + 12;
		hash = 53 * hash + Internal.hashLong(getEnd());
		hash = 37 * hash + 13;
		hash = 53 * hash + this.state_;
		if (getAjaxesCount() > 0) {
			hash = 37 * hash + 14;
			hash = 53 * hash + getAjaxesList().hashCode();
		}
		if (getTimersCount() > 0) {
			hash = 37 * hash + 15;
			hash = 53 * hash + getTimersList().hashCode();
		}
		if (getIframesCount() > 0) {
			hash = 37 * hash + 16;
			hash = 53 * hash + getIframesList().hashCode();
		}
		if (getCrossPagesCount() > 0) {
			hash = 37 * hash + 17;
			hash = 53 * hash + getCrossPagesList().hashCode();
		}
		hash = 37 * hash + 18;
		hash = 53 * hash + getTrigger().hashCode();
		hash = 37 * hash + 19;
		hash = 53 * hash + getRange().hashCode();
		hash = 37 * hash + 20;
		hash = 53 * hash + getEventId().hashCode();
		hash = 37 * hash + 21;
		hash = 53 * hash + getRefId().hashCode();
		if (hasSpe()) {
			hash = 37 * hash + 22;
			hash = 53 * hash + getSpe().hashCode();
		}
		hash = 29 * hash + this.unknownFields.hashCode();
		this.memoizedHashCode = hash;
		return hash;
	}

	public static Event parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
		return (Event) PARSER.parseFrom(data);
	}

	public static Event parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
		return (Event) PARSER.parseFrom(data, extensionRegistry);
	}

	public static Event parseFrom(ByteString data) throws InvalidProtocolBufferException {
		return (Event) PARSER.parseFrom(data);
	}

	public static Event parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
		return (Event) PARSER.parseFrom(data, extensionRegistry);
	}

	public static Event parseFrom(byte[] data) throws InvalidProtocolBufferException {
		return (Event) PARSER.parseFrom(data);
	}

	public static Event parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
		return (Event) PARSER.parseFrom(data, extensionRegistry);
	}

	public static Event parseFrom(InputStream input) throws IOException {
		return (Event) GeneratedMessageV3.parseWithIOException(PARSER, input);
	}

	public static Event parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
		return (Event) GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
	}

	public static Event parseDelimitedFrom(InputStream input) throws IOException {
		return (Event) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
	}

	public static Event parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
		return (Event) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
	}

	public static Event parseFrom(CodedInputStream input) throws IOException {
		return (Event) GeneratedMessageV3.parseWithIOException(PARSER, input);
	}

	public static Event parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
		return (Event) GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
	}

	public Builder newBuilderForType() {
		return newBuilder();
	}

	public static Builder newBuilder() {
		return DEFAULT_INSTANCE.toBuilder();
	}

	public static Builder newBuilder(Event prototype) {
		return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
	}

	public Builder toBuilder() {
		return this == DEFAULT_INSTANCE ? new Builder(null) : new Builder(null).mergeFrom(this);
	}

	protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
		Builder builder = new Builder(parent);
		return builder;
	}

	public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EventOrBuilder {
		private int bitField0_;
		private long duration_;

		public static final Descriptors.Descriptor getDescriptor() {
			return ActionOuterClass.internal_static_com_tingyun_proto_Event_descriptor;
		}

		protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
			return ActionOuterClass.internal_static_com_tingyun_proto_Event_fieldAccessorTable.ensureFieldAccessorsInitialized(Event.class, Builder.class);
		}

		private Builder() {
			maybeForceBuilderInitialization();
		}

		private Builder(GeneratedMessageV3.BuilderParent parent) {
			super();
			maybeForceBuilderInitialization();
		}

		private void maybeForceBuilderInitialization() {
			if (Event.alwaysUseFieldBuilders) {
				getAjaxesFieldBuilder();
				getTimersFieldBuilder();
				getIframesFieldBuilder();
				getCrossPagesFieldBuilder();
			}
		}

		public Builder clear() {
			super.clear();
			this.duration_ = 0L;

			this.path_ = "";

			this.nodeName_ = "";

			this.id_ = "";

			this.className_ = "";

			this.value_ = "";

			this.title_ = "";

			this.text_ = "";

			this.src_ = "";

			this.href_ = "";

			this.start_ = 0L;

			this.end_ = 0L;

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
			this.trigger_ = "";

			this.range_ = "";

			this.eventId_ = "";

			this.refId_ = "";
			if (this.speBuilder_ == null) {
				this.spe_ = null;
			} else {
				this.spe_ = null;
				this.speBuilder_ = null;
			}
			return this;
		}

		public Descriptors.Descriptor getDescriptorForType() {
			return ActionOuterClass.internal_static_com_tingyun_proto_Event_descriptor;
		}

		public Event getDefaultInstanceForType() {
			return Event.getDefaultInstance();
		}

		public Event build() {
			Event result = buildPartial();
			if (!result.isInitialized()) {
				throw newUninitializedMessageException(result);
			}
			return result;
		}

		public Event buildPartial() {
			Event result = new Event(this);
			int from_bitField0_ = this.bitField0_;
			result.duration_ = this.duration_;
			result.path_ = this.path_;
			result.nodeName_ = this.nodeName_;
			result.id_ = this.id_;
			result.className_ = this.className_;
			result.value_ = this.value_;
			result.title_ = this.title_;
			result.text_ = this.text_;
			result.src_ = this.src_;
			result.href_ = this.href_;
			result.start_ = this.start_;
			result.end_ = this.end_;
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
			result.trigger_ = this.trigger_;
			result.range_ = this.range_;
			result.eventId_ = this.eventId_;
			result.refId_ = this.refId_;
			if (this.speBuilder_ == null) {
				result.spe_ = this.spe_;
			} else {
				result.spe_ = ((Spe) this.speBuilder_.build());
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
			if ((other instanceof Event)) {
				return mergeFrom((Event) other);
			}
			super.mergeFrom(other);
			return this;
		}

		public Builder mergeFrom(Event other) {
			if (other == Event.getDefaultInstance()) {
				return this;
			}
			if (other.getDuration() != 0L) {
				setDuration(other.getDuration());
			}
			if (!other.getPath().isEmpty()) {
				this.path_ = other.path_;
				onChanged();
			}
			if (!other.getNodeName().isEmpty()) {
				this.nodeName_ = other.nodeName_;
				onChanged();
			}
			if (!other.getId().isEmpty()) {
				this.id_ = other.id_;
				onChanged();
			}
			if (!other.getClassName().isEmpty()) {
				this.className_ = other.className_;
				onChanged();
			}
			if (!other.getValue().isEmpty()) {
				this.value_ = other.value_;
				onChanged();
			}
			if (!other.getTitle().isEmpty()) {
				this.title_ = other.title_;
				onChanged();
			}
			if (!other.getText().isEmpty()) {
				this.text_ = other.text_;
				onChanged();
			}
			if (!other.getSrc().isEmpty()) {
				this.src_ = other.src_;
				onChanged();
			}
			if (!other.getHref().isEmpty()) {
				this.href_ = other.href_;
				onChanged();
			}
			if (other.getStart() != 0L) {
				setStart(other.getStart());
			}
			if (other.getEnd() != 0L) {
				setEnd(other.getEnd());
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

					this.ajaxesBuilder_ = (Event.alwaysUseFieldBuilders ? getAjaxesFieldBuilder() : null);
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

					this.timersBuilder_ = (Event.alwaysUseFieldBuilders ? getTimersFieldBuilder() : null);
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

					this.iframesBuilder_ = (Event.alwaysUseFieldBuilders ? getIframesFieldBuilder() : null);
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

					this.crossPagesBuilder_ = (Event.alwaysUseFieldBuilders ? getCrossPagesFieldBuilder() : null);
				} else {
					this.crossPagesBuilder_.addAllMessages(other.crossPages_);
				}
			}
			if (!other.getTrigger().isEmpty()) {
				this.trigger_ = other.trigger_;
				onChanged();
			}
			if (!other.getRange().isEmpty()) {
				this.range_ = other.range_;
				onChanged();
			}
			if (!other.getEventId().isEmpty()) {
				this.eventId_ = other.eventId_;
				onChanged();
			}
			if (!other.getRefId().isEmpty()) {
				this.refId_ = other.refId_;
				onChanged();
			}
			if (other.hasSpe()) {
				mergeSpe(other.getSpe());
			}
			mergeUnknownFields(other.unknownFields);
			onChanged();
			return this;
		}

		public final boolean isInitialized() {
			return true;
		}

		public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
			Event parsedMessage = null;
			try {
				parsedMessage = (Event) Event.PARSER.parsePartialFrom(input, extensionRegistry);
			} catch (InvalidProtocolBufferException e) {
				parsedMessage = (Event) e.getUnfinishedMessage();
				throw e.unwrapIOException();
			} finally {
				if (parsedMessage != null) {
					mergeFrom(parsedMessage);
				}
			}
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

		private Object path_ = "";

		public String getPath() {
			Object ref = this.path_;
			if (!(ref instanceof String)) {
				ByteString bs = (ByteString) ref;

				String s = bs.toStringUtf8();
				this.path_ = s;
				return s;
			}
			return (String) ref;
		}

		public ByteString getPathBytes() {
			Object ref = this.path_;
			if ((ref instanceof String)) {
				ByteString b = ByteString.copyFromUtf8((String) ref);

				this.path_ = b;
				return b;
			}
			return (ByteString) ref;
		}

		public Builder setPath(String value) {
			if (value == null) {
				throw new NullPointerException();
			}
			this.path_ = value;
			onChanged();
			return this;
		}

		public Builder clearPath() {
			this.path_ = Event.getDefaultInstance().getPath();
			onChanged();
			return this;
		}

		public Builder setPathBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Event.checkByteStringIsUtf8(value);

			this.path_ = value;
			onChanged();
			return this;
		}

		private Object nodeName_ = "";

		public String getNodeName() {
			Object ref = this.nodeName_;
			if (!(ref instanceof String)) {
				ByteString bs = (ByteString) ref;

				String s = bs.toStringUtf8();
				this.nodeName_ = s;
				return s;
			}
			return (String) ref;
		}

		public ByteString getNodeNameBytes() {
			Object ref = this.nodeName_;
			if ((ref instanceof String)) {
				ByteString b = ByteString.copyFromUtf8((String) ref);

				this.nodeName_ = b;
				return b;
			}
			return (ByteString) ref;
		}

		public Builder setNodeName(String value) {
			if (value == null) {
				throw new NullPointerException();
			}
			this.nodeName_ = value;
			onChanged();
			return this;
		}

		public Builder clearNodeName() {
			this.nodeName_ = Event.getDefaultInstance().getNodeName();
			onChanged();
			return this;
		}

		public Builder setNodeNameBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Event.checkByteStringIsUtf8(value);

			this.nodeName_ = value;
			onChanged();
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
			this.id_ = Event.getDefaultInstance().getId();
			onChanged();
			return this;
		}

		public Builder setIdBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Event.checkByteStringIsUtf8(value);

			this.id_ = value;
			onChanged();
			return this;
		}

		private Object className_ = "";

		public String getClassName() {
			Object ref = this.className_;
			if (!(ref instanceof String)) {
				ByteString bs = (ByteString) ref;

				String s = bs.toStringUtf8();
				this.className_ = s;
				return s;
			}
			return (String) ref;
		}

		public ByteString getClassNameBytes() {
			Object ref = this.className_;
			if ((ref instanceof String)) {
				ByteString b = ByteString.copyFromUtf8((String) ref);

				this.className_ = b;
				return b;
			}
			return (ByteString) ref;
		}

		public Builder setClassName(String value) {
			if (value == null) {
				throw new NullPointerException();
			}
			this.className_ = value;
			onChanged();
			return this;
		}

		public Builder clearClassName() {
			this.className_ = Event.getDefaultInstance().getClassName();
			onChanged();
			return this;
		}

		public Builder setClassNameBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Event.checkByteStringIsUtf8(value);

			this.className_ = value;
			onChanged();
			return this;
		}

		private Object value_ = "";

		public String getValue() {
			Object ref = this.value_;
			if (!(ref instanceof String)) {
				ByteString bs = (ByteString) ref;

				String s = bs.toStringUtf8();
				this.value_ = s;
				return s;
			}
			return (String) ref;
		}

		public ByteString getValueBytes() {
			Object ref = this.value_;
			if ((ref instanceof String)) {
				ByteString b = ByteString.copyFromUtf8((String) ref);

				this.value_ = b;
				return b;
			}
			return (ByteString) ref;
		}

		public Builder setValue(String value) {
			if (value == null) {
				throw new NullPointerException();
			}
			this.value_ = value;
			onChanged();
			return this;
		}

		public Builder clearValue() {
			this.value_ = Event.getDefaultInstance().getValue();
			onChanged();
			return this;
		}

		public Builder setValueBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Event.checkByteStringIsUtf8(value);

			this.value_ = value;
			onChanged();
			return this;
		}

		private Object title_ = "";

		public String getTitle() {
			Object ref = this.title_;
			if (!(ref instanceof String)) {
				ByteString bs = (ByteString) ref;

				String s = bs.toStringUtf8();
				this.title_ = s;
				return s;
			}
			return (String) ref;
		}

		public ByteString getTitleBytes() {
			Object ref = this.title_;
			if ((ref instanceof String)) {
				ByteString b = ByteString.copyFromUtf8((String) ref);

				this.title_ = b;
				return b;
			}
			return (ByteString) ref;
		}

		public Builder setTitle(String value) {
			if (value == null) {
				throw new NullPointerException();
			}
			this.title_ = value;
			onChanged();
			return this;
		}

		public Builder clearTitle() {
			this.title_ = Event.getDefaultInstance().getTitle();
			onChanged();
			return this;
		}

		public Builder setTitleBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Event.checkByteStringIsUtf8(value);

			this.title_ = value;
			onChanged();
			return this;
		}

		private Object text_ = "";

		public String getText() {
			Object ref = this.text_;
			if (!(ref instanceof String)) {
				ByteString bs = (ByteString) ref;

				String s = bs.toStringUtf8();
				this.text_ = s;
				return s;
			}
			return (String) ref;
		}

		public ByteString getTextBytes() {
			Object ref = this.text_;
			if ((ref instanceof String)) {
				ByteString b = ByteString.copyFromUtf8((String) ref);

				this.text_ = b;
				return b;
			}
			return (ByteString) ref;
		}

		public Builder setText(String value) {
			if (value == null) {
				throw new NullPointerException();
			}
			this.text_ = value;
			onChanged();
			return this;
		}

		public Builder clearText() {
			this.text_ = Event.getDefaultInstance().getText();
			onChanged();
			return this;
		}

		public Builder setTextBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Event.checkByteStringIsUtf8(value);

			this.text_ = value;
			onChanged();
			return this;
		}

		private Object src_ = "";

		public String getSrc() {
			Object ref = this.src_;
			if (!(ref instanceof String)) {
				ByteString bs = (ByteString) ref;

				String s = bs.toStringUtf8();
				this.src_ = s;
				return s;
			}
			return (String) ref;
		}

		public ByteString getSrcBytes() {
			Object ref = this.src_;
			if ((ref instanceof String)) {
				ByteString b = ByteString.copyFromUtf8((String) ref);

				this.src_ = b;
				return b;
			}
			return (ByteString) ref;
		}

		public Builder setSrc(String value) {
			if (value == null) {
				throw new NullPointerException();
			}
			this.src_ = value;
			onChanged();
			return this;
		}

		public Builder clearSrc() {
			this.src_ = Event.getDefaultInstance().getSrc();
			onChanged();
			return this;
		}

		public Builder setSrcBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Event.checkByteStringIsUtf8(value);

			this.src_ = value;
			onChanged();
			return this;
		}

		private Object href_ = "";
		private long start_;
		private long end_;

		public String getHref() {
			Object ref = this.href_;
			if (!(ref instanceof String)) {
				ByteString bs = (ByteString) ref;

				String s = bs.toStringUtf8();
				this.href_ = s;
				return s;
			}
			return (String) ref;
		}

		public ByteString getHrefBytes() {
			Object ref = this.href_;
			if ((ref instanceof String)) {
				ByteString b = ByteString.copyFromUtf8((String) ref);

				this.href_ = b;
				return b;
			}
			return (ByteString) ref;
		}

		public Builder setHref(String value) {
			if (value == null) {
				throw new NullPointerException();
			}
			this.href_ = value;
			onChanged();
			return this;
		}

		public Builder clearHref() {
			this.href_ = Event.getDefaultInstance().getHref();
			onChanged();
			return this;
		}

		public Builder setHrefBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Event.checkByteStringIsUtf8(value);

			this.href_ = value;
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
				addAll(values, this.ajaxes_);

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
				addAll(values, this.timers_);

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

		private Object trigger_ = "";

		public String getTrigger() {
			Object ref = this.trigger_;
			if (!(ref instanceof String)) {
				ByteString bs = (ByteString) ref;

				String s = bs.toStringUtf8();
				this.trigger_ = s;
				return s;
			}
			return (String) ref;
		}

		public ByteString getTriggerBytes() {
			Object ref = this.trigger_;
			if ((ref instanceof String)) {
				ByteString b = ByteString.copyFromUtf8((String) ref);

				this.trigger_ = b;
				return b;
			}
			return (ByteString) ref;
		}

		public Builder setTrigger(String value) {
			if (value == null) {
				throw new NullPointerException();
			}
			this.trigger_ = value;
			onChanged();
			return this;
		}

		public Builder clearTrigger() {
			this.trigger_ = Event.getDefaultInstance().getTrigger();
			onChanged();
			return this;
		}

		public Builder setTriggerBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Event.checkByteStringIsUtf8(value);

			this.trigger_ = value;
			onChanged();
			return this;
		}

		private Object range_ = "";

		public String getRange() {
			Object ref = this.range_;
			if (!(ref instanceof String)) {
				ByteString bs = (ByteString) ref;

				String s = bs.toStringUtf8();
				this.range_ = s;
				return s;
			}
			return (String) ref;
		}

		public ByteString getRangeBytes() {
			Object ref = this.range_;
			if ((ref instanceof String)) {
				ByteString b = ByteString.copyFromUtf8((String) ref);

				this.range_ = b;
				return b;
			}
			return (ByteString) ref;
		}

		public Builder setRange(String value) {
			if (value == null) {
				throw new NullPointerException();
			}
			this.range_ = value;
			onChanged();
			return this;
		}

		public Builder clearRange() {
			this.range_ = Event.getDefaultInstance().getRange();
			onChanged();
			return this;
		}

		public Builder setRangeBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Event.checkByteStringIsUtf8(value);

			this.range_ = value;
			onChanged();
			return this;
		}

		private Object eventId_ = "";

		public String getEventId() {
			Object ref = this.eventId_;
			if (!(ref instanceof String)) {
				ByteString bs = (ByteString) ref;

				String s = bs.toStringUtf8();
				this.eventId_ = s;
				return s;
			}
			return (String) ref;
		}

		public ByteString getEventIdBytes() {
			Object ref = this.eventId_;
			if ((ref instanceof String)) {
				ByteString b = ByteString.copyFromUtf8((String) ref);

				this.eventId_ = b;
				return b;
			}
			return (ByteString) ref;
		}

		public Builder setEventId(String value) {
			if (value == null) {
				throw new NullPointerException();
			}
			this.eventId_ = value;
			onChanged();
			return this;
		}

		public Builder clearEventId() {
			this.eventId_ = Event.getDefaultInstance().getEventId();
			onChanged();
			return this;
		}

		public Builder setEventIdBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Event.checkByteStringIsUtf8(value);

			this.eventId_ = value;
			onChanged();
			return this;
		}

		private Object refId_ = "";
		private Spe spe_;
		private SingleFieldBuilderV3<Spe, Spe.Builder, SpeOrBuilder> speBuilder_;

		public String getRefId() {
			Object ref = this.refId_;
			if (!(ref instanceof String)) {
				ByteString bs = (ByteString) ref;

				String s = bs.toStringUtf8();
				this.refId_ = s;
				return s;
			}
			return (String) ref;
		}

		public ByteString getRefIdBytes() {
			Object ref = this.refId_;
			if ((ref instanceof String)) {
				ByteString b = ByteString.copyFromUtf8((String) ref);

				this.refId_ = b;
				return b;
			}
			return (ByteString) ref;
		}

		public Builder setRefId(String value) {
			if (value == null) {
				throw new NullPointerException();
			}
			this.refId_ = value;
			onChanged();
			return this;
		}

		public Builder clearRefId() {
			this.refId_ = Event.getDefaultInstance().getRefId();
			onChanged();
			return this;
		}

		public Builder setRefIdBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Event.checkByteStringIsUtf8(value);

			this.refId_ = value;
			onChanged();
			return this;
		}

		public boolean hasSpe() {
			return (this.speBuilder_ != null) || (this.spe_ != null);
		}

		public Spe getSpe() {
			if (this.speBuilder_ == null) {
				return this.spe_ == null ? Spe.getDefaultInstance() : this.spe_;
			}
			return (Spe) this.speBuilder_.getMessage();
		}

		public Builder setSpe(Spe value) {
			if (this.speBuilder_ == null) {
				if (value == null) {
					throw new NullPointerException();
				}
				this.spe_ = value;
				onChanged();
			} else {
				this.speBuilder_.setMessage(value);
			}
			return this;
		}

		public Builder setSpe(Spe.Builder builderForValue) {
			if (this.speBuilder_ == null) {
				this.spe_ = builderForValue.build();
				onChanged();
			} else {
				this.speBuilder_.setMessage(builderForValue.build());
			}
			return this;
		}

		public Builder mergeSpe(Spe value) {
			if (this.speBuilder_ == null) {
				if (this.spe_ != null) {
					this.spe_ = Spe.newBuilder(this.spe_).mergeFrom(value).buildPartial();
				} else {
					this.spe_ = value;
				}
				onChanged();
			} else {
				this.speBuilder_.mergeFrom(value);
			}
			return this;
		}

		public Builder clearSpe() {
			if (this.speBuilder_ == null) {
				this.spe_ = null;
				onChanged();
			} else {
				this.spe_ = null;
				this.speBuilder_ = null;
			}
			return this;
		}

		public Spe.Builder getSpeBuilder() {
			onChanged();
			return (Spe.Builder) getSpeFieldBuilder().getBuilder();
		}

		public SpeOrBuilder getSpeOrBuilder() {
			if (this.speBuilder_ != null) {
				return (SpeOrBuilder) this.speBuilder_.getMessageOrBuilder();
			}
			return this.spe_ == null ? Spe.getDefaultInstance() : this.spe_;
		}

		private SingleFieldBuilderV3<Spe, Spe.Builder, SpeOrBuilder> getSpeFieldBuilder() {
			if (this.speBuilder_ == null) {
				this.speBuilder_ = new SingleFieldBuilderV3(getSpe(), getParentForChildren(), isClean());
				this.spe_ = null;
			}
			return this.speBuilder_;
		}

		public final Builder setUnknownFields(UnknownFieldSet unknownFields) {
			return (Builder) super.setUnknownFields(unknownFields);
		}

		public final Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
			return (Builder) super.mergeUnknownFields(unknownFields);
		}
	}

	private static final Event DEFAULT_INSTANCE = new Event();

	public static Event getDefaultInstance() {
		return DEFAULT_INSTANCE;
	}

	private static final Parser<Event> PARSER = new AbstractParser() {
		public Event parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
			return new Event(input, extensionRegistry);
		}
	};

	public static Parser<Event> parser() {
		return PARSER;
	}

	public Parser<Event> getParserForType() {
		return PARSER;
	}

	public Event getDefaultInstanceForType() {
		return DEFAULT_INSTANCE;
	}
}
