package com.qianfeng.week2.day2.eSingleton;

/**
 * �û���
 * @author luds
 */
public class User {
	String username;
	String email;
	int id;
	
	
	/*
	// 1. ���һ����̬�ĵ�ǰ���͵����ԣ�
	private static User instance = new User();
	
	
	// ����ϣ��User���ܹ��ṩһ��������������ȡһ��ȫ��Ψһ��User����
	public static User getUser() {
		return instance;
	}
	*/
	
	
	
	// 1. ���һ����̬�ĵ�ǰ���͵�����
	private static User instance;		// null
	
	public static User getUser() {
		if (instance == null)
			instance = new User();
		
		return instance;
	}
}
