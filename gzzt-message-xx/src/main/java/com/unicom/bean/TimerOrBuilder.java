package com.unicom.bean;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

import java.util.List;

public interface TimerOrBuilder extends MessageOrBuilder {
	public abstract String getName();

	public abstract ByteString getNameBytes();

	public abstract long getStart();

	public abstract long getEnd();

	public abstract long getDelay();

	public abstract int getStateValue();

	public abstract ActionState getState();

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
}
