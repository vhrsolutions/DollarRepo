package com.dr.common.util;

import com.dr.common.constants.DRErrorType;

public class DRResponseMessage {
	private final String errorCode;
	private DRErrorType drErrorType;
	private String message;

	public DRResponseMessage(final String errorCode, final DRErrorType drErrorType, final String message) {
		this.errorCode = errorCode;
	}

	@Override
	public String toString() {
		return "DRResponseMessage [errorCode=" + errorCode + ", drErrorType=" + drErrorType + ", message=" + message
				+ "]";
	}
}
