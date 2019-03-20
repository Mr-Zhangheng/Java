package com.qianfeng.week2.day4.cDuotai.DuoTai;

public class Program {
	public static void main(String[] args) {
		
		Company company = new Company();
		
		company.check(new Programmer());
		company.check(new Designer());
		company.check(new Manager());
		company.check(Boss.getBoss());
	}
}
