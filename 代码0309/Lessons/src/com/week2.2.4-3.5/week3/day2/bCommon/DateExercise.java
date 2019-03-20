package com.qianfeng.week3.day2.bCommon;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExercise {
	public static void main(String[] args) {
		// ����������֮�侭���˶�����
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
		// 1. ʵ����һ��SimpleDateFormat����
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		
		long delta = 0;
		
		// 2. ������������
		try {
			Date time1 = sdf.parse(date1);
			Date time2 = sdf.parse(date2);
			
			// ��μ������������
			delta = time2.getTime() - time1.getTime();
		}
		catch (Exception e) {
			
		}
		
		return (int)(delta / 1000 / 60 / 60 / 24);
	}
}
