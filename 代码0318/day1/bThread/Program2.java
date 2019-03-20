package com.qianfeng.week5.day1.bThread;

public class Program2 {
	// 单例
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++)
			new Thread(() -> User.getUser()).start();
	}
}


class User {
	private static User currentUser;
	public static User getUser() {
		if (currentUser == null) 
			currentUser = new User();
		
		return currentUser;
	}
	
	private User() {
		System.out.println("一个User对象被实例化了");
	}
}
