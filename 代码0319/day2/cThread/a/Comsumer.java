package com.qianfeng.week5.day2.cThread.a;

/**
 * �����ߣ��������Ѳ�Ʒ
 * 1. ��ʼ���ѵ�ʱ�����ж��Ƿ��в�Ʒ��������
 * 2. ����в�Ʒ����ȥ���������Ʒ
 * 3. ���û�в�Ʒ����֪ͨ������ȥ����
 * @author luds
 */
public class Comsumer implements Runnable {
	
	/**
	 * ������ʾ�����������Ҫ���ѵĲ�Ʒ
	 */
	private Good good;
	
	public Comsumer(Good good) {
		this.good = good;
	}
	
	@Override
	public void run() {
		while (true) {
			synchronized ("") {
				// 1. �ж��Ƿ��������
				if (Constants.shouldProduct == false) {
					// ģ�����ѣ�������ѵ�����
					System.out.println("�����ߡ�" + Thread.currentThread().getName() + "��������һ����Ʒ��" + this.good.name + "��");
					// ����������޸�һ��
					Constants.shouldProduct = true;
					// ֪ͨ����������
					"".notifyAll();
				}
				else {
					// ˵����Ҫ����
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
