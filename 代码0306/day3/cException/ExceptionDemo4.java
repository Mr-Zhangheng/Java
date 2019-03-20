package com.qianfeng.week3.day3.cException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * throw关键字
 * @author luds
 */
public class ExceptionDemo4 {
	public static void main(String[] args) throws ParseException {
		
		/*
		try {
			divide(10, 0);
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
		System.out.println("程序正常停止");
		 */
		
		try {
			getDate("12345678987");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		parseDate();
		
	}
	
	public static void parseDate() throws ParseException {
		parseDate("123456");
	}
	
	
	public static void parseDate(String dateTime) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d = sdf.parse(dateTime);
	}
	
	
	
	
	public static Date getDate(String dateTime) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			return sdf.parse(dateTime);
		}
		catch (ParseException e) {
			// 实例化了一个新的ParseException, 并且使用了指定的异常描述信息
			ParseException e1 = new ParseException("这个日期无法格式化为一个Date", 1);
			
			throw e1;
		}
	}
	
	
	// throws: 
	// 此时表示声明：这个方法会抛出一个算术异常，方便调用方去处理
	// 
	public static int divide(int a, int b) throws ArithmeticException {
		
		if (b == 0) {
			// 说明不能继续除了
			// 实例化一个算术异常的对象
			// 此时这个实例化完成的对象没有任何意义，不会中断程序的执行
			ArithmeticException exception = new ArithmeticException("这是一个我自定义的算术异常");
			
			// 一个异常对象需要被抛出后，才有意义，才会终止程序的运行
			// 抛出异常后，这个方法也会被终止
			throw exception;
		}
		
		return a / b;
	}
}
