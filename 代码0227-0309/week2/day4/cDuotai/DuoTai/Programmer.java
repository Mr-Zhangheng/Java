package com.qianfeng.week2.day4.cDuotai.DuoTai;

public class Programmer extends Staff {

	@Override
	public void work() {
		// 调用父类中的方法实现
		super.work();	// 员工在工作
		
		System.out.println("Coding...");
	}
}
