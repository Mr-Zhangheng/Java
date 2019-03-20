class ArrayProgram1 {
	public static void main(String[] args) {
		// keyi 
		getMax(1, 2, 3, 4, 5);
	}

	public static void getMax(int... array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		System.out.println("a = " + a);
	}
}