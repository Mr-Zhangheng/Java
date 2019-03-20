package com.qianfeng.week2.day4.cDuotai.DuoTai;

public class Boss extends Staff {

	private static Boss instance = new Boss();
	public static Boss getBoss() {
		return instance;
	}
	
	@Override
	public void work() {
		System.out.println("·¢Ç®");
	}
}
