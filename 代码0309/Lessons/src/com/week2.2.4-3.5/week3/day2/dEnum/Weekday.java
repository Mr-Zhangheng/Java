package com.qianfeng.week3.day2.dEnum;

public enum Weekday {
	Monday(0), Tuesday(1), Wednesday(2), Thursday(3), Friday(4), Saturday(5) {
		@Override
		public void show() {
			System.out.println("������");
		}
		
		@Override
		public int getValue() {
			return 666;
		}
	}, Sunday(6);
	
	// �����Ҫ��ö����д���ԡ�����...��Ҫ�����һ��ö�ٳ����� ����һ���ֺ���Ϊ����
	private int value;
	
	// 1. ��ö����д���췽��, ö���еĹ��췽����һ����������ǻ�����˽�е�
	private Weekday(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public void show() {
		System.out.println("hello world");
	}
	
}
