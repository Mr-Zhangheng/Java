package com.qianfeng.week3.day5.bList;

import java.util.*;

/**
 * List接口中定义的方法
 * @author luds
 */
public class Program {
	public static void main(String[] args) {
		// 通过ArrayList实现类来看List接口中的方法
		List<Integer> list = new ArrayList<>();
		// List接口中的方法：
		// 增、删、改、查
		// 增：
		list.add(10);					// 将一个元素添加到集合的最后
		list.add(0, 20);				// 在指定的下标插入一个元素
		list.addAll(list);				// 将一个指定集合中所有的元素添加到当前集合的最后
		list.addAll(3, list);			// 将一个指定集合中所有的元素添加到当前集合的指定下标位置
		// 20, 10, 20, 20, 10, 20, 10, 10 
		for (Integer i : list) {
			System.out.print(i + ", ");
		}
		System.out.println("\n---------------------------------------");
		// 删：
		// E remove(int index)								: 删除指定下标的元素, 返回值表示刚刚被删除的元素是谁
		// boolean remove(Object obj)						: 删除指定的元素
		// boolean removeAll(Collection<?> collection)		: 删除所有的在指定集合中存在的元素
		// boolean removeIf(Predicate<? super E> predicate)	: 删除所有的满足条件的元素
		// void clear();									: 清空集合			
		System.out.println(list.remove(4));
		System.out.println(list.remove(Integer.valueOf(20)));
		// 10, 20, 20, 20, 10, 10 
		// 改
		System.out.println(list.set(2, 200));				// 将指定下标位的元素，替换为指定的新的元素。并返回被替换的那个元素。
		// 查
		System.out.println(list.get(2));					// 获取指定下标的元素。
		List<Integer> result = list.subList(2, 6); 			// 截取一个子集合
		System.out.println(result);
		
	}
}
