package com.qianfeng.week5.day2.bThread;

public class Program1 {
	public static void main(String[] args) {
		
		
		
		Runnable r0 = () -> {
			synchronized ("a") {
				System.out.println(Thread.currentThread().getName() + "��ȡ�������a, �ȴ������b");
				synchronized ("b") {
					System.out.println(Thread.currentThread().getName() + "ͬʱ��ȡ�������a��b");
				}
			}
		};
		
		Runnable r1 = () -> {
			synchronized ("b") {
				System.out.println(Thread.currentThread().getName() + "��ȡ�������b, �ȴ������a");
				synchronized ("a") {
					System.out.println(Thread.currentThread().getName() + "ͬʱ��ȡ�������a��b");
				}
			}
		};
		
		
		
		// ʵ���������̶߳���
		Thread t0 = new Thread(r0, "t0");
		Thread t1 = new Thread(r1, "t1");
		
		t0.setPriority(1);
		t1.setPriority(10);
		
		// �����߳�
		t0.start();
		t1.start();
	}
}
