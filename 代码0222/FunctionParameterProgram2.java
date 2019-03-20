class FunctionParameterProgram2 {

	public static void main(String[] args) {
		int x = 10, y = 20;
		swap(x, y);
		System.out.println("x = " + x + ", y = " + y);	// x = 10, y = 20

		change(x);
		System.out.println("x = " + x);		// x = 10;
	}

	public static void swap(int x, int y) {
		x = x ^ y;
		y = x ^ y;
		x = x ^ y;
	}

	public static void change(int x) {
		x *= 10;
	}

	/*
		int x = 10, y = 20;

		int a = x;
		int b = y;

		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
	*/


	// 
}