package com.qianfeng.week3.day1.aExercise.exercise1.commonModule;

public class MathUtil {
	//1������һ����̬�ģ���һ���������з���ֵ�ķ�����ʵ����һ�����ľ���ֵ��
	public static int abs(int number) {
		return number < 0 ? -number : number;
	}
	
	public static float abs(float number) {
		return number < 0 ? -number : number;
	}

	//2������һ����̬�ģ���һ���������з���ֵ�ķ�����ʵ����һ������ƽ���� 
	public static int pow(int number) {
		// return number * number;
		return pow(number, 2);
	}
	
	public static float pow(float number) {
		return number * number;
	}
	
	// ����a��b�η�
	public static int pow(int a, int b) {
		int result = 1;
		for (int i = 0; i < b; i++) {
			result *= a;
		}
		return result;
	}
	
	//3������һ����̬�ģ��������������з���ֵ�ķ�����ʵ�����������еĽϴ��ߡ� 
	public static int getMax(int a, int b) {
		return a > b ? a : b;
	}

	//4������һ����̬�ģ���һ���������з���ֵ�ķ�����ʵ�ֶ�һ���������������롣
	// ��һ��С���������뵽����
	public static int getRound(float a) {
		
		int rest = (int)(a * 10) % 10;
		
		if (rest >= 5) {
			return (int)a + 1;
		}
		else {
			return (int)a;
		}
	}
}
