package com.hackerrank.algorithms.warmup;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversion {

	private static String timeConversion(String s) {
		String r = null;
		try {
			SimpleDateFormat dateFormatOld = new SimpleDateFormat("hh:mm:ssa");
			Date dateOld = dateFormatOld.parse(s);
			
			SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
			r = dateFormat.format(dateOld);
		
		} catch(ParseException e) {
			
		}
		return r;
	}

	public static void main(String[] args) {
		String s = "07:05:45PM";

		String result = timeConversion(s);
		System.out.println(result);
	}

}
