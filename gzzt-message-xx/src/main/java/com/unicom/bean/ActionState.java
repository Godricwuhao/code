package com.unicom.bean;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

public enum ActionState implements ProtocolMessageEnum {
	
	FINISH(0), TIMEOUT(1), PENDING(2), UNRECOGNIZED(-1);

	public static final int FINISH_VALUE = 0;
	public static final int TIMEOUT_VALUE = 1;
	public static final int PENDING_VALUE = 2;

	public final int getNumber() {
		if (this == UNRECOGNIZED) {
			throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
		}
		return this.value;
	}

	@Deprecated
	public static ActionState valueOf(int value) {
		return forNumber(value);
	}

	public static ActionState forNumber(int value) {
		switch (value) {
		case 0:
			return FINISH;
		case 1:
			return TIMEOUT;
		case 2:
			return PENDING;
		}
		return null;
	}

	public static Internal.EnumLiteMap<ActionState> internalGetValueMap() {
		return internalValueMap;
	}

	private static final Internal.EnumLiteMap<ActionState> internalValueMap = new Internal.EnumLiteMap() {
		public ActionState findValueByNumber(int number) {
			return ActionState.forNumber(number);
		}
	};

	public final Descriptors.EnumValueDescriptor getValueDescriptor() {
		return (Descriptors.EnumValueDescriptor) getDescriptor().getValues().get(ordinal());
	}

	public final Descriptors.EnumDescriptor getDescriptorForType() {
		return getDescriptor();
	}

	public static final Descriptors.EnumDescriptor getDescriptor() {
		return (Descriptors.EnumDescriptor) ActionOuterClass.getDescriptor().getEnumTypes().get(0);
	}

	private static final ActionState[] VALUES = values();
	private final int value;

	public static ActionState valueOf(Descriptors.EnumValueDescriptor desc) {
		if (desc.getType() != getDescriptor()) {
			throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
		}
		if (desc.getIndex() == -1) {
			return UNRECOGNIZED;
		}
		return VALUES[desc.getIndex()];
	}

	private ActionState(int value) {
		this.value = value;
	}
}
