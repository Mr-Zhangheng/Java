package com.qianfeng.week3.day1.cAdapter;

public class Program {
	public static void main(String[] args) {
		// ������ģʽ��
		// ����������Դ��������220V -> 
		// ����������ʵ��һ���м����
		
		Computer computer = new Computer();
		Phone phone = new Phone();
		
		
		// ���� ���ֻ����ӵ�������
		// computer.usb1 = phone;
		computer.usb1 = new USBAdpter(phone);
		// ��ʾ���ӵ�USB�豸��Ϣ
		computer.showUSBInfo();
	}
}
