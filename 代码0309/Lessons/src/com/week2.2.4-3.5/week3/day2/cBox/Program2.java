package com.qianfeng.week3.day2.cBox;

public class Program2 {
	public static void main(String[] args) {
		
		Integer a = new Integer(10);
		Integer b = new Integer(10);
		
		// ��ʱ��a��b�ĵ�ַ�ǲ�ͬ�ġ����Դ�ʱ==�Ƚ���false
		System.out.println(a == b);
		// ͨ����equals��ԭ�룬���Ƿ��֣���ʱ�Ƚϵ���value���Ե�ֵ
		System.out.println(a.equals(b));
		
		
		Integer c = 10;
		Integer d = 10;
		System.out.println(c == d);		// true 
	}
}
