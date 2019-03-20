class ArrayProgram2 
{
	public static void main(String[] args) 
	{
		// 1. 使用二分查找法，在一个数组中查询指定的元素
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

 		int index = binarySearch(array, 4);

		System.out.println(index);
	}

	/**
	 * 使用二分查找法，在数组array中查询ele元素出现的下标
	 */
	public static int binarySearch(int[] array, int ele) {
		// 因为每次查询的时候，我们都需要在一个范围内取中间值来查询
		// 定义两个变量，分别用来记录一个区间的最小下标和最大下标
		int minIndex = 0, maxIndex = array.length - 1;

		while (minIndex <= maxIndex) {
			// 求一个中间下标
			int midIndex = (minIndex + maxIndex) / 2;

			// 将中间这个元素和要查询的元素进行比较
			if (array[midIndex] > ele) {
				// 改上限
				maxIndex = midIndex - 1;
			}
			else if (array[midIndex] < ele) {
				// 改下限
				minIndex = midIndex + 1;
			}
			else {
				// 找到了
				return midIndex;
			}
		}

		// 元素不存在
		return -1;
	}
}