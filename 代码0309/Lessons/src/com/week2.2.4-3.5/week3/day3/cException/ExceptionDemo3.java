package com.qianfeng.week3.day3.cException;

public class ExceptionDemo3 {
	public static void main(String[] args) {
		
		try {
			int[] array = new int[5];
			array[4] = 10;
		}
		finally {
			System.out.println("finally�еĴ��뱻ִ����");
		}
		
		System.out.println("��������ֹͣ��");
		
		
		System.out.println(show(10, 0));
	}
	
	public static int show(int a, int b) {
		
		int c = 0;
		
		try {
			c = a / b;
			
			// ���ߵ����˵������ĳ�û���쳣��
			return c;
		}
		catch (ArithmeticException e) {
			System.out.println("������һ�������쳣");
			return c;
		}
		finally {
			// ��return֮ǰ��ִ��finally�еĴ����
			System.out.println("finally�еĴ���ִ����");
			c = -10;
		}
		
	}
	
	
}
