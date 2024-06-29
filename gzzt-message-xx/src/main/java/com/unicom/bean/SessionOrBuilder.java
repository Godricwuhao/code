package com.unicom.bean;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface SessionOrBuilder extends MessageOrBuilder {
	
	public abstract String getId();

	public abstract ByteString getIdBytes();

	public abstract String getName();

	public abstract ByteString getNameBytes();

	public abstract long getTime();

	public abstract String getContext();

	public abstract ByteString getContextBytes();

}
