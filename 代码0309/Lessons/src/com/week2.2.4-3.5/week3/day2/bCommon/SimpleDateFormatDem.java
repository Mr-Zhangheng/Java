package com.qianfeng.week3.day2.bCommon;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class SimpleDateFormatDem {
	public static void main(String[] args) {
		// 这个类是用来做日期的格式化的，
		// 可以将一个日期（Date）以指定的格式进行输出，或者将一个指定格式的日期字符串转换成Date
		
		// Date date = new Date();
		// 2019年3月5日 11:36:28
		
		
		// 实例化一个SimpleDateFormat对象：
		// 一般使用这个构造方法，在这个构造方法的参数中，我们需要去写一个格式
		// yyyy: 年  2019
		// yy: 年	19
		// MM: 月
		// dd: 日
		// HH: 时（24小时制）
		// hh: 时（12小时制）
		// mm: 分
		// ss: 秒
		SimpleDateFormat sdf = new SimpleDateFormat("yy年MM月dd日 HH:mm:ss");
		
		// 将一个Date对象转成指定格式的字符串
		String result = sdf.format(new Date());
		System.out.println(result);
		
		// 将一个指定格式的字符串解析成一个Date
		try {
			// 这个解析方法, 抛出了一个Exception（非运行时异常），此时我们必须要处理
			Date result2 = sdf.parse("2018年8月8日 23:59:59");
			
			System.out.println(result2);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
}
