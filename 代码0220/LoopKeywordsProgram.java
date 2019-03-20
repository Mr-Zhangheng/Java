class LoopKeywordsProgram 
{
	public static void main(String[] args) 
	{
		// 循环中的关键字：contninue, break

		// break: 用在循环中，表示立即结束循环。(无论循环条件是否成立)
		// for (int meter = 1; meter <= 100; meter++) {
		// 	System.out.println("小明在操场上跑步，跑了" + meter + "米");
		// 
		// 	if (meter == 50) {
		// 		System.out.println("小明跑到了50米，脚崴了，不能继续跑了");
		// 		break;
		// 	}
		// }

		// continue: 用在循环中，表示立即停止本次循环，开始下一次的循环
		// for (int meter = 1; meter <= 100; meter++) {
		// 
		// 	if (meter == 50) {
		// 		System.out.println("小明发现地上有个坑，跳过去");
		// 		continue;
		// 	}
		// 
		// 	System.out.println("小明在操场上跑步，跑了" + meter + "米");
		// }


		// 拓展 ：一般情况下，break只能作用于当前的循环。
		// 但是我们可以配合标签的使用，使其跳出指定的循环
		FLAG_OUTTER:
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println("i = " + i + ", j = " + j);

				if (j == 2) {
					continue FLAG_OUTTER;
				}
			}
		}
	}
}
