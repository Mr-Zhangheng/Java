package com.qianfeng.week3.day4.cGeneric;

public class Program3 {
	public static void main(String[] args) {
		// ʵ����һ��Human����
		// Human<Animal> h = new Human<>();
		
		Human<Dog> h = new Human<>();
		show(h);
	}
	
	// ? : ��ʾͨ�������ʱ����Ϊ������Human���Ϳ�������������
	// ? extends Animal: ��ʱ����Ϊ������Human���������Ϳ�����Animal���ͣ�������������
	// ? extends �ӿڣ���ʱ����Ϊ������Human���������Ϳ����ǽӿڵ�ʵ��������
	// ? super Dog: ��ʱ����Ϊ������Human���������Ϳ�����Dog���ͣ�Ҳ������Dog���͵ĸ�����
	public static void show(Human<? super Dog> human) {
		
	}
}

interface MyTestInterface {} 

class Animal implements MyTestInterface {}
class Dog extends Animal {}
class Hashiqi extends Dog {}

class Human<T> {
	
}
