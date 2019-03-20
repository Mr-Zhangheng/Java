package com.qianfeng.week3.day2.aExercise.adapter;

public class Adapter implements USB {

	private PS2 ps2Device;
	
	/**
	 * 通过构造方法，为需要转换的PS2设备进行赋值
	 * @param ps2Device
	 */
	public Adapter(PS2 ps2Device) {
		this.ps2Device = ps2Device;
	}
	
	
	
	@Override
	public String getInfo() {
		return this.ps2Device.getInfo();
	}
	
}
