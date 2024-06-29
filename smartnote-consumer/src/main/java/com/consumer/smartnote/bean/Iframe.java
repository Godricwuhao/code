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
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.UnknownFieldSet;

public class Iframe extends GeneratedMessageV3 implements IframeOrBuilder {

	private static final long serialVersionUID = 0L;
	public static final int LOAD_TYPE_FIELD_NUMBER = 1;
	private int loadType_;
	public static final int SRC_FIELD_NUMBER = 2;
	private volatile Object src_;
	public static final int HOST_FIELD_NUMBER = 3;
	private volatile Object host_;
	public static final int URI_FIELD_NUMBER = 4;
	private volatile Object uri_;
	public static final int PVID_FIELD_NUMBER = 5;
	private volatile Object pvid_;
	public static final int START_FIELD_NUMBER = 6;
	private long start_;
	public static final int END_FIELD_NUMBER = 7;
	private long end_;
	public static final int DURATION_FIELD_NUMBER = 8;
	private int duration_;
	public static final int FIRST_PAINT_TIME_FIELD_NUMBER = 9;
	private int firstPaintTime_;
	public static final int FIRST_SCREEN_TIME_FIELD_NUMBER = 10;
	private int firstScreenTime_;
	public static final int DOM_READY_TIME_FIELD_NUMBER = 11;
	private int domReadyTime_;
	public static final int S_APP_ID_FIELD_NUMBER = 12;
	private int sAppId_;
	public static final int S_APP_INSTANCE_ID_FIELD_NUMBER = 13;
	private int sAppInstanceId_;
	public static final int S_TNAME_FIELD_NUMBER = 14;
	private volatile Object sTname_;
	public static final int S_TID_FIELD_NUMBER = 15;
	private volatile Object sTid_;
	public static final int S_DURATION_FIELD_NUMBER = 16;
	private volatile Object sDuration_;
	public static final int S_USER_FIELD_NUMBER = 17;
	private volatile Object sUser_;
	public static final int S_BID_FIELD_NUMBER = 18;
	private volatile Object sBid_;
	public static final int S_BER_FIELD_NUMBER = 19;
	private volatile Object sBer_;
	public static final int S_ISERROR_FIELD_NUMBER = 20;
	private volatile Object sIsError_;
	public static final int SAME_ORIGIN_FIELD_NUMBER = 21;
	private boolean sameOrigin_;
	public static final int JS_ERROR_FIELD_NUMBER = 22;
	private boolean jsError_;
	public static final int STATE_FIELD_NUMBER = 23;
	private int state_;

	private Iframe(GeneratedMessageV3.Builder<?> builder) {
		super(builder);
	}

	private Iframe() {
		this.loadType_ = 0;
		this.src_ = "";
		this.host_ = "";
		this.uri_ = "";
		this.pvid_ = "";
		this.sTname_ = "";
		this.sTid_ = "";
		this.sDuration_ = "";
		this.sUser_ = "";
		this.sBid_ = "";
		this.sBer_ = "";
		this.sIsError_ = "";
		this.state_ = 0;
	}

	protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
		return new Iframe();
	}

	public final UnknownFieldSet getUnknownFields() {
		return this.unknownFields;
	}

	private Iframe(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
				case 8:
					int rawValue = input.readEnum();

					this.loadType_ = rawValue;
					break;
				case 18:
					String s = input.readStringRequireUtf8();

					this.src_ = s;
					break;
				case 26:
					this.host_ = input.readStringRequireUtf8();
					break;
				case 34:
					this.uri_ = input.readStringRequireUtf8();
					break;
				case 42:
					this.pvid_ = input.readStringRequireUtf8();
					break;
				case 48:
					this.start_ = input.readInt64();
					break;
				case 56:
					this.end_ = input.readInt64();
					break;
				case 64:
					this.duration_ = input.readInt32();
					break;
				case 72:
					this.firstPaintTime_ = input.readInt32();
					break;
				case 80:
					this.firstScreenTime_ = input.readInt32();
					break;
				case 88:
					this.domReadyTime_ = input.readInt32();
					break;
				case 96:
					this.sAppId_ = input.readInt32();
					break;
				case 104:
					this.sAppInstanceId_ = input.readInt32();
					break;
				case 114:
					this.sTname_ = input.readStringRequireUtf8();
					break;
				case 122:
					this.sTid_ = input.readStringRequireUtf8();
					break;
				case 130:
					this.sDuration_ = input.readStringRequireUtf8();
					break;
				case 138:
					this.sUser_ = input.readStringRequireUtf8();
					break;
				case 146:
					this.sBid_ = input.readStringRequireUtf8();
					break;
				case 154:
					this.sBer_ = input.readStringRequireUtf8();
					break;
				case 162:
					this.sIsError_ = input.readStringRequireUtf8();
					break;
				case 168:
					this.sameOrigin_ = input.readBool();
					break;
				case 176:
					this.jsError_ = input.readBool();
					break;
				case 184:
					this.state_ = input.readEnum();
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
		return ActionOuterClass.internal_static_com_tingyun_proto_Iframe_descriptor;
	}

	protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
		return ActionOuterClass.internal_static_com_tingyun_proto_Iframe_fieldAccessorTable.ensureFieldAccessorsInitialized(Iframe.class, Builder.class);
	}

	public static enum LoadType implements ProtocolMessageEnum {
		LOAD(0), RELOAD(1), UNRECOGNIZED(-1);

		public static final int LOAD_VALUE = 0;
		public static final int RELOAD_VALUE = 1;

		public final int getNumber() {
			if (this == UNRECOGNIZED) {
				throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
			}
			return this.value;
		}

		@Deprecated
		public static LoadType valueOf(int value) {
			return forNumber(value);
		}

		public static LoadType forNumber(int value) {
			switch (value) {
			case 0:
				return LOAD;
			case 1:
				return RELOAD;
			}
			return null;
		}

		public static Internal.EnumLiteMap<LoadType> internalGetValueMap() {
			return internalValueMap;
		}

		private static final Internal.EnumLiteMap<LoadType> internalValueMap = new Internal.EnumLiteMap() {
			public Iframe.LoadType findValueByNumber(int number) {
				return Iframe.LoadType.forNumber(number);
			}
		};

		public final Descriptors.EnumValueDescriptor getValueDescriptor() {
			return (Descriptors.EnumValueDescriptor) getDescriptor().getValues().get(ordinal());
		}

		public final Descriptors.EnumDescriptor getDescriptorForType() {
			return getDescriptor();
		}

		public static final Descriptors.EnumDescriptor getDescriptor() {
			return (Descriptors.EnumDescriptor) Iframe.getDescriptor().getEnumTypes().get(0);
		}

		private static final LoadType[] VALUES = values();
		private final int value;

		public static LoadType valueOf(Descriptors.EnumValueDescriptor desc) {
			if (desc.getType() != getDescriptor()) {
				throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
			}
			if (desc.getIndex() == -1) {
				return UNRECOGNIZED;
			}
			return VALUES[desc.getIndex()];
		}

		private LoadType(int value) {
			this.value = value;
		}
	}

	public int getLoadTypeValue() {
		return this.loadType_;
	}

	public LoadType getLoadType() {
		LoadType result = LoadType.valueOf(this.loadType_);
		return result == null ? LoadType.UNRECOGNIZED : result;
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

	public String getHost() {
		Object ref = this.host_;
		if ((ref instanceof String)) {
			return (String) ref;
		}
		ByteString bs = (ByteString) ref;

		String s = bs.toStringUtf8();
		this.host_ = s;
		return s;
	}

	public ByteString getHostBytes() {
		Object ref = this.host_;
		if ((ref instanceof String)) {
			ByteString b = ByteString.copyFromUtf8((String) ref);

			this.host_ = b;
			return b;
		}
		return (ByteString) ref;
	}

	public String getUri() {
		Object ref = this.uri_;
		if ((ref instanceof String)) {
			return (String) ref;
		}
		ByteString bs = (ByteString) ref;

		String s = bs.toStringUtf8();
		this.uri_ = s;
		return s;
	}

	public ByteString getUriBytes() {
		Object ref = this.uri_;
		if ((ref instanceof String)) {
			ByteString b = ByteString.copyFromUtf8((String) ref);

			this.uri_ = b;
			return b;
		}
		return (ByteString) ref;
	}

	public String getPvid() {
		Object ref = this.pvid_;
		if ((ref instanceof String)) {
			return (String) ref;
		}
		ByteString bs = (ByteString) ref;

		String s = bs.toStringUtf8();
		this.pvid_ = s;
		return s;
	}

	public ByteString getPvidBytes() {
		Object ref = this.pvid_;
		if ((ref instanceof String)) {
			ByteString b = ByteString.copyFromUtf8((String) ref);

			this.pvid_ = b;
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

	public int getDuration() {
		return this.duration_;
	}

	public int getFirstPaintTime() {
		return this.firstPaintTime_;
	}

	public int getFirstScreenTime() {
		return this.firstScreenTime_;
	}

	public int getDomReadyTime() {
		return this.domReadyTime_;
	}

	public int getSAppId() {
		return this.sAppId_;
	}

	public int getSAppInstanceId() {
		return this.sAppInstanceId_;
	}

	public String getSTname() {
		Object ref = this.sTname_;
		if ((ref instanceof String)) {
			return (String) ref;
		}
		ByteString bs = (ByteString) ref;

		String s = bs.toStringUtf8();
		this.sTname_ = s;
		return s;
	}

	public ByteString getSTnameBytes() {
		Object ref = this.sTname_;
		if ((ref instanceof String)) {
			ByteString b = ByteString.copyFromUtf8((String) ref);

			this.sTname_ = b;
			return b;
		}
		return (ByteString) ref;
	}

	public String getSTid() {
		Object ref = this.sTid_;
		if ((ref instanceof String)) {
			return (String) ref;
		}
		ByteString bs = (ByteString) ref;

		String s = bs.toStringUtf8();
		this.sTid_ = s;
		return s;
	}

	public ByteString getSTidBytes() {
		Object ref = this.sTid_;
		if ((ref instanceof String)) {
			ByteString b = ByteString.copyFromUtf8((String) ref);

			this.sTid_ = b;
			return b;
		}
		return (ByteString) ref;
	}

	public String getSDuration() {
		Object ref = this.sDuration_;
		if ((ref instanceof String)) {
			return (String) ref;
		}
		ByteString bs = (ByteString) ref;

		String s = bs.toStringUtf8();
		this.sDuration_ = s;
		return s;
	}

	public ByteString getSDurationBytes() {
		Object ref = this.sDuration_;
		if ((ref instanceof String)) {
			ByteString b = ByteString.copyFromUtf8((String) ref);

			this.sDuration_ = b;
			return b;
		}
		return (ByteString) ref;
	}

	public String getSUser() {
		Object ref = this.sUser_;
		if ((ref instanceof String)) {
			return (String) ref;
		}
		ByteString bs = (ByteString) ref;

		String s = bs.toStringUtf8();
		this.sUser_ = s;
		return s;
	}

	public ByteString getSUserBytes() {
		Object ref = this.sUser_;
		if ((ref instanceof String)) {
			ByteString b = ByteString.copyFromUtf8((String) ref);

			this.sUser_ = b;
			return b;
		}
		return (ByteString) ref;
	}

	public String getSBid() {
		Object ref = this.sBid_;
		if ((ref instanceof String)) {
			return (String) ref;
		}
		ByteString bs = (ByteString) ref;

		String s = bs.toStringUtf8();
		this.sBid_ = s;
		return s;
	}

	public ByteString getSBidBytes() {
		Object ref = this.sBid_;
		if ((ref instanceof String)) {
			ByteString b = ByteString.copyFromUtf8((String) ref);

			this.sBid_ = b;
			return b;
		}
		return (ByteString) ref;
	}

	public String getSBer() {
		Object ref = this.sBer_;
		if ((ref instanceof String)) {
			return (String) ref;
		}
		ByteString bs = (ByteString) ref;

		String s = bs.toStringUtf8();
		this.sBer_ = s;
		return s;
	}

	public ByteString getSBerBytes() {
		Object ref = this.sBer_;
		if ((ref instanceof String)) {
			ByteString b = ByteString.copyFromUtf8((String) ref);

			this.sBer_ = b;
			return b;
		}
		return (ByteString) ref;
	}

	public String getSIsError() {
		Object ref = this.sIsError_;
		if ((ref instanceof String)) {
			return (String) ref;
		}
		ByteString bs = (ByteString) ref;

		String s = bs.toStringUtf8();
		this.sIsError_ = s;
		return s;
	}

	public ByteString getSIsErrorBytes() {
		Object ref = this.sIsError_;
		if ((ref instanceof String)) {
			ByteString b = ByteString.copyFromUtf8((String) ref);

			this.sIsError_ = b;
			return b;
		}
		return (ByteString) ref;
	}

	public boolean getSameOrigin() {
		return this.sameOrigin_;
	}

	public boolean getJsError() {
		return this.jsError_;
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
		if (this.loadType_ != LoadType.LOAD.getNumber()) {
			output.writeEnum(1, this.loadType_);
		}
		if (!getSrcBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 2, this.src_);
		}
		if (!getHostBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 3, this.host_);
		}
		if (!getUriBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 4, this.uri_);
		}
		if (!getPvidBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 5, this.pvid_);
		}
		if (this.start_ != 0L) {
			output.writeInt64(6, this.start_);
		}
		if (this.end_ != 0L) {
			output.writeInt64(7, this.end_);
		}
		if (this.duration_ != 0) {
			output.writeInt32(8, this.duration_);
		}
		if (this.firstPaintTime_ != 0) {
			output.writeInt32(9, this.firstPaintTime_);
		}
		if (this.firstScreenTime_ != 0) {
			output.writeInt32(10, this.firstScreenTime_);
		}
		if (this.domReadyTime_ != 0) {
			output.writeInt32(11, this.domReadyTime_);
		}
		if (this.sAppId_ != 0) {
			output.writeInt32(12, this.sAppId_);
		}
		if (this.sAppInstanceId_ != 0) {
			output.writeInt32(13, this.sAppInstanceId_);
		}
		if (!getSTnameBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 14, this.sTname_);
		}
		if (!getSTidBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 15, this.sTid_);
		}
		if (!getSDurationBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 16, this.sDuration_);
		}
		if (!getSUserBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 17, this.sUser_);
		}
		if (!getSBidBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 18, this.sBid_);
		}
		if (!getSBerBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 19, this.sBer_);
		}
		if (!getSIsErrorBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 20, this.sIsError_);
		}
		if (this.sameOrigin_) {
			output.writeBool(21, this.sameOrigin_);
		}
		if (this.jsError_) {
			output.writeBool(22, this.jsError_);
		}
		if (this.state_ != ActionState.FINISH.getNumber()) {
			output.writeEnum(23, this.state_);
		}
		this.unknownFields.writeTo(output);
	}

	public int getSerializedSize() {
		int size = this.memoizedSize;
		if (size != -1) {
			return size;
		}
		size = 0;
		if (this.loadType_ != LoadType.LOAD.getNumber()) {
			size = size + CodedOutputStream.computeEnumSize(1, this.loadType_);
		}
		if (!getSrcBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(2, this.src_);
		}
		if (!getHostBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(3, this.host_);
		}
		if (!getUriBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(4, this.uri_);
		}
		if (!getPvidBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(5, this.pvid_);
		}
		if (this.start_ != 0L) {
			size = size + CodedOutputStream.computeInt64Size(6, this.start_);
		}
		if (this.end_ != 0L) {
			size = size + CodedOutputStream.computeInt64Size(7, this.end_);
		}
		if (this.duration_ != 0) {
			size = size + CodedOutputStream.computeInt32Size(8, this.duration_);
		}
		if (this.firstPaintTime_ != 0) {
			size = size + CodedOutputStream.computeInt32Size(9, this.firstPaintTime_);
		}
		if (this.firstScreenTime_ != 0) {
			size = size + CodedOutputStream.computeInt32Size(10, this.firstScreenTime_);
		}
		if (this.domReadyTime_ != 0) {
			size = size + CodedOutputStream.computeInt32Size(11, this.domReadyTime_);
		}
		if (this.sAppId_ != 0) {
			size = size + CodedOutputStream.computeInt32Size(12, this.sAppId_);
		}
		if (this.sAppInstanceId_ != 0) {
			size = size + CodedOutputStream.computeInt32Size(13, this.sAppInstanceId_);
		}
		if (!getSTnameBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(14, this.sTname_);
		}
		if (!getSTidBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(15, this.sTid_);
		}
		if (!getSDurationBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(16, this.sDuration_);
		}
		if (!getSUserBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(17, this.sUser_);
		}
		if (!getSBidBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(18, this.sBid_);
		}
		if (!getSBerBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(19, this.sBer_);
		}
		if (!getSIsErrorBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(20, this.sIsError_);
		}
		if (this.sameOrigin_) {
			size = size + CodedOutputStream.computeBoolSize(21, this.sameOrigin_);
		}
		if (this.jsError_) {
			size = size + CodedOutputStream.computeBoolSize(22, this.jsError_);
		}
		if (this.state_ != ActionState.FINISH.getNumber()) {
			size = size + CodedOutputStream.computeEnumSize(23, this.state_);
		}
		size += this.unknownFields.getSerializedSize();
		this.memoizedSize = size;
		return size;
	}

	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (!(obj instanceof Iframe)) {
			return super.equals(obj);
		}
		Iframe other = (Iframe) obj;
		if (this.loadType_ != other.loadType_) {
			return false;
		}
		if (!getSrc().equals(other.getSrc())) {
			return false;
		}
		if (!getHost().equals(other.getHost())) {
			return false;
		}
		if (!getUri().equals(other.getUri())) {
			return false;
		}
		if (!getPvid().equals(other.getPvid())) {
			return false;
		}
		if (getStart() != other.getStart()) {
			return false;
		}
		if (getEnd() != other.getEnd()) {
			return false;
		}
		if (getDuration() != other.getDuration()) {
			return false;
		}
		if (getFirstPaintTime() != other.getFirstPaintTime()) {
			return false;
		}
		if (getFirstScreenTime() != other.getFirstScreenTime()) {
			return false;
		}
		if (getDomReadyTime() != other.getDomReadyTime()) {
			return false;
		}
		if (getSAppId() != other.getSAppId()) {
			return false;
		}
		if (getSAppInstanceId() != other.getSAppInstanceId()) {
			return false;
		}
		if (!getSTname().equals(other.getSTname())) {
			return false;
		}
		if (!getSTid().equals(other.getSTid())) {
			return false;
		}
		if (!getSDuration().equals(other.getSDuration())) {
			return false;
		}
		if (!getSUser().equals(other.getSUser())) {
			return false;
		}
		if (!getSBid().equals(other.getSBid())) {
			return false;
		}
		if (!getSBer().equals(other.getSBer())) {
			return false;
		}
		if (!getSIsError().equals(other.getSIsError())) {
			return false;
		}
		if (getSameOrigin() != other.getSameOrigin()) {
			return false;
		}
		if (getJsError() != other.getJsError()) {
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
		hash = 53 * hash + this.loadType_;
		hash = 37 * hash + 2;
		hash = 53 * hash + getSrc().hashCode();
		hash = 37 * hash + 3;
		hash = 53 * hash + getHost().hashCode();
		hash = 37 * hash + 4;
		hash = 53 * hash + getUri().hashCode();
		hash = 37 * hash + 5;
		hash = 53 * hash + getPvid().hashCode();
		hash = 37 * hash + 6;
		hash = 53 * hash + Internal.hashLong(getStart());
		hash = 37 * hash + 7;
		hash = 53 * hash + Internal.hashLong(getEnd());
		hash = 37 * hash + 8;
		hash = 53 * hash + getDuration();
		hash = 37 * hash + 9;
		hash = 53 * hash + getFirstPaintTime();
		hash = 37 * hash + 10;
		hash = 53 * hash + getFirstScreenTime();
		hash = 37 * hash + 11;
		hash = 53 * hash + getDomReadyTime();
		hash = 37 * hash + 12;
		hash = 53 * hash + getSAppId();
		hash = 37 * hash + 13;
		hash = 53 * hash + getSAppInstanceId();
		hash = 37 * hash + 14;
		hash = 53 * hash + getSTname().hashCode();
		hash = 37 * hash + 15;
		hash = 53 * hash + getSTid().hashCode();
		hash = 37 * hash + 16;
		hash = 53 * hash + getSDuration().hashCode();
		hash = 37 * hash + 17;
		hash = 53 * hash + getSUser().hashCode();
		hash = 37 * hash + 18;
		hash = 53 * hash + getSBid().hashCode();
		hash = 37 * hash + 19;
		hash = 53 * hash + getSBer().hashCode();
		hash = 37 * hash + 20;
		hash = 53 * hash + getSIsError().hashCode();
		hash = 37 * hash + 21;
		hash = 53 * hash + Internal.hashBoolean(getSameOrigin());
		hash = 37 * hash + 22;
		hash = 53 * hash + Internal.hashBoolean(getJsError());
		hash = 37 * hash + 23;
		hash = 53 * hash + this.state_;
		hash = 29 * hash + this.unknownFields.hashCode();
		this.memoizedHashCode = hash;
		return hash;
	}

	public static Iframe parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
		return (Iframe) PARSER.parseFrom(data);
	}

	public static Iframe parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
		return (Iframe) PARSER.parseFrom(data, extensionRegistry);
	}

	public static Iframe parseFrom(ByteString data) throws InvalidProtocolBufferException {
		return (Iframe) PARSER.parseFrom(data);
	}

	public static Iframe parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
		return (Iframe) PARSER.parseFrom(data, extensionRegistry);
	}

	public static Iframe parseFrom(byte[] data) throws InvalidProtocolBufferException {
		return (Iframe) PARSER.parseFrom(data);
	}

	public static Iframe parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
		return (Iframe) PARSER.parseFrom(data, extensionRegistry);
	}

	public static Iframe parseFrom(InputStream input) throws IOException {
		return (Iframe) GeneratedMessageV3.parseWithIOException(PARSER, input);
	}

	public static Iframe parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
		return (Iframe) GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
	}

	public static Iframe parseDelimitedFrom(InputStream input) throws IOException {
		return (Iframe) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
	}

	public static Iframe parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
		return (Iframe) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
	}

	public static Iframe parseFrom(CodedInputStream input) throws IOException {
		return (Iframe) GeneratedMessageV3.parseWithIOException(PARSER, input);
	}

	public static Iframe parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
		return (Iframe) GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
	}

	public Builder newBuilderForType() {
		return newBuilder();
	}

	public static Builder newBuilder() {
		return DEFAULT_INSTANCE.toBuilder();
	}

	public static Builder newBuilder(Iframe prototype) {
		return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
	}

	public Builder toBuilder() {
		return this == DEFAULT_INSTANCE ? new Builder(null) : new Builder(null).mergeFrom(this);
	}

	protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
		Builder builder = new Builder(parent);
		return builder;
	}

	public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements IframeOrBuilder {
		public static final Descriptors.Descriptor getDescriptor() {
			return ActionOuterClass.internal_static_com_tingyun_proto_Iframe_descriptor;
		}

		protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
			return ActionOuterClass.internal_static_com_tingyun_proto_Iframe_fieldAccessorTable.ensureFieldAccessorsInitialized(Iframe.class, Builder.class);
		}

		private Builder() {
			maybeForceBuilderInitialization();
		}

		private Builder(GeneratedMessageV3.BuilderParent parent) {
			super();
			maybeForceBuilderInitialization();
		}

		private void maybeForceBuilderInitialization() {
			if (Iframe.alwaysUseFieldBuilders) {
			}
		}

		public Builder clear() {
			super.clear();
			this.loadType_ = 0;

			this.src_ = "";

			this.host_ = "";

			this.uri_ = "";

			this.pvid_ = "";

			this.start_ = 0L;

			this.end_ = 0L;

			this.duration_ = 0;

			this.firstPaintTime_ = 0;

			this.firstScreenTime_ = 0;

			this.domReadyTime_ = 0;

			this.sAppId_ = 0;

			this.sAppInstanceId_ = 0;

			this.sTname_ = "";

			this.sTid_ = "";

			this.sDuration_ = "";

			this.sUser_ = "";

			this.sBid_ = "";

			this.sBer_ = "";

			this.sIsError_ = "";

			this.sameOrigin_ = false;

			this.jsError_ = false;

			this.state_ = 0;

			return this;
		}

		public Descriptors.Descriptor getDescriptorForType() {
			return ActionOuterClass.internal_static_com_tingyun_proto_Iframe_descriptor;
		}

		public Iframe getDefaultInstanceForType() {
			return Iframe.getDefaultInstance();
		}

		public Iframe build() {
			Iframe result = buildPartial();
			if (!result.isInitialized()) {
				throw newUninitializedMessageException(result);
			}
			return result;
		}

		public Iframe buildPartial() {
			Iframe result = new Iframe(this);
			result.loadType_ = this.loadType_;
			result.src_ = this.src_;
			result.host_ = this.host_;
			result.uri_ = this.uri_;
			result.pvid_ = this.pvid_;
			result.start_ = this.start_;
			result.end_ = this.end_;
			result.duration_ = this.duration_;
			result.firstPaintTime_ = this.firstPaintTime_;
			result.firstScreenTime_ = this.firstScreenTime_;
			result.domReadyTime_ = this.domReadyTime_;
			result.sAppId_ = this.sAppId_;
			result.sAppInstanceId_ = this.sAppInstanceId_;
			result.sTname_ = this.sTname_;
			result.sTid_ = this.sTid_;
			result.sDuration_ = this.sDuration_;
			result.sUser_ = this.sUser_;
			result.sBid_ = this.sBid_;
			result.sBer_ = this.sBer_;
			result.sIsError_ = this.sIsError_;
			result.sameOrigin_ = this.sameOrigin_;
			result.jsError_ = this.jsError_;
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
			if ((other instanceof Iframe)) {
				return mergeFrom((Iframe) other);
			}
			super.mergeFrom(other);
			return this;
		}

		public Builder mergeFrom(Iframe other) {
			if (other == Iframe.getDefaultInstance()) {
				return this;
			}
			if (other.loadType_ != 0) {
				setLoadTypeValue(other.getLoadTypeValue());
			}
			if (!other.getSrc().isEmpty()) {
				this.src_ = other.src_;
				onChanged();
			}
			if (!other.getHost().isEmpty()) {
				this.host_ = other.host_;
				onChanged();
			}
			if (!other.getUri().isEmpty()) {
				this.uri_ = other.uri_;
				onChanged();
			}
			if (!other.getPvid().isEmpty()) {
				this.pvid_ = other.pvid_;
				onChanged();
			}
			if (other.getStart() != 0L) {
				setStart(other.getStart());
			}
			if (other.getEnd() != 0L) {
				setEnd(other.getEnd());
			}
			if (other.getDuration() != 0) {
				setDuration(other.getDuration());
			}
			if (other.getFirstPaintTime() != 0) {
				setFirstPaintTime(other.getFirstPaintTime());
			}
			if (other.getFirstScreenTime() != 0) {
				setFirstScreenTime(other.getFirstScreenTime());
			}
			if (other.getDomReadyTime() != 0) {
				setDomReadyTime(other.getDomReadyTime());
			}
			if (other.getSAppId() != 0) {
				setSAppId(other.getSAppId());
			}
			if (other.getSAppInstanceId() != 0) {
				setSAppInstanceId(other.getSAppInstanceId());
			}
			if (!other.getSTname().isEmpty()) {
				this.sTname_ = other.sTname_;
				onChanged();
			}
			if (!other.getSTid().isEmpty()) {
				this.sTid_ = other.sTid_;
				onChanged();
			}
			if (!other.getSDuration().isEmpty()) {
				this.sDuration_ = other.sDuration_;
				onChanged();
			}
			if (!other.getSUser().isEmpty()) {
				this.sUser_ = other.sUser_;
				onChanged();
			}
			if (!other.getSBid().isEmpty()) {
				this.sBid_ = other.sBid_;
				onChanged();
			}
			if (!other.getSBer().isEmpty()) {
				this.sBer_ = other.sBer_;
				onChanged();
			}
			if (!other.getSIsError().isEmpty()) {
				this.sIsError_ = other.sIsError_;
				onChanged();
			}
			if (other.getSameOrigin()) {
				setSameOrigin(other.getSameOrigin());
			}
			if (other.getJsError()) {
				setJsError(other.getJsError());
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
			Iframe parsedMessage = null;
			try {
				parsedMessage = (Iframe) Iframe.PARSER.parsePartialFrom(input, extensionRegistry);
			} catch (InvalidProtocolBufferException e) {
				parsedMessage = (Iframe) e.getUnfinishedMessage();
				throw e.unwrapIOException();
			} finally {
				if (parsedMessage != null) {
					mergeFrom(parsedMessage);
				}
			}
			return this;
		}

		private int loadType_ = 0;

		public int getLoadTypeValue() {
			return this.loadType_;
		}

		public Builder setLoadTypeValue(int value) {
			this.loadType_ = value;
			onChanged();
			return this;
		}

		public Iframe.LoadType getLoadType() {
			Iframe.LoadType result = Iframe.LoadType.valueOf(this.loadType_);
			return result == null ? Iframe.LoadType.UNRECOGNIZED : result;
		}

		public Builder setLoadType(Iframe.LoadType value) {
			if (value == null) {
				throw new NullPointerException();
			}
			this.loadType_ = value.getNumber();
			onChanged();
			return this;
		}

		public Builder clearLoadType() {
			this.loadType_ = 0;
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
			this.src_ = Iframe.getDefaultInstance().getSrc();
			onChanged();
			return this;
		}

		public Builder setSrcBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Iframe.checkByteStringIsUtf8(value);

			this.src_ = value;
			onChanged();
			return this;
		}

		private Object host_ = "";

		public String getHost() {
			Object ref = this.host_;
			if (!(ref instanceof String)) {
				ByteString bs = (ByteString) ref;

				String s = bs.toStringUtf8();
				this.host_ = s;
				return s;
			}
			return (String) ref;
		}

		public ByteString getHostBytes() {
			Object ref = this.host_;
			if ((ref instanceof String)) {
				ByteString b = ByteString.copyFromUtf8((String) ref);

				this.host_ = b;
				return b;
			}
			return (ByteString) ref;
		}

		public Builder setHost(String value) {
			if (value == null) {
				throw new NullPointerException();
			}
			this.host_ = value;
			onChanged();
			return this;
		}

		public Builder clearHost() {
			this.host_ = Iframe.getDefaultInstance().getHost();
			onChanged();
			return this;
		}

		public Builder setHostBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Iframe.checkByteStringIsUtf8(value);

			this.host_ = value;
			onChanged();
			return this;
		}

		private Object uri_ = "";

		public String getUri() {
			Object ref = this.uri_;
			if (!(ref instanceof String)) {
				ByteString bs = (ByteString) ref;

				String s = bs.toStringUtf8();
				this.uri_ = s;
				return s;
			}
			return (String) ref;
		}

		public ByteString getUriBytes() {
			Object ref = this.uri_;
			if ((ref instanceof String)) {
				ByteString b = ByteString.copyFromUtf8((String) ref);

				this.uri_ = b;
				return b;
			}
			return (ByteString) ref;
		}

		public Builder setUri(String value) {
			if (value == null) {
				throw new NullPointerException();
			}
			this.uri_ = value;
			onChanged();
			return this;
		}

		public Builder clearUri() {
			this.uri_ = Iframe.getDefaultInstance().getUri();
			onChanged();
			return this;
		}

		public Builder setUriBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Iframe.checkByteStringIsUtf8(value);

			this.uri_ = value;
			onChanged();
			return this;
		}

		private Object pvid_ = "";
		private long start_;
		private long end_;
		private int duration_;
		private int firstPaintTime_;
		private int firstScreenTime_;
		private int domReadyTime_;
		private int sAppId_;
		private int sAppInstanceId_;

		public String getPvid() {
			Object ref = this.pvid_;
			if (!(ref instanceof String)) {
				ByteString bs = (ByteString) ref;

				String s = bs.toStringUtf8();
				this.pvid_ = s;
				return s;
			}
			return (String) ref;
		}

		public ByteString getPvidBytes() {
			Object ref = this.pvid_;
			if ((ref instanceof String)) {
				ByteString b = ByteString.copyFromUtf8((String) ref);

				this.pvid_ = b;
				return b;
			}
			return (ByteString) ref;
		}

		public Builder setPvid(String value) {
			if (value == null) {
				throw new NullPointerException();
			}
			this.pvid_ = value;
			onChanged();
			return this;
		}

		public Builder clearPvid() {
			this.pvid_ = Iframe.getDefaultInstance().getPvid();
			onChanged();
			return this;
		}

		public Builder setPvidBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Iframe.checkByteStringIsUtf8(value);

			this.pvid_ = value;
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

		public int getDuration() {
			return this.duration_;
		}

		public Builder setDuration(int value) {
			this.duration_ = value;
			onChanged();
			return this;
		}

		public Builder clearDuration() {
			this.duration_ = 0;
			onChanged();
			return this;
		}

		public int getFirstPaintTime() {
			return this.firstPaintTime_;
		}

		public Builder setFirstPaintTime(int value) {
			this.firstPaintTime_ = value;
			onChanged();
			return this;
		}

		public Builder clearFirstPaintTime() {
			this.firstPaintTime_ = 0;
			onChanged();
			return this;
		}

		public int getFirstScreenTime() {
			return this.firstScreenTime_;
		}

		public Builder setFirstScreenTime(int value) {
			this.firstScreenTime_ = value;
			onChanged();
			return this;
		}

		public Builder clearFirstScreenTime() {
			this.firstScreenTime_ = 0;
			onChanged();
			return this;
		}

		public int getDomReadyTime() {
			return this.domReadyTime_;
		}

		public Builder setDomReadyTime(int value) {
			this.domReadyTime_ = value;
			onChanged();
			return this;
		}

		public Builder clearDomReadyTime() {
			this.domReadyTime_ = 0;
			onChanged();
			return this;
		}

		public int getSAppId() {
			return this.sAppId_;
		}

		public Builder setSAppId(int value) {
			this.sAppId_ = value;
			onChanged();
			return this;
		}

		public Builder clearSAppId() {
			this.sAppId_ = 0;
			onChanged();
			return this;
		}

		public int getSAppInstanceId() {
			return this.sAppInstanceId_;
		}

		public Builder setSAppInstanceId(int value) {
			this.sAppInstanceId_ = value;
			onChanged();
			return this;
		}

		public Builder clearSAppInstanceId() {
			this.sAppInstanceId_ = 0;
			onChanged();
			return this;
		}

		private Object sTname_ = "";

		public String getSTname() {
			Object ref = this.sTname_;
			if (!(ref instanceof String)) {
				ByteString bs = (ByteString) ref;

				String s = bs.toStringUtf8();
				this.sTname_ = s;
				return s;
			}
			return (String) ref;
		}

		public ByteString getSTnameBytes() {
			Object ref = this.sTname_;
			if ((ref instanceof String)) {
				ByteString b = ByteString.copyFromUtf8((String) ref);

				this.sTname_ = b;
				return b;
			}
			return (ByteString) ref;
		}

		public Builder setSTname(String value) {
			if (value == null) {
				throw new NullPointerException();
			}
			this.sTname_ = value;
			onChanged();
			return this;
		}

		public Builder clearSTname() {
			this.sTname_ = Iframe.getDefaultInstance().getSTname();
			onChanged();
			return this;
		}

		public Builder setSTnameBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Iframe.checkByteStringIsUtf8(value);

			this.sTname_ = value;
			onChanged();
			return this;
		}

		private Object sTid_ = "";

		public String getSTid() {
			Object ref = this.sTid_;
			if (!(ref instanceof String)) {
				ByteString bs = (ByteString) ref;

				String s = bs.toStringUtf8();
				this.sTid_ = s;
				return s;
			}
			return (String) ref;
		}

		public ByteString getSTidBytes() {
			Object ref = this.sTid_;
			if ((ref instanceof String)) {
				ByteString b = ByteString.copyFromUtf8((String) ref);

				this.sTid_ = b;
				return b;
			}
			return (ByteString) ref;
		}

		public Builder setSTid(String value) {
			if (value == null) {
				throw new NullPointerException();
			}
			this.sTid_ = value;
			onChanged();
			return this;
		}

		public Builder clearSTid() {
			this.sTid_ = Iframe.getDefaultInstance().getSTid();
			onChanged();
			return this;
		}

		public Builder setSTidBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Iframe.checkByteStringIsUtf8(value);

			this.sTid_ = value;
			onChanged();
			return this;
		}

		private Object sDuration_ = "";

		public String getSDuration() {
			Object ref = this.sDuration_;
			if (!(ref instanceof String)) {
				ByteString bs = (ByteString) ref;

				String s = bs.toStringUtf8();
				this.sDuration_ = s;
				return s;
			}
			return (String) ref;
		}

		public ByteString getSDurationBytes() {
			Object ref = this.sDuration_;
			if ((ref instanceof String)) {
				ByteString b = ByteString.copyFromUtf8((String) ref);

				this.sDuration_ = b;
				return b;
			}
			return (ByteString) ref;
		}

		public Builder setSDuration(String value) {
			if (value == null) {
				throw new NullPointerException();
			}
			this.sDuration_ = value;
			onChanged();
			return this;
		}

		public Builder clearSDuration() {
			this.sDuration_ = Iframe.getDefaultInstance().getSDuration();
			onChanged();
			return this;
		}

		public Builder setSDurationBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Iframe.checkByteStringIsUtf8(value);

			this.sDuration_ = value;
			onChanged();
			return this;
		}

		private Object sUser_ = "";

		public String getSUser() {
			Object ref = this.sUser_;
			if (!(ref instanceof String)) {
				ByteString bs = (ByteString) ref;

				String s = bs.toStringUtf8();
				this.sUser_ = s;
				return s;
			}
			return (String) ref;
		}

		public ByteString getSUserBytes() {
			Object ref = this.sUser_;
			if ((ref instanceof String)) {
				ByteString b = ByteString.copyFromUtf8((String) ref);

				this.sUser_ = b;
				return b;
			}
			return (ByteString) ref;
		}

		public Builder setSUser(String value) {
			if (value == null) {
				throw new NullPointerException();
			}
			this.sUser_ = value;
			onChanged();
			return this;
		}

		public Builder clearSUser() {
			this.sUser_ = Iframe.getDefaultInstance().getSUser();
			onChanged();
			return this;
		}

		public Builder setSUserBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Iframe.checkByteStringIsUtf8(value);

			this.sUser_ = value;
			onChanged();
			return this;
		}

		private Object sBid_ = "";

		public String getSBid() {
			Object ref = this.sBid_;
			if (!(ref instanceof String)) {
				ByteString bs = (ByteString) ref;

				String s = bs.toStringUtf8();
				this.sBid_ = s;
				return s;
			}
			return (String) ref;
		}

		public ByteString getSBidBytes() {
			Object ref = this.sBid_;
			if ((ref instanceof String)) {
				ByteString b = ByteString.copyFromUtf8((String) ref);

				this.sBid_ = b;
				return b;
			}
			return (ByteString) ref;
		}

		public Builder setSBid(String value) {
			if (value == null) {
				throw new NullPointerException();
			}
			this.sBid_ = value;
			onChanged();
			return this;
		}

		public Builder clearSBid() {
			this.sBid_ = Iframe.getDefaultInstance().getSBid();
			onChanged();
			return this;
		}

		public Builder setSBidBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Iframe.checkByteStringIsUtf8(value);

			this.sBid_ = value;
			onChanged();
			return this;
		}

		private Object sBer_ = "";

		public String getSBer() {
			Object ref = this.sBer_;
			if (!(ref instanceof String)) {
				ByteString bs = (ByteString) ref;

				String s = bs.toStringUtf8();
				this.sBer_ = s;
				return s;
			}
			return (String) ref;
		}

		public ByteString getSBerBytes() {
			Object ref = this.sBer_;
			if ((ref instanceof String)) {
				ByteString b = ByteString.copyFromUtf8((String) ref);

				this.sBer_ = b;
				return b;
			}
			return (ByteString) ref;
		}

		public Builder setSBer(String value) {
			if (value == null) {
				throw new NullPointerException();
			}
			this.sBer_ = value;
			onChanged();
			return this;
		}

		public Builder clearSBer() {
			this.sBer_ = Iframe.getDefaultInstance().getSBer();
			onChanged();
			return this;
		}

		public Builder setSBerBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Iframe.checkByteStringIsUtf8(value);

			this.sBer_ = value;
			onChanged();
			return this;
		}

		private Object sIsError_ = "";
		private boolean sameOrigin_;
		private boolean jsError_;

		public String getSIsError() {
			Object ref = this.sIsError_;
			if (!(ref instanceof String)) {
				ByteString bs = (ByteString) ref;

				String s = bs.toStringUtf8();
				this.sIsError_ = s;
				return s;
			}
			return (String) ref;
		}

		public ByteString getSIsErrorBytes() {
			Object ref = this.sIsError_;
			if ((ref instanceof String)) {
				ByteString b = ByteString.copyFromUtf8((String) ref);

				this.sIsError_ = b;
				return b;
			}
			return (ByteString) ref;
		}

		public Builder setSIsError(String value) {
			if (value == null) {
				throw new NullPointerException();
			}
			this.sIsError_ = value;
			onChanged();
			return this;
		}

		public Builder clearSIsError() {
			this.sIsError_ = Iframe.getDefaultInstance().getSIsError();
			onChanged();
			return this;
		}

		public Builder setSIsErrorBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Iframe.checkByteStringIsUtf8(value);

			this.sIsError_ = value;
			onChanged();
			return this;
		}

		public boolean getSameOrigin() {
			return this.sameOrigin_;
		}

		public Builder setSameOrigin(boolean value) {
			this.sameOrigin_ = value;
			onChanged();
			return this;
		}

		public Builder clearSameOrigin() {
			this.sameOrigin_ = false;
			onChanged();
			return this;
		}

		public boolean getJsError() {
			return this.jsError_;
		}

		public Builder setJsError(boolean value) {
			this.jsError_ = value;
			onChanged();
			return this;
		}

		public Builder clearJsError() {
			this.jsError_ = false;
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

		public final Builder setUnknownFields(UnknownFieldSet unknownFields) {
			return (Builder) super.setUnknownFields(unknownFields);
		}

		public final Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
			return (Builder) super.mergeUnknownFields(unknownFields);
		}
	}

	private static final Iframe DEFAULT_INSTANCE = new Iframe();

	public static Iframe getDefaultInstance() {
		return DEFAULT_INSTANCE;
	}

	private static final Parser<Iframe> PARSER = new AbstractParser() {
		public Iframe parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
			return new Iframe(input, extensionRegistry);
		}
	};

	public static Parser<Iframe> parser() {
		return PARSER;
	}

	public Parser<Iframe> getParserForType() {
		return PARSER;
	}

	public Iframe getDefaultInstanceForType() {
		return DEFAULT_INSTANCE;
	}
}
