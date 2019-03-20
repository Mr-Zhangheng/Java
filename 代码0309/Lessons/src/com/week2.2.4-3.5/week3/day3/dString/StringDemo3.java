package com.qianfeng.week3.day3.dString;

public class StringDemo3 {
	public static void main(String[] args) {
		String str = "hello world";
		
		// 增, 字符串拼接，将两个字符串拼接到一起
		// str = str.concat("!");
		// System.out.println(str);
		
		// 字符串截取：
		// [beginIndex, endIndex)
		// str = str.substring(0, 5);
		// System.out.println(str);
		// 从指定下标开始，截取到最后
		// str = str.substring(1);
		// System.out.println(str);	// 
		
		// 用指定的字符替换原字符串中指定的字符
		// str = str.replace('l', 'L');
		// str = str.replace("ll", "Y");
		
		// str.charAt(0);
		// str.toCharArray();
		
		System.out.println(str.indexOf('l'));		// 查询指定的字符第一次出现的下标
		System.out.println(str.indexOf('l', 4));	// 查询指定的字符，从指定位开始，第一次出现的下标
		System.out.println(str.lastIndexOf('l'));	// 查询指定的字符最后一次出现的下标
		System.out.println(str.lastIndexOf('l', 4));// 查询指定的字符，从指定位开始，最后一次出现的下标
		
		System.out.println(str.indexOf("ll"));			// 查询指定的字符串第一次出现的下标
		System.out.println(str.indexOf("ll", 4));		// 查询指定的字符串，从指定位开始，第一次出现的下标
		System.out.println(str.lastIndexOf("ll"));		// 查询指定的字符串最后一次出现的下标
		System.out.println(str.lastIndexOf("ll", 4));	// 查询指定的字符串，从指定位开始，最后一次出现的下标
		
		str = str.toUpperCase();	// 将小写字母转成大写字母
		str = str.toLowerCase();	// 将大写字母转成小写字母
		
		System.out.println(str.isEmpty());		// 判断一个字符串是否是空串 length() == 0
		System.out.println(str.length());		// 获取一个字符串的长度
		System.out.println(str.contains("ll"));	// 判断一个字符串中是否包含指定的子串
		
		System.out.println("哈利波特之凤凰社.avi".startsWith("哈利波特"));		// 判断一个字符串是否以指定的字符串开头
		System.out.println("哈利波特之凤凰社.avi".endsWith(".avi"));				// 判断一个字符串是否以指定的字符串结尾
		
		str = "       hello world       ".trim();	// 去除字符串前后的空格字符
		
		
		
		boolean ret = "hello world".equalsIgnoreCase("HELLO WORLD");	// 判断两个字符串是否相同（忽略大小写）
		
		/**
		 * 判断两个字符串的大小关系
		 * 返回值：
		 * > 0: 前面的比后面的大
		 * ==0: 两个一样大
		 * < 0: 后面的比前面的大
		 * 比较规则：
		 * 从第0个字符开始，依次比较每一个字符。直到某一次字符的比较中可以区分大小。
		 * 
		 */
		System.out.println("---------------------------");
		System.out.println("hello world".compareTo("he"));
		System.out.println("---------------------------");
		
		// 比较两个字符串的大小关系（忽略大小写）
		"hello world".compareToIgnoreCase("HELLO WORLD");
		
		
		// String[] result = "xiaoming, laowang, lilei, hanmeimei, lily, lucy".split(", ");		// 切割字符串
		
		String[] result = "xiaoming. lilei. hanmeimei. lily. lucy. uncle wang".split("\\. ");
		
		
		for(String ele : result) {
			System.out.println(ele);
		}
		
		System.out.println(str);
		
	}
}
