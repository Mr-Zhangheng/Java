package com.qianfeng.week5.day2.aThread;

public class Program1 {
	public static void main(String[] args) {
		
		// ʵ�����ĸ���ƱԱ
		Seller s1 = new Seller("���");
		Seller s2 = new Seller("С��");
		Seller s3 = new Seller("����");
		Seller s4 = new Seller("����");
		
		s1.start();
		s2.start();
		s3.start();
		s4.start();
	}
}

class Seller extends Thread {
	
	private static int rest = 100;
	
	public Seller(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		while (rest > 0) {
			System.out.println("��ƱԱ��" + this.getName() + "������һ��Ʊ��ʣ��������" + --rest + "��");
		}
	}
}
