/**
 * 
 */
package com.dr.common.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author Vaishnavie
 *
 */
public class DRDateUtil {
	
	
	
	public static java.sql.Date convertStrToDate(String dateStr){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date date;
		java.sql.Date sqlDate=null; 
		try {
			date = sdf.parse(dateStr);
			sqlDate = new java.sql.Date(date.getTime());
		}catch(ParseException pe){
			pe.printStackTrace();
		}
		return sqlDate;
	}
}
