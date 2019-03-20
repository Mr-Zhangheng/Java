package com.qianfeng.week2.day2.eSingleton;

/**
 * 用户类
 * @author luds
 */
public class User {
	String username;
	String email;
	int id;
	
	
	/*
	// 1. 设计一个静态的当前类型的属性，
	private static User instance = new User();
	
	
	// 需求：希望User类能够提供一个方法，用来获取一个全局唯一的User对象
	public static User getUser() {
		return instance;
	}
	*/
	
	
	
	// 1. 设计一个静态的当前类型的属性
	private static User instance;		// null
	
	public static User getUser() {
		if (instance == null)
			instance = new User();
		
		return instance;
	}
}
