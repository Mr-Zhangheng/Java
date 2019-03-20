package com.qianfeng.week3.day2.aExercise.simple;

public class Factory {
	public static Shoes getShoes(String type, String color) {
		// ����һ��Ь�Ķ���
		Shoes s = null;
		
		if (type.equals("nike")) {
			s = new NikeShoes();
		}
		else if (type.equals("adidas")) {
			s = new AdidasShoes();
		}
		
		s.color = color;
		
		return s;
	}
}
