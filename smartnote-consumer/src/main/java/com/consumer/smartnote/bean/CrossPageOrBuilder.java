package com.consumer.smartnote.bean;

import java.util.List;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface CrossPageOrBuilder extends MessageOrBuilder {
	
	public abstract long getStart();

	public abstract long getEnd();

	public abstract String getUrl();

	public abstract ByteString getUrlBytes();

	public abstract boolean hasPf();

	public abstract Pf getPf();

	public abstract PfOrBuilder getPfOrBuilder();

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

	public abstract int getStateValue();

	public abstract ActionState getState();
}
