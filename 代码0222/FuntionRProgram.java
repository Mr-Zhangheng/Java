class FuntionRProgram {
	public static void main(String[] args) {	

//		System.out.println(getNumber(5));

		for (int i = 1; i <= 50; i++) {
			System.out.print("��" + i + "λ��");
			System.out.println(getNumber(i));
		}
	}

	// �Ʋ���������
	// ���ã�����쳲�����������ָ��Ϊ������
	public static int getNumber(int index) {
		if (index == 1 || index == 2) 
			return 1;
		return getNumber(index - 2) + getNumber(index - 1);
	}



	// StackOverflow: ջ���
}