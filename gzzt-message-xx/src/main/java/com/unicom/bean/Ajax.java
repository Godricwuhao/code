package com.unicom.bean;

import com.google.protobuf.*;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ajax extends GeneratedMessageV3 implements AjaxOrBuilder {
	
	private static final long serialVersionUID = 0L;
	public static final int HOST_FIELD_NUMBER = 1;
	private volatile Object host_;
	public static final int URI_FIELD_NUMBER = 2;
	private volatile Object uri_;
	public static final int REQUEST_METHOD_FIELD_NUMBER = 3;
	private volatile Object requestMethod_;
	public static final int PROTOCOL_FIELD_NUMBER = 4;
	private volatile Object protocol_;
	public static final int REQUEST_URL_FIELD_NUMBER = 5;
	private volatile Object requestUrl_;
	public static final int URI_RULE_ID_FIELD_NUMBER = 6;
	private int uriRuleId_;
	public static final int HTTP_CODE_FIELD_NUMBER = 7;
	private int httpCode_;
	public static final int BYTES_SEND_FIELD_NUMBER = 8;
	private long bytesSend_;
	public static final int BYTES_RECEIVED_FIELD_NUMBER = 9;
	private long bytesReceived_;
	public static final int START_FIELD_NUMBER = 10;
	private long start_;
	public static final int END_FIELD_NUMBER = 12;
	private long end_;
	public static final int RESPONSE_TIME_FIELD_NUMBER = 13;
	private int responseTime_;
	public static final int APPLICATION_SERVER_TIME_FIELD_NUMBER = 14;
	private int applicationServerTime_;
	public static final int CALLBACK_TIME_FIELD_NUMBER = 15;
	private int callbackTime_;
	public static final int NETWORK_TIME_FIELD_NUMBER = 16;
	private int networkTime_;
	public static final int JS_ERROR_FIELD_NUMBER = 17;
	private boolean jsError_;
	public static final int OPERA_PARAM_FIELD_NUMBER = 18;
	private volatile Object operaParam_;
	public static final int S_APP_ID_FIELD_NUMBER = 19;
	private int sAppId_;
	public static final int S_APP_INSTANCE_ID_FIELD_NUMBER = 20;
	private int sAppInstanceId_;
	public static final int S_TNAME_FIELD_NUMBER = 21;
	private volatile Object sTname_;
	public static final int S_TID_FIELD_NUMBER = 22;
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
	public static final int STATE_FIELD_NUMBER = 28;
	private int state_;
	public static final int IGNORE_FIELD_NUMBER = 29;
	private boolean ignore_;
	public static final int AJAXES_FIELD_NUMBER = 30;
	private List<Ajax> ajaxes_;
	public static final int TIMERS_FIELD_NUMBER = 31;
	private List<Timer> timers_;
	public static final int IFRAMES_FIELD_NUMBER = 32;
	private List<Iframe> iframes_;
	public static final int CROSSPAGES_FIELD_NUMBER = 33;
	private List<CrossPage> crossPages_;
	public static final int OPERA_ALL_PARAM_FIELD_NUMBER = 34;
	private volatile Object operaAllParam_;
	public static final int SPE_FIELD_NUMBER = 35;
	private boolean spe_;
	public static final int SUB_TYPE_FIELD_NUMBER = 36;
	private volatile Object subType_;
	public static final int CONTEXT_FIELD_NUMBER = 37;
	private volatile Object context_;

	private Ajax(GeneratedMessageV3.Builder<?> builder) {
		super(builder);
	}

	private Ajax() {
		this.host_ = "";
		this.uri_ = "";
		this.requestMethod_ = "";
		this.protocol_ = "";
		this.requestUrl_ = "";
		this.operaParam_ = "";
		this.sTname_ = "";
		this.sTid_ = "";
		this.sDuration_ = "";
		this.sUser_ = "";
		this.sBid_ = "";
		this.sBer_ = "";
		this.sIsError_ = "";
		this.state_ = 0;
		this.ajaxes_ = Collections.emptyList();
		this.timers_ = Collections.emptyList();
		this.iframes_ = Collections.emptyList();
		this.crossPages_ = Collections.emptyList();
		this.operaAllParam_ = "";
		this.subType_ = "";
		this.context_ = "";
	}

	protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
		return new Ajax();
	}

	public final UnknownFieldSet getUnknownFields() {
		return this.unknownFields;
	}

	private Ajax(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
					this.host_ = input.readStringRequireUtf8();
					break;
				case 18:
					this.uri_ = input.readStringRequireUtf8();
					break;
				case 26:
					this.requestMethod_ = input.readStringRequireUtf8();
					break;
				case 34:
					this.protocol_ = input.readStringRequireUtf8();
					break;
				case 42:
					this.requestUrl_ = input.readStringRequireUtf8();
					break;
				case 48:
					this.uriRuleId_ = input.readInt32();
					break;
				case 56:
					this.httpCode_ = input.readInt32();
					break;
				case 64:
					this.bytesSend_ = input.readInt64();
					break;
				case 72:
					this.bytesReceived_ = input.readInt64();
					break;
				case 80:
					this.start_ = input.readInt64();
					break;
				case 96:
					this.end_ = input.readInt64();
					break;
				case 104:
					this.responseTime_ = input.readInt32();
					break;
				case 112:
					this.applicationServerTime_ = input.readInt32();
					break;
				case 120:
					this.callbackTime_ = input.readInt32();
					break;
				case 128:
					this.networkTime_ = input.readInt32();
					break;
				case 136:
					this.jsError_ = input.readBool();
					break;
				case 146:
					String s = input.readStringRequireUtf8();

					this.operaParam_ = s;
					break;
				case 152:
					this.sAppId_ = input.readInt32();
					break;
				case 160:
					this.sAppInstanceId_ = input.readInt32();
					break;
				case 170:
					this.sTname_ = input.readStringRequireUtf8();
					break;
				case 178:
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
				case 224:
					this.state_ = input.readEnum();
					break;
				case 232:
					this.ignore_ = input.readBool();
					break;
				case 242:
					if ((mutable_bitField0_ & 0x1) == 0) {
						this.ajaxes_ = new ArrayList();
						mutable_bitField0_ |= 0x1;
					}
					this.ajaxes_.add(input.readMessage(parser(), extensionRegistry));
					break;
				case 250:
					if ((mutable_bitField0_ & 0x2) == 0) {
						this.timers_ = new ArrayList();
						mutable_bitField0_ |= 0x2;
					}
					this.timers_.add(input.readMessage(Timer.parser(), extensionRegistry));
					break;
				case 258:
					if ((mutable_bitField0_ & 0x4) == 0) {
						this.iframes_ = new ArrayList();
						mutable_bitField0_ |= 0x4;
					}
					this.iframes_.add(input.readMessage(Iframe.parser(), extensionRegistry));
					break;
				case 266:
					if ((mutable_bitField0_ & 0x8) == 0) {
						this.crossPages_ = new ArrayList();
						mutable_bitField0_ |= 0x8;
					}
					this.crossPages_.add(input.readMessage(CrossPage.parser(), extensionRegistry));
					break;
				case 274:
					this.operaAllParam_ = input.readStringRequireUtf8();
					break;
				case 280:
					this.spe_ = input.readBool();
					break;
				case 290:
					this.subType_ = input.readStringRequireUtf8();
					break;
				case 298:
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
		return ActionOuterClass.internal_static_com_tingyun_proto_Ajax_descriptor;
	}

	protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
		return ActionOuterClass.internal_static_com_tingyun_proto_Ajax_fieldAccessorTable.ensureFieldAccessorsInitialized(Ajax.class, Builder.class);
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

	public String getRequestMethod() {
		Object ref = this.requestMethod_;
		if ((ref instanceof String)) {
			return (String) ref;
		}
		ByteString bs = (ByteString) ref;

		String s = bs.toStringUtf8();
		this.requestMethod_ = s;
		return s;
	}

	public ByteString getRequestMethodBytes() {
		Object ref = this.requestMethod_;
		if ((ref instanceof String)) {
			ByteString b = ByteString.copyFromUtf8((String) ref);

			this.requestMethod_ = b;
			return b;
		}
		return (ByteString) ref;
	}

	public String getProtocol() {
		Object ref = this.protocol_;
		if ((ref instanceof String)) {
			return (String) ref;
		}
		ByteString bs = (ByteString) ref;

		String s = bs.toStringUtf8();
		this.protocol_ = s;
		return s;
	}

	public ByteString getProtocolBytes() {
		Object ref = this.protocol_;
		if ((ref instanceof String)) {
			ByteString b = ByteString.copyFromUtf8((String) ref);

			this.protocol_ = b;
			return b;
		}
		return (ByteString) ref;
	}

	public String getRequestUrl() {
		Object ref = this.requestUrl_;
		if ((ref instanceof String)) {
			return (String) ref;
		}
		ByteString bs = (ByteString) ref;

		String s = bs.toStringUtf8();
		this.requestUrl_ = s;
		return s;
	}

	public ByteString getRequestUrlBytes() {
		Object ref = this.requestUrl_;
		if ((ref instanceof String)) {
			ByteString b = ByteString.copyFromUtf8((String) ref);

			this.requestUrl_ = b;
			return b;
		}
		return (ByteString) ref;
	}

	public int getUriRuleId() {
		return this.uriRuleId_;
	}

	public int getHttpCode() {
		return this.httpCode_;
	}

	public long getBytesSend() {
		return this.bytesSend_;
	}

	public long getBytesReceived() {
		return this.bytesReceived_;
	}

	public long getStart() {
		return this.start_;
	}

	public long getEnd() {
		return this.end_;
	}

	public int getResponseTime() {
		return this.responseTime_;
	}

	public int getApplicationServerTime() {
		return this.applicationServerTime_;
	}

	public int getCallbackTime() {
		return this.callbackTime_;
	}

	public int getNetworkTime() {
		return this.networkTime_;
	}

	public boolean getJsError() {
		return this.jsError_;
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

	public int getStateValue() {
		return this.state_;
	}

	public ActionState getState() {
		ActionState result = ActionState.valueOf(this.state_);
		return result == null ? ActionState.UNRECOGNIZED : result;
	}

	public boolean getIgnore() {
		return this.ignore_;
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

	public boolean getSpe() {
		return this.spe_;
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
		if (!getHostBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 1, this.host_);
		}
		if (!getUriBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 2, this.uri_);
		}
		if (!getRequestMethodBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 3, this.requestMethod_);
		}
		if (!getProtocolBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 4, this.protocol_);
		}
		if (!getRequestUrlBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 5, this.requestUrl_);
		}
		if (this.uriRuleId_ != 0) {
			output.writeInt32(6, this.uriRuleId_);
		}
		if (this.httpCode_ != 0) {
			output.writeInt32(7, this.httpCode_);
		}
		if (this.bytesSend_ != 0L) {
			output.writeInt64(8, this.bytesSend_);
		}
		if (this.bytesReceived_ != 0L) {
			output.writeInt64(9, this.bytesReceived_);
		}
		if (this.start_ != 0L) {
			output.writeInt64(10, this.start_);
		}
		if (this.end_ != 0L) {
			output.writeInt64(12, this.end_);
		}
		if (this.responseTime_ != 0) {
			output.writeInt32(13, this.responseTime_);
		}
		if (this.applicationServerTime_ != 0) {
			output.writeInt32(14, this.applicationServerTime_);
		}
		if (this.callbackTime_ != 0) {
			output.writeInt32(15, this.callbackTime_);
		}
		if (this.networkTime_ != 0) {
			output.writeInt32(16, this.networkTime_);
		}
		if (this.jsError_) {
			output.writeBool(17, this.jsError_);
		}
		if (!getOperaParamBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 18, this.operaParam_);
		}
		if (this.sAppId_ != 0) {
			output.writeInt32(19, this.sAppId_);
		}
		if (this.sAppInstanceId_ != 0) {
			output.writeInt32(20, this.sAppInstanceId_);
		}
		if (!getSTnameBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 21, this.sTname_);
		}
		if (!getSTidBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 22, this.sTid_);
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
		if (this.state_ != ActionState.FINISH.getNumber()) {
			output.writeEnum(28, this.state_);
		}
		if (this.ignore_) {
			output.writeBool(29, this.ignore_);
		}
		for (int i = 0; i < this.ajaxes_.size(); i++) {
			output.writeMessage(30, (MessageLite) this.ajaxes_.get(i));
		}
		for (int i = 0; i < this.timers_.size(); i++) {
			output.writeMessage(31, (MessageLite) this.timers_.get(i));
		}
		for (int i = 0; i < this.iframes_.size(); i++) {
			output.writeMessage(32, (MessageLite) this.iframes_.get(i));
		}
		for (int i = 0; i < this.crossPages_.size(); i++) {
			output.writeMessage(33, (MessageLite) this.crossPages_.get(i));
		}
		if (!getOperaAllParamBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 34, this.operaAllParam_);
		}
		if (this.spe_) {
			output.writeBool(35, this.spe_);
		}
		if (!getSubTypeBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 36, this.subType_);
		}
		if (!getContextBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 37, this.context_);
		}
		this.unknownFields.writeTo(output);
	}

	public int getSerializedSize() {
		int size = this.memoizedSize;
		if (size != -1) {
			return size;
		}
		size = 0;
		if (!getHostBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(1, this.host_);
		}
		if (!getUriBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(2, this.uri_);
		}
		if (!getRequestMethodBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(3, this.requestMethod_);
		}
		if (!getProtocolBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(4, this.protocol_);
		}
		if (!getRequestUrlBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(5, this.requestUrl_);
		}
		if (this.uriRuleId_ != 0) {
			size = size + CodedOutputStream.computeInt32Size(6, this.uriRuleId_);
		}
		if (this.httpCode_ != 0) {
			size = size + CodedOutputStream.computeInt32Size(7, this.httpCode_);
		}
		if (this.bytesSend_ != 0L) {
			size = size + CodedOutputStream.computeInt64Size(8, this.bytesSend_);
		}
		if (this.bytesReceived_ != 0L) {
			size = size + CodedOutputStream.computeInt64Size(9, this.bytesReceived_);
		}
		if (this.start_ != 0L) {
			size = size + CodedOutputStream.computeInt64Size(10, this.start_);
		}
		if (this.end_ != 0L) {
			size = size + CodedOutputStream.computeInt64Size(12, this.end_);
		}
		if (this.responseTime_ != 0) {
			size = size + CodedOutputStream.computeInt32Size(13, this.responseTime_);
		}
		if (this.applicationServerTime_ != 0) {
			size = size + CodedOutputStream.computeInt32Size(14, this.applicationServerTime_);
		}
		if (this.callbackTime_ != 0) {
			size = size + CodedOutputStream.computeInt32Size(15, this.callbackTime_);
		}
		if (this.networkTime_ != 0) {
			size = size + CodedOutputStream.computeInt32Size(16, this.networkTime_);
		}
		if (this.jsError_) {
			size = size + CodedOutputStream.computeBoolSize(17, this.jsError_);
		}
		if (!getOperaParamBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(18, this.operaParam_);
		}
		if (this.sAppId_ != 0) {
			size = size + CodedOutputStream.computeInt32Size(19, this.sAppId_);
		}
		if (this.sAppInstanceId_ != 0) {
			size = size + CodedOutputStream.computeInt32Size(20, this.sAppInstanceId_);
		}
		if (!getSTnameBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(21, this.sTname_);
		}
		if (!getSTidBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(22, this.sTid_);
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
		if (this.state_ != ActionState.FINISH.getNumber()) {
			size = size + CodedOutputStream.computeEnumSize(28, this.state_);
		}
		if (this.ignore_) {
			size = size + CodedOutputStream.computeBoolSize(29, this.ignore_);
		}
		for (int i = 0; i < this.ajaxes_.size(); i++) {
			size = size + CodedOutputStream.computeMessageSize(30, (MessageLite) this.ajaxes_.get(i));
		}
		for (int i = 0; i < this.timers_.size(); i++) {
			size = size + CodedOutputStream.computeMessageSize(31, (MessageLite) this.timers_.get(i));
		}
		for (int i = 0; i < this.iframes_.size(); i++) {
			size = size + CodedOutputStream.computeMessageSize(32, (MessageLite) this.iframes_.get(i));
		}
		for (int i = 0; i < this.crossPages_.size(); i++) {
			size = size + CodedOutputStream.computeMessageSize(33, (MessageLite) this.crossPages_.get(i));
		}
		if (!getOperaAllParamBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(34, this.operaAllParam_);
		}
		if (this.spe_) {
			size = size + CodedOutputStream.computeBoolSize(35, this.spe_);
		}
		if (!getSubTypeBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(36, this.subType_);
		}
		if (!getContextBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(37, this.context_);
		}
		size += this.unknownFields.getSerializedSize();
		this.memoizedSize = size;
		return size;
	}

	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (!(obj instanceof Ajax)) {
			return super.equals(obj);
		}
		Ajax other = (Ajax) obj;
		if (!getHost().equals(other.getHost())) {
			return false;
		}
		if (!getUri().equals(other.getUri())) {
			return false;
		}
		if (!getRequestMethod().equals(other.getRequestMethod())) {
			return false;
		}
		if (!getProtocol().equals(other.getProtocol())) {
			return false;
		}
		if (!getRequestUrl().equals(other.getRequestUrl())) {
			return false;
		}
		if (getUriRuleId() != other.getUriRuleId()) {
			return false;
		}
		if (getHttpCode() != other.getHttpCode()) {
			return false;
		}
		if (getBytesSend() != other.getBytesSend()) {
			return false;
		}
		if (getBytesReceived() != other.getBytesReceived()) {
			return false;
		}
		if (getStart() != other.getStart()) {
			return false;
		}
		if (getEnd() != other.getEnd()) {
			return false;
		}
		if (getResponseTime() != other.getResponseTime()) {
			return false;
		}
		if (getApplicationServerTime() != other.getApplicationServerTime()) {
			return false;
		}
		if (getCallbackTime() != other.getCallbackTime()) {
			return false;
		}
		if (getNetworkTime() != other.getNetworkTime()) {
			return false;
		}
		if (getJsError() != other.getJsError()) {
			return false;
		}
		if (!getOperaParam().equals(other.getOperaParam())) {
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
		if (this.state_ != other.state_) {
			return false;
		}
		if (getIgnore() != other.getIgnore()) {
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
		if (!getOperaAllParam().equals(other.getOperaAllParam())) {
			return false;
		}
		if (getSpe() != other.getSpe()) {
			return false;
		}
		if (!getSubType().equals(other.getSubType())) {
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
		hash = 53 * hash + getHost().hashCode();
		hash = 37 * hash + 2;
		hash = 53 * hash + getUri().hashCode();
		hash = 37 * hash + 3;
		hash = 53 * hash + getRequestMethod().hashCode();
		hash = 37 * hash + 4;
		hash = 53 * hash + getProtocol().hashCode();
		hash = 37 * hash + 5;
		hash = 53 * hash + getRequestUrl().hashCode();
		hash = 37 * hash + 6;
		hash = 53 * hash + getUriRuleId();
		hash = 37 * hash + 7;
		hash = 53 * hash + getHttpCode();
		hash = 37 * hash + 8;
		hash = 53 * hash + Internal.hashLong(getBytesSend());
		hash = 37 * hash + 9;
		hash = 53 * hash + Internal.hashLong(getBytesReceived());
		hash = 37 * hash + 10;
		hash = 53 * hash + Internal.hashLong(getStart());
		hash = 37 * hash + 12;
		hash = 53 * hash + Internal.hashLong(getEnd());
		hash = 37 * hash + 13;
		hash = 53 * hash + getResponseTime();
		hash = 37 * hash + 14;
		hash = 53 * hash + getApplicationServerTime();
		hash = 37 * hash + 15;
		hash = 53 * hash + getCallbackTime();
		hash = 37 * hash + 16;
		hash = 53 * hash + getNetworkTime();
		hash = 37 * hash + 17;
		hash = 53 * hash + Internal.hashBoolean(getJsError());
		hash = 37 * hash + 18;
		hash = 53 * hash + getOperaParam().hashCode();
		hash = 37 * hash + 19;
		hash = 53 * hash + getSAppId();
		hash = 37 * hash + 20;
		hash = 53 * hash + getSAppInstanceId();
		hash = 37 * hash + 21;
		hash = 53 * hash + getSTname().hashCode();
		hash = 37 * hash + 22;
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
		hash = 53 * hash + this.state_;
		hash = 37 * hash + 29;
		hash = 53 * hash + Internal.hashBoolean(getIgnore());
		if (getAjaxesCount() > 0) {
			hash = 37 * hash + 30;
			hash = 53 * hash + getAjaxesList().hashCode();
		}
		if (getTimersCount() > 0) {
			hash = 37 * hash + 31;
			hash = 53 * hash + getTimersList().hashCode();
		}
		if (getIframesCount() > 0) {
			hash = 37 * hash + 32;
			hash = 53 * hash + getIframesList().hashCode();
		}
		if (getCrossPagesCount() > 0) {
			hash = 37 * hash + 33;
			hash = 53 * hash + getCrossPagesList().hashCode();
		}
		hash = 37 * hash + 34;
		hash = 53 * hash + getOperaAllParam().hashCode();
		hash = 37 * hash + 35;
		hash = 53 * hash + Internal.hashBoolean(getSpe());
		hash = 37 * hash + 36;
		hash = 53 * hash + getSubType().hashCode();
		hash = 37 * hash + 37;
		hash = 53 * hash + getContext().hashCode();
		hash = 29 * hash + this.unknownFields.hashCode();
		this.memoizedHashCode = hash;
		return hash;
	}

	public static Ajax parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
		return (Ajax) PARSER.parseFrom(data);
	}

	public static Ajax parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
		return (Ajax) PARSER.parseFrom(data, extensionRegistry);
	}

	public static Ajax parseFrom(ByteString data) throws InvalidProtocolBufferException {
		return (Ajax) PARSER.parseFrom(data);
	}

	public static Ajax parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
		return (Ajax) PARSER.parseFrom(data, extensionRegistry);
	}

	public static Ajax parseFrom(byte[] data) throws InvalidProtocolBufferException {
		return (Ajax) PARSER.parseFrom(data);
	}

	public static Ajax parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
		return (Ajax) PARSER.parseFrom(data, extensionRegistry);
	}

	public static Ajax parseFrom(InputStream input) throws IOException {
		return (Ajax) GeneratedMessageV3.parseWithIOException(PARSER, input);
	}

	public static Ajax parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
		return (Ajax) GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
	}

	public static Ajax parseDelimitedFrom(InputStream input) throws IOException {
		return (Ajax) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
	}

	public static Ajax parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
		return (Ajax) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
	}

	public static Ajax parseFrom(CodedInputStream input) throws IOException {
		return (Ajax) GeneratedMessageV3.parseWithIOException(PARSER, input);
	}

	public static Ajax parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
		return (Ajax) GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
	}

	public Builder newBuilderForType() {
		return newBuilder();
	}

	public static Builder newBuilder() {
		return DEFAULT_INSTANCE.toBuilder();
	}

	public static Builder newBuilder(Ajax prototype) {
		return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
	}

	public Builder toBuilder() {
		return this == DEFAULT_INSTANCE ? new Builder(null) : new Builder(null).mergeFrom(this);
	}

	protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
		Builder builder = new Builder(parent);
		return builder;
	}

	public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AjaxOrBuilder {
		private int bitField0_;

		public static final Descriptors.Descriptor getDescriptor() {
			return ActionOuterClass.internal_static_com_tingyun_proto_Ajax_descriptor;
		}

		protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
			return ActionOuterClass.internal_static_com_tingyun_proto_Ajax_fieldAccessorTable.ensureFieldAccessorsInitialized(Ajax.class, Builder.class);
		}

		private Builder() {
			maybeForceBuilderInitialization();
		}

		private Builder(GeneratedMessageV3.BuilderParent parent) {
			super();
			maybeForceBuilderInitialization();
		}

		private void maybeForceBuilderInitialization() {
			if (Ajax.alwaysUseFieldBuilders) {
				getAjaxesFieldBuilder();
				getTimersFieldBuilder();
				getIframesFieldBuilder();
				getCrossPagesFieldBuilder();
			}
		}

		public Builder clear() {
			super.clear();
			this.host_ = "";

			this.uri_ = "";

			this.requestMethod_ = "";

			this.protocol_ = "";

			this.requestUrl_ = "";

			this.uriRuleId_ = 0;

			this.httpCode_ = 0;

			this.bytesSend_ = 0L;

			this.bytesReceived_ = 0L;

			this.start_ = 0L;

			this.end_ = 0L;

			this.responseTime_ = 0;

			this.applicationServerTime_ = 0;

			this.callbackTime_ = 0;

			this.networkTime_ = 0;

			this.jsError_ = false;

			this.operaParam_ = "";

			this.sAppId_ = 0;

			this.sAppInstanceId_ = 0;

			this.sTname_ = "";

			this.sTid_ = "";

			this.sDuration_ = "";

			this.sUser_ = "";

			this.sBid_ = "";

			this.sBer_ = "";

			this.sIsError_ = "";

			this.state_ = 0;

			this.ignore_ = false;
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
			this.operaAllParam_ = "";

			this.spe_ = false;

			this.subType_ = "";

			this.context_ = "";

			return this;
		}

		public Descriptors.Descriptor getDescriptorForType() {
			return ActionOuterClass.internal_static_com_tingyun_proto_Ajax_descriptor;
		}

		public Ajax getDefaultInstanceForType() {
			return Ajax.getDefaultInstance();
		}

		public Ajax build() {
			Ajax result = buildPartial();
			if (!result.isInitialized()) {
				throw newUninitializedMessageException(result);
			}
			return result;
		}

		public Ajax buildPartial() {
			Ajax result = new Ajax(this);
			int from_bitField0_ = this.bitField0_;
			result.host_ = this.host_;
			result.uri_ = this.uri_;
			result.requestMethod_ = this.requestMethod_;
			result.protocol_ = this.protocol_;
			result.requestUrl_ = this.requestUrl_;
			result.uriRuleId_ = this.uriRuleId_;
			result.httpCode_ = this.httpCode_;
			result.bytesSend_ = this.bytesSend_;
			result.bytesReceived_ = this.bytesReceived_;
			result.start_ = this.start_;
			result.end_ = this.end_;
			result.responseTime_ = this.responseTime_;
			result.applicationServerTime_ = this.applicationServerTime_;
			result.callbackTime_ = this.callbackTime_;
			result.networkTime_ = this.networkTime_;
			result.jsError_ = this.jsError_;
			result.operaParam_ = this.operaParam_;
			result.sAppId_ = this.sAppId_;
			result.sAppInstanceId_ = this.sAppInstanceId_;
			result.sTname_ = this.sTname_;
			result.sTid_ = this.sTid_;
			result.sDuration_ = this.sDuration_;
			result.sUser_ = this.sUser_;
			result.sBid_ = this.sBid_;
			result.sBer_ = this.sBer_;
			result.sIsError_ = this.sIsError_;
			result.state_ = this.state_;
			result.ignore_ = this.ignore_;
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
			result.operaAllParam_ = this.operaAllParam_;
			result.spe_ = this.spe_;
			result.subType_ = this.subType_;
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
			if ((other instanceof Ajax)) {
				return mergeFrom((Ajax) other);
			}
			super.mergeFrom(other);
			return this;
		}

		public Builder mergeFrom(Ajax other) {
			if (other == Ajax.getDefaultInstance()) {
				return this;
			}
			if (!other.getHost().isEmpty()) {
				this.host_ = other.host_;
				onChanged();
			}
			if (!other.getUri().isEmpty()) {
				this.uri_ = other.uri_;
				onChanged();
			}
			if (!other.getRequestMethod().isEmpty()) {
				this.requestMethod_ = other.requestMethod_;
				onChanged();
			}
			if (!other.getProtocol().isEmpty()) {
				this.protocol_ = other.protocol_;
				onChanged();
			}
			if (!other.getRequestUrl().isEmpty()) {
				this.requestUrl_ = other.requestUrl_;
				onChanged();
			}
			if (other.getUriRuleId() != 0) {
				setUriRuleId(other.getUriRuleId());
			}
			if (other.getHttpCode() != 0) {
				setHttpCode(other.getHttpCode());
			}
			if (other.getBytesSend() != 0L) {
				setBytesSend(other.getBytesSend());
			}
			if (other.getBytesReceived() != 0L) {
				setBytesReceived(other.getBytesReceived());
			}
			if (other.getStart() != 0L) {
				setStart(other.getStart());
			}
			if (other.getEnd() != 0L) {
				setEnd(other.getEnd());
			}
			if (other.getResponseTime() != 0) {
				setResponseTime(other.getResponseTime());
			}
			if (other.getApplicationServerTime() != 0) {
				setApplicationServerTime(other.getApplicationServerTime());
			}
			if (other.getCallbackTime() != 0) {
				setCallbackTime(other.getCallbackTime());
			}
			if (other.getNetworkTime() != 0) {
				setNetworkTime(other.getNetworkTime());
			}
			if (other.getJsError()) {
				setJsError(other.getJsError());
			}
			if (!other.getOperaParam().isEmpty()) {
				this.operaParam_ = other.operaParam_;
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
			if (other.state_ != 0) {
				setStateValue(other.getStateValue());
			}
			if (other.getIgnore()) {
				setIgnore(other.getIgnore());
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

					this.ajaxesBuilder_ = (Ajax.alwaysUseFieldBuilders ? getAjaxesFieldBuilder() : null);
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

					this.timersBuilder_ = (Ajax.alwaysUseFieldBuilders ? getTimersFieldBuilder() : null);
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

					this.iframesBuilder_ = (Ajax.alwaysUseFieldBuilders ? getIframesFieldBuilder() : null);
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

					this.crossPagesBuilder_ = (Ajax.alwaysUseFieldBuilders ? getCrossPagesFieldBuilder() : null);
				} else {
					this.crossPagesBuilder_.addAllMessages(other.crossPages_);
				}
			}
			if (!other.getOperaAllParam().isEmpty()) {
				this.operaAllParam_ = other.operaAllParam_;
				onChanged();
			}
			if (other.getSpe()) {
				setSpe(other.getSpe());
			}
			if (!other.getSubType().isEmpty()) {
				this.subType_ = other.subType_;
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
			Ajax parsedMessage = null;
			try {
				parsedMessage = (Ajax) Ajax.PARSER.parsePartialFrom(input, extensionRegistry);
			} catch (InvalidProtocolBufferException e) {
				parsedMessage = (Ajax) e.getUnfinishedMessage();
				throw e.unwrapIOException();
			} finally {
				if (parsedMessage != null) {
					mergeFrom(parsedMessage);
				}
			}
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
			this.host_ = Ajax.getDefaultInstance().getHost();
			onChanged();
			return this;
		}

		public Builder setHostBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Ajax.checkByteStringIsUtf8(value);

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
			this.uri_ = Ajax.getDefaultInstance().getUri();
			onChanged();
			return this;
		}

		public Builder setUriBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Ajax.checkByteStringIsUtf8(value);

			this.uri_ = value;
			onChanged();
			return this;
		}

		private Object requestMethod_ = "";

		public String getRequestMethod() {
			Object ref = this.requestMethod_;
			if (!(ref instanceof String)) {
				ByteString bs = (ByteString) ref;

				String s = bs.toStringUtf8();
				this.requestMethod_ = s;
				return s;
			}
			return (String) ref;
		}

		public ByteString getRequestMethodBytes() {
			Object ref = this.requestMethod_;
			if ((ref instanceof String)) {
				ByteString b = ByteString.copyFromUtf8((String) ref);

				this.requestMethod_ = b;
				return b;
			}
			return (ByteString) ref;
		}

		public Builder setRequestMethod(String value) {
			if (value == null) {
				throw new NullPointerException();
			}
			this.requestMethod_ = value;
			onChanged();
			return this;
		}

		public Builder clearRequestMethod() {
			this.requestMethod_ = Ajax.getDefaultInstance().getRequestMethod();
			onChanged();
			return this;
		}

		public Builder setRequestMethodBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Ajax.checkByteStringIsUtf8(value);

			this.requestMethod_ = value;
			onChanged();
			return this;
		}

		private Object protocol_ = "";

		public String getProtocol() {
			Object ref = this.protocol_;
			if (!(ref instanceof String)) {
				ByteString bs = (ByteString) ref;

				String s = bs.toStringUtf8();
				this.protocol_ = s;
				return s;
			}
			return (String) ref;
		}

		public ByteString getProtocolBytes() {
			Object ref = this.protocol_;
			if ((ref instanceof String)) {
				ByteString b = ByteString.copyFromUtf8((String) ref);

				this.protocol_ = b;
				return b;
			}
			return (ByteString) ref;
		}

		public Builder setProtocol(String value) {
			if (value == null) {
				throw new NullPointerException();
			}
			this.protocol_ = value;
			onChanged();
			return this;
		}

		public Builder clearProtocol() {
			this.protocol_ = Ajax.getDefaultInstance().getProtocol();
			onChanged();
			return this;
		}

		public Builder setProtocolBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Ajax.checkByteStringIsUtf8(value);

			this.protocol_ = value;
			onChanged();
			return this;
		}

		private Object requestUrl_ = "";
		private int uriRuleId_;
		private int httpCode_;
		private long bytesSend_;
		private long bytesReceived_;
		private long start_;
		private long end_;
		private int responseTime_;
		private int applicationServerTime_;
		private int callbackTime_;
		private int networkTime_;
		private boolean jsError_;

		public String getRequestUrl() {
			Object ref = this.requestUrl_;
			if (!(ref instanceof String)) {
				ByteString bs = (ByteString) ref;

				String s = bs.toStringUtf8();
				this.requestUrl_ = s;
				return s;
			}
			return (String) ref;
		}

		public ByteString getRequestUrlBytes() {
			Object ref = this.requestUrl_;
			if ((ref instanceof String)) {
				ByteString b = ByteString.copyFromUtf8((String) ref);

				this.requestUrl_ = b;
				return b;
			}
			return (ByteString) ref;
		}

		public Builder setRequestUrl(String value) {
			if (value == null) {
				throw new NullPointerException();
			}
			this.requestUrl_ = value;
			onChanged();
			return this;
		}

		public Builder clearRequestUrl() {
			this.requestUrl_ = Ajax.getDefaultInstance().getRequestUrl();
			onChanged();
			return this;
		}

		public Builder setRequestUrlBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Ajax.checkByteStringIsUtf8(value);

			this.requestUrl_ = value;
			onChanged();
			return this;
		}

		public int getUriRuleId() {
			return this.uriRuleId_;
		}

		public Builder setUriRuleId(int value) {
			this.uriRuleId_ = value;
			onChanged();
			return this;
		}

		public Builder clearUriRuleId() {
			this.uriRuleId_ = 0;
			onChanged();
			return this;
		}

		public int getHttpCode() {
			return this.httpCode_;
		}

		public Builder setHttpCode(int value) {
			this.httpCode_ = value;
			onChanged();
			return this;
		}

		public Builder clearHttpCode() {
			this.httpCode_ = 0;
			onChanged();
			return this;
		}

		public long getBytesSend() {
			return this.bytesSend_;
		}

		public Builder setBytesSend(long value) {
			this.bytesSend_ = value;
			onChanged();
			return this;
		}

		public Builder clearBytesSend() {
			this.bytesSend_ = 0L;
			onChanged();
			return this;
		}

		public long getBytesReceived() {
			return this.bytesReceived_;
		}

		public Builder setBytesReceived(long value) {
			this.bytesReceived_ = value;
			onChanged();
			return this;
		}

		public Builder clearBytesReceived() {
			this.bytesReceived_ = 0L;
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

		public int getResponseTime() {
			return this.responseTime_;
		}

		public Builder setResponseTime(int value) {
			this.responseTime_ = value;
			onChanged();
			return this;
		}

		public Builder clearResponseTime() {
			this.responseTime_ = 0;
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

		public int getCallbackTime() {
			return this.callbackTime_;
		}

		public Builder setCallbackTime(int value) {
			this.callbackTime_ = value;
			onChanged();
			return this;
		}

		public Builder clearCallbackTime() {
			this.callbackTime_ = 0;
			onChanged();
			return this;
		}

		public int getNetworkTime() {
			return this.networkTime_;
		}

		public Builder setNetworkTime(int value) {
			this.networkTime_ = value;
			onChanged();
			return this;
		}

		public Builder clearNetworkTime() {
			this.networkTime_ = 0;
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

		private Object operaParam_ = "";
		private int sAppId_;
		private int sAppInstanceId_;

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
			this.operaParam_ = Ajax.getDefaultInstance().getOperaParam();
			onChanged();
			return this;
		}

		public Builder setOperaParamBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Ajax.checkByteStringIsUtf8(value);

			this.operaParam_ = value;
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
			this.sTname_ = Ajax.getDefaultInstance().getSTname();
			onChanged();
			return this;
		}

		public Builder setSTnameBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Ajax.checkByteStringIsUtf8(value);

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
			this.sTid_ = Ajax.getDefaultInstance().getSTid();
			onChanged();
			return this;
		}

		public Builder setSTidBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Ajax.checkByteStringIsUtf8(value);

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
			this.sDuration_ = Ajax.getDefaultInstance().getSDuration();
			onChanged();
			return this;
		}

		public Builder setSDurationBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Ajax.checkByteStringIsUtf8(value);

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
			this.sUser_ = Ajax.getDefaultInstance().getSUser();
			onChanged();
			return this;
		}

		public Builder setSUserBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Ajax.checkByteStringIsUtf8(value);

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
			this.sBid_ = Ajax.getDefaultInstance().getSBid();
			onChanged();
			return this;
		}

		public Builder setSBidBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Ajax.checkByteStringIsUtf8(value);

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
			this.sBer_ = Ajax.getDefaultInstance().getSBer();
			onChanged();
			return this;
		}

		public Builder setSBerBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Ajax.checkByteStringIsUtf8(value);

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
			this.sIsError_ = Ajax.getDefaultInstance().getSIsError();
			onChanged();
			return this;
		}

		public Builder setSIsErrorBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Ajax.checkByteStringIsUtf8(value);

			this.sIsError_ = value;
			onChanged();
			return this;
		}

		private int state_ = 0;
		private boolean ignore_;

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

		public boolean getIgnore() {
			return this.ignore_;
		}

		public Builder setIgnore(boolean value) {
			this.ignore_ = value;
			onChanged();
			return this;
		}

		public Builder clearIgnore() {
			this.ignore_ = false;
			onChanged();
			return this;
		}

		private List<Ajax> ajaxes_ = Collections.emptyList();
		private RepeatedFieldBuilderV3<Ajax, Builder, AjaxOrBuilder> ajaxesBuilder_;

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

		public Builder setAjaxes(int index, Builder builderForValue) {
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

		public Builder addAjaxes(Builder builderForValue) {
			if (this.ajaxesBuilder_ == null) {
				ensureAjaxesIsMutable();
				this.ajaxes_.add(builderForValue.build());
				onChanged();
			} else {
				this.ajaxesBuilder_.addMessage(builderForValue.build());
			}
			return this;
		}

		public Builder addAjaxes(int index, Builder builderForValue) {
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

		public Builder getAjaxesBuilder(int index) {
			return (Builder) getAjaxesFieldBuilder().getBuilder(index);
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

		public Builder addAjaxesBuilder() {
			return (Builder) getAjaxesFieldBuilder().addBuilder(Ajax.getDefaultInstance());
		}

		public Builder addAjaxesBuilder(int index) {
			return (Builder) getAjaxesFieldBuilder().addBuilder(index, Ajax.getDefaultInstance());
		}

		public List<Builder> getAjaxesBuilderList() {
			return getAjaxesFieldBuilder().getBuilderList();
		}

		private RepeatedFieldBuilderV3<Ajax, Builder, AjaxOrBuilder> getAjaxesFieldBuilder() {
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

		private Object operaAllParam_ = "";
		private boolean spe_;

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
			this.operaAllParam_ = Ajax.getDefaultInstance().getOperaAllParam();
			onChanged();
			return this;
		}

		public Builder setOperaAllParamBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Ajax.checkByteStringIsUtf8(value);

			this.operaAllParam_ = value;
			onChanged();
			return this;
		}

		public boolean getSpe() {
			return this.spe_;
		}

		public Builder setSpe(boolean value) {
			this.spe_ = value;
			onChanged();
			return this;
		}

		public Builder clearSpe() {
			this.spe_ = false;
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
			this.subType_ = Ajax.getDefaultInstance().getSubType();
			onChanged();
			return this;
		}

		public Builder setSubTypeBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Ajax.checkByteStringIsUtf8(value);

			this.subType_ = value;
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
			this.context_ = Ajax.getDefaultInstance().getContext();
			onChanged();
			return this;
		}

		public Builder setContextBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Ajax.checkByteStringIsUtf8(value);

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

	private static final Ajax DEFAULT_INSTANCE = new Ajax();

	public static Ajax getDefaultInstance() {
		return DEFAULT_INSTANCE;
	}

	private static final Parser<Ajax> PARSER = new AbstractParser() {
		public Ajax parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
			return new Ajax(input, extensionRegistry);
		}
	};

	public static Parser<Ajax> parser() {
		return PARSER;
	}

	public Parser<Ajax> getParserForType() {
		return PARSER;
	}

	public Ajax getDefaultInstanceForType() {
		return DEFAULT_INSTANCE;
	}
}
