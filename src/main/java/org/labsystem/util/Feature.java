package org.labsystem.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Feature {
	public static String date2String(Date date) {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(date);
	}


}
