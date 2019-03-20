package com.qianfeng.week3.day2.aExercise.adapter;

public class Program {
	public static void main(String[] args) {
		// 实例化一个PS接口的鼠标
		Mouse mouse = new Mouse();
		
		// 实例化一个电脑
		Computer computer = new Computer();
		
		// 将鼠标连接到电脑
		// 因为电脑需要的是一个USB设备，而此时这个鼠标并不是USB设备，所以不能直接连接
		// computer.usb1 = mouse;
		// 可以在中间添加一个中间件（适配器）
		Adapter adapter = new Adapter(mouse);
		// 将这个中间件连接到电脑上
		computer.usb1 = adapter;
		
		
		// 输出usb1端口连接的设备信息
		computer.show();
	}
}	
