package com.qianfeng.week3.day2.aExercise.adapter;

public class Program {
	public static void main(String[] args) {
		// ʵ����һ��PS�ӿڵ����
		Mouse mouse = new Mouse();
		
		// ʵ����һ������
		Computer computer = new Computer();
		
		// ��������ӵ�����
		// ��Ϊ������Ҫ����һ��USB�豸������ʱ�����겢����USB�豸�����Բ���ֱ������
		// computer.usb1 = mouse;
		// �������м����һ���м������������
		Adapter adapter = new Adapter(mouse);
		// ������м�����ӵ�������
		computer.usb1 = adapter;
		
		
		// ���usb1�˿����ӵ��豸��Ϣ
		computer.show();
	}
}	
