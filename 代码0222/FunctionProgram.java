class FunctionProgram {
	// ������:
	// �������������ʼִ�У�������ִ�н���������Ҳ�ͽ�����
	public static void main(String[] args) {
		// ���÷���
		nineNineTable();
		System.out.println("hello world");
		nineNineTable();
	}

	// ����һ������������������������žų˷���
	static void nineNineTable() {
		for (int line = 1; line <= 9; line++) {
			for (int colum = 1; colum <= line; colum++) {
				System.out.print(colum + "x" + line + "=" + colum * line + "  ");
			}
			System.out.println();
		}
	}

}