package com.qianfeng.week3.day2.bCommon;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class SimpleDateFormatDem {
	public static void main(String[] args) {
		// ����������������ڵĸ�ʽ���ģ�
		// ���Խ�һ�����ڣ�Date����ָ���ĸ�ʽ������������߽�һ��ָ����ʽ�������ַ���ת����Date
		
		// Date date = new Date();
		// 2019��3��5�� 11:36:28
		
		
		// ʵ����һ��SimpleDateFormat����
		// һ��ʹ��������췽������������췽���Ĳ����У�������Ҫȥдһ����ʽ
		// yyyy: ��  2019
		// yy: ��	19
		// MM: ��
		// dd: ��
		// HH: ʱ��24Сʱ�ƣ�
		// hh: ʱ��12Сʱ�ƣ�
		// mm: ��
		// ss: ��
		SimpleDateFormat sdf = new SimpleDateFormat("yy��MM��dd�� HH:mm:ss");
		
		// ��һ��Date����ת��ָ����ʽ���ַ���
		String result = sdf.format(new Date());
		System.out.println(result);
		
		// ��һ��ָ����ʽ���ַ���������һ��Date
		try {
			// �����������, �׳���һ��Exception��������ʱ�쳣������ʱ���Ǳ���Ҫ����
			Date result2 = sdf.parse("2018��8��8�� 23:59:59");
			
			System.out.println(result2);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
}
