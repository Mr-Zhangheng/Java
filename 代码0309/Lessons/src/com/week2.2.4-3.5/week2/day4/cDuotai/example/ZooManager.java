package com.qianfeng.week2.day4.cDuotai.example;

public class ZooManager {
	
	/**
	 * 登记动物的基本信息
	 */
	public void recordInfo(Animal animal) {
		System.out.println(animal.name);
		System.out.println(animal.age);
		// 判断animal是不是老虎，
		if (animal instanceof Tiger) {
			Tiger t = (Tiger)animal;
			// 如果是老虎，再输出性别
			System.out.println("这是一个小脑斧" + t.gender);
		}
	}
}
