package com.qianfeng.week4.aList;

import java.util.*;

public class CollectionsDemo {
	public static void main(String[] args) {
		// Collections: 是一个工具类，用来操作集合的一个工具类，类似于Arrays提供了若干用来操作数组的方法。
		// 获取一个空集合。
		// Collections.EMPTY_LIST;
		// List<Object> list = Collections.emptyList();
		
		

		LinkedList<Integer> list = new LinkedList<>();
		// 向一个Collection集合中添加元素
		Collections.addAll(list, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println(list);
		
		// 使用二分查找法在集合中查询指定的元素出现的下标，这个集合需要满足要求：
		// 集合中的元素，对应的类，需要实现Comparable接口。
		// binarySearch(List<? extends Comparable<? super T>> list, T key) 
		
		
		// 使用指定的元素填充一个集合。
		// fill(List<? super T> list, T obj)
		Collections.fill(list, 100);
		System.out.println(list);
		
		
		// 使用指定的元素来替换掉集合中原有的元素
		// replaceAll(List<T> list, T oldVal, T newVal)
		Collections.replaceAll(list, 100, 0);
		System.out.println(list);
		
		// 将一个集合倒序
		// reverse(List<?> list)
		Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);	
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		
		// 对集合中的元素进行随机的排列
		// shuffle(List<?> list)
		Collections.shuffle(list);

		System.out.println(list);
		
		
		
		// 将一个线程不安全的集合，转成一个线程安全的集合。
		List<Integer> synchronizedList = Collections.synchronizedList(list);
		
		
		// Collections.sort(list, c);
		
		
		
	}
}
