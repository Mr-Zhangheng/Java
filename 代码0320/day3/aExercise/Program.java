package com.qianfeng.week5.day3.aExercise;

import java.util.Random;

public class Program {
	public static void main(String[] args) {
		// 1. 十个人过独木桥.
		// 张三开始过独木桥... 张三通过独木桥了。耗时10秒
		
		Runnable r = new Runnable() {
			@Override
			public void run() {
				goBridge();
			}
			
			/**
			 * 过桥
			 */
			private synchronized void goBridge() {
				// 人过过独木桥
				System.out.print(Thread.currentThread().getName() + "开始走独木桥了...");
				
				// 线程休眠：模拟过独木桥的时间
				Random random = new Random();
				long delta = random.nextInt(2000) + 1000;
				
				try {
					Thread.sleep(delta);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println(Thread.currentThread().getName() + "通过独木桥了，耗时" + Math.round((double)delta / 1000) + "秒");
			}
		};
		
		
		String[] names = {"张三", "赵四", "二狗子", "狗蛋", "虎子", "嘎子", "张麻子", "瓜娃子", "龟孙", "三蹦子"};
		
		for (int i = 0; i < names.length; i++) {
			// 实例化一个线程
			Thread t = new Thread(r, names[i]);
			
			t.start();
		}
		
		
	}
}
