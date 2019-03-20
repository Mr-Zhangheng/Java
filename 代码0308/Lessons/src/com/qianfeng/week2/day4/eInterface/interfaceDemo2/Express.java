package com.qianfeng.week2.day4.eInterface.interfaceDemo2;

public class Express {
	String name;
}

class Shunfeng extends Express implements SendPackageByAir, SendPackageByLand {

	@Override
	public void sendByLand() {
		System.out.println("顺丰快递发陆运");
	}

	@Override
	public void sendByAir() {
		System.out.println("顺丰快递发空运");
	}
	
}

class EMS extends Express implements SendPackageByAir {

	@Override
	public void sendByAir() {
		System.out.println("EMS快递发空运");
	}
	
}

class Yunda extends Express implements SendPackageByLand {

	@Override
	public void sendByLand() {
		System.out.println("韵达快递发陆运");
	}
	
}
