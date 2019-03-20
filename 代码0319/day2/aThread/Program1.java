package com.qianfeng.week5.day2.aThread;

public class Program1 {
	public static void main(String[] args) {
		
		// 实例化四个售票员
		Seller s1 = new Seller("大黄");
		Seller s2 = new Seller("小白");
		Seller s3 = new Seller("佩奇");
		Seller s4 = new Seller("乔治");
		
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
			System.out.println("售票员【" + this.getName() + "】卖出一张票，剩余数量：" + --rest + "张");
		}
	}
}
