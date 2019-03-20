class OperatorProgram 
{
	public static void main(String[] args) 
	{
		/*
		int a = 10, b = 20;
		System.out.println(a + b);	// 30
		System.out.println(a - b);	// -10
		System.out.println(a * b);	// 200
		System.out.println(a / b);	// 0.5
		// 浮点型强转成整型：
		// 直接舍去小数点后面所有的数字，只保留整数部分
		// % 模运算，求模，求余
		System.out.println(a % b);	// 10

		// ++  --
		// ++ : 自增运算符，将某一个变量的值+1
		// -- : 自减运算符，将某一个变量的值-1
		a++;
		System.out.println(a);		// 11
		a--;
		System.out.println(a);		// 10



		// 出现在变量后：
		// 先使用这个变量的值，然后再对这个变量进行+1操作
		System.out.println(a++);	// 10
		System.out.println(a);		// 11
		// 出现在变量前：
		// 先对这个变量进行+1操作，然后再使用这个变量的值
		System.out.println(++a);	// 12
		System.out.println(a);		// 12


		int c = 10;
		System.out.println(c++);	// 10	11
		System.out.println(--c);	// 10	10
		System.out.println(++c);	// 11	11
		System.out.println(c--);	// 11	10
		System.out.println(c);		// 10
		*/

/*
		int a;
		System.out.println(a = 10);	// 10

		System.out.println(a += 10);	// a = a + 10
		System.out.println(a -= 10);	// a = a - 10
		System.out.println(a *= 10);	// a = a * 10
		System.out.println(a /= 10);	// a = a / 10
		System.out.println(a %= 10);	// a = a % 10
*/

/*
		int a = 10, b = 11;
		System.out.println(a > b);		// false
		System.out.println(a < b);		// true
		System.out.println(a >= b);		// false
		System.out.println(a <= b);		// true
		System.out.println(a == b);		// false
		System.out.println(a != b);		// true
*/
/*

		// & | !
		// 与(and)：两真即为真，有任意一个为假，结果即为假
		// 或(or)：两假即为假，有任意一个为真，结果即为真
		// 非(not)：非真既假，非假既真
		System.out.println(true & false);	// false
		System.out.println(true | false);	// true
		System.out.println(!true);			// false

		// ^:
		// 异或(xor): 两个相同为false, 两个不同为true
		System.out.println(true ^ true);	// false
		System.out.println(false ^ false);	// false
		System.out.println(true ^ false);	// true
		System.out.println(false ^ true);	// true

		// &&  ||
		// && : 短路与
		// || : 短路或
		

		// &&与&
		// 相同点：计算的结果是一样的
		// 不同点：
		// 如果在进行逻辑运算的时候，前面的部分已经可以决定整体的结果，此时：
		// 短路操作：第二部分将不参与运算
		// 普通操作：第二部分依然参与运算
		// System.out.println(false & ___);	// false

		int a = 10, b = 20;
		boolean result = a++ > b-- && a-- > b++;

		System.out.println(result);							// false
		System.out.println("a = " + a + ", b = " + b);		// a = 10, b = 20

*/
/*
		// 位运算符
		// & | ^ ~
		// & : 位与
		// | : 位或
		// ^ : 位异或
		// ~ : 按位取反, 和反码不同，每一位都要按位取反，包括符号位
		// 位运算的逻辑：
		// 将参与运算的两个整型的变量，求出补码，用每一位的数字进行运算
		// 1: 相当于是true, 0: 相当于是false
		int a = 10, b = 20;
		// 0000 0000 0000 0000 0000 0000 0000 1010
		// 0000 0000 0000 0000 0000 0000 0001 0100
		// 0000 0000 0000 0000 0000 0000 0000 0000
		System.out.println(a & b);	// 0
		// 0000 0000 0000 0000 0000 0000 0001 1110
		System.out.println(a | b);	// 30
		// 0000 0000 0000 0000 0000 0000 0001 1110
		System.out.println(a ^ b);	// 30
		// 0000 0000 0000 0000 0000 0000 0000 1010
		// 1111 1111 1111 1111 1111 1111 1111 0101
		// 1000 0000 0000 0000 0000 0000 0000 1011
		System.out.println(~a);		// -11

		// ^ : 
		// 需求：设计一段程序，交换两个变量的值
		// 1. 借助中间变量
		// 2. 不借助中间变量-求和法
		// a = a + b;		// a = 30  b = 20
		// b = a - b;		// a = 30  b = 10
		// a = a - b;		// a = 20  b = 10
		// 3. 不借助中间变量-异或法
		// 定律：一个数字和另外一个数字异或两次，一定和自身相同
		// 100 ^ 78 ^ 100 = 78
		// -100 ^ 7 ^ 7 = -100
		// a = a ^ b;	// 10 ^ 20    20
		// b = a ^ b;	// 10 ^ 20    10 
		// a = a ^ b;	// 20	10
		
		// 移位运算符
		// << : 左移运算符
		// 将一个数字，求出补码，将每一位向左移动指定的位数
		// 0000 1010
		// 0010 1000	32 + 8 = 40
		System.out.println(a << 2);
		// 需求：如何高效率的计算3*8
		// 3 << 3
		System.out.println(-10 << 2); 

		// >> : 右移运算符(有符号右移)
		// 最高位补符号位
		// 0000 0010
		System.out.println(9 >> 2);	// 2	
		// 1111 0111
		System.out.println(-9 >> 2); // -3

		// >>> : 右移运算符(无符号右移)
		// 最高位补0
		// 1000 0000 0000 0000 0000 0000 0000 1001
		// 1111 1111 1111 1111 1111 1111 1111 0111
		// 0011 1111 1111 1111 1111 1111 1111 1101
		System.out.println(-9 >>> 2); // -3
*/

		int a = 10, b = 20;
		// 需求：输出a和b的最大值
		int c = a > b ? a : b;
		System.out.println(c);
	}
}
