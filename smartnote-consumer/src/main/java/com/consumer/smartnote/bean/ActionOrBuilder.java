package com.consumer.smartnote.bean;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public abstract interface ActionOrBuilder extends MessageOrBuilder {
	
	public abstract long getTimestamp();

	public abstract int getBrowserApplicationId();

	public abstract int getSAppId();

	public abstract int getSAppInstanceId();

	public abstract String getHost();

	public abstract ByteString getHostBytes();

	public abstract String getUri();

	public abstract ByteString getUriBytes();

	public abstract String getClientIp();

	public abstract ByteString getClientIpBytes();

	public abstract int getCountryId();

	public abstract int getRegionId();

	public abstract int getCityId();

	public abstract int getCarrierId();

	public abstract int getAccessMode();

	public abstract int getConnectType();

	public abstract String getWebBrowser();

	public abstract ByteString getWebBrowserBytes();

	public abstract String getWebBrowserVersion();

	public abstract ByteString getWebBrowserVersionBytes();

	public abstract int getModuleId();

	public abstract String getModuleRule();

	public abstract ByteString getModuleRuleBytes();

	public abstract int getUriRuleId();

	public abstract String getRequestMethod();

	public abstract ByteString getRequestMethodBytes();

	public abstract String getProtocol();

	public abstract ByteString getProtocolBytes();

	public abstract String getRequestUrl();

	public abstract ByteString getRequestUrlBytes();

	public abstract String getDeviceId();

	public abstract ByteString getDeviceIdBytes();

	public abstract String getSessionId();

	public abstract ByteString getSessionIdBytes();

	public abstract int getTypeValue();

	public abstract Action.ActionType getType();

	public abstract int getStateValue();

	public abstract ActionState getState();

	public abstract String getSubType();

	public abstract ByteString getSubTypeBytes();

	public abstract long getStart();

	public abstract long getEnd();

	public abstract String getPvid();

	public abstract ByteString getPvidBytes();

	public abstract String getOperaParam();

	public abstract ByteString getOperaParamBytes();

	public abstract long getAgentUploadTime();

	public abstract String getUa();

	public abstract ByteString getUaBytes();

	public abstract String getSystem();

	public abstract ByteString getSystemBytes();

	public abstract String getResolution();

	public abstract ByteString getResolutionBytes();

	public abstract String getUserId();

	public abstract ByteString getUserIdBytes();

	public abstract long getSessionStartTime();

	public abstract String getVersion();

	public abstract ByteString getVersionBytes();

	public abstract boolean hasPf();

	public abstract Pf getPf();

	public abstract PfOrBuilder getPfOrBuilder();

	public abstract boolean hasAjax();

	public abstract Ajax getAjax();

	public abstract AjaxOrBuilder getAjaxOrBuilder();

	public abstract boolean hasEvent();

	public abstract Event getEvent();

	public abstract EventOrBuilder getEventOrBuilder();

	public abstract boolean hasTimer();

	public abstract Timer getTimer();

	public abstract TimerOrBuilder getTimerOrBuilder();

	public abstract boolean hasIframe();

	public abstract Iframe getIframe();

	public abstract IframeOrBuilder getIframeOrBuilder();

	public abstract boolean hasImmediateEvent();

	public abstract ImmediateEvent getImmediateEvent();

	public abstract ImmediateEventOrBuilder getImmediateEventOrBuilder();

	public abstract boolean hasSession();

	public abstract Session getSession();

	public abstract SessionOrBuilder getSessionOrBuilder();

	public abstract String getContext();

	public abstract ByteString getContextBytes();

	public abstract int getTargetSourceValue();

	public abstract Action.TargetSource getTargetSource();

	public abstract int getAgreementId();
}
