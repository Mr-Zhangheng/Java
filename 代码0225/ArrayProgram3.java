import java.util.*;
class ArrayProgram3 {
	public static void main(String[] args) {
		// ���鿽��
		// �����ǳ����
		
		int[] array = { 1, 2, 3, 4, 5 };
		// ǳ������
		// ��ַ������
		int[] ret = array;	
		System.out.println(ret == array);				
		System.out.println(Arrays.equals(ret, array));	

		array[0] = 100;
		System.out.println(ret[0]);

		// �����
		// �ڶ��Ͽ���һ���µĿռ䣬��ԭ�����е�Ԫ�����ο���������µĿռ���
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