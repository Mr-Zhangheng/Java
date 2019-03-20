class ArrayProgram4 {
	public static void main(String[] args) {
		// 数组：数组是一个用来存储相兼容数据类型的容器
		// 二维数组：在数组中存储的元素类型，是数组类型的

		int[] a = new int[4];
		// 声明和实例化
		// 在实例化的时候，前面的中括号里面需要写上的是array这个数组的长度
		// 在实例化的时候，后面的中括号里面写的是嵌套的数组长度
		// null: 表示空，没有值，代表没有地址指向
		int[][] array = new int[3][];
		System.out.println(array.length);

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		
		// 访问数组中的元素
		// 通过下标访问
		// array[0] = new int[]{1, 2, 3, 4, 5};
		array[1] = new int[]{1, 2, 3};
		array[2] = new int[]{1};
		// array[0] = new int[]{1, 2, 3};


		// array[0] = {0, 0, 0, 0}
		// array[0] = null;

		System.out.println(array[0][2]);	// null[2]





	}
}