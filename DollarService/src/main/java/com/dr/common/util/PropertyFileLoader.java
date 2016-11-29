package com.dr.common.util;

import java.io.IOException;
import java.util.Properties;

import org.apache.commons.lang.StringUtils;

import com.dr.common.constants.DREnvironment;

public class PropertyFileLoader {

	private Properties propertyFile = null;

	public PropertyFileLoader(String propertyFileName) {
		final String regionName = StringUtils.trimToEmpty(System.getProperty("ENV_TYPE"));
		setEnvironment(regionName);
		propertyFileName = StringUtils.trimToEmpty(propertyFileName);
		if (!StringUtils.isEmpty(propertyFileName)) {
			propertyFile = new Properties();
			try {
				propertyFile.load(Thread.currentThread().getContextClassLoader().getResourceAsStream(propertyFileName));
			} catch (final IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			;
		}
	}

	public void setEnvironment(final String environmentName) {
		DREnvironment environment = DREnvironment.getName(environmentName);
		if (environment == null) {
			environment = DREnvironment.DEV;
		}
	}
}
