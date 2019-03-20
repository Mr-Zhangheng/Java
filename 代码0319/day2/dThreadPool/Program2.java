package com.qianfeng.week5.day2.dThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Program2 {
	public static void main(String[] args) {
		// 使用Executors工具类提供的工具方法
		
		// 1. 开辟一个核心池大小为0，最大线程数量为Integer.MAX_VALUE的一个线程池
		ExecutorService executor1 = Executors.newCachedThreadPool();
		// 2. 开辟一个核心池和最大线程数量都为nThreads的一个线程池
		ExecutorService executor2 = Executors.newFixedThreadPool(10);
		// 3. 开辟一个核心池和最大线程数量都为1的线程池
		ExecutorService executor3 = Executors.newSingleThreadExecutor();
		
		
		// executor1.execute(command);
		
	}
}
