package com.qianfeng.week2.day4.cDuotai;

public class Program {
	public static void main(String[] args) {
		/*
		// �����ת�ͣ�
		Dog hashiqi = new Dog();
		// ���������ָ��������Ķ���
		// hashiqi: Dog
		// animal: Animal
		// ����ת��
		// Dog -> Animal
		Animal animal = hashiqi;
		
		// ��������ת���������ǽ�һ�����������ͽ����޸ġ�
		// ��������һ���µı�����Ȼ��ԭ����ֵ������µı�����ֵ
		
		hashiqi.name = "";
		hashiqi.age = 1;
		hashiqi.color = "";
		
		animal.name = "";
		animal.age = 2;
		// animal.color = "";
		
		// ����ת��
		Dog d = (Dog)animal;
		d.color = "";
		*/
		
		// ����ת��
		Animal animal = new Dog();
		// ����ת��
		// ���ת�����������
		if (animal instanceof Cat) {
			Cat cat = (Cat)animal;			
			System.out.println(cat);	
		}
		else {
			System.out.println("˵��animal����һֻè");
		}
		
		if (animal instanceof Dog) { 
			Dog ddd = (Dog)animal;
		}
		else
			System.out.println("˵��animal����һֻ��");
		
		// 
		
	}
}
