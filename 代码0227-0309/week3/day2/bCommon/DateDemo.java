package com.qianfeng.week3.day2.bCommon;

import java.util.Date;

// ����2016��5��6�յ�2019��7��3��֮�侭�������죿

public class DateDemo {
	public static void main(String[] args) {
		// Date: 
		// ʵ����һ�����ڶ���ϵͳ��ǰ������
		Date date = new Date();
		System.out.println(date);
		
		// ͨ��һ��ʱ�����ʵ����һ�����ڶ���
		// ʱ������� 1970-1-1 ����ĺ�����
		Date date2 = new Date(23412312312487l);
		System.out.println(date2);
		
		// ��ָ����ʱ���������һ������
		date.setTime(23412312312487l);
		System.out.println(date);
		
		// ��ȡʱ���
		long time = date.getTime();
		System.out.println(time);
		
		
		// �ж�date�ǲ�����date2֮ǰ
		boolean ret = date.before(date2);
		System.out.println(ret);
		// �ж�date�ǲ�����date2֮��
		boolean ret2 = date.after(date2);
		System.out.println(ret2);
		// �ж����������Ƿ���ͬ
		boolean ret3 = date.equals(date2);
		System.out.println(ret3);
	}
}
