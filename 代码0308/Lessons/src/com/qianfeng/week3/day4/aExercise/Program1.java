package com.qianfeng.week3.day4.aExercise;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		// 从控制台录入一个字符串，
		// 如果这个字符串以大写字母开头，将该字符串转成全小写；
		// 如果这个字符串以小写字母开头，将该字符串转成全大写
		
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
