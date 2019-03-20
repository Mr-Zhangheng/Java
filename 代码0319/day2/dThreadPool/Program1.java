package com.qianfeng.week5.day2.dThreadPool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Program1 {
	public static void main(String[] args) {
		// ʵ����һ���̳߳�
		// ��ʱ����̳߳�û���߳�
		ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 100, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(5));
		
		// ���þܾ����ʲ���
		// 
		// ThreadPoolExecutor.AbortPolicy: �����µ����񣬲��׳�RejectedExecutionException
		// ThreadPoolExecutor.DiscardPolicy: �����µ����񣬵��ǲ����׳��쳣
		// ThreadPoolExecutor.DiscardOldestPolicy: �����ȴ���������ǰ����������³���ִ������
		// ThreadPoolExecutor.CallerRunsPolicy: �ɵ����߳�ִ���������
		executor.setRejectedExecutionHandler(new ThreadPoolExecutor.DiscardPolicy());
		
		
		// �����̳߳غ�������
		// executor.setCorePoolSize(10);
		
		// �����̳߳�����߳�����
		// executor.setMaximumPoolSize(20);

		// �����̴߳��ʱ��
		// executor.setKeepAliveTime(100, TimeUnit.MILLISECONDS);
		
		// 
		for (int i = 0; i < 20; i++) {
			// ��һ��������ӵ��̳߳�
			executor.execute(new MyTask());
			System.out.println("��ǰ�̳߳�������������" + executor.getPoolSize());
			System.out.println("��ǰ�̳߳���ɵ�����������" + executor.getCompletedTaskCount());
			System.out.println("��ǰ�̳߳��еȴ������������������" + executor.getQueue().size());
		}

		// �ر��̳߳�
		executor.shutdown();
		
		// �ر��̳߳أ����Խ�������ִ�е��̡߳�
		// executor.shutdownNow();
	}
}

class MyTask implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "��ʼִ����");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "ִ�н�����");
	}
}
