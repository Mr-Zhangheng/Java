package com.qianfeng.week5.day2.aThread;

public class Program6 {
	public static void main(String[] args) {
		
		for (int i = 0; i < 100; i++) {
			new Thread(() -> User.getUser()).start();;
		}
	}
}

class User {
	private User() {
		System.out.println("���췽��ִ����");
	}
	
	private static User currentUser;
	
	public static synchronized User getUser() {
		if (currentUser == null) 
			currentUser = new User();			
		return currentUser;
	}
}
