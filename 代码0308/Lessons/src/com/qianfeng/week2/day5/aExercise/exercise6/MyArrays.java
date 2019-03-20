package com.qianfeng.week2.day5.aExercise.exercise6;

public class MyArrays {

	/**
	 * ��һ��Object�����е�Ԫ�ؽ�������
	 * @param array
	 */
	public static void sort(Object[] array, MyComparator c) {
		// ѡ������
		int minIndex;
		Object tmp;
		
		for (int i = 0; i < array.length - 1; i++) {
			minIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				// ʹ������Ԥ��ķ������бȽ�
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
		// ѡ������
		int minIndex;
		Object tmp;
		
		for (int i = 0; i < array.length - 1; i++) {
			minIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				// ʹ������Ԥ��ķ������бȽ�
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
		// ѡ������
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
