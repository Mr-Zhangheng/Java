package com.qianfeng.week5.day1.aThread;

public class Program6 {
	public static void main(String[] args) {
		// �ػ��̣߳�
		// Ҳ��һ���̣߳��ֽ�����̨�̡߳�
		// ���ǰ̨�̶߳������ˣ����̨�߳�Ҳ���Զ����٣���������߳��е��߼���û��ִ���꣩
		// GC������һ���ػ��̡߳�
		
		// ʵ����һ���ػ��̣߳�
		Thread t = new Thread(() -> {
			for (int i = 0; i < 10000; i++) {
				System.out.println(Thread.currentThread().getName() + " : " + i);
			}
		});
		
		// ������߳���Ϊ�ػ��̣߳��������Ҫ�ŵ�start֮ǰ
		t.setDaemon(true);
		
		// ��������߳�
		t.start();
		
		for (int i = 0; i < 100; i++) {
			System.out.println("main: " + i);
		}
	}
}
