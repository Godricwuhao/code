package com.consumer.smartnote.bean;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface IframeOrBuilder extends MessageOrBuilder {
	public abstract int getLoadTypeValue();

	public abstract Iframe.LoadType getLoadType();

	public abstract String getSrc();

	public abstract ByteString getSrcBytes();

	public abstract String getHost();

	public abstract ByteString getHostBytes();

	public abstract String getUri();

	public abstract ByteString getUriBytes();

	public abstract String getPvid();

	public abstract ByteString getPvidBytes();

	public abstract long getStart();

	public abstract long getEnd();

	public abstract int getDuration();

	public abstract int getFirstPaintTime();

	public abstract int getFirstScreenTime();

	public abstract int getDomReadyTime();

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

	public abstract boolean getSameOrigin();

	public abstract boolean getJsError();

	public abstract int getStateValue();

	public abstract ActionState getState();
}
