package com.qianfeng.week3.day4.cGeneric;

public class Person<E> {
	// 现在，在这个类中就又有了一个类型，类型名称是E
	
	public E element;
	
	public void show(E e) {
		
	}
}

/**
 * 在这个类中定义了一个泛型E，并且用这个泛型，给父类中定义的泛型进行赋类型
 */
class Woman<T> extends Person<T> {
	
}

class Man extends Person<String> {
	
}
