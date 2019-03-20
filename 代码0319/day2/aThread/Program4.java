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
				
				System.out.println("售票员【" + Thread.currentThread().getName() + "】卖出一张票，剩余数量：" + --TicketCenter.rest + "张");
			}
		};
		
		Thread t0 = new Thread(r, "小黑");
		Thread t1 = new Thread(r, "皇受");
		Thread t2 = new Thread(r, "小新");
		Thread t3 = new Thread(r, "小白");
		
		t0.start();
		t1.start();
		t2.start();
		t3.start();
	}
}

class TicketCenter {
	public static int rest = 100;
}
