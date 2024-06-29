package com.unicom.bean;

import com.google.protobuf.*;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pf extends GeneratedMessageV3 implements PfOrBuilder {

	private static final long serialVersionUID = 0L;
	public static final int TRACE_TYPE_FIELD_NUMBER = 1;
	private int traceType_;
	public static final int TRACE_STATUS_FIELD_NUMBER = 2;
	private int traceStatus_;
	public static final int HOST_FIELD_NUMBER = 3;
	private volatile Object host_;
	public static final int URI_FIELD_NUMBER = 4;
	private volatile Object uri_;
	public static final int NAVIGATION_START_FIELD_NUMBER = 5;
	private long navigationStart_;
	public static final int DURATION_FIELD_NUMBER = 6;
	private int duration_;
	public static final int FIRST_PAINT_TIME_FIELD_NUMBER = 7;
	private int firstPaintTime_;
	public static final int FIRST_SCREEN_TIME_FIELD_NUMBER = 8;
	private int firstScreenTime_;
	public static final int DOM_READY_TIME_FIELD_NUMBER = 9;
	private int domReadyTime_;
	public static final int HTML_LOAD_TIME_FIELD_NUMBER = 10;
	private int htmlLoadTime_;
	public static final int PAGE_RENDER_TIME_FIELD_NUMBER = 11;
	private int pageRenderTime_;
	public static final int REQUEST_TIME_FIELD_NUMBER = 12;
	private int requestTime_;
	public static final int APPLICATION_SERVER_TIME_FIELD_NUMBER = 13;
	private int applicationServerTime_;
	public static final int JS_ERROR_FIELD_NUMBER = 14;
	private boolean jsError_;
	public static final int FETCH_START_FIELD_NUMBER = 15;
	private long fetchStart_;
	public static final int STATE_FIELD_NUMBER = 16;
	private int state_;
	public static final int TRACE_ID_FIELD_NUMBER = 17;
	private volatile Object traceId_;
	public static final int S_APP_ID_FIELD_NUMBER = 18;
	private int sAppId_;
	public static final int S_APP_INSTANCE_ID_FIELD_NUMBER = 19;
	private int sAppInstanceId_;
	public static final int S_TNAME_FIELD_NUMBER = 20;
	private volatile Object sTname_;
	public static final int S_TID_FIELD_NUMBER = 21;
	private volatile Object sTid_;
	public static final int S_DURATION_FIELD_NUMBER = 23;
	private volatile Object sDuration_;
	public static final int S_USER_FIELD_NUMBER = 24;
	private volatile Object sUser_;
	public static final int S_BID_FIELD_NUMBER = 25;
	private volatile Object sBid_;
	public static final int S_BER_FIELD_NUMBER = 26;
	private volatile Object sBer_;
	public static final int S_ISERROR_FIELD_NUMBER = 27;
	private volatile Object sIsError_;
	public static final int OPERA_PARAM_FIELD_NUMBER = 28;
	private volatile Object operaParam_;
	public static final int OPERA_ALL_PARAM_FIELD_NUMBER = 29;
	private volatile Object operaAllParam_;
	public static final int AJAXES_FIELD_NUMBER = 30;
	private List<Ajax> ajaxes_;
	public static final int IFRAMES_FIELD_NUMBER = 31;
	private List<Iframe> iframes_;
	public static final int PAGE_STAY_TIME_FIELD_NUMBER = 32;
	private int pageStayTime_;
	public static final int SUB_TYPE_FIELD_NUMBER = 33;
	private volatile Object subType_;

	private Pf(GeneratedMessageV3.Builder<?> builder) {
		super(builder);
	}

	private Pf() {
		this.host_ = "";
		this.uri_ = "";
		this.state_ = 0;
		this.traceId_ = "";
		this.sTname_ = "";
		this.sTid_ = "";
		this.sDuration_ = "";
		this.sUser_ = "";
		this.sBid_ = "";
		this.sBer_ = "";
		this.sIsError_ = "";
		this.operaParam_ = "";
		this.operaAllParam_ = "";
		this.ajaxes_ = Collections.emptyList();
		this.iframes_ = Collections.emptyList();
		this.subType_ = "";
	}

	protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
		return new Pf();
	}

	public final UnknownFieldSet getUnknownFields() {
		return this.unknownFields;
	}

	private Pf(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
					this.traceType_ = input.readInt32();
					break;
				case 16:
					this.traceStatus_ = input.readInt32();
					break;
				case 26:
					this.host_ = input.readStringRequireUtf8();
					break;
				case 34:
					this.uri_ = input.readStringRequireUtf8();
					break;
				case 40:
					this.navigationStart_ = input.readInt64();
					break;
				case 48:
					this.duration_ = input.readInt32();
					break;
				case 56:
					this.firstPaintTime_ = input.readInt32();
					break;
				case 64:
					this.firstScreenTime_ = input.readInt32();
					break;
				case 72:
					this.domReadyTime_ = input.readInt32();
					break;
				case 80:
					this.htmlLoadTime_ = input.readInt32();
					break;
				case 88:
					this.pageRenderTime_ = input.readInt32();
					break;
				case 96:
					this.requestTime_ = input.readInt32();
					break;
				case 104:
					this.applicationServerTime_ = input.readInt32();
					break;
				case 112:
					this.jsError_ = input.readBool();
					break;
				case 120:
					this.fetchStart_ = input.readInt64();
					break;
				case 128:
					int rawValue = input.readEnum();

					this.state_ = rawValue;
					break;
				case 138:
					this.traceId_ = input.readStringRequireUtf8();
					break;
				case 144:
					this.sAppId_ = input.readInt32();
					break;
				case 152:
					this.sAppInstanceId_ = input.readInt32();
					break;
				case 162:
					this.sTname_ = input.readStringRequireUtf8();
					break;
				case 170:
					this.sTid_ = input.readStringRequireUtf8();
					break;
				case 186:
					this.sDuration_ = input.readStringRequireUtf8();
					break;
				case 194:
					this.sUser_ = input.readStringRequireUtf8();
					break;
				case 202:
					this.sBid_ = input.readStringRequireUtf8();
					break;
				case 210:
					this.sBer_ = input.readStringRequireUtf8();
					break;
				case 218:
					this.sIsError_ = input.readStringRequireUtf8();
					break;
				case 226:
					this.operaParam_ = input.readStringRequireUtf8();
					break;
				case 234:
					this.operaAllParam_ = input.readStringRequireUtf8();
					break;
				case 242:
					if ((mutable_bitField0_ & 0x1) == 0) {
						this.ajaxes_ = new ArrayList();
						mutable_bitField0_ |= 0x1;
					}
					this.ajaxes_.add(input.readMessage(Ajax.parser(), extensionRegistry));
					break;
				case 250:
					if ((mutable_bitField0_ & 0x2) == 0) {
						this.iframes_ = new ArrayList();
						mutable_bitField0_ |= 0x2;
					}
					this.iframes_.add(input.readMessage(Iframe.parser(), extensionRegistry));
					break;
				case 256:
					this.pageStayTime_ = input.readInt32();
					break;
				case 266:
					String s = input.readStringRequireUtf8();

					this.subType_ = s;
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
				this.iframes_ = Collections.unmodifiableList(this.iframes_);
			}
			this.unknownFields = unknownFields.build();
			makeExtensionsImmutable();
		}
	}

	public static final Descriptors.Descriptor getDescriptor() {
		return ActionOuterClass.internal_static_com_tingyun_proto_Pf_descriptor;
	}

	protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
		return ActionOuterClass.internal_static_com_tingyun_proto_Pf_fieldAccessorTable.ensureFieldAccessorsInitialized(Pf.class, Builder.class);
	}

	public int getTraceType() {
		return this.traceType_;
	}

	public int getTraceStatus() {
		return this.traceStatus_;
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

	public long getNavigationStart() {
		return this.navigationStart_;
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

	public int getHtmlLoadTime() {
		return this.htmlLoadTime_;
	}

	public int getPageRenderTime() {
		return this.pageRenderTime_;
	}

	public int getRequestTime() {
		return this.requestTime_;
	}

	public int getApplicationServerTime() {
		return this.applicationServerTime_;
	}

	public boolean getJsError() {
		return this.jsError_;
	}

	public long getFetchStart() {
		return this.fetchStart_;
	}

	public int getStateValue() {
		return this.state_;
	}

	public ActionState getState() {
		ActionState result = ActionState.valueOf(this.state_);
		return result == null ? ActionState.UNRECOGNIZED : result;
	}

	public String getTraceId() {
		Object ref = this.traceId_;
		if ((ref instanceof String)) {
			return (String) ref;
		}
		ByteString bs = (ByteString) ref;

		String s = bs.toStringUtf8();
		this.traceId_ = s;
		return s;
	}

	public ByteString getTraceIdBytes() {
		Object ref = this.traceId_;
		if ((ref instanceof String)) {
			ByteString b = ByteString.copyFromUtf8((String) ref);

			this.traceId_ = b;
			return b;
		}
		return (ByteString) ref;
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

	public String getOperaParam() {
		Object ref = this.operaParam_;
		if ((ref instanceof String)) {
			return (String) ref;
		}
		ByteString bs = (ByteString) ref;

		String s = bs.toStringUtf8();
		this.operaParam_ = s;
		return s;
	}

	public ByteString getOperaParamBytes() {
		Object ref = this.operaParam_;
		if ((ref instanceof String)) {
			ByteString b = ByteString.copyFromUtf8((String) ref);

			this.operaParam_ = b;
			return b;
		}
		return (ByteString) ref;
	}

	public String getOperaAllParam() {
		Object ref = this.operaAllParam_;
		if ((ref instanceof String)) {
			return (String) ref;
		}
		ByteString bs = (ByteString) ref;

		String s = bs.toStringUtf8();
		this.operaAllParam_ = s;
		return s;
	}

	public ByteString getOperaAllParamBytes() {
		Object ref = this.operaAllParam_;
		if ((ref instanceof String)) {
			ByteString b = ByteString.copyFromUtf8((String) ref);

			this.operaAllParam_ = b;
			return b;
		}
		return (ByteString) ref;
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

	public int getPageStayTime() {
		return this.pageStayTime_;
	}

	public String getSubType() {
		Object ref = this.subType_;
		if ((ref instanceof String)) {
			return (String) ref;
		}
		ByteString bs = (ByteString) ref;

		String s = bs.toStringUtf8();
		this.subType_ = s;
		return s;
	}

	public ByteString getSubTypeBytes() {
		Object ref = this.subType_;
		if ((ref instanceof String)) {
			ByteString b = ByteString.copyFromUtf8((String) ref);

			this.subType_ = b;
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
		if (this.traceType_ != 0) {
			output.writeInt32(1, this.traceType_);
		}
		if (this.traceStatus_ != 0) {
			output.writeInt32(2, this.traceStatus_);
		}
		if (!getHostBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 3, this.host_);
		}
		if (!getUriBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 4, this.uri_);
		}
		if (this.navigationStart_ != 0L) {
			output.writeInt64(5, this.navigationStart_);
		}
		if (this.duration_ != 0) {
			output.writeInt32(6, this.duration_);
		}
		if (this.firstPaintTime_ != 0) {
			output.writeInt32(7, this.firstPaintTime_);
		}
		if (this.firstScreenTime_ != 0) {
			output.writeInt32(8, this.firstScreenTime_);
		}
		if (this.domReadyTime_ != 0) {
			output.writeInt32(9, this.domReadyTime_);
		}
		if (this.htmlLoadTime_ != 0) {
			output.writeInt32(10, this.htmlLoadTime_);
		}
		if (this.pageRenderTime_ != 0) {
			output.writeInt32(11, this.pageRenderTime_);
		}
		if (this.requestTime_ != 0) {
			output.writeInt32(12, this.requestTime_);
		}
		if (this.applicationServerTime_ != 0) {
			output.writeInt32(13, this.applicationServerTime_);
		}
		if (this.jsError_) {
			output.writeBool(14, this.jsError_);
		}
		if (this.fetchStart_ != 0L) {
			output.writeInt64(15, this.fetchStart_);
		}
		if (this.state_ != ActionState.FINISH.getNumber()) {
			output.writeEnum(16, this.state_);
		}
		if (!getTraceIdBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 17, this.traceId_);
		}
		if (this.sAppId_ != 0) {
			output.writeInt32(18, this.sAppId_);
		}
		if (this.sAppInstanceId_ != 0) {
			output.writeInt32(19, this.sAppInstanceId_);
		}
		if (!getSTnameBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 20, this.sTname_);
		}
		if (!getSTidBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 21, this.sTid_);
		}
		if (!getSDurationBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 23, this.sDuration_);
		}
		if (!getSUserBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 24, this.sUser_);
		}
		if (!getSBidBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 25, this.sBid_);
		}
		if (!getSBerBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 26, this.sBer_);
		}
		if (!getSIsErrorBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 27, this.sIsError_);
		}
		if (!getOperaParamBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 28, this.operaParam_);
		}
		if (!getOperaAllParamBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 29, this.operaAllParam_);
		}
		for (int i = 0; i < this.ajaxes_.size(); i++) {
			output.writeMessage(30, (MessageLite) this.ajaxes_.get(i));
		}
		for (int i = 0; i < this.iframes_.size(); i++) {
			output.writeMessage(31, (MessageLite) this.iframes_.get(i));
		}
		if (this.pageStayTime_ != 0) {
			output.writeInt32(32, this.pageStayTime_);
		}
		if (!getSubTypeBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 33, this.subType_);
		}
		this.unknownFields.writeTo(output);
	}

	public int getSerializedSize() {
		int size = this.memoizedSize;
		if (size != -1) {
			return size;
		}
		size = 0;
		if (this.traceType_ != 0) {
			size = size + CodedOutputStream.computeInt32Size(1, this.traceType_);
		}
		if (this.traceStatus_ != 0) {
			size = size + CodedOutputStream.computeInt32Size(2, this.traceStatus_);
		}
		if (!getHostBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(3, this.host_);
		}
		if (!getUriBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(4, this.uri_);
		}
		if (this.navigationStart_ != 0L) {
			size = size + CodedOutputStream.computeInt64Size(5, this.navigationStart_);
		}
		if (this.duration_ != 0) {
			size = size + CodedOutputStream.computeInt32Size(6, this.duration_);
		}
		if (this.firstPaintTime_ != 0) {
			size = size + CodedOutputStream.computeInt32Size(7, this.firstPaintTime_);
		}
		if (this.firstScreenTime_ != 0) {
			size = size + CodedOutputStream.computeInt32Size(8, this.firstScreenTime_);
		}
		if (this.domReadyTime_ != 0) {
			size = size + CodedOutputStream.computeInt32Size(9, this.domReadyTime_);
		}
		if (this.htmlLoadTime_ != 0) {
			size = size + CodedOutputStream.computeInt32Size(10, this.htmlLoadTime_);
		}
		if (this.pageRenderTime_ != 0) {
			size = size + CodedOutputStream.computeInt32Size(11, this.pageRenderTime_);
		}
		if (this.requestTime_ != 0) {
			size = size + CodedOutputStream.computeInt32Size(12, this.requestTime_);
		}
		if (this.applicationServerTime_ != 0) {
			size = size + CodedOutputStream.computeInt32Size(13, this.applicationServerTime_);
		}
		if (this.jsError_) {
			size = size + CodedOutputStream.computeBoolSize(14, this.jsError_);
		}
		if (this.fetchStart_ != 0L) {
			size = size + CodedOutputStream.computeInt64Size(15, this.fetchStart_);
		}
		if (this.state_ != ActionState.FINISH.getNumber()) {
			size = size + CodedOutputStream.computeEnumSize(16, this.state_);
		}
		if (!getTraceIdBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(17, this.traceId_);
		}
		if (this.sAppId_ != 0) {
			size = size + CodedOutputStream.computeInt32Size(18, this.sAppId_);
		}
		if (this.sAppInstanceId_ != 0) {
			size = size + CodedOutputStream.computeInt32Size(19, this.sAppInstanceId_);
		}
		if (!getSTnameBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(20, this.sTname_);
		}
		if (!getSTidBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(21, this.sTid_);
		}
		if (!getSDurationBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(23, this.sDuration_);
		}
		if (!getSUserBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(24, this.sUser_);
		}
		if (!getSBidBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(25, this.sBid_);
		}
		if (!getSBerBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(26, this.sBer_);
		}
		if (!getSIsErrorBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(27, this.sIsError_);
		}
		if (!getOperaParamBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(28, this.operaParam_);
		}
		if (!getOperaAllParamBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(29, this.operaAllParam_);
		}
		for (int i = 0; i < this.ajaxes_.size(); i++) {
			size = size + CodedOutputStream.computeMessageSize(30, (MessageLite) this.ajaxes_.get(i));
		}
		for (int i = 0; i < this.iframes_.size(); i++) {
			size = size + CodedOutputStream.computeMessageSize(31, (MessageLite) this.iframes_.get(i));
		}
		if (this.pageStayTime_ != 0) {
			size = size + CodedOutputStream.computeInt32Size(32, this.pageStayTime_);
		}
		if (!getSubTypeBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(33, this.subType_);
		}
		size += this.unknownFields.getSerializedSize();
		this.memoizedSize = size;
		return size;
	}

	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (!(obj instanceof Pf)) {
			return super.equals(obj);
		}
		Pf other = (Pf) obj;
		if (getTraceType() != other.getTraceType()) {
			return false;
		}
		if (getTraceStatus() != other.getTraceStatus()) {
			return false;
		}
		if (!getHost().equals(other.getHost())) {
			return false;
		}
		if (!getUri().equals(other.getUri())) {
			return false;
		}
		if (getNavigationStart() != other.getNavigationStart()) {
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
		if (getHtmlLoadTime() != other.getHtmlLoadTime()) {
			return false;
		}
		if (getPageRenderTime() != other.getPageRenderTime()) {
			return false;
		}
		if (getRequestTime() != other.getRequestTime()) {
			return false;
		}
		if (getApplicationServerTime() != other.getApplicationServerTime()) {
			return false;
		}
		if (getJsError() != other.getJsError()) {
			return false;
		}
		if (getFetchStart() != other.getFetchStart()) {
			return false;
		}
		if (this.state_ != other.state_) {
			return false;
		}
		if (!getTraceId().equals(other.getTraceId())) {
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
		if (!getOperaParam().equals(other.getOperaParam())) {
			return false;
		}
		if (!getOperaAllParam().equals(other.getOperaAllParam())) {
			return false;
		}
		if (!getAjaxesList().equals(other.getAjaxesList())) {
			return false;
		}
		if (!getIframesList().equals(other.getIframesList())) {
			return false;
		}
		if (getPageStayTime() != other.getPageStayTime()) {
			return false;
		}
		if (!getSubType().equals(other.getSubType())) {
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
		hash = 53 * hash + getTraceType();
		hash = 37 * hash + 2;
		hash = 53 * hash + getTraceStatus();
		hash = 37 * hash + 3;
		hash = 53 * hash + getHost().hashCode();
		hash = 37 * hash + 4;
		hash = 53 * hash + getUri().hashCode();
		hash = 37 * hash + 5;
		hash = 53 * hash + Internal.hashLong(getNavigationStart());
		hash = 37 * hash + 6;
		hash = 53 * hash + getDuration();
		hash = 37 * hash + 7;
		hash = 53 * hash + getFirstPaintTime();
		hash = 37 * hash + 8;
		hash = 53 * hash + getFirstScreenTime();
		hash = 37 * hash + 9;
		hash = 53 * hash + getDomReadyTime();
		hash = 37 * hash + 10;
		hash = 53 * hash + getHtmlLoadTime();
		hash = 37 * hash + 11;
		hash = 53 * hash + getPageRenderTime();
		hash = 37 * hash + 12;
		hash = 53 * hash + getRequestTime();
		hash = 37 * hash + 13;
		hash = 53 * hash + getApplicationServerTime();
		hash = 37 * hash + 14;
		hash = 53 * hash + Internal.hashBoolean(getJsError());
		hash = 37 * hash + 15;
		hash = 53 * hash + Internal.hashLong(getFetchStart());
		hash = 37 * hash + 16;
		hash = 53 * hash + this.state_;
		hash = 37 * hash + 17;
		hash = 53 * hash + getTraceId().hashCode();
		hash = 37 * hash + 18;
		hash = 53 * hash + getSAppId();
		hash = 37 * hash + 19;
		hash = 53 * hash + getSAppInstanceId();
		hash = 37 * hash + 20;
		hash = 53 * hash + getSTname().hashCode();
		hash = 37 * hash + 21;
		hash = 53 * hash + getSTid().hashCode();
		hash = 37 * hash + 23;
		hash = 53 * hash + getSDuration().hashCode();
		hash = 37 * hash + 24;
		hash = 53 * hash + getSUser().hashCode();
		hash = 37 * hash + 25;
		hash = 53 * hash + getSBid().hashCode();
		hash = 37 * hash + 26;
		hash = 53 * hash + getSBer().hashCode();
		hash = 37 * hash + 27;
		hash = 53 * hash + getSIsError().hashCode();
		hash = 37 * hash + 28;
		hash = 53 * hash + getOperaParam().hashCode();
		hash = 37 * hash + 29;
		hash = 53 * hash + getOperaAllParam().hashCode();
		if (getAjaxesCount() > 0) {
			hash = 37 * hash + 30;
			hash = 53 * hash + getAjaxesList().hashCode();
		}
		if (getIframesCount() > 0) {
			hash = 37 * hash + 31;
			hash = 53 * hash + getIframesList().hashCode();
		}
		hash = 37 * hash + 32;
		hash = 53 * hash + getPageStayTime();
		hash = 37 * hash + 33;
		hash = 53 * hash + getSubType().hashCode();
		hash = 29 * hash + this.unknownFields.hashCode();
		this.memoizedHashCode = hash;
		return hash;
	}

	public static Pf parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
		return (Pf) PARSER.parseFrom(data);
	}

	public static Pf parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
		return (Pf) PARSER.parseFrom(data, extensionRegistry);
	}

	public static Pf parseFrom(ByteString data) throws InvalidProtocolBufferException {
		return (Pf) PARSER.parseFrom(data);
	}

	public static Pf parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
		return (Pf) PARSER.parseFrom(data, extensionRegistry);
	}

	public static Pf parseFrom(byte[] data) throws InvalidProtocolBufferException {
		return (Pf) PARSER.parseFrom(data);
	}

	public static Pf parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
		return (Pf) PARSER.parseFrom(data, extensionRegistry);
	}

	public static Pf parseFrom(InputStream input) throws IOException {
		return (Pf) GeneratedMessageV3.parseWithIOException(PARSER, input);
	}

	public static Pf parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
		return (Pf) GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
	}

	public static Pf parseDelimitedFrom(InputStream input) throws IOException {
		return (Pf) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
	}

	public static Pf parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
		return (Pf) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
	}

	public static Pf parseFrom(CodedInputStream input) throws IOException {
		return (Pf) GeneratedMessageV3.parseWithIOException(PARSER, input);
	}

	public static Pf parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
		return (Pf) GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
	}

	public Builder newBuilderForType() {
		return newBuilder();
	}

	public static Builder newBuilder() {
		return DEFAULT_INSTANCE.toBuilder();
	}

	public static Builder newBuilder(Pf prototype) {
		return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
	}

	public Builder toBuilder() {
		return this == DEFAULT_INSTANCE ? new Builder(null) : new Builder(null).mergeFrom(this);
	}

	protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
		Builder builder = new Builder(parent);
		return builder;
	}

	public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PfOrBuilder {
		private int bitField0_;
		private int traceType_;
		private int traceStatus_;

		public static final Descriptors.Descriptor getDescriptor() {
			return ActionOuterClass.internal_static_com_tingyun_proto_Pf_descriptor;
		}

		protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
			return ActionOuterClass.internal_static_com_tingyun_proto_Pf_fieldAccessorTable.ensureFieldAccessorsInitialized(Pf.class, Builder.class);
		}

		private Builder() {
			maybeForceBuilderInitialization();
		}

		private Builder(GeneratedMessageV3.BuilderParent parent) {
			super();
			maybeForceBuilderInitialization();
		}

		private void maybeForceBuilderInitialization() {
			if (Pf.alwaysUseFieldBuilders) {
				getAjaxesFieldBuilder();
				getIframesFieldBuilder();
			}
		}

		public Builder clear() {
			super.clear();
			this.traceType_ = 0;

			this.traceStatus_ = 0;

			this.host_ = "";

			this.uri_ = "";

			this.navigationStart_ = 0L;

			this.duration_ = 0;

			this.firstPaintTime_ = 0;

			this.firstScreenTime_ = 0;

			this.domReadyTime_ = 0;

			this.htmlLoadTime_ = 0;

			this.pageRenderTime_ = 0;

			this.requestTime_ = 0;

			this.applicationServerTime_ = 0;

			this.jsError_ = false;

			this.fetchStart_ = 0L;

			this.state_ = 0;

			this.traceId_ = "";

			this.sAppId_ = 0;

			this.sAppInstanceId_ = 0;

			this.sTname_ = "";

			this.sTid_ = "";

			this.sDuration_ = "";

			this.sUser_ = "";

			this.sBid_ = "";

			this.sBer_ = "";

			this.sIsError_ = "";

			this.operaParam_ = "";

			this.operaAllParam_ = "";
			if (this.ajaxesBuilder_ == null) {
				this.ajaxes_ = Collections.emptyList();
				this.bitField0_ &= 0xFFFFFFFE;
			} else {
				this.ajaxesBuilder_.clear();
			}
			if (this.iframesBuilder_ == null) {
				this.iframes_ = Collections.emptyList();
				this.bitField0_ &= 0xFFFFFFFD;
			} else {
				this.iframesBuilder_.clear();
			}
			this.pageStayTime_ = 0;

			this.subType_ = "";

			return this;
		}

		public Descriptors.Descriptor getDescriptorForType() {
			return ActionOuterClass.internal_static_com_tingyun_proto_Pf_descriptor;
		}

		public Pf getDefaultInstanceForType() {
			return Pf.getDefaultInstance();
		}

		public Pf build() {
			Pf result = buildPartial();
			if (!result.isInitialized()) {
				throw newUninitializedMessageException(result);
			}
			return result;
		}

		public Pf buildPartial() {
			Pf result = new Pf(this);
			int from_bitField0_ = this.bitField0_;
			result.traceType_ = this.traceType_;
			result.traceStatus_ = this.traceStatus_;
			result.host_ = this.host_;
			result.uri_ = this.uri_;
			result.navigationStart_ = this.navigationStart_;
			result.duration_ = this.duration_;
			result.firstPaintTime_ = this.firstPaintTime_;
			result.firstScreenTime_ = this.firstScreenTime_;
			result.domReadyTime_ = this.domReadyTime_;
			result.htmlLoadTime_ = this.htmlLoadTime_;
			result.pageRenderTime_ = this.pageRenderTime_;
			result.requestTime_ = this.requestTime_;
			result.applicationServerTime_ = this.applicationServerTime_;
			result.jsError_ = this.jsError_;
			result.fetchStart_ = this.fetchStart_;
			result.state_ = this.state_;
			result.traceId_ = this.traceId_;
			result.sAppId_ = this.sAppId_;
			result.sAppInstanceId_ = this.sAppInstanceId_;
			result.sTname_ = this.sTname_;
			result.sTid_ = this.sTid_;
			result.sDuration_ = this.sDuration_;
			result.sUser_ = this.sUser_;
			result.sBid_ = this.sBid_;
			result.sBer_ = this.sBer_;
			result.sIsError_ = this.sIsError_;
			result.operaParam_ = this.operaParam_;
			result.operaAllParam_ = this.operaAllParam_;
			if (this.ajaxesBuilder_ == null) {
				if ((this.bitField0_ & 0x1) != 0) {
					this.ajaxes_ = Collections.unmodifiableList(this.ajaxes_);
					this.bitField0_ &= 0xFFFFFFFE;
				}
				result.ajaxes_ = this.ajaxes_;
			} else {
				result.ajaxes_ = this.ajaxesBuilder_.build();
			}
			if (this.iframesBuilder_ == null) {
				if ((this.bitField0_ & 0x2) != 0) {
					this.iframes_ = Collections.unmodifiableList(this.iframes_);
					this.bitField0_ &= 0xFFFFFFFD;
				}
				result.iframes_ = this.iframes_;
			} else {
				result.iframes_ = this.iframesBuilder_.build();
			}
			result.pageStayTime_ = this.pageStayTime_;
			result.subType_ = this.subType_;
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
			if ((other instanceof Pf)) {
				return mergeFrom((Pf) other);
			}
			super.mergeFrom(other);
			return this;
		}

		public Builder mergeFrom(Pf other) {
			if (other == Pf.getDefaultInstance()) {
				return this;
			}
			if (other.getTraceType() != 0) {
				setTraceType(other.getTraceType());
			}
			if (other.getTraceStatus() != 0) {
				setTraceStatus(other.getTraceStatus());
			}
			if (!other.getHost().isEmpty()) {
				this.host_ = other.host_;
				onChanged();
			}
			if (!other.getUri().isEmpty()) {
				this.uri_ = other.uri_;
				onChanged();
			}
			if (other.getNavigationStart() != 0L) {
				setNavigationStart(other.getNavigationStart());
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
			if (other.getHtmlLoadTime() != 0) {
				setHtmlLoadTime(other.getHtmlLoadTime());
			}
			if (other.getPageRenderTime() != 0) {
				setPageRenderTime(other.getPageRenderTime());
			}
			if (other.getRequestTime() != 0) {
				setRequestTime(other.getRequestTime());
			}
			if (other.getApplicationServerTime() != 0) {
				setApplicationServerTime(other.getApplicationServerTime());
			}
			if (other.getJsError()) {
				setJsError(other.getJsError());
			}
			if (other.getFetchStart() != 0L) {
				setFetchStart(other.getFetchStart());
			}
			if (other.state_ != 0) {
				setStateValue(other.getStateValue());
			}
			if (!other.getTraceId().isEmpty()) {
				this.traceId_ = other.traceId_;
				onChanged();
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
			if (!other.getOperaParam().isEmpty()) {
				this.operaParam_ = other.operaParam_;
				onChanged();
			}
			if (!other.getOperaAllParam().isEmpty()) {
				this.operaAllParam_ = other.operaAllParam_;
				onChanged();
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

					this.ajaxesBuilder_ = (Pf.alwaysUseFieldBuilders ? getAjaxesFieldBuilder() : null);
				} else {
					this.ajaxesBuilder_.addAllMessages(other.ajaxes_);
				}
			}
			if (this.iframesBuilder_ == null) {
				if (!other.iframes_.isEmpty()) {
					if (this.iframes_.isEmpty()) {
						this.iframes_ = other.iframes_;
						this.bitField0_ &= 0xFFFFFFFD;
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
					this.bitField0_ &= 0xFFFFFFFD;

					this.iframesBuilder_ = (Pf.alwaysUseFieldBuilders ? getIframesFieldBuilder() : null);
				} else {
					this.iframesBuilder_.addAllMessages(other.iframes_);
				}
			}
			if (other.getPageStayTime() != 0) {
				setPageStayTime(other.getPageStayTime());
			}
			if (!other.getSubType().isEmpty()) {
				this.subType_ = other.subType_;
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
			Pf parsedMessage = null;
			try {
				parsedMessage = (Pf) Pf.PARSER.parsePartialFrom(input, extensionRegistry);
			} catch (InvalidProtocolBufferException e) {
				parsedMessage = (Pf) e.getUnfinishedMessage();
				throw e.unwrapIOException();
			} finally {
				if (parsedMessage != null) {
					mergeFrom(parsedMessage);
				}
			}
			return this;
		}

		public int getTraceType() {
			return this.traceType_;
		}

		public Builder setTraceType(int value) {
			this.traceType_ = value;
			onChanged();
			return this;
		}

		public Builder clearTraceType() {
			this.traceType_ = 0;
			onChanged();
			return this;
		}

		public int getTraceStatus() {
			return this.traceStatus_;
		}

		public Builder setTraceStatus(int value) {
			this.traceStatus_ = value;
			onChanged();
			return this;
		}

		public Builder clearTraceStatus() {
			this.traceStatus_ = 0;
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
			this.host_ = Pf.getDefaultInstance().getHost();
			onChanged();
			return this;
		}

		public Builder setHostBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Pf.checkByteStringIsUtf8(value);

			this.host_ = value;
			onChanged();
			return this;
		}

		private Object uri_ = "";
		private long navigationStart_;
		private int duration_;
		private int firstPaintTime_;
		private int firstScreenTime_;
		private int domReadyTime_;
		private int htmlLoadTime_;
		private int pageRenderTime_;
		private int requestTime_;
		private int applicationServerTime_;
		private boolean jsError_;
		private long fetchStart_;

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
			this.uri_ = Pf.getDefaultInstance().getUri();
			onChanged();
			return this;
		}

		public Builder setUriBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Pf.checkByteStringIsUtf8(value);

			this.uri_ = value;
			onChanged();
			return this;
		}

		public long getNavigationStart() {
			return this.navigationStart_;
		}

		public Builder setNavigationStart(long value) {
			this.navigationStart_ = value;
			onChanged();
			return this;
		}

		public Builder clearNavigationStart() {
			this.navigationStart_ = 0L;
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

		public int getHtmlLoadTime() {
			return this.htmlLoadTime_;
		}

		public Builder setHtmlLoadTime(int value) {
			this.htmlLoadTime_ = value;
			onChanged();
			return this;
		}

		public Builder clearHtmlLoadTime() {
			this.htmlLoadTime_ = 0;
			onChanged();
			return this;
		}

		public int getPageRenderTime() {
			return this.pageRenderTime_;
		}

		public Builder setPageRenderTime(int value) {
			this.pageRenderTime_ = value;
			onChanged();
			return this;
		}

		public Builder clearPageRenderTime() {
			this.pageRenderTime_ = 0;
			onChanged();
			return this;
		}

		public int getRequestTime() {
			return this.requestTime_;
		}

		public Builder setRequestTime(int value) {
			this.requestTime_ = value;
			onChanged();
			return this;
		}

		public Builder clearRequestTime() {
			this.requestTime_ = 0;
			onChanged();
			return this;
		}

		public int getApplicationServerTime() {
			return this.applicationServerTime_;
		}

		public Builder setApplicationServerTime(int value) {
			this.applicationServerTime_ = value;
			onChanged();
			return this;
		}

		public Builder clearApplicationServerTime() {
			this.applicationServerTime_ = 0;
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

		public long getFetchStart() {
			return this.fetchStart_;
		}

		public Builder setFetchStart(long value) {
			this.fetchStart_ = value;
			onChanged();
			return this;
		}

		public Builder clearFetchStart() {
			this.fetchStart_ = 0L;
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

		private Object traceId_ = "";
		private int sAppId_;
		private int sAppInstanceId_;

		public String getTraceId() {
			Object ref = this.traceId_;
			if (!(ref instanceof String)) {
				ByteString bs = (ByteString) ref;

				String s = bs.toStringUtf8();
				this.traceId_ = s;
				return s;
			}
			return (String) ref;
		}

		public ByteString getTraceIdBytes() {
			Object ref = this.traceId_;
			if ((ref instanceof String)) {
				ByteString b = ByteString.copyFromUtf8((String) ref);

				this.traceId_ = b;
				return b;
			}
			return (ByteString) ref;
		}

		public Builder setTraceId(String value) {
			if (value == null) {
				throw new NullPointerException();
			}
			this.traceId_ = value;
			onChanged();
			return this;
		}

		public Builder clearTraceId() {
			this.traceId_ = Pf.getDefaultInstance().getTraceId();
			onChanged();
			return this;
		}

		public Builder setTraceIdBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Pf.checkByteStringIsUtf8(value);

			this.traceId_ = value;
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
			this.sTname_ = Pf.getDefaultInstance().getSTname();
			onChanged();
			return this;
		}

		public Builder setSTnameBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Pf.checkByteStringIsUtf8(value);

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
			this.sTid_ = Pf.getDefaultInstance().getSTid();
			onChanged();
			return this;
		}

		public Builder setSTidBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Pf.checkByteStringIsUtf8(value);

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
			this.sDuration_ = Pf.getDefaultInstance().getSDuration();
			onChanged();
			return this;
		}

		public Builder setSDurationBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Pf.checkByteStringIsUtf8(value);

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
			this.sUser_ = Pf.getDefaultInstance().getSUser();
			onChanged();
			return this;
		}

		public Builder setSUserBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Pf.checkByteStringIsUtf8(value);

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
			this.sBid_ = Pf.getDefaultInstance().getSBid();
			onChanged();
			return this;
		}

		public Builder setSBidBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Pf.checkByteStringIsUtf8(value);

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
			this.sBer_ = Pf.getDefaultInstance().getSBer();
			onChanged();
			return this;
		}

		public Builder setSBerBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Pf.checkByteStringIsUtf8(value);

			this.sBer_ = value;
			onChanged();
			return this;
		}

		private Object sIsError_ = "";

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
			this.sIsError_ = Pf.getDefaultInstance().getSIsError();
			onChanged();
			return this;
		}

		public Builder setSIsErrorBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Pf.checkByteStringIsUtf8(value);

			this.sIsError_ = value;
			onChanged();
			return this;
		}

		private Object operaParam_ = "";

		public String getOperaParam() {
			Object ref = this.operaParam_;
			if (!(ref instanceof String)) {
				ByteString bs = (ByteString) ref;

				String s = bs.toStringUtf8();
				this.operaParam_ = s;
				return s;
			}
			return (String) ref;
		}

		public ByteString getOperaParamBytes() {
			Object ref = this.operaParam_;
			if ((ref instanceof String)) {
				ByteString b = ByteString.copyFromUtf8((String) ref);

				this.operaParam_ = b;
				return b;
			}
			return (ByteString) ref;
		}

		public Builder setOperaParam(String value) {
			if (value == null) {
				throw new NullPointerException();
			}
			this.operaParam_ = value;
			onChanged();
			return this;
		}

		public Builder clearOperaParam() {
			this.operaParam_ = Pf.getDefaultInstance().getOperaParam();
			onChanged();
			return this;
		}

		public Builder setOperaParamBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Pf.checkByteStringIsUtf8(value);

			this.operaParam_ = value;
			onChanged();
			return this;
		}

		private Object operaAllParam_ = "";

		public String getOperaAllParam() {
			Object ref = this.operaAllParam_;
			if (!(ref instanceof String)) {
				ByteString bs = (ByteString) ref;

				String s = bs.toStringUtf8();
				this.operaAllParam_ = s;
				return s;
			}
			return (String) ref;
		}

		public ByteString getOperaAllParamBytes() {
			Object ref = this.operaAllParam_;
			if ((ref instanceof String)) {
				ByteString b = ByteString.copyFromUtf8((String) ref);

				this.operaAllParam_ = b;
				return b;
			}
			return (ByteString) ref;
		}

		public Builder setOperaAllParam(String value) {
			if (value == null) {
				throw new NullPointerException();
			}
			this.operaAllParam_ = value;
			onChanged();
			return this;
		}

		public Builder clearOperaAllParam() {
			this.operaAllParam_ = Pf.getDefaultInstance().getOperaAllParam();
			onChanged();
			return this;
		}

		public Builder setOperaAllParamBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Pf.checkByteStringIsUtf8(value);

			this.operaAllParam_ = value;
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

		private List<Iframe> iframes_ = Collections.emptyList();
		private RepeatedFieldBuilderV3<Iframe, Iframe.Builder, IframeOrBuilder> iframesBuilder_;
		private int pageStayTime_;

		private void ensureIframesIsMutable() {
			if ((this.bitField0_ & 0x2) == 0) {
				this.iframes_ = new ArrayList(this.iframes_);
				this.bitField0_ |= 0x2;
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
				this.bitField0_ &= 0xFFFFFFFD;
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
				this.iframesBuilder_ = new RepeatedFieldBuilderV3(this.iframes_, (this.bitField0_ & 0x2) != 0, getParentForChildren(), isClean());
				this.iframes_ = null;
			}
			return this.iframesBuilder_;
		}

		public int getPageStayTime() {
			return this.pageStayTime_;
		}

		public Builder setPageStayTime(int value) {
			this.pageStayTime_ = value;
			onChanged();
			return this;
		}

		public Builder clearPageStayTime() {
			this.pageStayTime_ = 0;
			onChanged();
			return this;
		}

		private Object subType_ = "";

		public String getSubType() {
			Object ref = this.subType_;
			if (!(ref instanceof String)) {
				ByteString bs = (ByteString) ref;

				String s = bs.toStringUtf8();
				this.subType_ = s;
				return s;
			}
			return (String) ref;
		}

		public ByteString getSubTypeBytes() {
			Object ref = this.subType_;
			if ((ref instanceof String)) {
				ByteString b = ByteString.copyFromUtf8((String) ref);

				this.subType_ = b;
				return b;
			}
			return (ByteString) ref;
		}

		public Builder setSubType(String value) {
			if (value == null) {
				throw new NullPointerException();
			}
			this.subType_ = value;
			onChanged();
			return this;
		}

		public Builder clearSubType() {
			this.subType_ = Pf.getDefaultInstance().getSubType();
			onChanged();
			return this;
		}

		public Builder setSubTypeBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Pf.checkByteStringIsUtf8(value);

			this.subType_ = value;
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

	private static final Pf DEFAULT_INSTANCE = new Pf();

	public static Pf getDefaultInstance() {
		return DEFAULT_INSTANCE;
	}

	private static final Parser<Pf> PARSER = new AbstractParser() {
		public Pf parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
			return new Pf(input, extensionRegistry);
		}
	};

	public static Parser<Pf> parser() {
		return PARSER;
	}

	public Parser<Pf> getParserForType() {
		return PARSER;
	}

	public Pf getDefaultInstanceForType() {
		return DEFAULT_INSTANCE;
	}
}
