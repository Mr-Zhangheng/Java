package com.qianfeng.week3.day4.cGeneric;

public class Program2 {
	public static void main(String[] args) {
		show(123);
	}
	
	
	// �ڷ����ж���һ������T�����T��ʹ�÷�Χ�����ڵ�ǰ�ķ���
	// �������β��б�����ֵ��������
	public static <T> T show(T t) {
		System.out.println(t);
		return t;
	}
}
