class WhileProgram {
	public static void main(String[] args) {
		// while
		// ����1+2+...+100
		// int sum = 0;
		// for (int i = 1; i <= 100; i++) {
		// 	sum += i;
		// }

		// int sum = 0;
		// int i = 1;
		// while (i <= 100) {
		// 	sum += i++;
		// }
		// System.out.println(sum);

		// ��һ�����������ж���λ
		// int num = 1234567;
		// int count = 0;
		// 
		// while (num != 0) {
		// 	num /= 10;
		// 	count++;
		// }
		// 
		// System.out.println(count);

		// �ж�һ�������ǲ��ǻ�����
		// 12345 => 54321
		// 5	 => 5			12345 % 10 = 5			0x10 + 5			12345 /= 10
		//						1234 % 10  = 4		    5x10 + 4			1234 /= 10
		//						123 % 10   = 3			54x10+3		
		// result: �������շ�ת֮�������
		int number = 12345, result = 0;
		int original = number;

		while (number != 0) {
			// ���number�����һλ
			int rest = number % 10;
			// ��rest��ӵ�result�����һλ
			result = result * 10 + rest;
			// 
			number /= 10;
		}

		System.out.println(result);
		if (result == original) {
			System.out.println("�ǻ�����");
		}
		else {
			System.out.println("���ǻ�����");
		}

		// ��ϰ�⣺
		// ��һ��ʮ���������Ķ����Ʊ�ʾ��ʽ������ʹ���ַ�����
		// շת�����
		// ������
		// 1. �����������ԭ�벹��λ����������λ��ǰ��0�չ�8λ���������8λ������16λ������16λ����32λ��
		// 2. ��һ�����ֵ�ԭ�룬���Ǹ�����
		// 3. ����

		while (false) {
			System.out.println("hello world");
		}

		do {
			System.out.println("hello world");
		} while (false);
	}
}