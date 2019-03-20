class Exercise 
{
	public static void main(String[] args) 
	{
		// 分支结构练习题：
		// 1. 将一个大写字母转成小写字母输出
		// char a = 'A';
		// System.out.println((char)(a + 32));
		
		// 2. 将一个字母大小写翻转输出
		// char c = 'a';
		// if (c >= 'a' && c <= 'z') {
		// 	System.out.println((char)(c - 32));
		// }
		// else if (c >= 'A' && c <= 'Z') {
		// 	System.out.println((char)(c + 32));
		// }
		// else {
		// 	System.out.println("不是字母");
		// }

		// 3. 判断一个数字是不是水仙花数
		// 水仙花数：如果一个三位数字的每一位的立方和加到一起和这个数字相同
		// 153 = 1 x 1 x 1 + 5 x 5 x 5 + 3 x 3 x 3 = 1 + 125 + 27 = 153
		// int num = 123;
		// if (num >= 100 && num < 1000) {
		// 	// 思路：求个位、十位、百位的数字
		// 	int g = num % 10;
		// 	int b = num / 100;
		// 	int s = num % 100 / 10;
		// 
		// 	if (g*g*g + s*s*s + b*b*b == num) {
		// 		System.out.println("是水仙花数");
		// 	}
		// 	else {
		// 		System.out.println("不是水仙花数");
		// 	}
		// }
		// else {
		// 	System.out.println("不是三位数");
		// }

		// 4. 根据一个时间，输出这个时间的下一秒
		// 12:01:44 -> 12:1:45
		// 12:01:59 -> 12:2:0
		// 23:59:59 -> 0:0:0
		// int hour, minute, second
	}
}
