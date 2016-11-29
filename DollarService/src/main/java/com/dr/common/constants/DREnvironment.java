/**
 *
 */
package com.dr.common.constants;

import org.apache.commons.lang.StringUtils;

/**
 * @author Administrator
 *
 */
public enum DREnvironment {
	LOCAL, DEV, SIT, UAT, PROD;

	public static DREnvironment getName(String name) {
		name = StringUtils.trimToEmpty(name);
		for (final DREnvironment region : values()) {
			if (region.name().equalsIgnoreCase(name)) {
				return region;
			}
		}
		return DREnvironment.LOCAL;
	}

}
