import java.util.Arrays;

class Arraysprogram {
	public static void main(String[] args) {
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = array.length - i;
		}


		// ����
		// �������������
		// Arrays.sort(array);
		// ������ָ������[fromIndex, toIndex)��Ԫ�ؽ�������
		// Arrays.sort(array, 0, 5);

		// 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
		// 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 
		// ʹ�ö��ֲ��ҷ����������н���Ԫ�صĲ�ѯ����������������в�ѯ�ģ�
 		// int index = Arrays.binarySearch(array, 7);


		// ��ָ����Ԫ�����������
		// Arrays.fill(array, 10);
		// ����ֵ��[fromIndex, toIndex)��Χ��Ԫ������ָ����ֵ
		// Arrays.fill(array, 0, 6, 10);
	

		// copy����
		// ��array�����е�Ԫ�ؿ���5�����µ�������
 		// int[] ret = Arrays.copyOf(array, 5);

		// ��ԭ������ָ����Χ��Ԫ�ؿ������µ�����
		// [fromIndex, toIndex)
		// 10, 9, 8, 7, 6, 5, 4, 3, 2, 1
 		// int[] ret = Arrays.copyOfRange(array, 3, 80);

		// ����һ��������ַ�����ʾ��ʽ
 		// String ret = Arrays.toString(array);
		// System.out.println(ret);



		int[] array1 = new int[] {1, 2, 3, 4, 5};
		int[] array2 = new int[] {5, 4, 3, 2, 1};

		// �Ƚ�array1��array2�洢�ĵ�ַ
		System.out.println(array1 == array2);
		// �Ƚ����������е�Ԫ���Ƿ���ͬ
 		boolean ret = Arrays.equals(array1, array2);
		System.out.println(ret);

/*
		for (int ele : ret) {
			System.out.println(ele);
		}
*/

	}
}