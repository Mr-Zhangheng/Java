package com.qianfeng.week2.day2.eSingleton;

public class Program {
	public static void main(String[] args) {
		
		User u = User.getUser();
		
		for (int i = 0; i < 10000; i++) {
			boolean ret = u == User.getUser();
			if (ret == false) {
				// ˵��������һ���µ�User����
				System.out.println("������һ���µ�User����");
			}
		}
		
		System.out.println("end");
	}
	
}
