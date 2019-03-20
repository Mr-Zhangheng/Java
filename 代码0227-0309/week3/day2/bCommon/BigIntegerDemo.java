package com.qianfeng.week3.day2.bCommon;

import java.math.BigInteger;

public class BigIntegerDemo {
	public static void main(String[] args) {
		BigInteger number1 = new BigInteger("3456787654345678765456789876545678987645678987656");
		BigInteger number2 = new BigInteger("76876578756787756787567875456787657876578765787656");
		
		// 让两个大数字相加
		BigInteger result1 = number1.add(number2);
		System.out.println(result1);
		
		// 让两个数字相减
		BigInteger result2 = number1.subtract(number2);
		System.out.println(result2);
		
		// 让两个数字相乘
		BigInteger result3 = number1.multiply(number2);
		System.out.println(result3);
		
		// 让两个数字相除
		BigInteger result4 = number1.divide(number2);
		System.out.println(result4);
		
		// 让两个数字相除，并得到商和余数，存入一个数组中
		BigInteger[] result5 = number1.divideAndRemainder(number2);
		System.out.println(result5[0]);
		System.out.println(result5[1]);
		
		System.out.println(result5.length);
		
		// 转成int 
		int result6 = number1.intValue();
		System.out.println(result6);
	}
}
