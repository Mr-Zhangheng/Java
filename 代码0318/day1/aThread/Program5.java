package com.qianfeng.week5.day1.aThread;


// �߳����� yield
// ָ�����õ�ǰ���̣߳��ͷ�CPUʱ��Ƭ���߳̽���Runnable����״����������״̬������������ʱ��Ƭ��
public class Program5 {
	public static void main(String[] args) {
		
		Runnable r = () -> {
			for (int i = 0; i < 100; i++) {
				System.out.println(Thread.currentThread().getName() + " : " + i);
				
				if (i == 20 && Thread.currentThread().getName().equals("t1")) {
					Thread.yield();
				}
			}
		};
		
		Thread t1 = new Thread(r, "t1");
		Thread t2 = new Thread(r, "t2");
		
		t1.start();
		t2.start();
	}
}
