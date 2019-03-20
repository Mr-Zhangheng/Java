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
	 * ������arrayʹ��ð����������������
	 */
	public static void bubbleSort(int[] array) {

		int temp;
		// 1. ѭ������ÿһ�˵ıȽ�
		for (int i = 0; i < array.length - 1; i++) {
			// 2. ���ζ��������ڵ�Ԫ�ؽ��бȽ�
			for (int j = 0; j < array.length - 1 - i; j++) {
				// 3. �Ƚ��������ڵ�Ԫ��
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	/**
	 * ������arrayʹ��ѡ����������������
	 */
	public static void selectSort(int[] array) {
		// 1. �̶��±�, �ӵ�0λ��ʼ, �����鳤��-2
		for (int i = 0; i < array.length - 1; i++) {
			// 2. ѭ������ÿһ�������͵�iλ���бȽϵ��±�
			for (int j = i + 1; j < array.length; j++) {
				// 3. �ж��Ƿ���Ҫ����
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}

	/**
	 * ѡ�������Ż���
	 */
	public static void selectSort2(int[] array) {
		// 0. ����һ��������������¼��Сֵ��Ӧ���±�
		int minIndex = -1, temp, length = array.length;
		// 1. �̶��±�, �ӵ�0λ��ʼ�������鳤��-2λ
		for (int i = 0; i < length - 1; i++) {
			// 2. ���赱ǰ�̶����±꣬������С��Ԫ��
			minIndex = i;
			// 3. �������ÿһλ���������ж�ָ����Ԫ���Ƿ�ȼ�¼����Сֵ��С
			for (int j = i + 1; j < length; j++) {
				if (array[j] < array[minIndex]) {
					// 4. ���¼�¼��С�±�
					minIndex = j;
				}
			}

			// 5. �ù̶����±�λ�ͼ�¼����Сֵλ���н���
			temp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = temp;
		}
	}

}