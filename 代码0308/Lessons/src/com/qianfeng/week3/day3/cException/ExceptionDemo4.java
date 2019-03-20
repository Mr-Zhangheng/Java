package com.qianfeng.week3.day3.cException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * throw�ؼ���
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
		
		System.out.println("��������ֹͣ");
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
			// ʵ������һ���µ�ParseException, ����ʹ����ָ�����쳣������Ϣ
			ParseException e1 = new ParseException("��������޷���ʽ��Ϊһ��Date", 1);
			
			throw e1;
		}
	}
	
	
	// throws: 
	// ��ʱ��ʾ����������������׳�һ�������쳣��������÷�ȥ����
	// 
	public static int divide(int a, int b) throws ArithmeticException {
		
		if (b == 0) {
			// ˵�����ܼ�������
			// ʵ����һ�������쳣�Ķ���
			// ��ʱ���ʵ������ɵĶ���û���κ����壬�����жϳ����ִ��
			ArithmeticException exception = new ArithmeticException("����һ�����Զ���������쳣");
			
			// һ���쳣������Ҫ���׳��󣬲������壬�Ż���ֹ���������
			// �׳��쳣���������Ҳ�ᱻ��ֹ
			throw exception;
		}
		
		return a / b;
	}
}
