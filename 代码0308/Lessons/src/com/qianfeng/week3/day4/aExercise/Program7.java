package com.qianfeng.week3.day4.aExercise;

public class Program7 {
	public static void main(String[] args) {
		System.out.println(getResult("1798798099079798098"));
	}
	
	// int hour = Integer.valueOf(times[0]);
	public static String getResult(String str) {
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		
		for (int i = 3; i < sb.length(); i+=4) {
			sb.insert(i, ',');
		}
		
		return sb.reverse().toString();
	}
	
}
