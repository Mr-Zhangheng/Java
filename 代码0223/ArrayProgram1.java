class ArrayProgram1 {
	public static void main(String[] args) {
		// 1. ʵ����һ������Ϊ5�����飬�������Ĭ��ֵ
		int[] array = {1, 2, 3, 4, 5};
		
		// 2. 
		// ������������еĵ�3������
		// System.out.println(array[3]);
		// ���󣺽��������±�Ϊ3��Ԫ�ظĳ�400
		array[3] = 400;
		// System.out.println(array[3]);

		// System.out.println(array[5]);

		// 3. �������飺���λ�ȡ�����е�ÿһ��Ԫ��
		//for (int i = 0; i < array.length; i++) {
		//	System.out.println(array[i]);
		//}

		// ��ǿforѭ��
		// ele : ��������
		for (int ele : array) {
			System.out.println(ele);
			ele = 10;
		}
		for (int ele : array) {
			System.out.println(ele);
		}
	}

	public static int indexOf(int[] array, int ele) {
		// ˼·: ��ǰ�������ÿһ��Ԫ�أ������������Ԫ�غ�Ҫ��ѯ��Ԫ����ͬ���򷵻��±�
		for (int i = 0; i < array.length; i++) {
			if (array[i] == ele) 
				return i;
		}
		// ���Ҫ��ѯ��Ԫ���������в�����
		return -1;
	}
}