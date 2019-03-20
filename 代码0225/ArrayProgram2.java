class ArrayProgram2 
{
	public static void main(String[] args) 
	{
		// 1. ʹ�ö��ֲ��ҷ�����һ�������в�ѯָ����Ԫ��
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

 		int index = binarySearch(array, 4);

		System.out.println(index);
	}

	/**
	 * ʹ�ö��ֲ��ҷ���������array�в�ѯeleԪ�س��ֵ��±�
	 */
	public static int binarySearch(int[] array, int ele) {
		// ��Ϊÿ�β�ѯ��ʱ�����Ƕ���Ҫ��һ����Χ��ȡ�м�ֵ����ѯ
		// ���������������ֱ�������¼һ���������С�±������±�
		int minIndex = 0, maxIndex = array.length - 1;

		while (minIndex <= maxIndex) {
			// ��һ���м��±�
			int midIndex = (minIndex + maxIndex) / 2;

			// ���м����Ԫ�غ�Ҫ��ѯ��Ԫ�ؽ��бȽ�
			if (array[midIndex] > ele) {
				// ������
				maxIndex = midIndex - 1;
			}
			else if (array[midIndex] < ele) {
				// ������
				minIndex = midIndex + 1;
			}
			else {
				// �ҵ���
				return midIndex;
			}
		}

		// Ԫ�ز�����
		return -1;
	}
}