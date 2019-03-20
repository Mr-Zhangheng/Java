package com.qianfeng.week2.day5.aExercise.exercise5;

import java.util.*;

public class Program {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		Shunfeng shunfeng = new Shunfeng();
		
		
		if (num >= 8 && num <= 18) {
			shunfeng.open();
		}
		else {
			shunfeng.close();
		}
		
	}
}
