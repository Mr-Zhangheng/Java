class FunctionOverloadProgram {
	public static void main(String[] args) {
		
		add(10, 10);
		add("", "");
	}

	public static void add(int a, int b) {
		System.out.println("add(int,int)");
	}

	public static void add(String a, String b) {
		System.out.println("add(Stirng, String)");
	}
}