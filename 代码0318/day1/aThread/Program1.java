package com.qianfeng.week5.day1.aThread;

public class Program1 {
	public static void main(String[] args) {
		// 实例化一个MyThread对象
		// MyThread thread = new MyThread();
		// Thread thread = new Thread(new MyRunnable());
		/*
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				
			}
		});*/
		Thread thread = new Thread(() -> {
			
		});
		
		
		// 开启这个线程：使用方法start();
		thread.start();
		// thread.run();
		
		System.out.println("end");
		
	}
}



/**
 * Runnable接口的实现类
 * @author luds
 *
 */
class MyRunnable implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
	}
}



/**
 * 继承自Thread类，写了一个Thread的子类
 * @author luds
 */
class MyThread extends Thread {
	@Override
	public void run() {
		// 这里的代码，就是这个线程需要执行的任务。
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
	}
}