class ArrayProgram1 {
	public static void main(String[] args) {
		// 1. 实例化一个长度为5的数组，并且填充默认值
		int[] array = {1, 2, 3, 4, 5};
		
		// 2. 
		// 需求：输出数组中的第3个数字
		// System.out.println(array[3]);
		// 需求：将数组中下标为3的元素改成400
		array[3] = 400;
		// System.out.println(array[3]);

		// System.out.println(array[5]);

		// 3. 遍历数组：依次获取数组中的每一个元素
		//for (int i = 0; i < array.length; i++) {
		//	System.out.println(array[i]);
		//}

		// 增强for循环
		// ele : 迭代变量
		for (int ele : array) {
			System.out.println(ele);
			ele = 10;
		}
		for (int ele : array) {
			System.out.println(ele);
		}
	}

	public static int indexOf(int[] array, int ele) {
		// 思路: 从前往后遍历每一个元素，如果遍历到的元素和要查询的元素相同，则返回下标
		for (int i = 0; i < array.length; i++) {
			if (array[i] == ele) 
				return i;
		}
		// 如果要查询的元素在数组中不存在
		return -1;
	}
}