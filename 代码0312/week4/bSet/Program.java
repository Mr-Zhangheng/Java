package com.qianfeng.week4.bSet;

import java.util.*;

/**
 * HashSet和LinkedHashSet
 * @author luds
 */
public class Program {
	public static void main(String[] args) {
		// Set集合常用的实现类：
		// HashSet, LinkedHashSet, TreeSet
		
		/*
		LinkedList<Integer> list = new LinkedList<>();
		Collections.addAll(list, 1, 2, 3, 4, 4, 3, 2, 1, 1, 2, 3, 4, 5, 6, 7);
	
		HashSet<Integer> sets = new HashSet<>(list);	
		
		System.out.println(sets);
		*/
		
		LinkedHashSet<Integer> list = new LinkedHashSet<>();
		
		Collections.addAll(list, 1, 2, 1, 2, 1, 2, 1, 3, 4, 5, 6, 7, 12, 12, 33, 1, 0, 12, 4, 8);
		
		System.out.println(list);
		
		
		
		
		for (Integer i : list) {
			
		}
		
		
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
