package com.qianfeng.week2.day4.bObject;

public class Program {
	public static void main(String[] args) {
		
		equalsDemo();
	}
	
	public static void equalsDemo() {
		// ʵ��������Person����
		Person xiaoming = new Person("xiaoming", 10, '��');
		Person laowang = new Person("xiaoming", 10, '��');
		Person xiaoli = new Person("xiaoming", 10, '��');
		
		// == �Ƚϵ��ǵ�ַ�����Դ�ʱ xiaoming �� laowang �Ǿ��в�ͬ��ַ�����ԱȽϽ���� false
		System.out.println(xiaoming == laowang);
		
		
		// ��������������������ǵ����������䡢�Ա�ֱ�������ͬ�ģ���ʱ���Ǿ���Ϊ������������ͬһ������
		System.out.println(xiaoming.equals(laowang));
		System.out.println(laowang.equals(xiaoming));
		
		System.out.println(xiaoming.equals(xiaoli));
		System.out.println(laowang.equals(xiaoli));
			
	}
	
	
	public static void toStringDemo() {
		// 1. ʵ����һ��Person����
				// Person xiaoming = new Person("xiaoming", 10, '��');
				
				// System.out.println(xiaoming);	// �ܲ��ܿ���xiaoming�����ÿһ�����Ե�ֵ
				// ����
				// ϣ�������һ�������ʱ�򣬿��Կ�����������ÿһ�����Ե�ֵ
				// �����
				// ��дtoString()����
				// System.out.println(xiaoming);
				// String str = "ABC: " + xiaoming;
				// System.out.println(str);
				
				/*
				Dog d = new Dog();
				d.name = "��ʿ��";
				d.age = 1;
				d.color = "�ڰ�";
				
				xiaoming.dog = d;
				
				System.out.println(xiaoming);
				
				
				System.out.println(xiaoming.getClass());
				System.out.println(d.getClass());
				*/
				
	}
}
