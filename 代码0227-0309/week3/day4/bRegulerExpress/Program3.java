package com.qianfeng.week3.day4.bRegulerExpress;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program3 {
	public static void main(String[] args) {
		// 在Java中操作正则需要使用到的类：
		// Pattern、Mather
		// Pattern:
		// 静态方法
		Pattern.matches("^hello world$", "hello world");
		
		
		// 获取一个Pattern对象
		// 不能实例化，通过这个方法来获取对象
		// 参数： 就是一个正则表达式
		Pattern pattern = Pattern.compile("\\d+");
		
		Matcher m = pattern.matcher("aa1123456765678asdfghjk");
		
		// 获取一个Pattern对象
		System.out.println(m.pattern());				// pattern
		// boolean类型的，获取一个匹配的结果
		System.out.println(m.matches());				// true
		
		// 对前面的字符串进行匹配， 只有当满足正则规则的字符串出现的前方的时候才会满足
		// 校验一个字符串是否是以指定的规则作为开头的。
		System.out.println(m.lookingAt());
		
		// 对一个字符串中任意的部位进行匹配，只要有满足条件的部分，就返回true
		// 类似于String   contains
		// 判断一个字符串中是否有满足规则的部分出现（开头除外）
		System.out.println(m.find());
		
		// 返回一个字符串中满足条件的部分第一个字符的下标
		System.out.println(m.start());
		// 返回一个字符串中满足条件的部分最后一个字符的下标
		System.out.println(m.end());
		
		
		Matcher matcher = Pattern.compile("^(1[3578]\\d)(\\d{4})(\\d{4})$").matcher("13577665544");
		// 查找分组
		matcher.find();
		System.out.println(matcher.group(1));
		System.out.println(matcher.group(2));
		System.out.println(matcher.group(3));
		
		
	}
}
