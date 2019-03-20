package com.qianfeng.week5.day2.dThreadPool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Program1 {
	public static void main(String[] args) {
		// 实例化一个线程池
		// 此时这个线程池没有线程
		ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 100, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(5));
		
		// 设置拒绝访问策略
		// 
		// ThreadPoolExecutor.AbortPolicy: 丢弃新的任务，并抛出RejectedExecutionException
		// ThreadPoolExecutor.DiscardPolicy: 丢新新的任务，但是不会抛出异常
		// ThreadPoolExecutor.DiscardOldestPolicy: 丢弃等待队列中最前面的任务，重新尝试执行任务
		// ThreadPoolExecutor.CallerRunsPolicy: 由调用线程执行这个任务
		executor.setRejectedExecutionHandler(new ThreadPoolExecutor.DiscardPolicy());
		
		
		// 设置线程池核心数量
		// executor.setCorePoolSize(10);
		
		// 设置线程池最大线程数量
		// executor.setMaximumPoolSize(20);

		// 设置线程存活时间
		// executor.setKeepAliveTime(100, TimeUnit.MILLISECONDS);
		
		// 
		for (int i = 0; i < 20; i++) {
			// 将一个任务添加到线程池
			executor.execute(new MyTask());
			System.out.println("当前线程池中任务数量：" + executor.getPoolSize());
			System.out.println("当前线程池完成的任务数量：" + executor.getCompletedTaskCount());
			System.out.println("当前线程池中等待队列中任务的数量：" + executor.getQueue().size());
		}

		// 关闭线程池
		executor.shutdown();
		
		// 关闭线程池，尝试结束正在执行的线程。
		// executor.shutdownNow();
	}
}

class MyTask implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "开始执行了");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "执行结束了");
	}
}
