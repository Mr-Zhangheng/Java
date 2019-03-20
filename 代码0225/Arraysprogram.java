import java.util.Arrays;

class Arraysprogram {
	public static void main(String[] args) {
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = array.length - i;
		}


		// 排序：
		// 对数组进行排序
		// Arrays.sort(array);
		// 对数组指定部分[fromIndex, toIndex)的元素进行排序
		// Arrays.sort(array, 0, 5);

		// 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
		// 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 
		// 使用二分查找法，在数组中进行元素的查询（按照升序排序进行查询的）
 		// int index = Arrays.binarySearch(array, 7);


		// 用指定的元素来填充数组
		// Arrays.fill(array, 10);
		// 将数值中[fromIndex, toIndex)范围的元素填充成指定的值
		// Arrays.fill(array, 0, 6, 10);
	

		// copy拷贝
		// 将array数组中的元素拷贝5个到新的数组中
 		// int[] ret = Arrays.copyOf(array, 5);

		// 将原数组中指定范围的元素拷贝到新的数组
		// [fromIndex, toIndex)
		// 10, 9, 8, 7, 6, 5, 4, 3, 2, 1
 		// int[] ret = Arrays.copyOfRange(array, 3, 80);

		// 返回一个数组的字符串表示形式
 		// String ret = Arrays.toString(array);
		// System.out.println(ret);



		int[] array1 = new int[] {1, 2, 3, 4, 5};
		int[] array2 = new int[] {5, 4, 3, 2, 1};

		// 比较array1和array2存储的地址
		System.out.println(array1 == array2);
		// 比较两个数组中的元素是否相同
 		boolean ret = Arrays.equals(array1, array2);
		System.out.println(ret);

/*
		for (int ele : ret) {
			System.out.println(ele);
		}
*/

	}
}