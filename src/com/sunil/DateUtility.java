package com.sunil;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtility {
	public static String getDate(){
		SimpleDateFormat dateFormatter = new SimpleDateFormat("M-dd-yyy");
		return dateFormatter.format(new Date());
	}
}
