package com.qianfeng.week2.day4.eInterface.interfaceDemo2;

public class Person {
	
	/**
	 * 发空运 顺丰  EMS
	 */
	public void sendPackageByAir(SendPackageByAir air) {
		air.sendByAir();
	}
	
	/**
	 * 发陆运
	 */
	public void sendPackageByLand(SendPackageByLand land) {
		land.sendByLand();
	}
}
