package com.qianfeng.week3.day1.cAdapter;

/**
 * �������࣬һ������USB��һ������TypeC
 * @author luds
 *
 */
public class USBAdpter implements USB {

	// USB
	// Type-C
	// ��Ҫ���ӵ�TypeC�豸
	private TypeC typeCDevice;
	
	public USBAdpter(TypeC typeCDevice) {
		this.typeCDevice = typeCDevice;
	}
	
	
	@Override
	public String getDeviceInfo() {
		return this.typeCDevice.getDeviceInfo();
	}
}
