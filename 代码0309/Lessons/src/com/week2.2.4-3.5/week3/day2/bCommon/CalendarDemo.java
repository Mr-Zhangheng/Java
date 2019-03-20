package com.qianfeng.week3.day2.bCommon;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
	public static void main(String[] args) {
		// Calendar是一个抽象类，无法直接实例化对象
		// 通过Calendar给我们提供的一个方法来获取对象
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
		// 通过指定的序号，来获取指定的时间
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH) + 1);
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		
		System.out.println(c.get(Calendar.HOUR));
		System.out.println(c.get(Calendar.HOUR_OF_DAY));
		
		System.out.println(c.get(Calendar.MINUTE));
		System.out.println(c.get(Calendar.SECOND));
		System.out.println(c.get(Calendar.MILLISECOND));

		
		// 通过指定的序号，来设置时间
		c.set(Calendar.YEAR, 2018);
		c.set(Calendar.MONTH, 3);
		c.set(Calendar.DAY_OF_MONTH, 19);
		// 直接设置年月日
		c.set(2017, 7, 7);
		// 直接设置年月日时分秒
		c.set(2016, 6, 6, 6, 6, 6);
		
		// 使用一个Date对象来给一个Calendar进行赋值
		c.setTime(new Date());
		c.getTime();
		
		
		// 对月份+2
		c.add(Calendar.MONTH, 2);	// 2016-8-6
		c.add(Calendar.MONTH, 4);	// 2016-12-6	12:  2017-0-6
		
		c.add(Calendar.DAY_OF_MONTH, 26);	// 2017-1-1
		c.add(Calendar.DAY_OF_MONTH, 28);
		
		c.set(2017, 1, 30);					// 2017-1-30  2017-2-3
		// c.add(Calendar.DAY_OF_MONTH, 1);
		c.add(Calendar.MONTH, -1);
		
		System.out.println(c);
	}
}
