package com.unicom.bean;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

import java.util.List;

public interface AjaxOrBuilder extends MessageOrBuilder{
	public abstract String getHost();
	  
	  public abstract ByteString getHostBytes();
	  
	  public abstract String getUri();
	  
	  public abstract ByteString getUriBytes();
	  
	  public abstract String getRequestMethod();
	  
	  public abstract ByteString getRequestMethodBytes();
	  
	  public abstract String getProtocol();
	  
	  public abstract ByteString getProtocolBytes();
	  
	  public abstract String getRequestUrl();
	  
	  public abstract ByteString getRequestUrlBytes();
	  
	  public abstract int getUriRuleId();
	  
	  public abstract int getHttpCode();
	  
	  public abstract long getBytesSend();
	  
	  public abstract long getBytesReceived();
	  
	  public abstract long getStart();
	  
	  public abstract long getEnd();
	  
	  public abstract int getResponseTime();
	  
	  public abstract int getApplicationServerTime();
	  
	  public abstract int getCallbackTime();
	  
	  public abstract int getNetworkTime();
	  
	  public abstract boolean getJsError();
	  
	  public abstract String getOperaParam();
	  
	  public abstract ByteString getOperaParamBytes();
	  
	  public abstract int getSAppId();
	  
	  public abstract int getSAppInstanceId();
	  
	  public abstract String getSTname();
	  
	  public abstract ByteString getSTnameBytes();
	  
	  public abstract String getSTid();
	  
	  public abstract ByteString getSTidBytes();
	  
	  public abstract String getSDuration();
	  
	  public abstract ByteString getSDurationBytes();
	  
	  public abstract String getSUser();
	  
	  public abstract ByteString getSUserBytes();
	  
	  public abstract String getSBid();
	  
	  public abstract ByteString getSBidBytes();
	  
	  public abstract String getSBer();
	  
	  public abstract ByteString getSBerBytes();
	  
	  public abstract String getSIsError();
	  
	  public abstract ByteString getSIsErrorBytes();
	  
	  public abstract int getStateValue();
	  
	  public abstract ActionState getState();
	  
	  public abstract boolean getIgnore();
	  
	  public abstract List<Ajax> getAjaxesList();
	  
	  public abstract Ajax getAjaxes(int paramInt);
	  
	  public abstract int getAjaxesCount();
	  
	  public abstract List<? extends AjaxOrBuilder> getAjaxesOrBuilderList();
	  
	  public abstract AjaxOrBuilder getAjaxesOrBuilder(int paramInt);
	  
	  public abstract List<Timer> getTimersList();
	  
	  public abstract Timer getTimers(int paramInt);
	  
	  public abstract int getTimersCount();
	  
	  public abstract List<? extends TimerOrBuilder> getTimersOrBuilderList();
	  
	  public abstract TimerOrBuilder getTimersOrBuilder(int paramInt);
	  
	  public abstract List<Iframe> getIframesList();
	  
	  public abstract Iframe getIframes(int paramInt);
	  
	  public abstract int getIframesCount();
	  
	  public abstract List<? extends IframeOrBuilder> getIframesOrBuilderList();
	  
	  public abstract IframeOrBuilder getIframesOrBuilder(int paramInt);
	  
	  public abstract List<CrossPage> getCrossPagesList();
	  
	  public abstract CrossPage getCrossPages(int paramInt);
	  
	  public abstract int getCrossPagesCount();
	  
	  public abstract List<? extends CrossPageOrBuilder> getCrossPagesOrBuilderList();
	  
	  public abstract CrossPageOrBuilder getCrossPagesOrBuilder(int paramInt);
	  
	  public abstract String getOperaAllParam();
	  
	  public abstract ByteString getOperaAllParamBytes();
	  
	  public abstract boolean getSpe();
	  
	  public abstract String getSubType();
	  
	  public abstract ByteString getSubTypeBytes();
	  
	  public abstract String getContext();
	  
	  public abstract ByteString getContextBytes();
}
