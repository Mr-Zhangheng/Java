class WhileProgram {
	public static void main(String[] args) {
		// while
		// 计算1+2+...+100
		// int sum = 0;
		// for (int i = 1; i <= 100; i++) {
		// 	sum += i;
		// }

		// int sum = 0;
		// int i = 1;
		// while (i <= 100) {
		// 	sum += i++;
		// }
		// System.out.println(sum);

		// 求一个整型数字有多少位
		// int num = 1234567;
		// int count = 0;
		// 
		// while (num != 0) {
		// 	num /= 10;
		// 	count++;
		// }
		// 
		// System.out.println(count);

		// 判断一个数字是不是回文数
		// 12345 => 54321
		// 5	 => 5			12345 % 10 = 5			0x10 + 5			12345 /= 10
		//						1234 % 10  = 4		    5x10 + 4			1234 /= 10
		//						123 % 10   = 3			54x10+3		
		// result: 用来接收翻转之后的数字
		int number = 12345, result = 0;
		int original = number;

		while (number != 0) {
			// 求出number的最后一位
			int rest = number % 10;
			// 将rest添加到result的最后一位
			result = result * 10 + rest;
			// 
			number /= 10;
		}

		System.out.println(result);
		if (result == original) {
			System.out.println("是回文数");
		}
		else {
			System.out.println("不是回文数");
		}

		// 练习题：
		// 求一个十进制正数的二进制表示形式（可以使用字符串）
		// 辗转相除法
		// 后续：
		// 1. 将这个二进制原码补齐位数（不够八位往前补0凑够8位，如果超过8位，补齐16位，超过16位补齐32位）
		// 2. 求一个数字的原码，考虑负数，
		// 3. 求补码

		while (false) {
			System.out.println("hello world");
		}

		do {
			System.out.println("hello world");
		} while (false);
	}
}