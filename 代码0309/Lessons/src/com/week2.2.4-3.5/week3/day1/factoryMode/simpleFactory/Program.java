package com.qianfeng.week3.day1.factoryMode.simpleFactory;

public class Program {
	public static void main(String[] args) {
		// С�����ֻ������ֻ�
		
		// ʹ�ù��������ṩ�ķ�������ȡָ�����ֻ�
		// Phone phone = PhoneFactory.getPhone("Huawei", "P20 Pro", "��ɫ");
		// Phone phone2 = PhoneFactory.getPhone("Xiaomi", "9", "͸��");
		
	    Huawei huawei = PhoneFactory.getHuawei("Huawei", "��ɫ");
		
		// ����ԭ��
		// ����չ���ţ����޸Ĺرա�
		
	}
}
