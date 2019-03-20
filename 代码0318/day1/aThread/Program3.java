package com.qianfeng.week5.day1.aThread;

public class Program3 {
	public static void main(String[] args) {
		
		Runnable r = () -> {
			for (int i = 0; i < 100; i++) {
				System.out.println(Thread.currentThread().getName() + " : " + i);
			}
		};
		
		Thread t1 = new Thread(r, "�߳�1");
		Thread t2 = new Thread(r, "�߳�2");
		
		
		// �����߳����ȼ���
		// �����߳̿�������CPUʱ��Ƭ�ĸ��ʡ���ע�⣺��������ߵĸ��ʣ������������ȼ��ߵ�һ��������ʱ��Ƭ��
		// �������ȼ���һ��Ҫ�ŵ�start֮ǰ��start֮�������ã���Ч��
		// ��������һ���������֣����ַ�Χ�ǣ�[1, 10], Ĭ�ϵ��߳����ȼ���5
		t1.setPriority(1);
		t2.setPriority(10);
		
		
		
		t1.start();
		t2.start();
				
		
	}
}
