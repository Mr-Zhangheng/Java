package com.qianfeng.week5.day2.aThread;

import java.util.concurrent.locks.ReentrantLock;

public class Program5 {
	public static void main(String[] args) {
		
		// 实例化四个售票员
		TicketSeller3 s1 = new TicketSeller3("大黄");
		TicketSeller3 s2 = new TicketSeller3("小白");
		TicketSeller3 s3 = new TicketSeller3("佩奇");
		TicketSeller3 s4 = new TicketSeller3("乔治");
		
		s1.start();
		s2.start();
		s3.start();
		s4.start();
	}
}

class TicketSeller3 extends Thread {
	
	
	static ReentrantLock lock = new ReentrantLock();
	
	private static int rest = 100;
	
	public TicketSeller3(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		while (rest > 0) {
			// 上锁
			lock.lock();
			
			if (rest <= 0)
				break;
			
			--rest;
			System.out.println("售票员【" + this.getName() + "】卖出一张票，剩余数量：" + rest + "张");
			
			// 解锁
			lock.unlock();
			
		}
	}
}