package com.qianfeng.week2.day3.fArray;

import java.util.Arrays;

public class Program {
	
	static int[] array = {};
	
	public static void main(String[] args) {
		// ˼�룺�ı�����ĳ���
		// ���������е�Ԫ�ص�����һ��������
		
		// src: Դԭ����
		// srcPos: ��Դ����ĵڼ�λ��ʼ����
		// dest: Ŀ������
		// destPos: ������Ŀ������ĵڼ�λ
		// length: �������ٸ�Ԫ��
		// System.arraycopy(src, srcPos, dest, destPos, length);
		/*
		int[] array1 = {100, 200, 300, 400, 500};
		int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		// {1, 2, 100, 200, 300, 400, 500, 8, 9, 10}
		System.arraycopy(array1, 0, array2, 2, 5);
		
		for (int ele : array2) {
			System.out.println(ele);
		}
		*/
		
		// 1, 2, 3, 4, 5, 6, 7, 8, 9
		// 1, 2, 3, 4, 5, 6, 7, 8, 9, 0
		// 1, 2, 3, 3, 4, 5, 6, 7, 8, 9
		// 1, 2, 100, 3, 4, 5, 6, 7, 8, 9, 0
		/*
		int index = 2, ele = 100;
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		// 1. ����
		array = Arrays.copyOf(array, array.length + 1);
		// 2. �ӵ�indexλ��ʼ�������Ԫ���������Ų
		System.arraycopy(array, index, array, index + 1, array.length - index - 1);
		
		array[index] = ele;
		*/
		
		/*
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int index = 4;
		
		System.arraycopy(array, index + 1, array, index, array.length - 1 - index);
		
		array = Arrays.copyOf(array, array.length - 1);
		
		
		for (int e : array) {
			System.out.println(e);
		}
		*/
		
		MyList list = new MyList();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		
		for (int i = 0; i < list.size; i++) {
			System.out.println(list.get(i));
		}
		
	}
	
	public static void add(int index, int ele) {
		// 1. ����������
		growUp(1);
		// 2. ��indexλ��ʼ���������е�Ԫ���������Ų1λ
		// System.arraycopy(src, srcPos, dest, destPos, length);
	}
	
	public static void growUp(int capicity) {
		array = Arrays.copyOf(array, array.length + capicity);
	}
}
