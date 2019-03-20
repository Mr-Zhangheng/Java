class FunctionProgram {
	// 主函数:
	// 程序从主函数开始执行，主函数执行结束，程序也就结束了
	public static void main(String[] args) {
		// 调用方法
		nineNineTable();
		System.out.println("hello world");
		nineNineTable();
	}

	// 定义一个方法，方法的作用是输出九九乘法表
	static void nineNineTable() {
		for (int line = 1; line <= 9; line++) {
			for (int colum = 1; colum <= line; colum++) {
				System.out.print(colum + "x" + line + "=" + colum * line + "  ");
			}
			System.out.println();
		}
	}

}