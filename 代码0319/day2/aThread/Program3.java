package com.qianfeng.week5.day2.aThread;

public class Program3 {
	public static void main(String[] args) {
		
		// 实例化四个售票员
		TicketSeller2 s1 = new TicketSeller2("大黄");
		TicketSeller2 s2 = new TicketSeller2("小白");
		TicketSeller2 s3 = new TicketSeller2("佩奇");
		TicketSeller2 s4 = new TicketSeller2("乔治");
		
		s1.start();
		s2.start();
		s3.start();
		s4.start();
	}
}

class TicketSeller2 extends Thread {
	
	private static int rest = 100;
	
	public TicketSeller2(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		while (rest > 0) {
			sellTicket();
		}
	}
	
	private static synchronized void sellTicket() {
		--rest;
		System.out.println("售票员【" + Thread.currentThread().getName() + "】卖出一张票，剩余数量：" + rest + "张");
	}
}















