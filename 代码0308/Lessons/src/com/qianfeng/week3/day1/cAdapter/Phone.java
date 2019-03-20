package com.qianfeng.week3.day1.cAdapter;

public class Phone implements TypeC {
	@Override
	public String getDeviceInfo() {
		return "这是一个采用了Type-C接口的手机，Huawei";
	}
}
