class FunctionProgram2 {
	public static void main(String[] args) {
		
		System.out.println("0");
		method01();
		System.out.println("5");
	}

	static void method01() {
		System.out.println("1");
		method02();
	}

	static void method02() {
		method03();
		System.out.println("2");
	}

	static void method03() {
		System.out.println("3");
		method04();
	}

	static void method04() {
		System.out.println("4");
	}
}