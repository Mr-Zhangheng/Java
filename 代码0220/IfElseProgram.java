class IfElseProgram 
{
	public static void main(String[] args) 
	{
		// ����1��
		// ��֪��������a��b�������ǵ����ֵ
		int a = 10, b = 20, max;
		if (a > b) {
			max = a;
		}
		else {
			max = b;
		}

		// ����2: ����
		boolean beauty = true;
		boolean white = true;
		boolean height = true;
		boolean thin = true;
		boolean rich = true;
		boolean girl = false;
		boolean young = true;

		if (girl) {
			System.out.println("go to meeting~");
		}

		// ����3��
		// ĳһ�ο��ԣ��ɼ������ˣ�
		// 3����֧
		// < 0 : ����ɼ�
		// [0, 100] : �Ϸ��ɼ�
		// > 100: �����˰�

/*
		float score = 1000;
		
		if (score < 0) {
			System.out.println("����ɼ�");
		}
		else {
			// >= 0
			if (score <= 100) {
				System.out.println("�Ϸ��ɼ�");
			}
			else {
				// > 100
				System.out.println("�����˰�");
			}
		}
*/

		// if-else: ʡ�Դ�����
		// if (false) 
		// 	System.out.println("hello world");
		// else
		// 	System.out.println("��ã�ʦ��");
		
		// ���ַ�֧
		/*
		float score = -100;
		
		if (score < 0) 
			System.out.println("����ɼ�");
		else if (score <= 100) 
			System.out.println("�Ϸ��ɼ�");
		else 
			System.out.println("�����˰�");
		*/
		
		// ���ַ�֧
		// > 100: SSR
		// [90, 100]: S
		// [80, 90): A
		// [60, 80): B
		// [20, 60): C
		// [0, 20): D
		// < 0: E

		float score = 99.0f;
		if (score > 100) {
			System.out.println("SSR");
		}
		else if (score >= 90) {
			System.out.println("S");
		}
		else if (score >= 80) {
			System.out.println("A");
		}
		else if (score >= 60) {
			System.out.println("B");
		}
		else if (score >= 20) {
			System.out.println("C");
		}
		else if (score >= 0) {
			System.out.println("D");
		}
		else {
			System.out.println("E");
		}
		


	}
}
