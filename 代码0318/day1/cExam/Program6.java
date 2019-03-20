package com.qianfeng.week5.day1.cExam;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class Program6 {
	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		
		Random r = new Random();
		
		for (int i = 0; i < 5; i++) {
			list.add(r.nextInt(10) + 1);
		}
		
		// list.sort((e1, e2) -> e1 - e2);
		
		Collections.sort(list);
		
		
		
	}
}
