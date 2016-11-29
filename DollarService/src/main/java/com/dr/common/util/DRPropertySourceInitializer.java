/**
 *
 */
package com.dr.common.util;

import org.springframework.core.env.PropertySource;

/**
 * @author Administrator
 *
 */
public class DRPropertySourceInitializer extends PropertySource<PropertyFileLoader> {

	public DRPropertySourceInitializer(final String name, final PropertyFileLoader source) {
		super(name, source);
	}

	@Override
	public Object getProperty(final String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
