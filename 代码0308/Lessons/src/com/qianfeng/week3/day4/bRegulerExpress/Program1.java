package com.qianfeng.week3.day4.bRegulerExpress;

public class Program1 {
	public static void main(String[] args) {
		// 判断一个字符串是否和指定的正则规则匹配
		// boolean ret = "hello world".matches("hello world");
		// System.out.println(ret);
		
		// ^: 用来匹配一个字符串的开头
		System.out.println("hello world".matches("^hello world"));
		// $：用来匹配一个字符串的结尾
		System.out.println("hello world".matches("hello world$"));
		// 如果需要对一个字符串进行完整的校验, 最好把^和$都加上去。
		System.out.println("hello world".matches("^hello world$"));
		
		// []: 表示用来匹配一位字符
		// [abc]: 表示这一位字符可以是a，也可以是b，也可以是c
		System.out.println("aello world".matches("^[abch]ello world$"));
		// [a-z]: 表示这一位字符可以是所有的小写字母 [a, z]
		System.out.println("aello world".matches("^[a-z]ello world$"));
		// [a-zABC]: 表示这一位字符可以是所有的小写字母，或者A，或者B，或者C
		System.out.println("Bello world".matches("^[a-zABC]ello world$"));
		// [a-zA-Z]: 表示这一位字符可以是所有的大小写字母
		System.out.println("hello world".matches("^[a-zA-Z]ello world$"));
		// [a-zA-Z0-9]: 表示这一位字符可以是所有的大小写字母或者数字
		System.out.println("hello world".matches("^$[a-zA-Z0-9]ello world"));
		// [^a]: 表示这一位字符可以是任意的字符，唯独不是a
		System.out.println("aello world".matches("^[^a]ello world$"));
		// [^abc]: 表示这一位是除了a、b、c之外的任意字符
		System.out.println("cello world".matches("^[^abc]ello world$"));
		// [^a-z[h-w]]: 
		System.out.println("uello world".matches("^[^a-z[h-w]]ello world$"));
		
		// .: 是一个通配符，可以匹配任意的字符
		System.out.println("hello world".matches("^.ello world$"));
		
		// \: 是一个转义字符，备注：因为这个符号在字符串中也是一个转义字符，所以我们需要再加一个转义
		System.out.println("hello world".matches("^hello\\.world$"));
		
		// \d: [0-9] 可以匹配任意的数字
		// \D: [^0-9] 可以匹配任意的非数字
		System.out.println("hello world1".matches("^hello world\\d$"));
		
		// \w: 可以匹配任意的一个单词字符 [a-zA-Z0-9_]
		// \W: 可以匹配任意的一个非单词字符 
		
		// + : 前面的一位或者一组字符连续出现了1次或多次
		// ? : 前面的一位或者一组字符连续出现了1次或0次
		// * : 前面的一位或者一组字符连续出现了0次或多次(包含1次)
		System.out.println("hello world".matches("^hel+o world$"));
		System.out.println("hello world".matches("^hell?o world$"));
		System.out.println("helo world".matches("^hel*o world$"));
		System.out.println("hello world".matches(".*"));
		
		// {}: 次数限制
		// {m}		:前面的一位或者一组字符，连续出现了m次
		// {m,}		:前面的一位或者一组字符，连续出现了至少m次	
		// {m,n}	:前面的一位或者一组字符，连续出现了至少m次，最多n次
		
		System.out.println("hello world".matches("^hel{2,5}o world$"));
		
		
		// (): 分组，可以将一个字符串按照指定的规则进行分组
	}
}
