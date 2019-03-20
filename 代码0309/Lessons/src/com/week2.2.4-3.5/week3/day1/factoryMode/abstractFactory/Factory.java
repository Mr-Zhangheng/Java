package com.qianfeng.week3.day1.factoryMode.abstractFactory;

public interface Factory {
	// Car create(String color);
	
	// 生产SUV
	SUV createSUV(String color);
	// 生产MPV
	MPV createMPV(String color);
	// 生产跑车
	PaoChe createPaoChe(String color);
	// 生产轿车
	JiaoChe createJiaoChe(String color);
}

class AudiFactory implements Factory {

	@Override
	public SUV createSUV(String color) {
		// 
		AudiSUV suv = new AudiSUV();
		suv.color = color;
		
		return suv;
	}

	@Override
	public MPV createMPV(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PaoChe createPaoChe(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JiaoChe createJiaoChe(String color) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

class BMWFactory implements Factory {

	@Override
	public SUV createSUV(String color) {
		
		BMWSUV suv = new BMWSUV();
		suv.color = color;
		
		return suv;
	}

	@Override
	public MPV createMPV(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PaoChe createPaoChe(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JiaoChe createJiaoChe(String color) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}

