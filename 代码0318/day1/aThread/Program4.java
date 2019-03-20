package com.qianfeng.week5.day1.aThread;

// 线程合并
public class Program4 {
	public static void main(String[] args) {
		// 值得是将一个线程并入另外一个线程。
		// 合并进来的线程优先执行。被合并的线程，会释放时间片，等待合并进来的线程执行结束之后，再去抢夺时间片。
		// A：1-100   50： B: 90-100
		
		// 举例： 
		// 某一个景点售票窗口，有一个售票员在售票，一共有100张票，当卖出50张的时候，来了一个VIP团体，要团购20张票。这个售票员要优先处理VIP的任务。
		
		
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 20; i++) {
				System.out.println("卖出一张VIP票，剩余" + --TicketCenter.count + "张");
			}
		},"VIP团体") ;
		
		Thread t0 = new Thread(() -> {
			while (TicketCenter.count > 0) {
				System.out.println("卖出一张票，剩余" + --TicketCenter.count + "张");
				
				if (TicketCenter.count == 50) {
					// VIP团体合并进来
					try {
						// 开启要插入进来的线程
						t1.start();
						// 合并
						t1.join();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}, "散客窗口");
		
		// 开启t0线程
		t0.start();
		
	}
}

class TicketCenter {
	public static int count = 100;
}
