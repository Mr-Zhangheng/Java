package com.qianfeng.week5.day1.bThread;

public class Program1 {
	public static void main(String[] args) {
		
		// 需求： 某景点售票窗口，有4个售票员在同时卖票。100张票
		
		// 1. 有一个Runnable接口实现类，让每一个售票员去处理这里的任务。
		Runnable r = () -> {
			while (TicketCenter.rest > 0) {
				System.out.println("售票员【" + Thread.currentThread().getName() + "】卖出一张票，剩余" + --TicketCenter.rest + "张");
			}
			
		};
		
		// 2. 实例化四个售票员
		Thread t1 = new Thread(r, "老王");
		Thread t2 = new Thread(r, "老李");
		Thread t3 = new Thread(r, "奔波霸");
		Thread t4 = new Thread(r, "霸波奔");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		/*
		Seller s1 = new Seller("张学友");
		Seller s2 = new Seller("刘德华");
		Seller s3 = new Seller("黎明");
		Seller s4 = new Seller("郭富城");
		
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
			System.out.println("售票员【" + Thread.currentThread().getName() + "】卖出一张票，剩余" + --TicketCenter.rest + "张");
		}
	}
}

class TicketCenter {
	// 剩余的票的数量
	public static int rest = 100;
}
