package com.qianfeng.week5.day2.dThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Program2 {
	public static void main(String[] args) {
		// ʹ��Executors�������ṩ�Ĺ��߷���
		
		// 1. ����һ�����ĳش�СΪ0������߳�����ΪInteger.MAX_VALUE��һ���̳߳�
		ExecutorService executor1 = Executors.newCachedThreadPool();
		// 2. ����һ�����ĳغ�����߳�������ΪnThreads��һ���̳߳�
		ExecutorService executor2 = Executors.newFixedThreadPool(10);
		// 3. ����һ�����ĳغ�����߳�������Ϊ1���̳߳�
		ExecutorService executor3 = Executors.newSingleThreadExecutor();
		
		
		// executor1.execute(command);
		
	}
}
