package com.qianfeng.week5.day3.aExercise;

import java.util.Random;

public class Program {
	public static void main(String[] args) {
		// 1. ʮ���˹���ľ��.
		// ������ʼ����ľ��... ����ͨ����ľ���ˡ���ʱ10��
		
		Runnable r = new Runnable() {
			@Override
			public void run() {
				goBridge();
			}
			
			/**
			 * ����
			 */
			private synchronized void goBridge() {
				// �˹�����ľ��
				System.out.print(Thread.currentThread().getName() + "��ʼ�߶�ľ����...");
				
				// �߳����ߣ�ģ�����ľ�ŵ�ʱ��
				Random random = new Random();
				long delta = random.nextInt(2000) + 1000;
				
				try {
					Thread.sleep(delta);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println(Thread.currentThread().getName() + "ͨ����ľ���ˣ���ʱ" + Math.round((double)delta / 1000) + "��");
			}
		};
		
		
		String[] names = {"����", "����", "������", "����", "����", "����", "������", "������", "����", "������"};
		
		for (int i = 0; i < names.length; i++) {
			// ʵ����һ���߳�
			Thread t = new Thread(r, names[i]);
			
			t.start();
		}
		
		
	}
}
