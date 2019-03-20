package com.qianfeng.week2.day5.aExercise.exercise6;

public class MyArrays {

	/**
	 * 对一个Object数组中的元素进行排序
	 * @param array
	 */
	public static void sort(Object[] array, MyComparator c) {
		// 选择排序
		int minIndex;
		Object tmp;
		
		for (int i = 0; i < array.length - 1; i++) {
			minIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				// 使用我们预设的方法进行比较
				if (c.compare(array[minIndex], array[j]) > 0) {
					minIndex = j;
				}
			}
			
			tmp = array[minIndex];
			array[minIndex] = array[i];
			array[i] = tmp;
		}
	}
	
	/**
	 * 
	 * @param array
	 */
	public static void sort(Object[] array) {
		// 选择排序
		int minIndex;
		Object tmp;
		
		for (int i = 0; i < array.length - 1; i++) {
			minIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				// 使用我们预设的方法进行比较
				MyComparable m1 = (MyComparable)array[minIndex];
				
				if (m1.compareTo(array[j]) > 0) {
					minIndex = j;
				}
			}
			
			tmp = array[minIndex];
			array[minIndex] = array[i];
			array[i] = tmp;
		}
	}
	
	
	
	@SuppressWarnings("unused")
	private void srotExercise(int[] array) {
		// 选择排序
		int minIndex, tmp;
		
		for (int i = 0; i < array.length - 1; i++) {
			minIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[minIndex] > array[j]) {
					minIndex = j;
				}
			}
			
			tmp = array[minIndex];
			array[minIndex] = array[i];
			array[i] = tmp;
		}
	}
}
