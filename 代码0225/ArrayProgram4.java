class ArrayProgram4 {
	public static void main(String[] args) {
		// ���飺������һ�������洢������������͵�����
		// ��ά���飺�������д洢��Ԫ�����ͣ����������͵�

		int[] a = new int[4];
		// ������ʵ����
		// ��ʵ������ʱ��ǰ���������������Ҫд�ϵ���array�������ĳ���
		// ��ʵ������ʱ�򣬺��������������д����Ƕ�׵����鳤��
		// null: ��ʾ�գ�û��ֵ������û�е�ַָ��
		int[][] array = new int[3][];
		System.out.println(array.length);

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		
		// ���������е�Ԫ��
		// ͨ���±����
		// array[0] = new int[]{1, 2, 3, 4, 5};
		array[1] = new int[]{1, 2, 3};
		array[2] = new int[]{1};
		// array[0] = new int[]{1, 2, 3};


		// array[0] = {0, 0, 0, 0}
		// array[0] = null;

		System.out.println(array[0][2]);	// null[2]





	}
}