package com.qianfeng.week3.day4.aExercise;

public class Program2 {
	public static void main(String[] args) {
		
		String str = getResult("a    c s  sd a w r  f s a s d a sd a s");
		
		System.out.println(str);
	}
	
	// ���һ��������ȥ���ַ��������еĿո�
	
	public static String getResult(String str) {
		
		StringBuilder builder = new StringBuilder(str);
		
		// ѭ���ж�str���Ƿ񻹰����ո�
		
		int index = -1;
		
		while ((index = builder.indexOf(" ")) != -1) {
			builder.deleteCharAt(index);
		}
		
		return builder.toString();
				
		/*
		String[] parts = str.split(" ");
		
		String ret = "";
		
		
		for (String ele : parts) {
			System.out.println(ele);
			ret += ele;
		}
				
		return ret;
		*/
		
		// return str.replace(" ", "");
	}
	
}
