package com.qianfeng.week3.day1.factoryMode.simpleFactory;

public class Program {
	public static void main(String[] args) {
		// 小明到手机店买手机
		
		// 使用工厂类中提供的方法，获取指定的手机
		// Phone phone = PhoneFactory.getPhone("Huawei", "P20 Pro", "黑色");
		// Phone phone2 = PhoneFactory.getPhone("Xiaomi", "9", "透明");
		
	    Huawei huawei = PhoneFactory.getHuawei("Huawei", "红色");
		
		// 开闭原则：
		// 对扩展开放，对修改关闭。
		
	}
}
