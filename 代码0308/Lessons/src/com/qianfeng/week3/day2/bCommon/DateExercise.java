package com.qianfeng.week3.day2.bCommon;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExercise {
	public static void main(String[] args) {
		// 求两个日期之间经过了多少天
		int days = getDays("2016-7-2", "2019-8-3");
		System.out.println(days);
	}
	
	/**
	 * yyyy-MM-dd
	 * @param date1
	 * @param date2
	 * @return
	 */
	public static int getDays(String date1, String date2) {
		// 1. 实例化一个SimpleDateFormat对象
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		
		long delta = 0;
		
		// 2. 解析两个日期
		try {
			Date time1 = sdf.parse(date1);
			Date time2 = sdf.parse(date2);
			
			// 如何计算相隔多少天
			delta = time2.getTime() - time1.getTime();
		}
		catch (Exception e) {
			
		}
		
		return (int)(delta / 1000 / 60 / 60 / 24);
	}
}
