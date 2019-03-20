class ForProgram 
{
	public static void main(String[] args) 
	{
		// for
		// 模拟小明跑步
		// for (int meter = 0; meter <= 10; meter++) {
		// 	System.out.println("小明在跑步，跑了" + meter + "米");
		// }
		// 执行步骤：
		// 1. int meter = 0;  循环的起点
		// 2. meter <= 10; 判断条件是否成立
		// 3. 如果条件为true, 执行循环体, 循环体执行结束, 执行步长。
		// 4. 步长执行结束后，再判断条件是否成立
		// 5. 如果某一次的循环条件为false, 循环结束


		// 1. 需求：输出1-100之间所有的数字
		// for (int i = 1; i <= 100; i++) {
		// 	System.out.println(i);
		// }

		// 2. 需求：输出1-100之间所有的偶数
		// for (int i = 2; i <= 100; i += 2) {
		// 	System.out.println(i);
		// }

		// 3. 需求：求1+2+3+4+...+100的和
		// int sum = 0;	// 记录所有的数字相加的结果
		// for (int i = 1; i <= 100; i++) {
		// 	sum += i;
		// }
		// System.out.println(sum);

		// 4. 需求：求一个数字的阶乘 4! = 4 x 3 x 2 x 1
		
		// 5. 输出斐波那契数列中的前50位
		// 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...

		// 6. 输出所有的水仙花数
		// for (int num = 100; num < 1000; num++) {
		// 	// 思路：求个位、十位、百位的数字
		// 	int g = num % 10;
		// 	int b = num / 100;
		// 	int s = num % 100 / 10;
		// 
		// 	if (g*g*g + s*s*s + b*b*b == num) {
		// 		System.out.println(num + "是水仙花数");
		// 	}
		// }

		// 7. 判断一个数字是不是质数
		// 8. 输出100以内所有的质数
	}
}
