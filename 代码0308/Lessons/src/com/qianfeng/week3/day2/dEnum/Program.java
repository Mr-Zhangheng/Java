package com.qianfeng.week3.day2.dEnum;

public class Program {
	public static void main(String[] args) {
		// ����һ��ö�����͵ı���
		Weekday day = Weekday.Tuesday;
		Weekday day2 = Weekday.Sunday;
		
		// System.out.println(day.value);
		System.out.println(day.getValue());
		
		
		Weekday.Monday.show();
		Weekday.Saturday.show();
		
		System.out.println(Weekday.Monday.getValue());		// 0
		System.out.println(Weekday.Saturday.getValue());	// 666
		
		/*
		// ���switch-caseһ��ʹ�õ�
		switch(day) {
		case Monday:
			System.out.println("��һ");
			break;
		case Tuesday:
			System.out.println("�ܶ�");
			break;
		case Wednesday:
			System.out.println("����");
			break;
		}
		*/
		
		/*
		// �Ƚ�����ö�ٶ���
		int result = day.compareTo(day2);
		System.out.println(result);
		// ��ȡö�ٳ���������
		System.out.println(day.name());
		// ��ȡö�ٳ������±�
		System.out.println(day.ordinal());
		
		// ��ȡö�������е�ö�ٳ���
		Weekday[] days = Weekday.values();
		for (Weekday ele : days) {
			System.out.println(ele.name());
		}
		*/
		
		
		
	}
}	
