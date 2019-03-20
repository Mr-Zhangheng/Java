package com.qianfeng.week2.day4.bObject;

public class Program {
	public static void main(String[] args) {
		
		equalsDemo();
	}
	
	public static void equalsDemo() {
		// 实例化两个Person对象
		Person xiaoming = new Person("xiaoming", 10, '男');
		Person laowang = new Person("xiaoming", 10, '男');
		Person xiaoli = new Person("xiaoming", 10, '男');
		
		// == 比较的是地址，所以此时 xiaoming 和 laowang 是具有不同地址，所以比较结果是 false
		System.out.println(xiaoming == laowang);
		
		
		// 需求：如果有两个对象，他们的姓名、年龄、性别分贝都是相同的，此时我们就认为这两个对象是同一个独享
		System.out.println(xiaoming.equals(laowang));
		System.out.println(laowang.equals(xiaoming));
		
		System.out.println(xiaoming.equals(xiaoli));
		System.out.println(laowang.equals(xiaoli));
			
	}
	
	
	public static void toStringDemo() {
		// 1. 实例化一个Person对象
				// Person xiaoming = new Person("xiaoming", 10, '男');
				
				// System.out.println(xiaoming);	// 能不能看到xiaoming对象的每一个属性的值
				// 需求：
				// 希望在输出一个对象的时候，可以看到这个对象的每一个属性的值
				// 解决：
				// 重写toString()方法
				// System.out.println(xiaoming);
				// String str = "ABC: " + xiaoming;
				// System.out.println(str);
				
				/*
				Dog d = new Dog();
				d.name = "哈士奇";
				d.age = 1;
				d.color = "黑白";
				
				xiaoming.dog = d;
				
				System.out.println(xiaoming);
				
				
				System.out.println(xiaoming.getClass());
				System.out.println(d.getClass());
				*/
				
	}
}
