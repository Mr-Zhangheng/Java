package com.qianfeng.week3.day1.factoryMode.simpleFactory;

/**
 * 手机工厂类, 上帝类
 * @author luds
 */
public class PhoneFactory {

	/*
	public static Phone getPhone(String type, String name, String color) {
		
		Phone phone = null;
		
		if (type == "Huawei") {
			phone = new Huawei();
		}
		else if (type == "Xiaomi") {
			phone = new Xiaomi();
		}
		else if (type == "iPhone") {
			phone = new IPhone();
		}
		else if (type == "OPPO") {
			phone = new OPPO();
		}
		
		phone.name = name;
		phone.color = color;
		
		return phone;
	}
	*/
	
	
	
	public static Huawei getHuawei(String name, String color) {
		Huawei huawei = new Huawei();
		huawei.name = name;
		huawei.color = color;
		return huawei ;
	}
}
