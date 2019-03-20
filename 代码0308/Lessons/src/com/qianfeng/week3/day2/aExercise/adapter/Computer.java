package com.qianfeng.week3.day2.aExercise.adapter;

public class Computer {
	USB usb1;
	
	/**
	 * 显示USB1口连接的设备信息
	 */
	void show() {
		// 获取usb1设备的信息
		String info = usb1.getInfo();
		
		System.out.println(info);
	}
}
