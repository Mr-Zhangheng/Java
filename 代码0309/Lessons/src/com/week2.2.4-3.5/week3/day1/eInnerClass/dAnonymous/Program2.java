package com.qianfeng.week3.day1.eInnerClass.dAnonymous;

public class Program2 {
	public static void main(String[] args) {
		// 接口不能实例化对象
		// 现在，我是不是实例化了一个接口对象？
		// 不是！
		// 是实例化了一个接口的实现类对象，并做了一个向上转型。
		USB usb = new USB() {
			@Override
			public void charge() {
				System.out.println("充电");
			}
		};
	}
}

interface USB {
	void charge();
}