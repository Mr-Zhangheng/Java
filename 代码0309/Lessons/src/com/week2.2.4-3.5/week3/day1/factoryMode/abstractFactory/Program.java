package com.qianfeng.week3.day1.factoryMode.abstractFactory;

public class Program {
	// ��֪���е��������Ի��ֳɣ�SUV��Jiaoche��MPV��Paoche
	// BMW��Audi��BYD
	public static void main(String[] args) {
		// ��һ̨��ɫ�ı���SUV
		SUV suv = new BMWFactory().createSUV("��ɫ");
	}
}
