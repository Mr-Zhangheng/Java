package com.qianfeng.week5.day1.aThread;

public class Program2 {
	public static void main(String[] args) {
		
		// Runnable�ӿڵ�ʵ�������
		Runnable r = () -> {
			for (int i = 0; i < 10; i++) {
				// ��ȡ��ǰ�̡߳�
				Thread t = Thread.currentThread();
				System.out.println(t.getName() + ": " + i);

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		
		Thread t1 = new Thread(r);
		t1.setName("�߳�1");
		Thread t2 = new Thread(r, "�߳�2");		
		t1.start();
		t2.start();
		
		
		
	}
}
