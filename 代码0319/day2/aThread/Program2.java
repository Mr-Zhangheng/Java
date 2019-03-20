package com.qianfeng.week5.day2.aThread;

public class Program2 {
	public static void main(String[] args) {
		
		// ʵ�����ĸ���ƱԱ
		TicketSeller s1 = new TicketSeller("���");
		TicketSeller s2 = new TicketSeller("С��");
		TicketSeller s3 = new TicketSeller("����");
		TicketSeller s4 = new TicketSeller("����");
		
		s1.start();
		s2.start();
		s3.start();
		s4.start();
	}
}

class TicketSeller extends Thread {
	
	private static int rest = 100;
	
	public TicketSeller(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		while (rest > 0) {
			synchronized (TicketSeller.class) {
				
				if (rest <= 0)
					break;
				
				--rest;
				System.out.println("��ƱԱ��" + this.getName() + "������һ��Ʊ��ʣ��������" + rest + "��");
			}
		}
	}
}