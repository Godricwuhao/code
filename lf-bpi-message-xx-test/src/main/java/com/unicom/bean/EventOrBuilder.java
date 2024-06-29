package com.unicom.bean;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

import java.util.List;

public interface EventOrBuilder extends MessageOrBuilder {
	
	public abstract long getDuration();

	public abstract String getPath();

	public abstract ByteString getPathBytes();

	public abstract String getNodeName();

	public abstract ByteString getNodeNameBytes();

	public abstract String getId();

	public abstract ByteString getIdBytes();

	public abstract String getClassName();

	public abstract ByteString getClassNameBytes();

	public abstract String getValue();

	public abstract ByteString getValueBytes();

	public abstract String getTitle();

	public abstract ByteString getTitleBytes();

	public abstract String getText();

	public abstract ByteString getTextBytes();

	public abstract String getSrc();

	public abstract ByteString getSrcBytes();

	public abstract String getHref();

	public abstract ByteString getHrefBytes();

	public abstract long getStart();

	public abstract long getEnd();

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

	public abstract String getTrigger();

	public abstract ByteString getTriggerBytes();

	public abstract String getRange();

	public abstract ByteString getRangeBytes();

	public abstract String getEventId();

	public abstract ByteString getEventIdBytes();

	public abstract String getRefId();

	public abstract ByteString getRefIdBytes();

	public abstract boolean hasSpe();

	public abstract Spe getSpe();

	public abstract SpeOrBuilder getSpeOrBuilder();
}
