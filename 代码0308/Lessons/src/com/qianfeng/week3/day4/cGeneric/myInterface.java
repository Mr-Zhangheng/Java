package com.qianfeng.week3.day4.cGeneric;

public interface myInterface<T> {
	// ��ʱ�����Tֻ�ܹ��ڵ�ǰ�Ľӿ���ʹ��
	T testMethod();
	void testMethod2(T t);
}

class MyImplementsTest implements myInterface<String> {

	@Override
	public String testMethod() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void testMethod2(String t) {
		// TODO Auto-generated method stub
		
	}

	
}

