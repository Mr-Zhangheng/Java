package com.qianfeng.week2.day4.cDuotai.example;

public class ZooManager {
	
	/**
	 * �ǼǶ���Ļ�����Ϣ
	 */
	public void recordInfo(Animal animal) {
		System.out.println(animal.name);
		System.out.println(animal.age);
		// �ж�animal�ǲ����ϻ���
		if (animal instanceof Tiger) {
			Tiger t = (Tiger)animal;
			// ������ϻ���������Ա�
			System.out.println("����һ��С�Ը�" + t.gender);
		}
	}
}
