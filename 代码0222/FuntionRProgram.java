class FuntionRProgram {
	public static void main(String[] args) {	

//		System.out.println(getNumber(5));

		for (int i = 1; i <= 50; i++) {
			System.out.print("第" + i + "位：");
			System.out.println(getNumber(i));
		}
	}

	// 菲波那契数列
	// 作用：返回斐波那契数列中指定为的数字
	public static int getNumber(int index) {
		if (index == 1 || index == 2) 
			return 1;
		return getNumber(index - 2) + getNumber(index - 1);
	}



	// StackOverflow: 栈溢出
}