package com.dr.common.constants;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

public enum DRErrorType {
	WARNING("warning"), VALIDATION("validation"), EXCEPTION("exception");

	private String value;
	private static Logger logger = Logger.getLogger(DRErrorType.class);

	private DRErrorType(final String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public static DRErrorType getDRErrorType(String errorType) throws IllegalAccessException {
		errorType = StringUtils.trimToEmpty(errorType);
		for (final DRErrorType drErrorType : values()) {
			if (drErrorType.getValue().equals(errorType)) {
				return drErrorType;
			}
		}
		logger.error("No matching ErrorType for the value passed");
		throw new IllegalAccessException("DRErrorType value passed is invalid");
	}
}
