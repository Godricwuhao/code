package com.unicom.bean;

import com.google.protobuf.*;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class Action extends GeneratedMessageV3 implements ActionOrBuilder {

	private static final long serialVersionUID = 0L;
	public static final int TIMESTAMP_FIELD_NUMBER = 1;
	private long timestamp_;
	public static final int BROWSER_APPLICATION_ID_FIELD_NUMBER = 2;
	private int browserApplicationId_;
	public static final int S_APP_ID_FIELD_NUMBER = 3;
	private int sAppId_;
	public static final int S_APP_INSTANCE_ID_FIELD_NUMBER = 4;
	private int sAppInstanceId_;
	public static final int HOST_FIELD_NUMBER = 5;
	private volatile Object host_;
	public static final int URI_FIELD_NUMBER = 6;
	private volatile Object uri_;
	public static final int CLIENT_IP_FIELD_NUMBER = 7;
	private volatile Object clientIp_;
	public static final int COUNTRY_ID_FIELD_NUMBER = 8;
	private int countryId_;
	public static final int REGION_ID_FIELD_NUMBER = 9;
	private int regionId_;
	public static final int CITY_ID_FIELD_NUMBER = 10;
	private int cityId_;
	public static final int CARRIER_ID_FIELD_NUMBER = 11;
	private int carrierId_;
	public static final int ACCESS_MODE_FIELD_NUMBER = 12;
	private int accessMode_;
	public static final int CONNECT_TYPE_FIELD_NUMBER = 13;
	private int connectType_;
	public static final int WEB_BROWSER_FIELD_NUMBER = 14;
	private volatile Object webBrowser_;
	public static final int WEB_BROWSER_VERSION_FIELD_NUMBER = 15;
	private volatile Object webBrowserVersion_;
	public static final int MODULE_ID_FIELD_NUMBER = 16;
	private int moduleId_;
	public static final int MODULE_RULE_FIELD_NUMBER = 17;
	private volatile Object moduleRule_;
	public static final int URI_RULE_ID_FIELD_NUMBER = 18;
	private int uriRuleId_;
	public static final int REQUEST_METHOD_FIELD_NUMBER = 19;
	private volatile Object requestMethod_;
	public static final int PROTOCOL_FIELD_NUMBER = 20;
	private volatile Object protocol_;
	public static final int REQUEST_URL_FIELD_NUMBER = 21;
	private volatile Object requestUrl_;
	public static final int DEVICE_ID_FIELD_NUMBER = 22;
	private volatile Object deviceId_;
	public static final int SESSION_ID_FIELD_NUMBER = 23;
	private volatile Object sessionId_;
	public static final int TYPE_FIELD_NUMBER = 24;
	private int type_;
	public static final int STATE_FIELD_NUMBER = 25;
	private int state_;
	public static final int SUB_TYPE_FIELD_NUMBER = 26;
	private volatile Object subType_;
	public static final int START_FIELD_NUMBER = 27;
	private long start_;
	public static final int END_FIELD_NUMBER = 28;
	private long end_;
	public static final int PVID_FIELD_NUMBER = 29;
	private volatile Object pvid_;
	public static final int OPERA_PARAM_FIELD_NUMBER = 30;
	private volatile Object operaParam_;
	public static final int AGENT_UPLOAD_TIME_FIELD_NUMBER = 31;
	private long agentUploadTime_;
	public static final int UA_FIELD_NUMBER = 32;
	private volatile Object ua_;
	public static final int SYSTEM_FIELD_NUMBER = 33;
	private volatile Object system_;
	public static final int RESOLUTION_FIELD_NUMBER = 34;
	private volatile Object resolution_;
	public static final int USER_ID_FIELD_NUMBER = 35;
	private volatile Object userId_;
	public static final int SESSION_START_TIME_FIELD_NUMBER = 36;
	private long sessionStartTime_;
	public static final int VERSION_FIELD_NUMBER = 37;
	private volatile Object version_;
	public static final int PF_FIELD_NUMBER = 40;
	private Pf pf_;
	public static final int AJAX_FIELD_NUMBER = 41;
	private Ajax ajax_;
	public static final int EVENT_FIELD_NUMBER = 42;
	private Event event_;
	public static final int TIMER_FIELD_NUMBER = 43;
	private Timer timer_;
	public static final int IFRAME_FIELD_NUMBER = 44;
	private Iframe iframe_;
	public static final int IMMEDIATEEVENT_FIELD_NUMBER = 45;
	private ImmediateEvent immediateEvent_;
	public static final int SESSION_FIELD_NUMBER = 46;
	private Session session_;
	public static final int CONTEXT_FIELD_NUMBER = 47;
	private volatile Object context_;
	public static final int TARGET_SOURCE_FIELD_NUMBER = 48;
	private int targetSource_;
	public static final int AGREEMENT_ID_FIELD_NUMBER = 49;
	private int agreementId_;

	private Action(GeneratedMessageV3.Builder<?> builder) {
		super(builder);
	}

	private Action() {
		this.host_ = "";
		this.uri_ = "";
		this.clientIp_ = "";
		this.webBrowser_ = "";
		this.webBrowserVersion_ = "";
		this.moduleRule_ = "";
		this.requestMethod_ = "";
		this.protocol_ = "";
		this.requestUrl_ = "";
		this.deviceId_ = "";
		this.sessionId_ = "";
		this.type_ = 0;
		this.state_ = 0;
		this.subType_ = "";
		this.pvid_ = "";
		this.operaParam_ = "";
		this.ua_ = "";
		this.system_ = "";
		this.resolution_ = "";
		this.userId_ = "";
		this.version_ = "";
		this.context_ = "";
		this.targetSource_ = 0;
	}

	protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
		return new Action();
	}

	public final UnknownFieldSet getUnknownFields() {
		return this.unknownFields;
	}

	private Action(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
						this.timestamp_ = input.readInt64();
						break;
					case 16:
						this.browserApplicationId_ = input.readInt32();
						break;
					case 24:
						this.sAppId_ = input.readInt32();
						break;
					case 32:
						this.sAppInstanceId_ = input.readInt32();
						break;
					case 42:
						this.host_ = input.readStringRequireUtf8();
						break;
					case 50:
						this.uri_ = input.readStringRequireUtf8();
						break;
					case 58:
						this.clientIp_ = input.readStringRequireUtf8();
						break;
					case 64:
						this.countryId_ = input.readInt32();
						break;
					case 72:
						this.regionId_ = input.readInt32();
						break;
					case 80:
						this.cityId_ = input.readInt32();
						break;
					case 88:
						this.carrierId_ = input.readInt32();
						break;
					case 96:
						this.accessMode_ = input.readInt32();
						break;
					case 104:
						this.connectType_ = input.readInt32();
						break;
					case 114:
						String s = input.readStringRequireUtf8();

						this.webBrowser_ = s;
						break;
					case 122:
						this.webBrowserVersion_ = input.readStringRequireUtf8();
						break;
					case 128:
						this.moduleId_ = input.readInt32();
						break;
					case 138:
						this.moduleRule_ = input.readStringRequireUtf8();
						break;
					case 144:
						this.uriRuleId_ = input.readInt32();
						break;
					case 154:
						this.requestMethod_ = input.readStringRequireUtf8();
						break;
					case 162:
						this.protocol_ = input.readStringRequireUtf8();
						break;
					case 170:
						this.requestUrl_ = input.readStringRequireUtf8();
						break;
					case 178:
						this.deviceId_ = input.readStringRequireUtf8();
						break;
					case 186:
						this.sessionId_ = input.readStringRequireUtf8();
						break;
					case 192:
						this.type_ = input.readEnum();
						break;
					case 200:
						this.state_ = input.readEnum();
						break;
					case 210:
						this.subType_ = input.readStringRequireUtf8();
						break;
					case 216:
						this.start_ = input.readInt64();
						break;
					case 224:
						this.end_ = input.readInt64();
						break;
					case 234:
						this.pvid_ = input.readStringRequireUtf8();
						break;
					case 242:
						this.operaParam_ = input.readStringRequireUtf8();
						break;
					case 248:
						this.agentUploadTime_ = input.readInt64();
						break;
					case 258:
						this.ua_ = input.readStringRequireUtf8();
						break;
					case 266:
						this.system_ = input.readStringRequireUtf8();
						break;
					case 274:
						this.resolution_ = input.readStringRequireUtf8();
						break;
					case 282:
						this.userId_ = input.readStringRequireUtf8();
						break;
					case 288:
						this.sessionStartTime_ = input.readInt64();
						break;
					case 298:
						this.version_ = input.readStringRequireUtf8();
						break;
					case 322:
						Pf.Builder pfBuilder = null;
						if (this.pf_ != null) {
							pfBuilder = this.pf_.toBuilder();
						}
						this.pf_ = ((Pf) input.readMessage(Pf.parser(), extensionRegistry));
						if (pfBuilder != null) {
							pfBuilder.mergeFrom(this.pf_);
							this.pf_ = pfBuilder.buildPartial();
						}
						break;
					case 330:
						Ajax.Builder ajaxBuilder = null;
						if (this.ajax_ != null) {
							ajaxBuilder = this.ajax_.toBuilder();
						}
						this.ajax_ = ((Ajax) input.readMessage(Ajax.parser(), extensionRegistry));
						if (ajaxBuilder != null) {
							ajaxBuilder.mergeFrom(this.ajax_);
							this.ajax_ = ajaxBuilder.buildPartial();
						}
						break;
					case 338:
						Event.Builder eventBuilder = null;
						if (this.event_ != null) {
							eventBuilder = this.event_.toBuilder();
						}
						this.event_ = ((Event) input.readMessage(Event.parser(), extensionRegistry));
						if (eventBuilder != null) {
							eventBuilder.mergeFrom(this.event_);
							this.event_ = eventBuilder.buildPartial();
						}
						break;
					case 346:
						Timer.Builder timerBuilder = null;
						if (this.timer_ != null) {
							timerBuilder = this.timer_.toBuilder();
						}
						this.timer_ = ((Timer) input.readMessage(Timer.parser(), extensionRegistry));
						if (timerBuilder != null) {
							timerBuilder.mergeFrom(this.timer_);
							this.timer_ = timerBuilder.buildPartial();
						}
						break;
					case 354:
						Iframe.Builder iframeBuilder = null;
						if (this.iframe_ != null) {
							iframeBuilder = this.iframe_.toBuilder();
						}
						this.iframe_ = ((Iframe) input.readMessage(Iframe.parser(), extensionRegistry));
						if (iframeBuilder != null) {
							iframeBuilder.mergeFrom(this.iframe_);
							this.iframe_ = iframeBuilder.buildPartial();
						}
						break;
					case 362:
						ImmediateEvent.Builder immediateEventBuilder = null;
						if (this.immediateEvent_ != null) {
							immediateEventBuilder = this.immediateEvent_.toBuilder();
						}
						this.immediateEvent_ = ((ImmediateEvent) input.readMessage(ImmediateEvent.parser(), extensionRegistry));
						if (immediateEventBuilder != null) {
							immediateEventBuilder.mergeFrom(this.immediateEvent_);
							this.immediateEvent_ = immediateEventBuilder.buildPartial();
						}
						break;
					case 370:
						Session.Builder sessionBuilder = null;
						if (this.session_ != null) {
							sessionBuilder = this.session_.toBuilder();
						}
						this.session_ = ((Session) input.readMessage(Session.parser(), extensionRegistry));
						if (sessionBuilder != null) {
							sessionBuilder.mergeFrom(this.session_);
							this.session_ = sessionBuilder.buildPartial();
						}
						break;
					case 378:
						this.context_ = input.readStringRequireUtf8();
						break;
					case 384:
						this.targetSource_ = input.readEnum();
						break;
					case 392:
						this.agreementId_ = input.readInt32();
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
		return ActionOuterClass.internal_static_com_tingyun_proto_Action_descriptor;
	}

	protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
		return ActionOuterClass.internal_static_com_tingyun_proto_Action_fieldAccessorTable.ensureFieldAccessorsInitialized(Action.class, Builder.class);
	}

	public static enum ActionType implements ProtocolMessageEnum {
		UNKNOWN(0), PF(1), AJAX(2), EVENT(3), TIMER(4), IFRAME(5), CROSSPAGE(6), IMMEDIATEEVENT(7), SESSION(8), UNRECOGNIZED(-1);

		public static final int UNKNOWN_VALUE = 0;
		public static final int PF_VALUE = 1;
		public static final int AJAX_VALUE = 2;
		public static final int EVENT_VALUE = 3;
		public static final int TIMER_VALUE = 4;
		public static final int IFRAME_VALUE = 5;
		public static final int CROSSPAGE_VALUE = 6;
		public static final int IMMEDIATEEVENT_VALUE = 7;
		public static final int SESSION_VALUE = 8;

		public final int getNumber() {
			if (this == UNRECOGNIZED) {
				throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
			}
			return this.value;
		}

		@Deprecated
		public static ActionType valueOf(int value) {
			return forNumber(value);
		}

		public static ActionType forNumber(int value) {
			switch (value) {
				case 0:
					return UNKNOWN;
				case 1:
					return PF;
				case 2:
					return AJAX;
				case 3:
					return EVENT;
				case 4:
					return TIMER;
				case 5:
					return IFRAME;
				case 6:
					return CROSSPAGE;
				case 7:
					return IMMEDIATEEVENT;
				case 8:
					return SESSION;
			}
			return null;
		}

		public static Internal.EnumLiteMap<ActionType> internalGetValueMap() {
			return internalValueMap;
		}

		private static final Internal.EnumLiteMap<ActionType> internalValueMap = new Internal.EnumLiteMap() {
			public ActionType findValueByNumber(int number) {
				return ActionType.forNumber(number);
			}
		};

		public final Descriptors.EnumValueDescriptor getValueDescriptor() {
			return (Descriptors.EnumValueDescriptor) getDescriptor().getValues().get(ordinal());
		}

		public final Descriptors.EnumDescriptor getDescriptorForType() {
			return getDescriptor();
		}

		public static final Descriptors.EnumDescriptor getDescriptor() {
			return (Descriptors.EnumDescriptor) Action.getDescriptor().getEnumTypes().get(0);
		}

		private static final ActionType[] VALUES = values();
		private final int value;

		public static ActionType valueOf(Descriptors.EnumValueDescriptor desc) {
			if (desc.getType() != getDescriptor()) {
				throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
			}
			if (desc.getIndex() == -1) {
				return UNRECOGNIZED;
			}
			return VALUES[desc.getIndex()];
		}

		private ActionType(int value) {
			this.value = value;
		}
	}

	public static enum TargetSource implements ProtocolMessageEnum {
		WEB(0), MP(1), UNRECOGNIZED(-1);

		public static final int WEB_VALUE = 0;
		public static final int MP_VALUE = 1;

		public final int getNumber() {
			if (this == UNRECOGNIZED) {
				throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
			}
			return this.value;
		}

		@Deprecated
		public static TargetSource valueOf(int value) {
			return forNumber(value);
		}

		public static TargetSource forNumber(int value) {
			switch (value) {
				case 0:
					return WEB;
				case 1:
					return MP;
			}
			return null;
		}

		public static Internal.EnumLiteMap<TargetSource> internalGetValueMap() {
			return internalValueMap;
		}

		private static final Internal.EnumLiteMap<TargetSource> internalValueMap = new Internal.EnumLiteMap() {
			public TargetSource findValueByNumber(int number) {
				return TargetSource.forNumber(number);
			}
		};

		public final Descriptors.EnumValueDescriptor getValueDescriptor() {
			return (Descriptors.EnumValueDescriptor) getDescriptor().getValues().get(ordinal());
		}

		public final Descriptors.EnumDescriptor getDescriptorForType() {
			return getDescriptor();
		}

		public static final Descriptors.EnumDescriptor getDescriptor() {
			return (Descriptors.EnumDescriptor) Action.getDescriptor().getEnumTypes().get(1);
		}

		private static final TargetSource[] VALUES = values();
		private final int value;

		public static TargetSource valueOf(Descriptors.EnumValueDescriptor desc) {
			if (desc.getType() != getDescriptor()) {
				throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
			}
			if (desc.getIndex() == -1) {
				return UNRECOGNIZED;
			}
			return VALUES[desc.getIndex()];
		}

		private TargetSource(int value) {
			this.value = value;
		}
	}

	public long getTimestamp() {
		return this.timestamp_;
	}

	public int getBrowserApplicationId() {
		return this.browserApplicationId_;
	}

	public int getSAppId() {
		return this.sAppId_;
	}

	public int getSAppInstanceId() {
		return this.sAppInstanceId_;
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

	public String getClientIp() {
		Object ref = this.clientIp_;
		if ((ref instanceof String)) {
			return (String) ref;
		}
		ByteString bs = (ByteString) ref;

		String s = bs.toStringUtf8();
		this.clientIp_ = s;
		return s;
	}

	public ByteString getClientIpBytes() {
		Object ref = this.clientIp_;
		if ((ref instanceof String)) {
			ByteString b = ByteString.copyFromUtf8((String) ref);

			this.clientIp_ = b;
			return b;
		}
		return (ByteString) ref;
	}

	public int getCountryId() {
		return this.countryId_;
	}

	public int getRegionId() {
		return this.regionId_;
	}

	public int getCityId() {
		return this.cityId_;
	}

	public int getCarrierId() {
		return this.carrierId_;
	}

	public int getAccessMode() {
		return this.accessMode_;
	}

	public int getConnectType() {
		return this.connectType_;
	}

	public String getWebBrowser() {
		Object ref = this.webBrowser_;
		if ((ref instanceof String)) {
			return (String) ref;
		}
		ByteString bs = (ByteString) ref;

		String s = bs.toStringUtf8();
		this.webBrowser_ = s;
		return s;
	}

	public ByteString getWebBrowserBytes() {
		Object ref = this.webBrowser_;
		if ((ref instanceof String)) {
			ByteString b = ByteString.copyFromUtf8((String) ref);

			this.webBrowser_ = b;
			return b;
		}
		return (ByteString) ref;
	}

	public String getWebBrowserVersion() {
		Object ref = this.webBrowserVersion_;
		if ((ref instanceof String)) {
			return (String) ref;
		}
		ByteString bs = (ByteString) ref;

		String s = bs.toStringUtf8();
		this.webBrowserVersion_ = s;
		return s;
	}

	public ByteString getWebBrowserVersionBytes() {
		Object ref = this.webBrowserVersion_;
		if ((ref instanceof String)) {
			ByteString b = ByteString.copyFromUtf8((String) ref);

			this.webBrowserVersion_ = b;
			return b;
		}
		return (ByteString) ref;
	}

	public int getModuleId() {
		return this.moduleId_;
	}

	public String getModuleRule() {
		Object ref = this.moduleRule_;
		if ((ref instanceof String)) {
			return (String) ref;
		}
		ByteString bs = (ByteString) ref;

		String s = bs.toStringUtf8();
		this.moduleRule_ = s;
		return s;
	}

	public ByteString getModuleRuleBytes() {
		Object ref = this.moduleRule_;
		if ((ref instanceof String)) {
			ByteString b = ByteString.copyFromUtf8((String) ref);

			this.moduleRule_ = b;
			return b;
		}
		return (ByteString) ref;
	}

	public int getUriRuleId() {
		return this.uriRuleId_;
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

	public String getDeviceId() {
		Object ref = this.deviceId_;
		if ((ref instanceof String)) {
			return (String) ref;
		}
		ByteString bs = (ByteString) ref;

		String s = bs.toStringUtf8();
		this.deviceId_ = s;
		return s;
	}

	public ByteString getDeviceIdBytes() {
		Object ref = this.deviceId_;
		if ((ref instanceof String)) {
			ByteString b = ByteString.copyFromUtf8((String) ref);

			this.deviceId_ = b;
			return b;
		}
		return (ByteString) ref;
	}

	public String getSessionId() {
		Object ref = this.sessionId_;
		if ((ref instanceof String)) {
			return (String) ref;
		}
		ByteString bs = (ByteString) ref;

		String s = bs.toStringUtf8();
		this.sessionId_ = s;
		return s;
	}

	public ByteString getSessionIdBytes() {
		Object ref = this.sessionId_;
		if ((ref instanceof String)) {
			ByteString b = ByteString.copyFromUtf8((String) ref);

			this.sessionId_ = b;
			return b;
		}
		return (ByteString) ref;
	}

	public int getTypeValue() {
		return this.type_;
	}

	public ActionType getType() {
		ActionType result = ActionType.valueOf(this.type_);
		return result == null ? ActionType.UNRECOGNIZED : result;
	}

	public int getStateValue() {
		return this.state_;
	}

	public ActionState getState() {
		ActionState result = ActionState.valueOf(this.state_);
		return result == null ? ActionState.UNRECOGNIZED : result;
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

	public long getStart() {
		return this.start_;
	}

	public long getEnd() {
		return this.end_;
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

	public long getAgentUploadTime() {
		return this.agentUploadTime_;
	}

	public String getUa() {
		Object ref = this.ua_;
		if ((ref instanceof String)) {
			return (String) ref;
		}
		ByteString bs = (ByteString) ref;

		String s = bs.toStringUtf8();
		this.ua_ = s;
		return s;
	}

	public ByteString getUaBytes() {
		Object ref = this.ua_;
		if ((ref instanceof String)) {
			ByteString b = ByteString.copyFromUtf8((String) ref);

			this.ua_ = b;
			return b;
		}
		return (ByteString) ref;
	}

	public String getSystem() {
		Object ref = this.system_;
		if ((ref instanceof String)) {
			return (String) ref;
		}
		ByteString bs = (ByteString) ref;

		String s = bs.toStringUtf8();
		this.system_ = s;
		return s;
	}

	public ByteString getSystemBytes() {
		Object ref = this.system_;
		if ((ref instanceof String)) {
			ByteString b = ByteString.copyFromUtf8((String) ref);

			this.system_ = b;
			return b;
		}
		return (ByteString) ref;
	}

	public String getResolution() {
		Object ref = this.resolution_;
		if ((ref instanceof String)) {
			return (String) ref;
		}
		ByteString bs = (ByteString) ref;

		String s = bs.toStringUtf8();
		this.resolution_ = s;
		return s;
	}

	public ByteString getResolutionBytes() {
		Object ref = this.resolution_;
		if ((ref instanceof String)) {
			ByteString b = ByteString.copyFromUtf8((String) ref);

			this.resolution_ = b;
			return b;
		}
		return (ByteString) ref;
	}

	public String getUserId() {
		Object ref = this.userId_;
		if ((ref instanceof String)) {
			return (String) ref;
		}
		ByteString bs = (ByteString) ref;

		String s = bs.toStringUtf8();
		this.userId_ = s;
		return s;
	}

	public ByteString getUserIdBytes() {
		Object ref = this.userId_;
		if ((ref instanceof String)) {
			ByteString b = ByteString.copyFromUtf8((String) ref);

			this.userId_ = b;
			return b;
		}
		return (ByteString) ref;
	}

	public long getSessionStartTime() {
		return this.sessionStartTime_;
	}

	public String getVersion() {
		Object ref = this.version_;
		if ((ref instanceof String)) {
			return (String) ref;
		}
		ByteString bs = (ByteString) ref;

		String s = bs.toStringUtf8();
		this.version_ = s;
		return s;
	}

	public ByteString getVersionBytes() {
		Object ref = this.version_;
		if ((ref instanceof String)) {
			ByteString b = ByteString.copyFromUtf8((String) ref);

			this.version_ = b;
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

	public boolean hasAjax() {
		return this.ajax_ != null;
	}

	public Ajax getAjax() {
		return this.ajax_ == null ? Ajax.getDefaultInstance() : this.ajax_;
	}

	public AjaxOrBuilder getAjaxOrBuilder() {
		return getAjax();
	}

	public boolean hasEvent() {
		return this.event_ != null;
	}

	public Event getEvent() {
		return this.event_ == null ? Event.getDefaultInstance() : this.event_;
	}

	public EventOrBuilder getEventOrBuilder() {
		return getEvent();
	}

	public boolean hasTimer() {
		return this.timer_ != null;
	}

	public Timer getTimer() {
		return this.timer_ == null ? Timer.getDefaultInstance() : this.timer_;
	}

	public TimerOrBuilder getTimerOrBuilder() {
		return getTimer();
	}

	public boolean hasIframe() {
		return this.iframe_ != null;
	}

	public Iframe getIframe() {
		return this.iframe_ == null ? Iframe.getDefaultInstance() : this.iframe_;
	}

	public IframeOrBuilder getIframeOrBuilder() {
		return getIframe();
	}

	public boolean hasImmediateEvent() {
		return this.immediateEvent_ != null;
	}

	public ImmediateEvent getImmediateEvent() {
		return this.immediateEvent_ == null ? ImmediateEvent.getDefaultInstance() : this.immediateEvent_;
	}

	public ImmediateEventOrBuilder getImmediateEventOrBuilder() {
		return getImmediateEvent();
	}

	public boolean hasSession() {
		return this.session_ != null;
	}

	public Session getSession() {
		return this.session_ == null ? Session.getDefaultInstance() : this.session_;
	}

	public SessionOrBuilder getSessionOrBuilder() {
		return getSession();
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

	public int getTargetSourceValue() {
		return this.targetSource_;
	}

	public TargetSource getTargetSource() {
		TargetSource result = TargetSource.valueOf(this.targetSource_);
		return result == null ? TargetSource.UNRECOGNIZED : result;
	}

	public int getAgreementId() {
		return this.agreementId_;
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
		if (this.timestamp_ != 0L) {
			output.writeInt64(1, this.timestamp_);
		}
		if (this.browserApplicationId_ != 0) {
			output.writeInt32(2, this.browserApplicationId_);
		}
		if (this.sAppId_ != 0) {
			output.writeInt32(3, this.sAppId_);
		}
		if (this.sAppInstanceId_ != 0) {
			output.writeInt32(4, this.sAppInstanceId_);
		}
		if (!getHostBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 5, this.host_);
		}
		if (!getUriBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 6, this.uri_);
		}
		if (!getClientIpBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 7, this.clientIp_);
		}
		if (this.countryId_ != 0) {
			output.writeInt32(8, this.countryId_);
		}
		if (this.regionId_ != 0) {
			output.writeInt32(9, this.regionId_);
		}
		if (this.cityId_ != 0) {
			output.writeInt32(10, this.cityId_);
		}
		if (this.carrierId_ != 0) {
			output.writeInt32(11, this.carrierId_);
		}
		if (this.accessMode_ != 0) {
			output.writeInt32(12, this.accessMode_);
		}
		if (this.connectType_ != 0) {
			output.writeInt32(13, this.connectType_);
		}
		if (!getWebBrowserBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 14, this.webBrowser_);
		}
		if (!getWebBrowserVersionBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 15, this.webBrowserVersion_);
		}
		if (this.moduleId_ != 0) {
			output.writeInt32(16, this.moduleId_);
		}
		if (!getModuleRuleBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 17, this.moduleRule_);
		}
		if (this.uriRuleId_ != 0) {
			output.writeInt32(18, this.uriRuleId_);
		}
		if (!getRequestMethodBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 19, this.requestMethod_);
		}
		if (!getProtocolBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 20, this.protocol_);
		}
		if (!getRequestUrlBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 21, this.requestUrl_);
		}
		if (!getDeviceIdBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 22, this.deviceId_);
		}
		if (!getSessionIdBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 23, this.sessionId_);
		}
		if (this.type_ != ActionType.UNKNOWN.getNumber()) {
			output.writeEnum(24, this.type_);
		}
		if (this.state_ != ActionState.FINISH.getNumber()) {
			output.writeEnum(25, this.state_);
		}
		if (!getSubTypeBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 26, this.subType_);
		}
		if (this.start_ != 0L) {
			output.writeInt64(27, this.start_);
		}
		if (this.end_ != 0L) {
			output.writeInt64(28, this.end_);
		}
		if (!getPvidBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 29, this.pvid_);
		}
		if (!getOperaParamBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 30, this.operaParam_);
		}
		if (this.agentUploadTime_ != 0L) {
			output.writeInt64(31, this.agentUploadTime_);
		}
		if (!getUaBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 32, this.ua_);
		}
		if (!getSystemBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 33, this.system_);
		}
		if (!getResolutionBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 34, this.resolution_);
		}
		if (!getUserIdBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 35, this.userId_);
		}
		if (this.sessionStartTime_ != 0L) {
			output.writeInt64(36, this.sessionStartTime_);
		}
		if (!getVersionBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 37, this.version_);
		}
		if (this.pf_ != null) {
			output.writeMessage(40, getPf());
		}
		if (this.ajax_ != null) {
			output.writeMessage(41, getAjax());
		}
		if (this.event_ != null) {
			output.writeMessage(42, getEvent());
		}
		if (this.timer_ != null) {
			output.writeMessage(43, getTimer());
		}
		if (this.iframe_ != null) {
			output.writeMessage(44, getIframe());
		}
		if (this.immediateEvent_ != null) {
			output.writeMessage(45, getImmediateEvent());
		}
		if (this.session_ != null) {
			output.writeMessage(46, getSession());
		}
		if (!getContextBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 47, this.context_);
		}
		if (this.targetSource_ != TargetSource.WEB.getNumber()) {
			output.writeEnum(48, this.targetSource_);
		}
		if (this.agreementId_ != 0) {
			output.writeInt32(49, this.agreementId_);
		}
		this.unknownFields.writeTo(output);
	}

	public int getSerializedSize() {
		int size = this.memoizedSize;
		if (size != -1) {
			return size;
		}
		size = 0;
		if (this.timestamp_ != 0L) {
			size = size + CodedOutputStream.computeInt64Size(1, this.timestamp_);
		}
		if (this.browserApplicationId_ != 0) {
			size = size + CodedOutputStream.computeInt32Size(2, this.browserApplicationId_);
		}
		if (this.sAppId_ != 0) {
			size = size + CodedOutputStream.computeInt32Size(3, this.sAppId_);
		}
		if (this.sAppInstanceId_ != 0) {
			size = size + CodedOutputStream.computeInt32Size(4, this.sAppInstanceId_);
		}
		if (!getHostBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(5, this.host_);
		}
		if (!getUriBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(6, this.uri_);
		}
		if (!getClientIpBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(7, this.clientIp_);
		}
		if (this.countryId_ != 0) {
			size = size + CodedOutputStream.computeInt32Size(8, this.countryId_);
		}
		if (this.regionId_ != 0) {
			size = size + CodedOutputStream.computeInt32Size(9, this.regionId_);
		}
		if (this.cityId_ != 0) {
			size = size + CodedOutputStream.computeInt32Size(10, this.cityId_);
		}
		if (this.carrierId_ != 0) {
			size = size + CodedOutputStream.computeInt32Size(11, this.carrierId_);
		}
		if (this.accessMode_ != 0) {
			size = size + CodedOutputStream.computeInt32Size(12, this.accessMode_);
		}
		if (this.connectType_ != 0) {
			size = size + CodedOutputStream.computeInt32Size(13, this.connectType_);
		}
		if (!getWebBrowserBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(14, this.webBrowser_);
		}
		if (!getWebBrowserVersionBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(15, this.webBrowserVersion_);
		}
		if (this.moduleId_ != 0) {
			size = size + CodedOutputStream.computeInt32Size(16, this.moduleId_);
		}
		if (!getModuleRuleBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(17, this.moduleRule_);
		}
		if (this.uriRuleId_ != 0) {
			size = size + CodedOutputStream.computeInt32Size(18, this.uriRuleId_);
		}
		if (!getRequestMethodBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(19, this.requestMethod_);
		}
		if (!getProtocolBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(20, this.protocol_);
		}
		if (!getRequestUrlBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(21, this.requestUrl_);
		}
		if (!getDeviceIdBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(22, this.deviceId_);
		}
		if (!getSessionIdBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(23, this.sessionId_);
		}
		if (this.type_ != ActionType.UNKNOWN.getNumber()) {
			size = size + CodedOutputStream.computeEnumSize(24, this.type_);
		}
		if (this.state_ != ActionState.FINISH.getNumber()) {
			size = size + CodedOutputStream.computeEnumSize(25, this.state_);
		}
		if (!getSubTypeBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(26, this.subType_);
		}
		if (this.start_ != 0L) {
			size = size + CodedOutputStream.computeInt64Size(27, this.start_);
		}
		if (this.end_ != 0L) {
			size = size + CodedOutputStream.computeInt64Size(28, this.end_);
		}
		if (!getPvidBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(29, this.pvid_);
		}
		if (!getOperaParamBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(30, this.operaParam_);
		}
		if (this.agentUploadTime_ != 0L) {
			size = size + CodedOutputStream.computeInt64Size(31, this.agentUploadTime_);
		}
		if (!getUaBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(32, this.ua_);
		}
		if (!getSystemBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(33, this.system_);
		}
		if (!getResolutionBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(34, this.resolution_);
		}
		if (!getUserIdBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(35, this.userId_);
		}
		if (this.sessionStartTime_ != 0L) {
			size = size + CodedOutputStream.computeInt64Size(36, this.sessionStartTime_);
		}
		if (!getVersionBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(37, this.version_);
		}
		if (this.pf_ != null) {
			size = size + CodedOutputStream.computeMessageSize(40, getPf());
		}
		if (this.ajax_ != null) {
			size = size + CodedOutputStream.computeMessageSize(41, getAjax());
		}
		if (this.event_ != null) {
			size = size + CodedOutputStream.computeMessageSize(42, getEvent());
		}
		if (this.timer_ != null) {
			size = size + CodedOutputStream.computeMessageSize(43, getTimer());
		}
		if (this.iframe_ != null) {
			size = size + CodedOutputStream.computeMessageSize(44, getIframe());
		}
		if (this.immediateEvent_ != null) {
			size = size + CodedOutputStream.computeMessageSize(45, getImmediateEvent());
		}
		if (this.session_ != null) {
			size = size + CodedOutputStream.computeMessageSize(46, getSession());
		}
		if (!getContextBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(47, this.context_);
		}
		if (this.targetSource_ != TargetSource.WEB.getNumber()) {
			size = size + CodedOutputStream.computeEnumSize(48, this.targetSource_);
		}
		if (this.agreementId_ != 0) {
			size = size + CodedOutputStream.computeInt32Size(49, this.agreementId_);
		}
		size += this.unknownFields.getSerializedSize();
		this.memoizedSize = size;
		return size;
	}

	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (!(obj instanceof Action)) {
			return super.equals(obj);
		}
		Action other = (Action) obj;
		if (getTimestamp() != other.getTimestamp()) {
			return false;
		}
		if (getBrowserApplicationId() != other.getBrowserApplicationId()) {
			return false;
		}
		if (getSAppId() != other.getSAppId()) {
			return false;
		}
		if (getSAppInstanceId() != other.getSAppInstanceId()) {
			return false;
		}
		if (!getHost().equals(other.getHost())) {
			return false;
		}
		if (!getUri().equals(other.getUri())) {
			return false;
		}
		if (!getClientIp().equals(other.getClientIp())) {
			return false;
		}
		if (getCountryId() != other.getCountryId()) {
			return false;
		}
		if (getRegionId() != other.getRegionId()) {
			return false;
		}
		if (getCityId() != other.getCityId()) {
			return false;
		}
		if (getCarrierId() != other.getCarrierId()) {
			return false;
		}
		if (getAccessMode() != other.getAccessMode()) {
			return false;
		}
		if (getConnectType() != other.getConnectType()) {
			return false;
		}
		if (!getWebBrowser().equals(other.getWebBrowser())) {
			return false;
		}
		if (!getWebBrowserVersion().equals(other.getWebBrowserVersion())) {
			return false;
		}
		if (getModuleId() != other.getModuleId()) {
			return false;
		}
		if (!getModuleRule().equals(other.getModuleRule())) {
			return false;
		}
		if (getUriRuleId() != other.getUriRuleId()) {
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
		if (!getDeviceId().equals(other.getDeviceId())) {
			return false;
		}
		if (!getSessionId().equals(other.getSessionId())) {
			return false;
		}
		if (this.type_ != other.type_) {
			return false;
		}
		if (this.state_ != other.state_) {
			return false;
		}
		if (!getSubType().equals(other.getSubType())) {
			return false;
		}
		if (getStart() != other.getStart()) {
			return false;
		}
		if (getEnd() != other.getEnd()) {
			return false;
		}
		if (!getPvid().equals(other.getPvid())) {
			return false;
		}
		if (!getOperaParam().equals(other.getOperaParam())) {
			return false;
		}
		if (getAgentUploadTime() != other.getAgentUploadTime()) {
			return false;
		}
		if (!getUa().equals(other.getUa())) {
			return false;
		}
		if (!getSystem().equals(other.getSystem())) {
			return false;
		}
		if (!getResolution().equals(other.getResolution())) {
			return false;
		}
		if (!getUserId().equals(other.getUserId())) {
			return false;
		}
		if (getSessionStartTime() != other.getSessionStartTime()) {
			return false;
		}
		if (!getVersion().equals(other.getVersion())) {
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
		if (hasAjax() != other.hasAjax()) {
			return false;
		}
		if (hasAjax()) {
			if (!getAjax().equals(other.getAjax())) {
				return false;
			}
		}
		if (hasEvent() != other.hasEvent()) {
			return false;
		}
		if (hasEvent()) {
			if (!getEvent().equals(other.getEvent())) {
				return false;
			}
		}
		if (hasTimer() != other.hasTimer()) {
			return false;
		}
		if (hasTimer()) {
			if (!getTimer().equals(other.getTimer())) {
				return false;
			}
		}
		if (hasIframe() != other.hasIframe()) {
			return false;
		}
		if (hasIframe()) {
			if (!getIframe().equals(other.getIframe())) {
				return false;
			}
		}
		if (hasImmediateEvent() != other.hasImmediateEvent()) {
			return false;
		}
		if (hasImmediateEvent()) {
			if (!getImmediateEvent().equals(other.getImmediateEvent())) {
				return false;
			}
		}
		if (hasSession() != other.hasSession()) {
			return false;
		}
		if (hasSession()) {
			if (!getSession().equals(other.getSession())) {
				return false;
			}
		}
		if (!getContext().equals(other.getContext())) {
			return false;
		}
		if (this.targetSource_ != other.targetSource_) {
			return false;
		}
		if (getAgreementId() != other.getAgreementId()) {
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
		hash = 53 * hash + Internal.hashLong(getTimestamp());
		hash = 37 * hash + 2;
		hash = 53 * hash + getBrowserApplicationId();
		hash = 37 * hash + 3;
		hash = 53 * hash + getSAppId();
		hash = 37 * hash + 4;
		hash = 53 * hash + getSAppInstanceId();
		hash = 37 * hash + 5;
		hash = 53 * hash + getHost().hashCode();
		hash = 37 * hash + 6;
		hash = 53 * hash + getUri().hashCode();
		hash = 37 * hash + 7;
		hash = 53 * hash + getClientIp().hashCode();
		hash = 37 * hash + 8;
		hash = 53 * hash + getCountryId();
		hash = 37 * hash + 9;
		hash = 53 * hash + getRegionId();
		hash = 37 * hash + 10;
		hash = 53 * hash + getCityId();
		hash = 37 * hash + 11;
		hash = 53 * hash + getCarrierId();
		hash = 37 * hash + 12;
		hash = 53 * hash + getAccessMode();
		hash = 37 * hash + 13;
		hash = 53 * hash + getConnectType();
		hash = 37 * hash + 14;
		hash = 53 * hash + getWebBrowser().hashCode();
		hash = 37 * hash + 15;
		hash = 53 * hash + getWebBrowserVersion().hashCode();
		hash = 37 * hash + 16;
		hash = 53 * hash + getModuleId();
		hash = 37 * hash + 17;
		hash = 53 * hash + getModuleRule().hashCode();
		hash = 37 * hash + 18;
		hash = 53 * hash + getUriRuleId();
		hash = 37 * hash + 19;
		hash = 53 * hash + getRequestMethod().hashCode();
		hash = 37 * hash + 20;
		hash = 53 * hash + getProtocol().hashCode();
		hash = 37 * hash + 21;
		hash = 53 * hash + getRequestUrl().hashCode();
		hash = 37 * hash + 22;
		hash = 53 * hash + getDeviceId().hashCode();
		hash = 37 * hash + 23;
		hash = 53 * hash + getSessionId().hashCode();
		hash = 37 * hash + 24;
		hash = 53 * hash + this.type_;
		hash = 37 * hash + 25;
		hash = 53 * hash + this.state_;
		hash = 37 * hash + 26;
		hash = 53 * hash + getSubType().hashCode();
		hash = 37 * hash + 27;
		hash = 53 * hash + Internal.hashLong(getStart());
		hash = 37 * hash + 28;
		hash = 53 * hash + Internal.hashLong(getEnd());
		hash = 37 * hash + 29;
		hash = 53 * hash + getPvid().hashCode();
		hash = 37 * hash + 30;
		hash = 53 * hash + getOperaParam().hashCode();
		hash = 37 * hash + 31;
		hash = 53 * hash + Internal.hashLong(getAgentUploadTime());
		hash = 37 * hash + 32;
		hash = 53 * hash + getUa().hashCode();
		hash = 37 * hash + 33;
		hash = 53 * hash + getSystem().hashCode();
		hash = 37 * hash + 34;
		hash = 53 * hash + getResolution().hashCode();
		hash = 37 * hash + 35;
		hash = 53 * hash + getUserId().hashCode();
		hash = 37 * hash + 36;
		hash = 53 * hash + Internal.hashLong(getSessionStartTime());
		hash = 37 * hash + 37;
		hash = 53 * hash + getVersion().hashCode();
		if (hasPf()) {
			hash = 37 * hash + 40;
			hash = 53 * hash + getPf().hashCode();
		}
		if (hasAjax()) {
			hash = 37 * hash + 41;
			hash = 53 * hash + getAjax().hashCode();
		}
		if (hasEvent()) {
			hash = 37 * hash + 42;
			hash = 53 * hash + getEvent().hashCode();
		}
		if (hasTimer()) {
			hash = 37 * hash + 43;
			hash = 53 * hash + getTimer().hashCode();
		}
		if (hasIframe()) {
			hash = 37 * hash + 44;
			hash = 53 * hash + getIframe().hashCode();
		}
		if (hasImmediateEvent()) {
			hash = 37 * hash + 45;
			hash = 53 * hash + getImmediateEvent().hashCode();
		}
		if (hasSession()) {
			hash = 37 * hash + 46;
			hash = 53 * hash + getSession().hashCode();
		}
		hash = 37 * hash + 47;
		hash = 53 * hash + getContext().hashCode();
		hash = 37 * hash + 48;
		hash = 53 * hash + this.targetSource_;
		hash = 37 * hash + 49;
		hash = 53 * hash + getAgreementId();
		hash = 29 * hash + this.unknownFields.hashCode();
		this.memoizedHashCode = hash;
		return hash;
	}

	public static Action parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
		return (Action) PARSER.parseFrom(data);
	}

	public static Action parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
		return (Action) PARSER.parseFrom(data, extensionRegistry);
	}

	public static Action parseFrom(ByteString data) throws InvalidProtocolBufferException {
		return (Action) PARSER.parseFrom(data);
	}

	public static Action parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
		return (Action) PARSER.parseFrom(data, extensionRegistry);
	}

	public static Action parseFrom(byte[] data) throws InvalidProtocolBufferException {
		return (Action) PARSER.parseFrom(data);
	}

	public static Action parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
		return (Action) PARSER.parseFrom(data, extensionRegistry);
	}

	public static Action parseFrom(InputStream input) throws IOException {
		return (Action) GeneratedMessageV3.parseWithIOException(PARSER, input);
	}

	public static Action parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
		return (Action) GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
	}

	public static Action parseDelimitedFrom(InputStream input) throws IOException {
		return (Action) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
	}

	public static Action parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
		return (Action) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
	}

	public static Action parseFrom(CodedInputStream input) throws IOException {
		return (Action) GeneratedMessageV3.parseWithIOException(PARSER, input);
	}

	public static Action parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
		return (Action) GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
	}

	public Builder newBuilderForType() {
		return newBuilder();
	}

	public static Builder newBuilder() {
		return DEFAULT_INSTANCE.toBuilder();
	}

	public static Builder newBuilder(Action prototype) {
		return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
	}

	public Builder toBuilder() {
		return this == DEFAULT_INSTANCE ? new Builder(null) : new Builder(null).mergeFrom(this);
	}

	protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
		Builder builder = new Builder(parent);
		return builder;
	}

	public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ActionOrBuilder {
		private long timestamp_;
		private int browserApplicationId_;
		private int sAppId_;
		private int sAppInstanceId_;

		public static final Descriptors.Descriptor getDescriptor() {
			return ActionOuterClass.internal_static_com_tingyun_proto_Action_descriptor;
		}

		protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
			return ActionOuterClass.internal_static_com_tingyun_proto_Action_fieldAccessorTable.ensureFieldAccessorsInitialized(Action.class, Builder.class);
		}

		private Builder() {
			maybeForceBuilderInitialization();
		}

		private Builder(GeneratedMessageV3.BuilderParent parent) {
			super();
			maybeForceBuilderInitialization();
		}

		private void maybeForceBuilderInitialization() {
			if (Action.alwaysUseFieldBuilders) {
			}
		}

		public Builder clear() {
			super.clear();
			this.timestamp_ = 0L;

			this.browserApplicationId_ = 0;

			this.sAppId_ = 0;

			this.sAppInstanceId_ = 0;

			this.host_ = "";

			this.uri_ = "";

			this.clientIp_ = "";

			this.countryId_ = 0;

			this.regionId_ = 0;

			this.cityId_ = 0;

			this.carrierId_ = 0;

			this.accessMode_ = 0;

			this.connectType_ = 0;

			this.webBrowser_ = "";

			this.webBrowserVersion_ = "";

			this.moduleId_ = 0;

			this.moduleRule_ = "";

			this.uriRuleId_ = 0;

			this.requestMethod_ = "";

			this.protocol_ = "";

			this.requestUrl_ = "";

			this.deviceId_ = "";

			this.sessionId_ = "";

			this.type_ = 0;

			this.state_ = 0;

			this.subType_ = "";

			this.start_ = 0L;

			this.end_ = 0L;

			this.pvid_ = "";

			this.operaParam_ = "";

			this.agentUploadTime_ = 0L;

			this.ua_ = "";

			this.system_ = "";

			this.resolution_ = "";

			this.userId_ = "";

			this.sessionStartTime_ = 0L;

			this.version_ = "";
			if (this.pfBuilder_ == null) {
				this.pf_ = null;
			} else {
				this.pf_ = null;
				this.pfBuilder_ = null;
			}
			if (this.ajaxBuilder_ == null) {
				this.ajax_ = null;
			} else {
				this.ajax_ = null;
				this.ajaxBuilder_ = null;
			}
			if (this.eventBuilder_ == null) {
				this.event_ = null;
			} else {
				this.event_ = null;
				this.eventBuilder_ = null;
			}
			if (this.timerBuilder_ == null) {
				this.timer_ = null;
			} else {
				this.timer_ = null;
				this.timerBuilder_ = null;
			}
			if (this.iframeBuilder_ == null) {
				this.iframe_ = null;
			} else {
				this.iframe_ = null;
				this.iframeBuilder_ = null;
			}
			if (this.immediateEventBuilder_ == null) {
				this.immediateEvent_ = null;
			} else {
				this.immediateEvent_ = null;
				this.immediateEventBuilder_ = null;
			}
			if (this.sessionBuilder_ == null) {
				this.session_ = null;
			} else {
				this.session_ = null;
				this.sessionBuilder_ = null;
			}
			this.context_ = "";

			this.targetSource_ = 0;

			this.agreementId_ = 0;

			return this;
		}

		public Descriptors.Descriptor getDescriptorForType() {
			return ActionOuterClass.internal_static_com_tingyun_proto_Action_descriptor;
		}

		public Action getDefaultInstanceForType() {
			return Action.getDefaultInstance();
		}

		public Action build() {
			Action result = buildPartial();
			if (!result.isInitialized()) {
				throw newUninitializedMessageException(result);
			}
			return result;
		}

		public Action buildPartial() {
			Action result = new Action(this);
			result.timestamp_ = this.timestamp_;
			result.browserApplicationId_ = this.browserApplicationId_;
			result.sAppId_ = this.sAppId_;
			result.sAppInstanceId_ = this.sAppInstanceId_;
			result.host_ = this.host_;
			result.uri_ = this.uri_;
			result.clientIp_ = this.clientIp_;
			result.countryId_ = this.countryId_;
			result.regionId_ = this.regionId_;
			result.cityId_ = this.cityId_;
			result.carrierId_ = this.carrierId_;
			result.accessMode_ = this.accessMode_;
			result.connectType_ = this.connectType_;
			result.webBrowser_ = this.webBrowser_;
			result.webBrowserVersion_ = this.webBrowserVersion_;
			result.moduleId_ = this.moduleId_;
			result.moduleRule_ = this.moduleRule_;
			result.uriRuleId_ = this.uriRuleId_;
			result.requestMethod_ = this.requestMethod_;
			result.protocol_ = this.protocol_;
			result.requestUrl_ = this.requestUrl_;
			result.deviceId_ = this.deviceId_;
			result.sessionId_ = this.sessionId_;
			result.type_ = this.type_;
			result.state_ = this.state_;
			result.subType_ = this.subType_;
			result.start_ = this.start_;
			result.end_ = this.end_;
			result.pvid_ = this.pvid_;
			result.operaParam_ = this.operaParam_;
			result.agentUploadTime_ = this.agentUploadTime_;
			result.ua_ = this.ua_;
			result.system_ = this.system_;
			result.resolution_ = this.resolution_;
			result.userId_ = this.userId_;
			result.sessionStartTime_ = this.sessionStartTime_;
			result.version_ = this.version_;
			if (this.pfBuilder_ == null) {
				result.pf_ = this.pf_;
			} else {
				result.pf_ = ((Pf) this.pfBuilder_.build());
			}
			if (this.ajaxBuilder_ == null) {
				result.ajax_ = this.ajax_;
			} else {
				result.ajax_ = ((Ajax) this.ajaxBuilder_.build());
			}
			if (this.eventBuilder_ == null) {
				result.event_ = this.event_;
			} else {
				result.event_ = ((Event) this.eventBuilder_.build());
			}
			if (this.timerBuilder_ == null) {
				result.timer_ = this.timer_;
			} else {
				result.timer_ = ((Timer) this.timerBuilder_.build());
			}
			if (this.iframeBuilder_ == null) {
				result.iframe_ = this.iframe_;
			} else {
				result.iframe_ = ((Iframe) this.iframeBuilder_.build());
			}
			if (this.immediateEventBuilder_ == null) {
				result.immediateEvent_ = this.immediateEvent_;
			} else {
				result.immediateEvent_ = ((ImmediateEvent) this.immediateEventBuilder_.build());
			}
			if (this.sessionBuilder_ == null) {
				result.session_ = this.session_;
			} else {
				result.session_ = ((Session) this.sessionBuilder_.build());
			}
			result.context_ = this.context_;
			result.targetSource_ = this.targetSource_;
			result.agreementId_ = this.agreementId_;
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
			if ((other instanceof Action)) {
				return mergeFrom((Action) other);
			}
			super.mergeFrom(other);
			return this;
		}

		public Builder mergeFrom(Action other) {
			if (other == Action.getDefaultInstance()) {
				return this;
			}
			if (other.getTimestamp() != 0L) {
				setTimestamp(other.getTimestamp());
			}
			if (other.getBrowserApplicationId() != 0) {
				setBrowserApplicationId(other.getBrowserApplicationId());
			}
			if (other.getSAppId() != 0) {
				setSAppId(other.getSAppId());
			}
			if (other.getSAppInstanceId() != 0) {
				setSAppInstanceId(other.getSAppInstanceId());
			}
			if (!other.getHost().isEmpty()) {
				this.host_ = other.host_;
				onChanged();
			}
			if (!other.getUri().isEmpty()) {
				this.uri_ = other.uri_;
				onChanged();
			}
			if (!other.getClientIp().isEmpty()) {
				this.clientIp_ = other.clientIp_;
				onChanged();
			}
			if (other.getCountryId() != 0) {
				setCountryId(other.getCountryId());
			}
			if (other.getRegionId() != 0) {
				setRegionId(other.getRegionId());
			}
			if (other.getCityId() != 0) {
				setCityId(other.getCityId());
			}
			if (other.getCarrierId() != 0) {
				setCarrierId(other.getCarrierId());
			}
			if (other.getAccessMode() != 0) {
				setAccessMode(other.getAccessMode());
			}
			if (other.getConnectType() != 0) {
				setConnectType(other.getConnectType());
			}
			if (!other.getWebBrowser().isEmpty()) {
				this.webBrowser_ = other.webBrowser_;
				onChanged();
			}
			if (!other.getWebBrowserVersion().isEmpty()) {
				this.webBrowserVersion_ = other.webBrowserVersion_;
				onChanged();
			}
			if (other.getModuleId() != 0) {
				setModuleId(other.getModuleId());
			}
			if (!other.getModuleRule().isEmpty()) {
				this.moduleRule_ = other.moduleRule_;
				onChanged();
			}
			if (other.getUriRuleId() != 0) {
				setUriRuleId(other.getUriRuleId());
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
			if (!other.getDeviceId().isEmpty()) {
				this.deviceId_ = other.deviceId_;
				onChanged();
			}
			if (!other.getSessionId().isEmpty()) {
				this.sessionId_ = other.sessionId_;
				onChanged();
			}
			if (other.type_ != 0) {
				setTypeValue(other.getTypeValue());
			}
			if (other.state_ != 0) {
				setStateValue(other.getStateValue());
			}
			if (!other.getSubType().isEmpty()) {
				this.subType_ = other.subType_;
				onChanged();
			}
			if (other.getStart() != 0L) {
				setStart(other.getStart());
			}
			if (other.getEnd() != 0L) {
				setEnd(other.getEnd());
			}
			if (!other.getPvid().isEmpty()) {
				this.pvid_ = other.pvid_;
				onChanged();
			}
			if (!other.getOperaParam().isEmpty()) {
				this.operaParam_ = other.operaParam_;
				onChanged();
			}
			if (other.getAgentUploadTime() != 0L) {
				setAgentUploadTime(other.getAgentUploadTime());
			}
			if (!other.getUa().isEmpty()) {
				this.ua_ = other.ua_;
				onChanged();
			}
			if (!other.getSystem().isEmpty()) {
				this.system_ = other.system_;
				onChanged();
			}
			if (!other.getResolution().isEmpty()) {
				this.resolution_ = other.resolution_;
				onChanged();
			}
			if (!other.getUserId().isEmpty()) {
				this.userId_ = other.userId_;
				onChanged();
			}
			if (other.getSessionStartTime() != 0L) {
				setSessionStartTime(other.getSessionStartTime());
			}
			if (!other.getVersion().isEmpty()) {
				this.version_ = other.version_;
				onChanged();
			}
			if (other.hasPf()) {
				mergePf(other.getPf());
			}
			if (other.hasAjax()) {
				mergeAjax(other.getAjax());
			}
			if (other.hasEvent()) {
				mergeEvent(other.getEvent());
			}
			if (other.hasTimer()) {
				mergeTimer(other.getTimer());
			}
			if (other.hasIframe()) {
				mergeIframe(other.getIframe());
			}
			if (other.hasImmediateEvent()) {
				mergeImmediateEvent(other.getImmediateEvent());
			}
			if (other.hasSession()) {
				mergeSession(other.getSession());
			}
			if (!other.getContext().isEmpty()) {
				this.context_ = other.context_;
				onChanged();
			}
			if (other.targetSource_ != 0) {
				setTargetSourceValue(other.getTargetSourceValue());
			}
			if (other.getAgreementId() != 0) {
				setAgreementId(other.getAgreementId());
			}
			mergeUnknownFields(other.unknownFields);
			onChanged();
			return this;
		}

		public final boolean isInitialized() {
			return true;
		}

		public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
			Action parsedMessage = null;
			try {
				parsedMessage = (Action) Action.PARSER.parsePartialFrom(input, extensionRegistry);
			} catch (InvalidProtocolBufferException e) {
				parsedMessage = (Action) e.getUnfinishedMessage();
				throw e.unwrapIOException();
			} finally {
				if (parsedMessage != null) {
					mergeFrom(parsedMessage);
				}
			}
			return this;
		}

		public long getTimestamp() {
			return this.timestamp_;
		}

		public Builder setTimestamp(long value) {
			this.timestamp_ = value;
			onChanged();
			return this;
		}

		public Builder clearTimestamp() {
			this.timestamp_ = 0L;
			onChanged();
			return this;
		}

		public int getBrowserApplicationId() {
			return this.browserApplicationId_;
		}

		public Builder setBrowserApplicationId(int value) {
			this.browserApplicationId_ = value;
			onChanged();
			return this;
		}

		public Builder clearBrowserApplicationId() {
			this.browserApplicationId_ = 0;
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
			this.host_ = Action.getDefaultInstance().getHost();
			onChanged();
			return this;
		}

		public Builder setHostBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Action.checkByteStringIsUtf8(value);

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
			this.uri_ = Action.getDefaultInstance().getUri();
			onChanged();
			return this;
		}

		public Builder setUriBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Action.checkByteStringIsUtf8(value);

			this.uri_ = value;
			onChanged();
			return this;
		}

		private Object clientIp_ = "";
		private int countryId_;
		private int regionId_;
		private int cityId_;
		private int carrierId_;
		private int accessMode_;
		private int connectType_;

		public String getClientIp() {
			Object ref = this.clientIp_;
			if (!(ref instanceof String)) {
				ByteString bs = (ByteString) ref;

				String s = bs.toStringUtf8();
				this.clientIp_ = s;
				return s;
			}
			return (String) ref;
		}

		public ByteString getClientIpBytes() {
			Object ref = this.clientIp_;
			if ((ref instanceof String)) {
				ByteString b = ByteString.copyFromUtf8((String) ref);

				this.clientIp_ = b;
				return b;
			}
			return (ByteString) ref;
		}

		public Builder setClientIp(String value) {
			if (value == null) {
				throw new NullPointerException();
			}
			this.clientIp_ = value;
			onChanged();
			return this;
		}

		public Builder clearClientIp() {
			this.clientIp_ = Action.getDefaultInstance().getClientIp();
			onChanged();
			return this;
		}

		public Builder setClientIpBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Action.checkByteStringIsUtf8(value);

			this.clientIp_ = value;
			onChanged();
			return this;
		}

		public int getCountryId() {
			return this.countryId_;
		}

		public Builder setCountryId(int value) {
			this.countryId_ = value;
			onChanged();
			return this;
		}

		public Builder clearCountryId() {
			this.countryId_ = 0;
			onChanged();
			return this;
		}

		public int getRegionId() {
			return this.regionId_;
		}

		public Builder setRegionId(int value) {
			this.regionId_ = value;
			onChanged();
			return this;
		}

		public Builder clearRegionId() {
			this.regionId_ = 0;
			onChanged();
			return this;
		}

		public int getCityId() {
			return this.cityId_;
		}

		public Builder setCityId(int value) {
			this.cityId_ = value;
			onChanged();
			return this;
		}

		public Builder clearCityId() {
			this.cityId_ = 0;
			onChanged();
			return this;
		}

		public int getCarrierId() {
			return this.carrierId_;
		}

		public Builder setCarrierId(int value) {
			this.carrierId_ = value;
			onChanged();
			return this;
		}

		public Builder clearCarrierId() {
			this.carrierId_ = 0;
			onChanged();
			return this;
		}

		public int getAccessMode() {
			return this.accessMode_;
		}

		public Builder setAccessMode(int value) {
			this.accessMode_ = value;
			onChanged();
			return this;
		}

		public Builder clearAccessMode() {
			this.accessMode_ = 0;
			onChanged();
			return this;
		}

		public int getConnectType() {
			return this.connectType_;
		}

		public Builder setConnectType(int value) {
			this.connectType_ = value;
			onChanged();
			return this;
		}

		public Builder clearConnectType() {
			this.connectType_ = 0;
			onChanged();
			return this;
		}

		private Object webBrowser_ = "";

		public String getWebBrowser() {
			Object ref = this.webBrowser_;
			if (!(ref instanceof String)) {
				ByteString bs = (ByteString) ref;

				String s = bs.toStringUtf8();
				this.webBrowser_ = s;
				return s;
			}
			return (String) ref;
		}

		public ByteString getWebBrowserBytes() {
			Object ref = this.webBrowser_;
			if ((ref instanceof String)) {
				ByteString b = ByteString.copyFromUtf8((String) ref);

				this.webBrowser_ = b;
				return b;
			}
			return (ByteString) ref;
		}

		public Builder setWebBrowser(String value) {
			if (value == null) {
				throw new NullPointerException();
			}
			this.webBrowser_ = value;
			onChanged();
			return this;
		}

		public Builder clearWebBrowser() {
			this.webBrowser_ = Action.getDefaultInstance().getWebBrowser();
			onChanged();
			return this;
		}

		public Builder setWebBrowserBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Action.checkByteStringIsUtf8(value);

			this.webBrowser_ = value;
			onChanged();
			return this;
		}

		private Object webBrowserVersion_ = "";
		private int moduleId_;

		public String getWebBrowserVersion() {
			Object ref = this.webBrowserVersion_;
			if (!(ref instanceof String)) {
				ByteString bs = (ByteString) ref;

				String s = bs.toStringUtf8();
				this.webBrowserVersion_ = s;
				return s;
			}
			return (String) ref;
		}

		public ByteString getWebBrowserVersionBytes() {
			Object ref = this.webBrowserVersion_;
			if ((ref instanceof String)) {
				ByteString b = ByteString.copyFromUtf8((String) ref);

				this.webBrowserVersion_ = b;
				return b;
			}
			return (ByteString) ref;
		}

		public Builder setWebBrowserVersion(String value) {
			if (value == null) {
				throw new NullPointerException();
			}
			this.webBrowserVersion_ = value;
			onChanged();
			return this;
		}

		public Builder clearWebBrowserVersion() {
			this.webBrowserVersion_ = Action.getDefaultInstance().getWebBrowserVersion();
			onChanged();
			return this;
		}

		public Builder setWebBrowserVersionBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Action.checkByteStringIsUtf8(value);

			this.webBrowserVersion_ = value;
			onChanged();
			return this;
		}

		public int getModuleId() {
			return this.moduleId_;
		}

		public Builder setModuleId(int value) {
			this.moduleId_ = value;
			onChanged();
			return this;
		}

		public Builder clearModuleId() {
			this.moduleId_ = 0;
			onChanged();
			return this;
		}

		private Object moduleRule_ = "";
		private int uriRuleId_;

		public String getModuleRule() {
			Object ref = this.moduleRule_;
			if (!(ref instanceof String)) {
				ByteString bs = (ByteString) ref;

				String s = bs.toStringUtf8();
				this.moduleRule_ = s;
				return s;
			}
			return (String) ref;
		}

		public ByteString getModuleRuleBytes() {
			Object ref = this.moduleRule_;
			if ((ref instanceof String)) {
				ByteString b = ByteString.copyFromUtf8((String) ref);

				this.moduleRule_ = b;
				return b;
			}
			return (ByteString) ref;
		}

		public Builder setModuleRule(String value) {
			if (value == null) {
				throw new NullPointerException();
			}
			this.moduleRule_ = value;
			onChanged();
			return this;
		}

		public Builder clearModuleRule() {
			this.moduleRule_ = Action.getDefaultInstance().getModuleRule();
			onChanged();
			return this;
		}

		public Builder setModuleRuleBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Action.checkByteStringIsUtf8(value);

			this.moduleRule_ = value;
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
			this.requestMethod_ = Action.getDefaultInstance().getRequestMethod();
			onChanged();
			return this;
		}

		public Builder setRequestMethodBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Action.checkByteStringIsUtf8(value);

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
			this.protocol_ = Action.getDefaultInstance().getProtocol();
			onChanged();
			return this;
		}

		public Builder setProtocolBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Action.checkByteStringIsUtf8(value);

			this.protocol_ = value;
			onChanged();
			return this;
		}

		private Object requestUrl_ = "";

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
			this.requestUrl_ = Action.getDefaultInstance().getRequestUrl();
			onChanged();
			return this;
		}

		public Builder setRequestUrlBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Action.checkByteStringIsUtf8(value);

			this.requestUrl_ = value;
			onChanged();
			return this;
		}

		private Object deviceId_ = "";

		public String getDeviceId() {
			Object ref = this.deviceId_;
			if (!(ref instanceof String)) {
				ByteString bs = (ByteString) ref;

				String s = bs.toStringUtf8();
				this.deviceId_ = s;
				return s;
			}
			return (String) ref;
		}

		public ByteString getDeviceIdBytes() {
			Object ref = this.deviceId_;
			if ((ref instanceof String)) {
				ByteString b = ByteString.copyFromUtf8((String) ref);

				this.deviceId_ = b;
				return b;
			}
			return (ByteString) ref;
		}

		public Builder setDeviceId(String value) {
			if (value == null) {
				throw new NullPointerException();
			}
			this.deviceId_ = value;
			onChanged();
			return this;
		}

		public Builder clearDeviceId() {
			this.deviceId_ = Action.getDefaultInstance().getDeviceId();
			onChanged();
			return this;
		}

		public Builder setDeviceIdBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Action.checkByteStringIsUtf8(value);

			this.deviceId_ = value;
			onChanged();
			return this;
		}

		private Object sessionId_ = "";

		public String getSessionId() {
			Object ref = this.sessionId_;
			if (!(ref instanceof String)) {
				ByteString bs = (ByteString) ref;

				String s = bs.toStringUtf8();
				this.sessionId_ = s;
				return s;
			}
			return (String) ref;
		}

		public ByteString getSessionIdBytes() {
			Object ref = this.sessionId_;
			if ((ref instanceof String)) {
				ByteString b = ByteString.copyFromUtf8((String) ref);

				this.sessionId_ = b;
				return b;
			}
			return (ByteString) ref;
		}

		public Builder setSessionId(String value) {
			if (value == null) {
				throw new NullPointerException();
			}
			this.sessionId_ = value;
			onChanged();
			return this;
		}

		public Builder clearSessionId() {
			this.sessionId_ = Action.getDefaultInstance().getSessionId();
			onChanged();
			return this;
		}

		public Builder setSessionIdBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Action.checkByteStringIsUtf8(value);

			this.sessionId_ = value;
			onChanged();
			return this;
		}

		private int type_ = 0;

		public int getTypeValue() {
			return this.type_;
		}

		public Builder setTypeValue(int value) {
			this.type_ = value;
			onChanged();
			return this;
		}

		public ActionType getType() {
			ActionType result = ActionType.valueOf(this.type_);
			return result == null ? ActionType.UNRECOGNIZED : result;
		}

		public Builder setType(ActionType value) {
			if (value == null) {
				throw new NullPointerException();
			}
			this.type_ = value.getNumber();
			onChanged();
			return this;
		}

		public Builder clearType() {
			this.type_ = 0;
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

		private Object subType_ = "";
		private long start_;
		private long end_;

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
			this.subType_ = Action.getDefaultInstance().getSubType();
			onChanged();
			return this;
		}

		public Builder setSubTypeBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Action.checkByteStringIsUtf8(value);

			this.subType_ = value;
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

		private Object pvid_ = "";

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
			this.pvid_ = Action.getDefaultInstance().getPvid();
			onChanged();
			return this;
		}

		public Builder setPvidBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Action.checkByteStringIsUtf8(value);

			this.pvid_ = value;
			onChanged();
			return this;
		}

		private Object operaParam_ = "";
		private long agentUploadTime_;

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
			this.operaParam_ = Action.getDefaultInstance().getOperaParam();
			onChanged();
			return this;
		}

		public Builder setOperaParamBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Action.checkByteStringIsUtf8(value);

			this.operaParam_ = value;
			onChanged();
			return this;
		}

		public long getAgentUploadTime() {
			return this.agentUploadTime_;
		}

		public Builder setAgentUploadTime(long value) {
			this.agentUploadTime_ = value;
			onChanged();
			return this;
		}

		public Builder clearAgentUploadTime() {
			this.agentUploadTime_ = 0L;
			onChanged();
			return this;
		}

		private Object ua_ = "";

		public String getUa() {
			Object ref = this.ua_;
			if (!(ref instanceof String)) {
				ByteString bs = (ByteString) ref;

				String s = bs.toStringUtf8();
				this.ua_ = s;
				return s;
			}
			return (String) ref;
		}

		public ByteString getUaBytes() {
			Object ref = this.ua_;
			if ((ref instanceof String)) {
				ByteString b = ByteString.copyFromUtf8((String) ref);

				this.ua_ = b;
				return b;
			}
			return (ByteString) ref;
		}

		public Builder setUa(String value) {
			if (value == null) {
				throw new NullPointerException();
			}
			this.ua_ = value;
			onChanged();
			return this;
		}

		public Builder clearUa() {
			this.ua_ = Action.getDefaultInstance().getUa();
			onChanged();
			return this;
		}

		public Builder setUaBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Action.checkByteStringIsUtf8(value);

			this.ua_ = value;
			onChanged();
			return this;
		}

		private Object system_ = "";

		public String getSystem() {
			Object ref = this.system_;
			if (!(ref instanceof String)) {
				ByteString bs = (ByteString) ref;

				String s = bs.toStringUtf8();
				this.system_ = s;
				return s;
			}
			return (String) ref;
		}

		public ByteString getSystemBytes() {
			Object ref = this.system_;
			if ((ref instanceof String)) {
				ByteString b = ByteString.copyFromUtf8((String) ref);

				this.system_ = b;
				return b;
			}
			return (ByteString) ref;
		}

		public Builder setSystem(String value) {
			if (value == null) {
				throw new NullPointerException();
			}
			this.system_ = value;
			onChanged();
			return this;
		}

		public Builder clearSystem() {
			this.system_ = Action.getDefaultInstance().getSystem();
			onChanged();
			return this;
		}

		public Builder setSystemBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Action.checkByteStringIsUtf8(value);

			this.system_ = value;
			onChanged();
			return this;
		}

		private Object resolution_ = "";

		public String getResolution() {
			Object ref = this.resolution_;
			if (!(ref instanceof String)) {
				ByteString bs = (ByteString) ref;

				String s = bs.toStringUtf8();
				this.resolution_ = s;
				return s;
			}
			return (String) ref;
		}

		public ByteString getResolutionBytes() {
			Object ref = this.resolution_;
			if ((ref instanceof String)) {
				ByteString b = ByteString.copyFromUtf8((String) ref);

				this.resolution_ = b;
				return b;
			}
			return (ByteString) ref;
		}

		public Builder setResolution(String value) {
			if (value == null) {
				throw new NullPointerException();
			}
			this.resolution_ = value;
			onChanged();
			return this;
		}

		public Builder clearResolution() {
			this.resolution_ = Action.getDefaultInstance().getResolution();
			onChanged();
			return this;
		}

		public Builder setResolutionBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Action.checkByteStringIsUtf8(value);

			this.resolution_ = value;
			onChanged();
			return this;
		}

		private Object userId_ = "";
		private long sessionStartTime_;

		public String getUserId() {
			Object ref = this.userId_;
			if (!(ref instanceof String)) {
				ByteString bs = (ByteString) ref;

				String s = bs.toStringUtf8();
				this.userId_ = s;
				return s;
			}
			return (String) ref;
		}

		public ByteString getUserIdBytes() {
			Object ref = this.userId_;
			if ((ref instanceof String)) {
				ByteString b = ByteString.copyFromUtf8((String) ref);

				this.userId_ = b;
				return b;
			}
			return (ByteString) ref;
		}

		public Builder setUserId(String value) {
			if (value == null) {
				throw new NullPointerException();
			}
			this.userId_ = value;
			onChanged();
			return this;
		}

		public Builder clearUserId() {
			this.userId_ = Action.getDefaultInstance().getUserId();
			onChanged();
			return this;
		}

		public Builder setUserIdBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Action.checkByteStringIsUtf8(value);

			this.userId_ = value;
			onChanged();
			return this;
		}

		public long getSessionStartTime() {
			return this.sessionStartTime_;
		}

		public Builder setSessionStartTime(long value) {
			this.sessionStartTime_ = value;
			onChanged();
			return this;
		}

		public Builder clearSessionStartTime() {
			this.sessionStartTime_ = 0L;
			onChanged();
			return this;
		}

		private Object version_ = "";
		private Pf pf_;
		private SingleFieldBuilderV3<Pf, Pf.Builder, PfOrBuilder> pfBuilder_;
		private Ajax ajax_;
		private SingleFieldBuilderV3<Ajax, Ajax.Builder, AjaxOrBuilder> ajaxBuilder_;
		private Event event_;
		private SingleFieldBuilderV3<Event, Event.Builder, EventOrBuilder> eventBuilder_;
		private Timer timer_;
		private SingleFieldBuilderV3<Timer, Timer.Builder, TimerOrBuilder> timerBuilder_;
		private Iframe iframe_;
		private SingleFieldBuilderV3<Iframe, Iframe.Builder, IframeOrBuilder> iframeBuilder_;
		private ImmediateEvent immediateEvent_;
		private SingleFieldBuilderV3<ImmediateEvent, ImmediateEvent.Builder, ImmediateEventOrBuilder> immediateEventBuilder_;
		private Session session_;
		private SingleFieldBuilderV3<Session, Session.Builder, SessionOrBuilder> sessionBuilder_;

		public String getVersion() {
			Object ref = this.version_;
			if (!(ref instanceof String)) {
				ByteString bs = (ByteString) ref;

				String s = bs.toStringUtf8();
				this.version_ = s;
				return s;
			}
			return (String) ref;
		}

		public ByteString getVersionBytes() {
			Object ref = this.version_;
			if ((ref instanceof String)) {
				ByteString b = ByteString.copyFromUtf8((String) ref);

				this.version_ = b;
				return b;
			}
			return (ByteString) ref;
		}

		public Builder setVersion(String value) {
			if (value == null) {
				throw new NullPointerException();
			}
			this.version_ = value;
			onChanged();
			return this;
		}

		public Builder clearVersion() {
			this.version_ = Action.getDefaultInstance().getVersion();
			onChanged();
			return this;
		}

		public Builder setVersionBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Action.checkByteStringIsUtf8(value);

			this.version_ = value;
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

		public boolean hasAjax() {
			return (this.ajaxBuilder_ != null) || (this.ajax_ != null);
		}

		public Ajax getAjax() {
			if (this.ajaxBuilder_ == null) {
				return this.ajax_ == null ? Ajax.getDefaultInstance() : this.ajax_;
			}
			return (Ajax) this.ajaxBuilder_.getMessage();
		}

		public Builder setAjax(Ajax value) {
			if (this.ajaxBuilder_ == null) {
				if (value == null) {
					throw new NullPointerException();
				}
				this.ajax_ = value;
				onChanged();
			} else {
				this.ajaxBuilder_.setMessage(value);
			}
			return this;
		}

		public Builder setAjax(Ajax.Builder builderForValue) {
			if (this.ajaxBuilder_ == null) {
				this.ajax_ = builderForValue.build();
				onChanged();
			} else {
				this.ajaxBuilder_.setMessage(builderForValue.build());
			}
			return this;
		}

		public Builder mergeAjax(Ajax value) {
			if (this.ajaxBuilder_ == null) {
				if (this.ajax_ != null) {
					this.ajax_ = Ajax.newBuilder(this.ajax_).mergeFrom(value).buildPartial();
				} else {
					this.ajax_ = value;
				}
				onChanged();
			} else {
				this.ajaxBuilder_.mergeFrom(value);
			}
			return this;
		}

		public Builder clearAjax() {
			if (this.ajaxBuilder_ == null) {
				this.ajax_ = null;
				onChanged();
			} else {
				this.ajax_ = null;
				this.ajaxBuilder_ = null;
			}
			return this;
		}

		public Ajax.Builder getAjaxBuilder() {
			onChanged();
			return (Ajax.Builder) getAjaxFieldBuilder().getBuilder();
		}

		public AjaxOrBuilder getAjaxOrBuilder() {
			if (this.ajaxBuilder_ != null) {
				return (AjaxOrBuilder) this.ajaxBuilder_.getMessageOrBuilder();
			}
			return this.ajax_ == null ? Ajax.getDefaultInstance() : this.ajax_;
		}

		private SingleFieldBuilderV3<Ajax, Ajax.Builder, AjaxOrBuilder> getAjaxFieldBuilder() {
			if (this.ajaxBuilder_ == null) {
				this.ajaxBuilder_ = new SingleFieldBuilderV3(getAjax(), getParentForChildren(), isClean());
				this.ajax_ = null;
			}
			return this.ajaxBuilder_;
		}

		public boolean hasEvent() {
			return (this.eventBuilder_ != null) || (this.event_ != null);
		}

		public Event getEvent() {
			if (this.eventBuilder_ == null) {
				return this.event_ == null ? Event.getDefaultInstance() : this.event_;
			}
			return (Event) this.eventBuilder_.getMessage();
		}

		public Builder setEvent(Event value) {
			if (this.eventBuilder_ == null) {
				if (value == null) {
					throw new NullPointerException();
				}
				this.event_ = value;
				onChanged();
			} else {
				this.eventBuilder_.setMessage(value);
			}
			return this;
		}

		public Builder setEvent(Event.Builder builderForValue) {
			if (this.eventBuilder_ == null) {
				this.event_ = builderForValue.build();
				onChanged();
			} else {
				this.eventBuilder_.setMessage(builderForValue.build());
			}
			return this;
		}

		public Builder mergeEvent(Event value) {
			if (this.eventBuilder_ == null) {
				if (this.event_ != null) {
					this.event_ = Event.newBuilder(this.event_).mergeFrom(value).buildPartial();
				} else {
					this.event_ = value;
				}
				onChanged();
			} else {
				this.eventBuilder_.mergeFrom(value);
			}
			return this;
		}

		public Builder clearEvent() {
			if (this.eventBuilder_ == null) {
				this.event_ = null;
				onChanged();
			} else {
				this.event_ = null;
				this.eventBuilder_ = null;
			}
			return this;
		}

		public Event.Builder getEventBuilder() {
			onChanged();
			return (Event.Builder) getEventFieldBuilder().getBuilder();
		}

		public EventOrBuilder getEventOrBuilder() {
			if (this.eventBuilder_ != null) {
				return (EventOrBuilder) this.eventBuilder_.getMessageOrBuilder();
			}
			return this.event_ == null ? Event.getDefaultInstance() : this.event_;
		}

		private SingleFieldBuilderV3<Event, Event.Builder, EventOrBuilder> getEventFieldBuilder() {
			if (this.eventBuilder_ == null) {
				this.eventBuilder_ = new SingleFieldBuilderV3(getEvent(), getParentForChildren(), isClean());
				this.event_ = null;
			}
			return this.eventBuilder_;
		}

		public boolean hasTimer() {
			return (this.timerBuilder_ != null) || (this.timer_ != null);
		}

		public Timer getTimer() {
			if (this.timerBuilder_ == null) {
				return this.timer_ == null ? Timer.getDefaultInstance() : this.timer_;
			}
			return (Timer) this.timerBuilder_.getMessage();
		}

		public Builder setTimer(Timer value) {
			if (this.timerBuilder_ == null) {
				if (value == null) {
					throw new NullPointerException();
				}
				this.timer_ = value;
				onChanged();
			} else {
				this.timerBuilder_.setMessage(value);
			}
			return this;
		}

		public Builder setTimer(Timer.Builder builderForValue) {
			if (this.timerBuilder_ == null) {
				this.timer_ = builderForValue.build();
				onChanged();
			} else {
				this.timerBuilder_.setMessage(builderForValue.build());
			}
			return this;
		}

		public Builder mergeTimer(Timer value) {
			if (this.timerBuilder_ == null) {
				if (this.timer_ != null) {
					this.timer_ = Timer.newBuilder(this.timer_).mergeFrom(value).buildPartial();
				} else {
					this.timer_ = value;
				}
				onChanged();
			} else {
				this.timerBuilder_.mergeFrom(value);
			}
			return this;
		}

		public Builder clearTimer() {
			if (this.timerBuilder_ == null) {
				this.timer_ = null;
				onChanged();
			} else {
				this.timer_ = null;
				this.timerBuilder_ = null;
			}
			return this;
		}

		public Timer.Builder getTimerBuilder() {
			onChanged();
			return (Timer.Builder) getTimerFieldBuilder().getBuilder();
		}

		public TimerOrBuilder getTimerOrBuilder() {
			if (this.timerBuilder_ != null) {
				return (TimerOrBuilder) this.timerBuilder_.getMessageOrBuilder();
			}
			return this.timer_ == null ? Timer.getDefaultInstance() : this.timer_;
		}

		private SingleFieldBuilderV3<Timer, Timer.Builder, TimerOrBuilder> getTimerFieldBuilder() {
			if (this.timerBuilder_ == null) {
				this.timerBuilder_ = new SingleFieldBuilderV3(getTimer(), getParentForChildren(), isClean());
				this.timer_ = null;
			}
			return this.timerBuilder_;
		}

		public boolean hasIframe() {
			return (this.iframeBuilder_ != null) || (this.iframe_ != null);
		}

		public Iframe getIframe() {
			if (this.iframeBuilder_ == null) {
				return this.iframe_ == null ? Iframe.getDefaultInstance() : this.iframe_;
			}
			return (Iframe) this.iframeBuilder_.getMessage();
		}

		public Builder setIframe(Iframe value) {
			if (this.iframeBuilder_ == null) {
				if (value == null) {
					throw new NullPointerException();
				}
				this.iframe_ = value;
				onChanged();
			} else {
				this.iframeBuilder_.setMessage(value);
			}
			return this;
		}

		public Builder setIframe(Iframe.Builder builderForValue) {
			if (this.iframeBuilder_ == null) {
				this.iframe_ = builderForValue.build();
				onChanged();
			} else {
				this.iframeBuilder_.setMessage(builderForValue.build());
			}
			return this;
		}

		public Builder mergeIframe(Iframe value) {
			if (this.iframeBuilder_ == null) {
				if (this.iframe_ != null) {
					this.iframe_ = Iframe.newBuilder(this.iframe_).mergeFrom(value).buildPartial();
				} else {
					this.iframe_ = value;
				}
				onChanged();
			} else {
				this.iframeBuilder_.mergeFrom(value);
			}
			return this;
		}

		public Builder clearIframe() {
			if (this.iframeBuilder_ == null) {
				this.iframe_ = null;
				onChanged();
			} else {
				this.iframe_ = null;
				this.iframeBuilder_ = null;
			}
			return this;
		}

		public Iframe.Builder getIframeBuilder() {
			onChanged();
			return (Iframe.Builder) getIframeFieldBuilder().getBuilder();
		}

		public IframeOrBuilder getIframeOrBuilder() {
			if (this.iframeBuilder_ != null) {
				return (IframeOrBuilder) this.iframeBuilder_.getMessageOrBuilder();
			}
			return this.iframe_ == null ? Iframe.getDefaultInstance() : this.iframe_;
		}

		private SingleFieldBuilderV3<Iframe, Iframe.Builder, IframeOrBuilder> getIframeFieldBuilder() {
			if (this.iframeBuilder_ == null) {
				this.iframeBuilder_ = new SingleFieldBuilderV3(getIframe(), getParentForChildren(), isClean());
				this.iframe_ = null;
			}
			return this.iframeBuilder_;
		}

		public boolean hasImmediateEvent() {
			return (this.immediateEventBuilder_ != null) || (this.immediateEvent_ != null);
		}

		public ImmediateEvent getImmediateEvent() {
			if (this.immediateEventBuilder_ == null) {
				return this.immediateEvent_ == null ? ImmediateEvent.getDefaultInstance() : this.immediateEvent_;
			}
			return (ImmediateEvent) this.immediateEventBuilder_.getMessage();
		}

		public Builder setImmediateEvent(ImmediateEvent value) {
			if (this.immediateEventBuilder_ == null) {
				if (value == null) {
					throw new NullPointerException();
				}
				this.immediateEvent_ = value;
				onChanged();
			} else {
				this.immediateEventBuilder_.setMessage(value);
			}
			return this;
		}

		public Builder setImmediateEvent(ImmediateEvent.Builder builderForValue) {
			if (this.immediateEventBuilder_ == null) {
				this.immediateEvent_ = builderForValue.build();
				onChanged();
			} else {
				this.immediateEventBuilder_.setMessage(builderForValue.build());
			}
			return this;
		}

		public Builder mergeImmediateEvent(ImmediateEvent value) {
			if (this.immediateEventBuilder_ == null) {
				if (this.immediateEvent_ != null) {
					this.immediateEvent_ = ImmediateEvent.newBuilder(this.immediateEvent_).mergeFrom(value).buildPartial();
				} else {
					this.immediateEvent_ = value;
				}
				onChanged();
			} else {
				this.immediateEventBuilder_.mergeFrom(value);
			}
			return this;
		}

		public Builder clearImmediateEvent() {
			if (this.immediateEventBuilder_ == null) {
				this.immediateEvent_ = null;
				onChanged();
			} else {
				this.immediateEvent_ = null;
				this.immediateEventBuilder_ = null;
			}
			return this;
		}

		public ImmediateEvent.Builder getImmediateEventBuilder() {
			onChanged();
			return (ImmediateEvent.Builder) getImmediateEventFieldBuilder().getBuilder();
		}

		public ImmediateEventOrBuilder getImmediateEventOrBuilder() {
			if (this.immediateEventBuilder_ != null) {
				return (ImmediateEventOrBuilder) this.immediateEventBuilder_.getMessageOrBuilder();
			}
			return this.immediateEvent_ == null ? ImmediateEvent.getDefaultInstance() : this.immediateEvent_;
		}

		private SingleFieldBuilderV3<ImmediateEvent, ImmediateEvent.Builder, ImmediateEventOrBuilder> getImmediateEventFieldBuilder() {
			if (this.immediateEventBuilder_ == null) {
				this.immediateEventBuilder_ = new SingleFieldBuilderV3(getImmediateEvent(), getParentForChildren(), isClean());
				this.immediateEvent_ = null;
			}
			return this.immediateEventBuilder_;
		}

		public boolean hasSession() {
			return (this.sessionBuilder_ != null) || (this.session_ != null);
		}

		public Session getSession() {
			if (this.sessionBuilder_ == null) {
				return this.session_ == null ? Session.getDefaultInstance() : this.session_;
			}
			return (Session) this.sessionBuilder_.getMessage();
		}

		public Builder setSession(Session value) {
			if (this.sessionBuilder_ == null) {
				if (value == null) {
					throw new NullPointerException();
				}
				this.session_ = value;
				onChanged();
			} else {
				this.sessionBuilder_.setMessage(value);
			}
			return this;
		}

		public Builder setSession(Session.Builder builderForValue) {
			if (this.sessionBuilder_ == null) {
				this.session_ = builderForValue.build();
				onChanged();
			} else {
				this.sessionBuilder_.setMessage(builderForValue.build());
			}
			return this;
		}

		public Builder mergeSession(Session value) {
			if (this.sessionBuilder_ == null) {
				if (this.session_ != null) {
					this.session_ = Session.newBuilder(this.session_).mergeFrom(value).buildPartial();
				} else {
					this.session_ = value;
				}
				onChanged();
			} else {
				this.sessionBuilder_.mergeFrom(value);
			}
			return this;
		}

		public Builder clearSession() {
			if (this.sessionBuilder_ == null) {
				this.session_ = null;
				onChanged();
			} else {
				this.session_ = null;
				this.sessionBuilder_ = null;
			}
			return this;
		}

		public Session.Builder getSessionBuilder() {
			onChanged();
			return (Session.Builder) getSessionFieldBuilder().getBuilder();
		}

		public SessionOrBuilder getSessionOrBuilder() {
			if (this.sessionBuilder_ != null) {
				return (SessionOrBuilder) this.sessionBuilder_.getMessageOrBuilder();
			}
			return this.session_ == null ? Session.getDefaultInstance() : this.session_;
		}

		private SingleFieldBuilderV3<Session, Session.Builder, SessionOrBuilder> getSessionFieldBuilder() {
			if (this.sessionBuilder_ == null) {
				this.sessionBuilder_ = new SingleFieldBuilderV3(getSession(), getParentForChildren(), isClean());
				this.session_ = null;
			}
			return this.sessionBuilder_;
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
			this.context_ = Action.getDefaultInstance().getContext();
			onChanged();
			return this;
		}

		public Builder setContextBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			Action.checkByteStringIsUtf8(value);

			this.context_ = value;
			onChanged();
			return this;
		}

		private int targetSource_ = 0;
		private int agreementId_;

		public int getTargetSourceValue() {
			return this.targetSource_;
		}

		public Builder setTargetSourceValue(int value) {
			this.targetSource_ = value;
			onChanged();
			return this;
		}

		public TargetSource getTargetSource() {
			TargetSource result = TargetSource.valueOf(this.targetSource_);
			return result == null ? TargetSource.UNRECOGNIZED : result;
		}

		public Builder setTargetSource(TargetSource value) {
			if (value == null) {
				throw new NullPointerException();
			}
			this.targetSource_ = value.getNumber();
			onChanged();
			return this;
		}

		public Builder clearTargetSource() {
			this.targetSource_ = 0;
			onChanged();
			return this;
		}

		public int getAgreementId() {
			return this.agreementId_;
		}

		public Builder setAgreementId(int value) {
			this.agreementId_ = value;
			onChanged();
			return this;
		}

		public Builder clearAgreementId() {
			this.agreementId_ = 0;
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

	private static final Action DEFAULT_INSTANCE = new Action();

	public static Action getDefaultInstance() {
		return DEFAULT_INSTANCE;
	}

	private static final Parser<Action> PARSER = new AbstractParser() {
		public Action parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
			return new Action(input, extensionRegistry);
		}
	};

	public static Parser<Action> parser() {
		return PARSER;
	}

	public Parser<Action> getParserForType() {
		return PARSER;
	}

	public Action getDefaultInstanceForType() {
		return DEFAULT_INSTANCE;
	}
}
