package com.qianfeng.week5.day1.aThread;

// �̺߳ϲ�
public class Program4 {
	public static void main(String[] args) {
		// ֵ���ǽ�һ���̲߳�������һ���̡߳�
		// �ϲ��������߳�����ִ�С����ϲ����̣߳����ͷ�ʱ��Ƭ���ȴ��ϲ��������߳�ִ�н���֮����ȥ����ʱ��Ƭ��
		// A��1-100   50�� B: 90-100
		
		// ������ 
		// ĳһ��������Ʊ���ڣ���һ����ƱԱ����Ʊ��һ����100��Ʊ��������50�ŵ�ʱ������һ��VIP���壬Ҫ�Ź�20��Ʊ�������ƱԱҪ���ȴ���VIP������
		
		
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 20; i++) {
				System.out.println("����һ��VIPƱ��ʣ��" + --TicketCenter.count + "��");
			}
		},"VIP����") ;
		
		Thread t0 = new Thread(() -> {
			while (TicketCenter.count > 0) {
				System.out.println("����һ��Ʊ��ʣ��" + --TicketCenter.count + "��");
				
				if (TicketCenter.count == 50) {
					// VIP����ϲ�����
					try {
						// ����Ҫ����������߳�
						t1.start();
						// �ϲ�
						t1.join();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}, "ɢ�ʹ���");
		
		// ����t0�߳�
		t0.start();
		
	}
}

class TicketCenter {
	public static int count = 100;
}
