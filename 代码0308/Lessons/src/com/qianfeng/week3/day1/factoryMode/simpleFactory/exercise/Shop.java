package com.qianfeng.week3.day1.factoryMode.simpleFactory.exercise;

public class Shop {

	private static Shop instance = new Shop();
	public static Shop getShop() {
		return instance;
	}
	
	public Pet getPet(String type, String name, String color) {
		
		Pet pet = null;
		
		if (type.equals("cat")) {
			pet = new Cat();
		}
		else if (type.equals("dog")) {
			pet = new Dog();
		}
		
		pet.name = name;
		pet.color = color;
		
		return pet;
	}
	
}
