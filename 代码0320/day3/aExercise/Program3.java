package com.qianfeng.week5.day3.aExercise;

public class Program3 {
	
	public static int number = 10;
	
	public static void main(String[] args) {
		
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				while (true) {
					synchronized ("") {
						number++;
						System.out.println(Thread.currentThread().getName() + "对数字number进行了+1, 结果是:" + number);
					}	
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		
		Runnable r2 = new Runnable() {
			@Override
			public void run() {
				while (true) {
					synchronized ("") {
						number--;
						System.out.println(Thread.currentThread().getName() + "对数字number进行了-1, 结果是:" + number);
					}
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		
		
		new Thread(r1, "加线程").start();
		new Thread(r2, "减线程").start();
		
	}
}
