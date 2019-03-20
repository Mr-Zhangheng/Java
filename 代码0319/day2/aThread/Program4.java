package com.qianfeng.week5.day2.aThread;

public class Program4 {
	
	public static void main(String[] args) {
		
		Runnable r = new Runnable() {
			@Override
			public void run() {
				while (TicketCenter.rest > 0)
					sellTicket();
			}
			private synchronized void sellTicket() {
				
				if (TicketCenter.rest <= 0)
					return;
				
				System.out.println("��ƱԱ��" + Thread.currentThread().getName() + "������һ��Ʊ��ʣ��������" + --TicketCenter.rest + "��");
			}
		};
		
		Thread t0 = new Thread(r, "С��");
		Thread t1 = new Thread(r, "����");
		Thread t2 = new Thread(r, "С��");
		Thread t3 = new Thread(r, "С��");
		
		t0.start();
		t1.start();
		t2.start();
		t3.start();
	}
}

class TicketCenter {
	public static int rest = 100;
}
