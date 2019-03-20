package com.qianfeng.week3.day2.aExercise.adapter;

public class Adapter implements USB {

	private PS2 ps2Device;
	
	/**
	 * ͨ�����췽����Ϊ��Ҫת����PS2�豸���и�ֵ
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
