package com.qianfeng.week5.day2.cThread.a;

public class Program {
	public static void main(String[] args) {
		// һ�������ߣ�һ��������
		Good good = new Good("");
		
		Thread productor1 = new Thread(new Producter(good), "����ʦ��");
		Thread productor2 = new Thread(new Producter(good), "�Ͽ�ʦ��");
		Thread productor3 = new Thread(new Producter(good), "����ͷ");
		Thread productor4 = new Thread(new Producter(good), "����ͷ");
		
		Thread consumer1 = new Thread(new Comsumer(good), "С��");
		Thread consumer2 = new Thread(new Comsumer(good), "С��");
		Thread consumer3 = new Thread(new Comsumer(good), "С��");
		Thread consumer4 = new Thread(new Comsumer(good), "С��");
		
		
		productor1.start();
		productor2.start();
		productor3.start();
		productor4.start();

		consumer1.start();
		consumer2.start();
		consumer3.start();
		consumer4.start();
		
		
	}
}
