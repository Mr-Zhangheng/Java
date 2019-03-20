package com.qianfeng.week2.day4.cDuotai;

public class Program {
	public static void main(String[] args) {
		/*
		// 对象的转型：
		Dog hashiqi = new Dog();
		// 父类的引用指向了子类的对象
		// hashiqi: Dog
		// animal: Animal
		// 向上转型
		// Dog -> Animal
		Animal animal = hashiqi;
		
		// 数据类型转化：并不是将一个变量的类型进行修改。
		// 而是声明一个新的变量，然后将原来的值给这个新的变量赋值
		
		hashiqi.name = "";
		hashiqi.age = 1;
		hashiqi.color = "";
		
		animal.name = "";
		animal.age = 2;
		// animal.color = "";
		
		// 向下转型
		Dog d = (Dog)animal;
		d.color = "";
		*/
		
		// 向上转型
		Animal animal = new Dog();
		// 向下转型
		// 这个转型是有问题的
		if (animal instanceof Cat) {
			Cat cat = (Cat)animal;			
			System.out.println(cat);	
		}
		else {
			System.out.println("说明animal不是一只猫");
		}
		
		if (animal instanceof Dog) { 
			Dog ddd = (Dog)animal;
		}
		else
			System.out.println("说明animal不是一只狗");
		
		// 
		
	}
}
