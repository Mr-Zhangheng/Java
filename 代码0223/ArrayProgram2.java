class ArrayProgram2 {
	public static void main(String[] args) {
		
		int x = 10;
		change(x);
		System.out.println(x);	// 

		int[] arr = {10};
		change(arr);
		System.out.println(arr[0]);	// 10? 100?
	}

	public static void change(int[] arr) {
		// arr[0] = 100;
		arr = new int[] {100};
	}

	public static void change(int a) {
		a = 100;
	}
}