package com.qianfeng.week3.day2.aExercise.adapter;

public class Computer {
	USB usb1;
	
	/**
	 * ��ʾUSB1�����ӵ��豸��Ϣ
	 */
	void show() {
		// ��ȡusb1�豸����Ϣ
		String info = usb1.getInfo();
		
		System.out.println(info);
	}
}
