package com.unicom.bean;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface SpeOrBuilder extends MessageOrBuilder {
	
	public abstract String getKey();

	public abstract ByteString getKeyBytes();

	public abstract long getStart();

	public abstract long getDuration();

	public abstract int getStatus();

	public abstract String getType();

	public abstract ByteString getTypeBytes();

	public abstract boolean getHasAjax();

	public abstract String getDebug();

	public abstract ByteString getDebugBytes();

	public abstract String getContext();

	public abstract ByteString getContextBytes();

	public abstract String getOprtName();

	public abstract ByteString getOprtNameBytes();

}
