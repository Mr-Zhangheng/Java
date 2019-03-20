package com.qianfeng.week5.day2.cThread.a;

public class Producter implements Runnable {
	
	private Good good;
	public Producter(Good good) {
		this.good = good;
	}
	@Override
	public void run() {
		while (true) {
			synchronized ("") {
				if (Constants.shouldProduct) {
					// ģ��һ�������Ĺ���
					this.good.name = "�����"; 
					
					System.out.println("�����ߡ�" + Thread.currentThread().getName() + "��������һ����Ʒ��" + this.good.name + "��");
					
					// �޸��������
					Constants.shouldProduct = false;
					
					// ֪ͨ����������
					"".notifyAll();
				}
				else {
					try {
						"".wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}
