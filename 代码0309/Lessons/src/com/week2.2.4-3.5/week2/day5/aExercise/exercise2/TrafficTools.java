package com.qianfeng.week2.day5.aExercise.exercise2;

/**
 * ��ͨ���߳�����
 * @author luds
 */
public abstract class TrafficTools {
	/**
	 * ��ʻ
	 */
	public abstract void drive();
}

/**
 * ��ͨ��������-������
 * @author luds
 */
class Car extends TrafficTools {

	@Override
	public void drive() {
		System.out.println("��������·����ʻ");
	}
}

/**
 * ����
 * @author luds
 */
class Train extends TrafficTools {

	@Override
	public void drive() {
		System.out.println("������·����ʻ");
	}
}

class Plane extends TrafficTools {

	@Override
	public void drive() {
		System.out.println("�ɻ����������ʻ");
	}
}
