package com.qianfeng.week2.day2.bThis;

public class Program {
	
	public static void main(String[] args) {	
		Person xiaoming = new Person();
		xiaoming.setInfo("xiaoming", 19, 'n');
		
		Person xiaobai = new Person();
		xiaobai.name = "xiaobai";
		
		xiaoming.eat();	// xiaoming�ڳԷ�
		xiaobai.eat();	// xiaobai�ڳԷ�
	}
}
