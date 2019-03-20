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
		
		// ���� ��һ���ֻ����м���λ���γ�****
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
	
	// ���һ���������ж�һ���ַ����е������ǲ���һ���Ϸ���QQ��
	// 1. ������
	// 2. ������0��ͷ
	// 3. λ������: [5, 12]
	public static boolean checkQQ(String str) {
		return str.matches("^[1-9]\\d{4,11}$");
	}
}
