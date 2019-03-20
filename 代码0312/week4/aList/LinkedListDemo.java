package com.qianfeng.week4.aList;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * LinkedList常用方法
 * @author luds
 */
public class LinkedListDemo {
	public static void main(String[] args) {
		// LinkedList是List接口的实现类，所以List接口中所有的方法，在LinkedList中都可以使用
		
		LinkedList<Integer> list = new LinkedList<>();
			
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		
		// list.add(0, 100);
		// list.addFirst(100);
		// list.offer(1000);
		// list.offerLast(e)
	
		// System.out.println(list.poll());
		
		// System.out.println(list.element());
		
		list.push(100);
		System.out.println(list);
		
		System.out.println(list.pop());
		System.out.println(list);
		
		
		
		Iterator<Integer> it = list.descendingIterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
			
	}
}
