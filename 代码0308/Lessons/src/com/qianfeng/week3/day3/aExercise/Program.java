package com.qianfeng.week3.day3.aExercise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {
	public static void main(String[] args) {
		
	}
	
	
	public static int getDays(int year, int month, int day) {
		// SimpleDateFormat
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			Date date = sdf.parse(year + "-" + month + "-" + day);
			
			Date now = new Date();
			
			long delta = now.getTime() - date.getTime();
			
			return (int)(delta / 1000 / 60 / 60 / 24);
			
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		return 0;
	}
}
