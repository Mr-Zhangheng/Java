import java.util.*;
class ArrayProgram3 {
	public static void main(String[] args) {
		// 数组拷贝
		// 深拷贝，浅拷贝
		
		int[] array = { 1, 2, 3, 4, 5 };
		// 浅拷贝：
		// 地址拷贝：
		int[] ret = array;	
		System.out.println(ret == array);				
		System.out.println(Arrays.equals(ret, array));	

		array[0] = 100;
		System.out.println(ret[0]);

		// 深拷贝：
		// 在堆上开辟一块新的空间，将原数组中的元素依次拷贝到这个新的空间中
		int[] ret2 = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			ret2[i] = array[i];
		}

		System.out.println(ret2 == array);					// false
		System.out.println(Arrays.equals(ret2, array));		// true


		array[1] = 200;
		System.out.println(ret2[1]);
	}
}