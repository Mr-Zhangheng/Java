package com.qianfeng.week3.day2.bCommon;

import java.util.Date;

// 计算2016年5月6日到2019年7月3日之间经历多少天？

public class DateDemo {
	public static void main(String[] args) {
		// Date: 
		// 实例化一个日期对象：系统当前的日期
		Date date = new Date();
		System.out.println(date);
		
		// 通过一个时间戳来实例化一个日期对象
		// 时间戳：从 1970-1-1 算起的毫秒数
		Date date2 = new Date(23412312312487l);
		System.out.println(date2);
		
		// 用指定的时间戳来设置一个日期
		date.setTime(23412312312487l);
		System.out.println(date);
		
		// 获取时间戳
		long time = date.getTime();
		System.out.println(time);
		
		
		// 判断date是不是在date2之前
		boolean ret = date.before(date2);
		System.out.println(ret);
		// 判断date是不是在date2之后
		boolean ret2 = date.after(date2);
		System.out.println(ret2);
		// 判断两个日期是否相同
		boolean ret3 = date.equals(date2);
		System.out.println(ret3);
	}
}
