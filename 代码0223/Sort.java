class Sort {
	public static void main(String[] args) {
		
		int[] array = {6, 2, 17, 20, 9, 1, 7, 10};
		// bubbleSort(array);
		// selectSort(array);
		selectSort2(array);

		for (int ele : array) {
			System.out.println(ele);
		}

		// {1, 2, 6, 7, 9, 10, 17, 20}
	}

	/**
	 * 对数组array使用冒泡排序做升序排序
	 */
	public static void bubbleSort(int[] array) {

		int temp;
		// 1. 循环进行每一趟的比较
		for (int i = 0; i < array.length - 1; i++) {
			// 2. 依次对两个相邻的元素进行比较
			for (int j = 0; j < array.length - 1 - i; j++) {
				// 3. 比较两个相邻的元素
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	/**
	 * 对数组array使用选择排序做升序排序
	 */
	public static void selectSort(int[] array) {
		// 1. 固定下标, 从第0位开始, 到数组长度-2
		for (int i = 0; i < array.length - 1; i++) {
			// 2. 循环遍历每一个用来和第i位进行比较的下标
			for (int j = i + 1; j < array.length; j++) {
				// 3. 判断是否需要交换
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}

	/**
	 * 选择排序优化版
	 */
	public static void selectSort2(int[] array) {
		// 0. 定义一个变量，用来记录最小值对应的下标
		int minIndex = -1, temp, length = array.length;
		// 1. 固定下标, 从第0位开始，到数组长度-2位
		for (int i = 0; i < length - 1; i++) {
			// 2. 假设当前固定的下标，就是最小的元素
			minIndex = i;
			// 3. 往后遍历每一位，依次来判断指定的元素是否比记录的最小值还小
			for (int j = i + 1; j < length; j++) {
				if (array[j] < array[minIndex]) {
					// 4. 重新记录最小下标
					minIndex = j;
				}
			}

			// 5. 用固定的下标位和记录的最小值位进行交换
			temp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = temp;
		}
	}

}