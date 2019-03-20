package com.qianfeng.week5.day2.cThread.a;

public class Program {
	public static void main(String[] args) {
		// 一个生产者，一个消费者
		Good good = new Good("");
		
		Thread productor1 = new Thread(new Producter(good), "老王师傅");
		Thread productor2 = new Thread(new Producter(good), "老康师傅");
		Thread productor3 = new Thread(new Producter(good), "老李头");
		Thread productor4 = new Thread(new Producter(good), "老孙头");
		
		Thread consumer1 = new Thread(new Comsumer(good), "小王");
		Thread consumer2 = new Thread(new Comsumer(good), "小李");
		Thread consumer3 = new Thread(new Comsumer(good), "小明");
		Thread consumer4 = new Thread(new Comsumer(good), "小孙");
		
		
		productor1.start();
		productor2.start();
		productor3.start();
		productor4.start();

		consumer1.start();
		consumer2.start();
		consumer3.start();
		consumer4.start();
		
		
	}
}
