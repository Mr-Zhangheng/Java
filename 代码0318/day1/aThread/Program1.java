package com.qianfeng.week5.day1.aThread;

public class Program1 {
	public static void main(String[] args) {
		// ʵ����һ��MyThread����
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
		
		
		// ��������̣߳�ʹ�÷���start();
		thread.start();
		// thread.run();
		
		System.out.println("end");
		
	}
}



/**
 * Runnable�ӿڵ�ʵ����
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
 * �̳���Thread�࣬д��һ��Thread������
 * @author luds
 */
class MyThread extends Thread {
	@Override
	public void run() {
		// ����Ĵ��룬��������߳���Ҫִ�е�����
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
	}
}