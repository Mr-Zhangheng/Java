package com.qianfeng.week2.day5.aExercise.exercise1;

public class Program {
	public static void main(String[] args) {
		// ʵ����һ�����ԣ�ʵ�������������豸
		Computer c = new Computer();
		
		Mouse m = new Mouse();
		Keyboard k = new Keyboard();
		Disk d = new Disk();
		
		
		// ��ĳһ�������豸���ӵ�����
		c.usb1 = m;
		c.usb2 = k;
		c.usb3 = d;
		
		System.out.println(c.usb1.getInfo());
		System.out.println(c.usb2.getInfo());
		System.out.println(c.usb3.getInfo());
		
	}
}
