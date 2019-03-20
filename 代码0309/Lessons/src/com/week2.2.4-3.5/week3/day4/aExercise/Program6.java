package com.qianfeng.week3.day4.aExercise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Program6 {
	public static void main(String[] args) {
		System.out.println(getNextSecond2("23:59:59"));
	}
	
	
	public static String getNextSecond2(String time) {
		// 1. ����ð�Ž����и�
		String[] times = time.split(":");
		
		// 2. �ֱ��ȡʱ����
		int hour = Integer.valueOf(times[0]);
		int minute = Integer.valueOf(times[1]);
		int second = Integer.valueOf(times[2]);
		
		if (++second >= 60) {
			second = 0;
			if (++minute >= 60) {
				minute = 0;
				if (++hour >= 24) {
					hour = 0;
				}
			}
		}
		
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	
	// ����һ��ʱ�䣬���������һ��ʱ��(�ַ����汾)
	public static String getNextSecond(String time) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		
		try {
			Date date = sdf.parse(time);
			
			Calendar c = Calendar.getInstance();
			c.setTime(date);
			
			c.add(Calendar.SECOND, 1);
						
			date = c.getTime();
			
			return sdf.format(date);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return "";
	}
}
