package com.qianfeng.week2.day3.aExercise;

public class Program3 {
	public static void main(String[] args) {
		
		int[] array = {1, 2, 3, 4, 5, 6, 7};
		System.out.println(ArrayTools.toString(array));
	}
}

/**
 * π§æﬂ¿‡
 * @author luds
 */
class ArrayTools {
	
	/**
	 * 
	 * @param array
	 */
	public static void reverse(int[] array) {
		int tmp;
		for(int i = 0; i < array.length / 2; i++) {
			tmp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = tmp;
		}
	}
	
	/**
	 * 
	 * @param array
	 * @return
	 */
	public static String toString(int[] array) {
		// [1, 2, 3, 4, 5]
		String str = "[";
		
		for (int i = 0; i < array.length - 1; i++) {
			str += array[i] + ", ";
		}
		
		return str + array[array.length - 1] + "]";
	}
}
