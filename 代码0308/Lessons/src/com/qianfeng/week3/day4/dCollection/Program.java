package com.qianfeng.week3.day4.dCollection;

import java.util.*;
import java.util.function.Predicate;

public class Program {
	// Collection接口、Map接口
	// Collection: 
	public static void main(String[] args) {
		// 以ArrayList为例，讲Collection中的方法
		Collection<Integer> list = new ArrayList<>();
		
		// 围绕核心：增、删、改、查、功能性
		
		// 增：
		// add(E e): 添加一个元素
		// addAll(Collection<? extends E> e): 将一个集合中的元素依次添加到另外一个集合中
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list);
		list.addAll(list);
		list.addAll(list);
		System.out.println(list);
		
		// 删：
		// boolean remove(Object obj): 从集合中删除第一个指定的元素, 返回值代表这个删除操作到底有没有删除元素
		System.out.println(list.remove(10));
		
		// boolean removeAll(Collection<?> e): 从集合中删除所有在指定集合中存在的元素。只要有元素删除，返回值都是true
		Collection<Integer> remove = new ArrayList<>();
		remove.add(2);
		remove.add(30);
		// System.out.println(list.removeAll(remove));
		
		// 依次将list集合中的每一个元素带入到Predicate接口的test方法中，如果返回值是true，就删除这个元素
		/*list.removeIf(new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				return t % 2 == 0;
			}			
		});*/
		// list.removeIf(ele -> ele % 2 == 0);
		
		// clear();  清空集合
		
		
		// contains 判断集合中是否包含指定的元素
		
		// containsAll：判断一个集合中的元素是否在list集合中都存在
		System.out.println(list.containsAll(remove));
		
		
		// equals
		
		System.out.println(list);
		
		Object[] array = list.toArray();
		
		Integer[] arr = list.toArray(new Integer[0]);
		
		
		for (Integer i : list) {
			System.out.println(i);
		}
		
	}
}
