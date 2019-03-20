package com.qianfeng.week3.day1.cAdapter;

/**
 * 适配器类，一端连接USB，一端连接TypeC
 * @author luds
 *
 */
public class USBAdpter implements USB {

	// USB
	// Type-C
	// 需要连接的TypeC设备
	private TypeC typeCDevice;
	
	public USBAdpter(TypeC typeCDevice) {
		this.typeCDevice = typeCDevice;
	}
	
	
	@Override
	public String getDeviceInfo() {
		return this.typeCDevice.getDeviceInfo();
	}
}
