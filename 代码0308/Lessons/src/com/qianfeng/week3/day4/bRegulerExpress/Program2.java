package com.qianfeng.week3.day4.bRegulerExpress;

public class Program2 {
	
	public static void main(String[] args) {
		
		String str = "";
		StringBuffer s = new StringBuffer(str);
		
		System.out.println(checkQQ("12345678901234"));	// false
		System.out.println(checkQQ("123a123a123"));		// false
		System.out.println(checkQQ("01234567"));		// false
		System.out.println(checkQQ("123456"));			// true
		
		System.out.println();
		
		split();
		
		replace();
	}
	
	
	
	/**
	 * str.replaceAll()
	 */
	public static void replace() {
		
		/*
		String names = "lily********lucy&&&&&&&&uncle wang##########lintao    polly   madongmei";
		// "lily, lucy, uncle wang, lintao, polly, madongmei";
		
		names = names.replaceAll("[*&# ]{2,}", ", ");
		
		System.out.println(names);
		*/
		
		// 需求： 将一个手机号中间四位屏蔽成****
		String phone = "13478659876";
		phone = phone.replaceAll("^(1[34789]\\d)(\\d{4})(\\d{4})$", "$1****$3");
		System.out.println(phone);
	}
	
	
	
	public static void split() {
		String names = "lily********lucy&&&&&&&&uncle wang##########lintao    polly   madongmei";
		
		String[] nameArray = names.split("[*&# ]{2,}");
		
		for (String name : nameArray) {
			System.out.println(name);
		}
	}
	
	
	public static boolean checkPhone(String str) {
		return str.matches("^1[356789]\\d{9}$");
	}
	
	// 设计一个方法，判断一个字符串中的内容是不是一个合法的QQ号
	// 1. 纯数字
	// 2. 不能以0开头
	// 3. 位数限制: [5, 12]
	public static boolean checkQQ(String str) {
		return str.matches("^[1-9]\\d{4,11}$");
	}
}
