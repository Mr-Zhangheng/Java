class FunctionParameterProgram {
	public static void main(String[] args) {
		// 参数:
		add(10, 20, 30);

		method01(10, 3.14f);


		for (int i = 100; i <= 999; i++) {
			check(i);
		}
	}


	// 把某一个功能提取出来，做成一个方法
	static void add(int a, int b, int c) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	static void method01(int a, float b) {
		method02(b, a);
	}


	static void method02(float a, int b) {
		method03(b);
	}

	static void method03(int a) {
		System.out.println(a);
	}




	static void check(int num) {
		int g = num % 10;
		int s = num / 10 % 10;
		int b = num / 100;

		if (g*g*g + s*s*s + b*b*b == num) {
			System.out.println(num);
		}
	}

}