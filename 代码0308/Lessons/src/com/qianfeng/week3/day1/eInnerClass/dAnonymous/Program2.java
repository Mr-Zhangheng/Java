package com.qianfeng.week3.day1.eInnerClass.dAnonymous;

public class Program2 {
	public static void main(String[] args) {
		// �ӿڲ���ʵ��������
		// ���ڣ����ǲ���ʵ������һ���ӿڶ���
		// ���ǣ�
		// ��ʵ������һ���ӿڵ�ʵ������󣬲�����һ������ת�͡�
		USB usb = new USB() {
			@Override
			public void charge() {
				System.out.println("���");
			}
		};
	}
}

interface USB {
	void charge();
}