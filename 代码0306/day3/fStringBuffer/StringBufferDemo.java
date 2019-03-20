package com.qianfeng.week3.day3.fStringBuffer;

public class StringBufferDemo {
	public static void main(String[] args) {
		// StringBuffer、StringBuilder：
		// 构造方法：
		// 0. 通过一个字符串来实例化一个StringBuffer
		StringBuffer buffer = new StringBuffer("hello world");
		
		// 1. append: 字符串拼接，将一个指定的部分拼接到字符串的结尾
		// 2. insert: 字符串插入，将指定的部分插入到一个字符串中指定的位置
		// 3. delete: 字符串删除，删除指定部分的子串
		// 4. deleteCharAt: 删除指定下标的字符
		// 5. replace: 字符串替换，使用一个新的字符串，替换掉原字符串中指定范围的字符串
		// 6. reverse: 字符串翻转
		// 7. setCharAt: 修改指定位的字符为一个新的字符
		// 8. toString: 将StringBuffer转成字符串
		
		buffer.append('!').append("2").append("123");
		buffer.append("xiaoming", 2, 4);
		
		buffer.insert(11, '@');
		buffer.delete(11, 13);
		buffer.deleteCharAt(12);
		buffer.replace(6, 11, "WORLLD");
		buffer.reverse();
		buffer.setCharAt(4, '!');
		
		System.out.println(buffer);
		
	}
}
