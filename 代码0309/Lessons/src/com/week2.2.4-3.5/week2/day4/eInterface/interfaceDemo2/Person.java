package com.qianfeng.week2.day4.eInterface.interfaceDemo2;

public class Person {
	
	/**
	 * ������ ˳��  EMS
	 */
	public void sendPackageByAir(SendPackageByAir air) {
		air.sendByAir();
	}
	
	/**
	 * ��½��
	 */
	public void sendPackageByLand(SendPackageByLand land) {
		land.sendByLand();
	}
}
