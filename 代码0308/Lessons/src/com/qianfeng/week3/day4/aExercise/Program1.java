package com.qianfeng.week3.day4.aExercise;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		// �ӿ���̨¼��һ���ַ�����
		// �������ַ����Դ�д��ĸ��ͷ�������ַ���ת��ȫСд��
		// �������ַ�����Сд��ĸ��ͷ�������ַ���ת��ȫ��д
		
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.nextLine();
		
		
		if (str.equals("") == false) {
			char start = str.charAt(0);
			
			if (start >= 'a' && start <= 'z') {
				str = str.toUpperCase();
			}
			else if (start >= 'A' && start <= 'Z') {
				str = str.toLowerCase();
			}	
		}
		
		System.out.println(str);
		
	}
}
