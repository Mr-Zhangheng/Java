package com.qianfeng.week5.day2.aThread;

public class Program2 {
	public static void main(String[] args) {
		
		// 实例化四个售票员
		TicketSeller s1 = new TicketSeller("大黄");
		TicketSeller s2 = new TicketSeller("小白");
		TicketSeller s3 = new TicketSeller("佩奇");
		TicketSeller s4 = new TicketSeller("乔治");
		
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
				System.out.println("售票员【" + this.getName() + "】卖出一张票，剩余数量：" + rest + "张");
			}
		}
	}
}