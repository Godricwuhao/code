package com.unicom.bean;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface ImmediateEventOrBuilder extends MessageOrBuilder {
	
	public abstract String getName();

	public abstract ByteString getNameBytes();

	public abstract long getTime();

	public abstract String getStatus();

	public abstract ByteString getStatusBytes();

	public abstract String getMsg();

	public abstract ByteString getMsgBytes();

	public abstract String getContext();

	public abstract ByteString getContextBytes();

}
