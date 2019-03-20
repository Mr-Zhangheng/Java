package com.qianfeng.week3.day5.bList;

import java.util.*;

/**
 * ListIterator
 * @author luds
 */
public class Progra2ListIterator {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		// 获取迭代器
		// next: 先向后挪动一个指向，再返回这个指向指向的元素
		// previous: 先返回这个元素，再向前移动一个指向
		// set: 修改当前指向的元素
		// add: 将一个元素添加到当前指向的这一位的后面。并指向这个新增的元素。
		ListIterator<Integer> it = list.listIterator();
		System.out.println(it.hasNext());		// true
		System.out.println(it.next());			// 0
		System.out.println(it.next());			// 1
		it.set(100);
		System.out.println(list);
		it.remove();
		System.out.println(list);
		System.out.println(it.next());
		it.add(100);
		System.out.println(list);
		System.out.println(it.next());
		System.out.println(it.nextIndex());
		System.out.println(it.previousIndex());
	}
}
