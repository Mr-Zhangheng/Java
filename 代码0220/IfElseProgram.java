class IfElseProgram 
{
	public static void main(String[] args) 
	{
		// 需求1：
		// 已知两个变量a和b，求他们的最大值
		int a = 10, b = 20, max;
		if (a > b) {
			max = a;
		}
		else {
			max = b;
		}

		// 需求2: 相亲
		boolean beauty = true;
		boolean white = true;
		boolean height = true;
		boolean thin = true;
		boolean rich = true;
		boolean girl = false;
		boolean young = true;

		if (girl) {
			System.out.println("go to meeting~");
		}

		// 需求3：
		// 某一次考试，成绩出来了，
		// 3个分支
		// < 0 : 错误成绩
		// [0, 100] : 合法成绩
		// > 100: 开挂了吧

/*
		float score = 1000;
		
		if (score < 0) {
			System.out.println("错误成绩");
		}
		else {
			// >= 0
			if (score <= 100) {
				System.out.println("合法成绩");
			}
			else {
				// > 100
				System.out.println("开挂了吧");
			}
		}
*/

		// if-else: 省略大括号
		// if (false) 
		// 	System.out.println("hello world");
		// else
		// 	System.out.println("你好，师姐");
		
		// 三种分支
		/*
		float score = -100;
		
		if (score < 0) 
			System.out.println("错误成绩");
		else if (score <= 100) 
			System.out.println("合法成绩");
		else 
			System.out.println("开挂了吧");
		*/
		
		// 七种分支
		// > 100: SSR
		// [90, 100]: S
		// [80, 90): A
		// [60, 80): B
		// [20, 60): C
		// [0, 20): D
		// < 0: E

		float score = 99.0f;
		if (score > 100) {
			System.out.println("SSR");
		}
		else if (score >= 90) {
			System.out.println("S");
		}
		else if (score >= 80) {
			System.out.println("A");
		}
		else if (score >= 60) {
			System.out.println("B");
		}
		else if (score >= 20) {
			System.out.println("C");
		}
		else if (score >= 0) {
			System.out.println("D");
		}
		else {
			System.out.println("E");
		}
		


	}
}
