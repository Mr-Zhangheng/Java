class MyFirstJavaProject
{
	public static void main(String[] args) 
	{
		// 注释：
		// 注释的部分不会编译，是对某一段代码进行的描述
		// 代码是给机器看的，注释是给程序员看的

		// 单行注释，只会注释一行内容

		/*
			多行注释
			中间的部分都会被注释
		*/

		/**
			文档注释
		*/
		
		// 将指定的内容（括号中的内容）输出到控制台
		System.out.println("hello world");


		// 变量：
		// 语法：数据类型 标识符
		// 变量在使用的时候，一定要保证是有值的
		int age;
		// 给一个变量进行赋值
		// =：赋值运算符，将等号右边的值给左边的变量进行赋值
		age = 10;
		age = 30;
		System.out.println(age);


		// 语法2：数据类型 标识符 = 初始值;
		// 在声明一个变量的同时，给这个变量一个初始的值
		int score = 90;
		System.out.println(score);

		// 语法3：同时声明多个相同类型的变量
		// 两个变量 height, weight, 都是整型的
		// 此时，
		// height没有值
		// weight的值是20
		int height, weight = 20;


		// 常量：
		// 需要使用关键字 final 修饰
		final int id = 10;
		// 在java中，允许先声明一个常量，不赋值，然后在后面进行赋值
		final int a;
		a = 20;
		System.out.println(a);
	}
}