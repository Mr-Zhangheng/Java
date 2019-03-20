package com.qianfeng.week3.day1.aExercise.exercise2;

/**
 * 自定义的一个工具类
 */
public class MyArrayTools {
	public static void sort(Person[] array, MyComparator c) {
		int minIndex;
		Person temp;
		
		for (int i = 0; i < array.length - 1; i++) {
			minIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				
				int ret = c.compare(array[minIndex], array[j]);
				
				if (ret > 0) {
					minIndex = j;
				}
			}
			
			temp = array[minIndex];
			array[minIndex] = array[i];
			array[i] = temp;
		}
	}
	
	
	public static void sort(int[] array, boolean asc) {
		
		int minIndex, temp;
		
		for (int i = 0; i < array.length - 1; i++) {
			minIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				
				boolean ret = array[minIndex] > array[j];
				
				if (asc ? ret : !ret) {
					minIndex = j;
				}
			}
			
			temp = array[minIndex];
			array[minIndex] = array[i];
			array[i] = temp;
		}
	}
}
