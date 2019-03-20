package com.qianfeng.week2.day4.eInterface.interfaceDemo2;

public class Express {
	String name;
}

class Shunfeng extends Express implements SendPackageByAir, SendPackageByLand {

	@Override
	public void sendByLand() {
		System.out.println("˳���ݷ�½��");
	}

	@Override
	public void sendByAir() {
		System.out.println("˳���ݷ�����");
	}
	
}

class EMS extends Express implements SendPackageByAir {

	@Override
	public void sendByAir() {
		System.out.println("EMS��ݷ�����");
	}
	
}

class Yunda extends Express implements SendPackageByLand {

	@Override
	public void sendByLand() {
		System.out.println("�ϴ��ݷ�½��");
	}
	
}
