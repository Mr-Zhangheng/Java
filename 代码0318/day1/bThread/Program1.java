package com.qianfeng.week5.day1.bThread;

public class Program1 {
	public static void main(String[] args) {
		
		// ���� ĳ������Ʊ���ڣ���4����ƱԱ��ͬʱ��Ʊ��100��Ʊ
		
		// 1. ��һ��Runnable�ӿ�ʵ���࣬��ÿһ����ƱԱȥ�������������
		Runnable r = () -> {
			while (TicketCenter.rest > 0) {
				System.out.println("��ƱԱ��" + Thread.currentThread().getName() + "������һ��Ʊ��ʣ��" + --TicketCenter.rest + "��");
			}
			
		};
		
		// 2. ʵ�����ĸ���ƱԱ
		Thread t1 = new Thread(r, "����");
		Thread t2 = new Thread(r, "����");
		Thread t3 = new Thread(r, "������");
		Thread t4 = new Thread(r, "�Բ���");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		/*
		Seller s1 = new Seller("��ѧ��");
		Seller s2 = new Seller("���»�");
		Seller s3 = new Seller("����");
		Seller s4 = new Seller("������");
		
		s1.start();
		s2.start();
		s3.start();
		s4.start();*/
	}
}

class Seller extends Thread {
	
	public Seller(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		while (TicketCenter.rest > 0) {
			System.out.println("��ƱԱ��" + Thread.currentThread().getName() + "������һ��Ʊ��ʣ��" + --TicketCenter.rest + "��");
		}
	}
}

class TicketCenter {
	// ʣ���Ʊ������
	public static int rest = 100;
}
