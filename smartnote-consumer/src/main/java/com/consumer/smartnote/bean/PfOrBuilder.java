package com.consumer.smartnote.bean;

import java.util.List;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface PfOrBuilder extends MessageOrBuilder {

    public abstract int getTraceType();

    public abstract int getTraceStatus();

    public abstract String getHost();

    public abstract ByteString getHostBytes();

    public abstract String getUri();

    public abstract ByteString getUriBytes();

    public abstract long getNavigationStart();

    public abstract int getDuration();

    public abstract int getFirstPaintTime();

    public abstract int getFirstScreenTime();

    public abstract int getDomReadyTime();

    public abstract int getHtmlLoadTime();

    public abstract int getPageRenderTime();

    public abstract int getRequestTime();

    public abstract int getApplicationServerTime();

    public abstract boolean getJsError();

    public abstract long getFetchStart();

    public abstract int getStateValue();

    public abstract ActionState getState();

    public abstract String getTraceId();

    public abstract ByteString getTraceIdBytes();

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

    public abstract String getOperaParam();

    public abstract ByteString getOperaParamBytes();

    public abstract String getOperaAllParam();

    public abstract ByteString getOperaAllParamBytes();

    public abstract List<Ajax> getAjaxesList();

    public abstract Ajax getAjaxes(int paramInt);

    public abstract int getAjaxesCount();

    public abstract List<? extends AjaxOrBuilder> getAjaxesOrBuilderList();

    public abstract AjaxOrBuilder getAjaxesOrBuilder(int paramInt);

    public abstract List<Iframe> getIframesList();

    public abstract Iframe getIframes(int paramInt);

    public abstract int getIframesCount();

    public abstract List<? extends IframeOrBuilder> getIframesOrBuilderList();

    public abstract IframeOrBuilder getIframesOrBuilder(int paramInt);

    public abstract int getPageStayTime();

    public abstract String getSubType();

    public abstract ByteString getSubTypeBytes();
}
