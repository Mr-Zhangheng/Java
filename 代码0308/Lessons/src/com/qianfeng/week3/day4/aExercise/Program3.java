package com.qianfeng.week3.day4.aExercise;

public class Program3 {
	public static void main(String[] args) {
		
	}
	
	
	// ���һ����������һ���ַ������з�ת�����ַ�����ָ�����ֽ��з�ת 
	public static String reverse(String str, int start, int end) {
		// ת��StringBuilder��������
		StringBuilder sb = new StringBuilder(str);	   	// 1234567890
														// 1238765490
		// ȡ���м䲿��
		String content = sb.substring(start, end);
		
		sb.replace(start, end, new StringBuilder(content).reverse().toString());
		
		return sb.toString();
	}
}
