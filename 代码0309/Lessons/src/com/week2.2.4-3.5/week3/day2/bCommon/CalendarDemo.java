package com.qianfeng.week3.day2.bCommon;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
	public static void main(String[] args) {
		// Calendar��һ�������࣬�޷�ֱ��ʵ��������
		// ͨ��Calendar�������ṩ��һ����������ȡ����
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
		// ͨ��ָ������ţ�����ȡָ����ʱ��
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH) + 1);
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		
		System.out.println(c.get(Calendar.HOUR));
		System.out.println(c.get(Calendar.HOUR_OF_DAY));
		
		System.out.println(c.get(Calendar.MINUTE));
		System.out.println(c.get(Calendar.SECOND));
		System.out.println(c.get(Calendar.MILLISECOND));

		
		// ͨ��ָ������ţ�������ʱ��
		c.set(Calendar.YEAR, 2018);
		c.set(Calendar.MONTH, 3);
		c.set(Calendar.DAY_OF_MONTH, 19);
		// ֱ������������
		c.set(2017, 7, 7);
		// ֱ������������ʱ����
		c.set(2016, 6, 6, 6, 6, 6);
		
		// ʹ��һ��Date��������һ��Calendar���и�ֵ
		c.setTime(new Date());
		c.getTime();
		
		
		// ���·�+2
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
