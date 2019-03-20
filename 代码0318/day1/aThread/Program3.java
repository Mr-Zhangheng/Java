package com.qianfeng.week5.day1.aThread;

public class Program3 {
	public static void main(String[] args) {
		
		Runnable r = () -> {
			for (int i = 0; i < 100; i++) {
				System.out.println(Thread.currentThread().getName() + " : " + i);
			}
		};
		
		Thread t1 = new Thread(r, "线程1");
		Thread t2 = new Thread(r, "线程2");
		
		
		// 设置线程优先级：
		// 设置线程可以抢到CPU时间片的概率。（注意：仅仅是提高的概率，并不代表优先级高的一定会抢到时间片）
		// 设置优先级，一定要放到start之前。start之后再设置，无效。
		// 参数：是一个整型数字，数字范围是：[1, 10], 默认的线程优先级是5
		t1.setPriority(1);
		t2.setPriority(10);
		
		
		
		t1.start();
		t2.start();
				
		
	}
}
