package com.qianfeng.week3.day2.bCommon;

import java.math.BigDecimal;

public class BigDecimalDemo {
	public static void main(String[] args) {
		
		BigDecimal number1 = new BigDecimal("3.1234567890987654321234567898765432345678");
		BigDecimal number2 = new BigDecimal("1.546786545786578657656765678657567");
		
		// ¼Ó
		BigDecimal result1 = number1.add(number2);
		System.out.println(result1);
		
		// ¼õ
		BigDecimal result2 = number1.subtract(number2);
		System.out.println(result2);
		
		// ³Ë
		BigDecimal result3 = number1.multiply(number2);
		System.out.println(result3);
		
		// BigDecimal result4 = number1.divide(number2);
		// System.out.println(result4);
	}

}
