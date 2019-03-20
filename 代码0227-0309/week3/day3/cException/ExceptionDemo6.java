package com.qianfeng.week3.day3.cException;

public class ExceptionDemo6 {

	public static void main(String[] args) {
		Dog xiaoming = new Dog();
		
		try {
			xiaoming.setLegs(0);
		} catch (NumberOfLegException e) {
			e.printStackTrace();
		}
	}
}

// �����ࣺ�ж�������
class Dog extends Animal {
	
	private int legs;
	
	public void setLegs(int legs) throws NumberOfLegException {
		if (legs != 4) {
			// ˵�������ֵ������
			NumberOfLegException exception = new NumberOfLegException("�����ȵ�����һ����4���źϷ�");
			
			throw exception;
		}
		else {
			this.legs = legs;
		}
	}
	
}


// �Զ����쳣
class NumberOfLegException extends Exception {
	
	/**
	 * ͨ��һ���쳣������Ϣ��ʵ����һ���쳣����
	 * @param message
	 */
	public NumberOfLegException(String message) {
		// ��ô��ȥ��������쳣��Ϣ��
		super(message);
	}
}

