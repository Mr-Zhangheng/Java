package com.qianfeng.week2.day2.eSingleton;

public class Program {
	public static void main(String[] args) {
		
		User u = User.getUser();
		
		for (int i = 0; i < 10000; i++) {
			boolean ret = u == User.getUser();
			if (ret == false) {
				// 说明产生了一个新的User对象
				System.out.println("产生了一个新的User对象");
			}
		}
		
		System.out.println("end");
	}
	
}
