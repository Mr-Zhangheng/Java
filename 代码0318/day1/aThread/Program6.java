package com.qianfeng.week5.day1.aThread;

public class Program6 {
	public static void main(String[] args) {
		// 守护线程：
		// 也是一个线程，又叫做后台线程。
		// 如果前台线程都结束了，则后台线程也会自动销毁（无论这个线程中的逻辑有没有执行完）
		// GC：就是一个守护线程。
		
		// 实例化一个守护线程：
		Thread t = new Thread(() -> {
			for (int i = 0; i < 10000; i++) {
				System.out.println(Thread.currentThread().getName() + " : " + i);
			}
		});
		
		// 将这个线程设为守护线程，这个操作要放到start之前
		t.setDaemon(true);
		
		// 开启这个线程
		t.start();
		
		for (int i = 0; i < 100; i++) {
			System.out.println("main: " + i);
		}
	}
}
