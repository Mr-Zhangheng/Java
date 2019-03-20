package com.qianfeng.week5.day1.aThread;


// 线程礼让 yield
// 指的是让当前的线程，释放CPU时间片。线程进入Runnable就绪状（不是阻塞状态），继续抢夺时间片。
public class Program5 {
	public static void main(String[] args) {
		
		Runnable r = () -> {
			for (int i = 0; i < 100; i++) {
				System.out.println(Thread.currentThread().getName() + " : " + i);
				
				if (i == 20 && Thread.currentThread().getName().equals("t1")) {
					Thread.yield();
				}
			}
		};
		
		Thread t1 = new Thread(r, "t1");
		Thread t2 = new Thread(r, "t2");
		
		t1.start();
		t2.start();
	}
}
