package com.qianfeng.week4.bSet;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Program1 {
	
	public static void main(String[] args) {
		// Set��һ���������ظ�Ԫ�صļ��ϡ�
		// HashSet: 
		Set<Integer> sets = new HashSet<>();
		Collections.addAll(sets, 10, 20, 20, 10, 30, 24, 18, 19, 20, 1000, 1000);
		System.out.println(sets);
	}
}
