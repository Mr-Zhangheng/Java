package com.qianfeng.week3.day5.aCollection;

import java.util.*;

public class Program {
	public static void main(String[] args) {
		// 通过ArrayList来实例化一个集合，看Collection中的方法。
		Collection<Integer> list = new ArrayList<>();
		
		// 增元素
		for (int i = 0; i < 100; i++) 
			list.add(i);
		
		// 获取一个可以遍历list这个集合的迭代器
		Iterator<Integer> it = list.iterator();
		
		// 在使用迭代器进行迭代的时候，一般是配合hasNext进行使用的。
		while (it.hasNext()) {
			// 获取下一个元素
			Integer element = it.next();
			// 输出
			System.out.print(element + ", ");
			
			
			it.remove();
		}
		
		System.out.println(list.size());
	}
}
