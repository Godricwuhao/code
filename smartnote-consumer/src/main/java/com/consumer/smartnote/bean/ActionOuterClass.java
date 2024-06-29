package com.consumer.smartnote.bean;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public class ActionOuterClass {
	public static void registerAllExtensions(ExtensionRegistryLite registry) {
	}

	public static void registerAllExtensions(ExtensionRegistry registry) {
		registerAllExtensions(registry);
	}

	public static Descriptors.FileDescriptor getDescriptor() {
		return descriptor;
	}

	static {
		String[] descriptorData = { "" };
		descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
	}

	static final Descriptors.Descriptor internal_static_com_tingyun_proto_Action_descriptor = (Descriptors.Descriptor) getDescriptor().getMessageTypes().get(0);
	static final GeneratedMessageV3.FieldAccessorTable internal_static_com_tingyun_proto_Action_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_com_tingyun_proto_Action_descriptor, new String[] { "Timestamp", "BrowserApplicationId", "SAppId", "SAppInstanceId", "Host", "Uri", "ClientIp", "CountryId", "RegionId", "CityId", "CarrierId", "AccessMode", "ConnectType", "WebBrowser", "WebBrowserVersion", "ModuleId", "ModuleRule", "UriRuleId", "RequestMethod", "Protocol", "RequestUrl", "DeviceId", "SessionId", "Type", "State", "SubType", "Start", "End", "Pvid", "OperaParam", "AgentUploadTime", "Ua", "System", "Resolution", "UserId", "SessionStartTime", "Version", "Pf", "Ajax", "Event", "Timer", "Iframe", "ImmediateEvent", "Session", "Context", "TargetSource", "AgreementId" });
	static final Descriptors.Descriptor internal_static_com_tingyun_proto_Pf_descriptor = (Descriptors.Descriptor) getDescriptor().getMessageTypes().get(1);
	static final GeneratedMessageV3.FieldAccessorTable internal_static_com_tingyun_proto_Pf_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_com_tingyun_proto_Pf_descriptor, new String[] { "TraceType", "TraceStatus", "Host", "Uri", "NavigationStart", "Duration", "FirstPaintTime", "FirstScreenTime", "DomReadyTime", "HtmlLoadTime", "PageRenderTime", "RequestTime", "ApplicationServerTime", "JsError", "FetchStart", "State", "TraceId", "SAppId", "SAppInstanceId", "STname", "STid", "SDuration", "SUser", "SBid", "SBer", "SIsError", "OperaParam", "OperaAllParam", "Ajaxes", "Iframes", "PageStayTime", "SubType" });
	static final Descriptors.Descriptor internal_static_com_tingyun_proto_Ajax_descriptor = (Descriptors.Descriptor) getDescriptor().getMessageTypes().get(2);
	static final GeneratedMessageV3.FieldAccessorTable internal_static_com_tingyun_proto_Ajax_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_com_tingyun_proto_Ajax_descriptor, new String[] { "Host", "Uri", "RequestMethod", "Protocol", "RequestUrl", "UriRuleId", "HttpCode", "BytesSend", "BytesReceived", "Start", "End", "ResponseTime", "ApplicationServerTime", "CallbackTime", "NetworkTime", "JsError", "OperaParam", "SAppId", "SAppInstanceId", "STname", "STid", "SDuration", "SUser", "SBid", "SBer", "SIsError", "State", "Ignore", "Ajaxes", "Timers", "Iframes", "CrossPages", "OperaAllParam", "Spe", "SubType", "Context" });
	static final Descriptors.Descriptor internal_static_com_tingyun_proto_Event_descriptor = (Descriptors.Descriptor) getDescriptor().getMessageTypes().get(3);
	static final GeneratedMessageV3.FieldAccessorTable internal_static_com_tingyun_proto_Event_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_com_tingyun_proto_Event_descriptor, new String[] { "Duration", "Path", "NodeName", "Id", "ClassName", "Value", "Title", "Text", "Src", "Href", "Start", "End", "State", "Ajaxes", "Timers", "Iframes", "CrossPages", "Trigger", "Range", "EventId", "RefId", "Spe" });
	static final Descriptors.Descriptor internal_static_com_tingyun_proto_Spe_descriptor = (Descriptors.Descriptor) getDescriptor().getMessageTypes().get(4);
	static final GeneratedMessageV3.FieldAccessorTable internal_static_com_tingyun_proto_Spe_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_com_tingyun_proto_Spe_descriptor, new String[] { "Key", "Start", "Duration", "Status", "Type", "HasAjax", "Debug", "Context", "OprtName" });
	static final Descriptors.Descriptor internal_static_com_tingyun_proto_Timer_descriptor = (Descriptors.Descriptor) getDescriptor().getMessageTypes().get(5);
	static final GeneratedMessageV3.FieldAccessorTable internal_static_com_tingyun_proto_Timer_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_com_tingyun_proto_Timer_descriptor, new String[] { "Name", "Start", "End", "Delay", "State", "Ajaxes", "Timers", "Iframes", "CrossPages" });
	static final Descriptors.Descriptor internal_static_com_tingyun_proto_Iframe_descriptor = (Descriptors.Descriptor) getDescriptor().getMessageTypes().get(6);
	static final GeneratedMessageV3.FieldAccessorTable internal_static_com_tingyun_proto_Iframe_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_com_tingyun_proto_Iframe_descriptor, new String[] { "LoadType", "Src", "Host", "Uri", "Pvid", "Start", "End", "Duration", "FirstPaintTime", "FirstScreenTime", "DomReadyTime", "SAppId", "SAppInstanceId", "STname", "STid", "SDuration", "SUser", "SBid", "SBer", "SIsError", "SameOrigin", "JsError", "State" });
	static final Descriptors.Descriptor internal_static_com_tingyun_proto_CrossPage_descriptor = (Descriptors.Descriptor) getDescriptor().getMessageTypes().get(7);
	static final GeneratedMessageV3.FieldAccessorTable internal_static_com_tingyun_proto_CrossPage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_com_tingyun_proto_CrossPage_descriptor, new String[] { "Start", "End", "Url", "Pf", "Ajaxes", "Timers", "Iframes", "State" });
	static final Descriptors.Descriptor internal_static_com_tingyun_proto_ImmediateEvent_descriptor = (Descriptors.Descriptor) getDescriptor().getMessageTypes().get(8);
	static final GeneratedMessageV3.FieldAccessorTable internal_static_com_tingyun_proto_ImmediateEvent_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_com_tingyun_proto_ImmediateEvent_descriptor, new String[] { "Name", "Time", "Status", "Msg", "Context" });
	static final Descriptors.Descriptor internal_static_com_tingyun_proto_Session_descriptor = (Descriptors.Descriptor) getDescriptor().getMessageTypes().get(9);
	static final GeneratedMessageV3.FieldAccessorTable internal_static_com_tingyun_proto_Session_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_com_tingyun_proto_Session_descriptor, new String[] { "Id", "Name", "Time", "Context" });
	private static Descriptors.FileDescriptor descriptor;
}
