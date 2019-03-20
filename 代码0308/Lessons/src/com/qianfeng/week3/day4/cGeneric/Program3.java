package com.qianfeng.week3.day4.cGeneric;

public class Program3 {
	public static void main(String[] args) {
		// 实例化一个Human对象
		// Human<Animal> h = new Human<>();
		
		Human<Dog> h = new Human<>();
		show(h);
	}
	
	// ? : 表示通配符，此时，作为参数的Human泛型可以是任意类型
	// ? extends Animal: 此时，作为参数的Human，泛型类型可以是Animal类型，或者其子类型
	// ? extends 接口：此时，作为参数的Human，泛型类型可以是接口的实现类类型
	// ? super Dog: 此时，作为参数的Human，泛型类型可以是Dog类型，也可以是Dog类型的父类型
	public static void show(Human<? super Dog> human) {
		
	}
}

interface MyTestInterface {} 

class Animal implements MyTestInterface {}
class Dog extends Animal {}
class Hashiqi extends Dog {}

class Human<T> {
	
}
