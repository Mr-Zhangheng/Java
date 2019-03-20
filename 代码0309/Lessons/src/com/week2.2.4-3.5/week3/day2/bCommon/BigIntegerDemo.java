package com.qianfeng.week3.day2.bCommon;

import java.math.BigInteger;

public class BigIntegerDemo {
	public static void main(String[] args) {
		BigInteger number1 = new BigInteger("3456787654345678765456789876545678987645678987656");
		BigInteger number2 = new BigInteger("76876578756787756787567875456787657876578765787656");
		
		// ���������������
		BigInteger result1 = number1.add(number2);
		System.out.println(result1);
		
		// �������������
		BigInteger result2 = number1.subtract(number2);
		System.out.println(result2);
		
		// �������������
		BigInteger result3 = number1.multiply(number2);
		System.out.println(result3);
		
		// �������������
		BigInteger result4 = number1.divide(number2);
		System.out.println(result4);
		
		// ������������������õ��̺�����������һ��������
		BigInteger[] result5 = number1.divideAndRemainder(number2);
		System.out.println(result5[0]);
		System.out.println(result5[1]);
		
		System.out.println(result5.length);
		
		// ת��int 
		int result6 = number1.intValue();
		System.out.println(result6);
	}
}
