package com.qianfeng.week3.day1.cAdapter;

public class Program {
	public static void main(String[] args) {
		// 适配器模式：
		// 适配器：电源适配器，220V -> 
		// 适配器，其实是一种中间件。
		
		Computer computer = new Computer();
		Phone phone = new Phone();
		
		
		// 需求： 将手机连接到电脑上
		// computer.usb1 = phone;
		computer.usb1 = new USBAdpter(phone);
		// 显示连接的USB设备信息
		computer.showUSBInfo();
	}
}
