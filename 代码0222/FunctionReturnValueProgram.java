class FunctionReturnValueProgram {

	public static void main(String[] args) {
		int a = add(100, 20);
		System.out.println(a);
	}

	public static int add(int a, int b) {
		// return a + b;
		return calculate(a, b);
	}

	public static int calculate(int a, int b) {
		if (a > b) {
			return a - b;
		}
		else if (a < b) {
			return b - a;
		}
		else {
			return a;
		}
	}
}