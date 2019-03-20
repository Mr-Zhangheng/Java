package com.qianfeng.week2.day3.fArray;

import java.util.Arrays;

public class Program {
	
	static int[] array = {};
	
	public static void main(String[] args) {
		// 思想：改变数组的长度
		// 拷贝数组中的元素到另外一个数组中
		
		// src: 源原数组
		// srcPos: 从源数组的第几位开始拷贝
		// dest: 目标数组
		// destPos: 拷贝到目标数组的第几位
		// length: 拷贝多少个元素
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
		// 1. 扩容
		array = Arrays.copyOf(array, array.length + 1);
		// 2. 从第index位开始，后面的元素依次向后挪
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
		// 1. 对数组扩容
		growUp(1);
		// 2. 将index位开始，往后所有的元素依次向后挪1位
		// System.arraycopy(src, srcPos, dest, destPos, length);
	}
	
	public static void growUp(int capicity) {
		array = Arrays.copyOf(array, array.length + capicity);
	}
}
