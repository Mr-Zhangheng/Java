package com.qianfeng.week3.day4.aExercise;

public class Program4 {
	public static void main(String[] args) {
		System.out.println(getPhone("18888888888"));
	}
	
	public static String getPhone(String phone) {
		
		// return phone.replace(phone.substring(3, 7), "xxxx");
		
		return new StringBuilder(phone).replace(3, 7, "xxxx").toString();
			
		// return phone.replaceAll("(1\\d{2})(\\d{4})(\\d{4})", "$1****$3");
	}
}
