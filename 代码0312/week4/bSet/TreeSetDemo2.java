package com.qianfeng.week4.bSet;

import java.util.*;

public class TreeSetDemo2 {
	public static void main(String[] args) {
		// 实例化一个TreeSet
		TreeSet<Integer> sets = new TreeSet<>();
		Collections.addAll(sets, 10, 20, 30, 5, 8, 0, 9, 10, 62, 8, 6, 30);
		// [0, 5, 6, 8, 9, 10, 20, 30, 62]
		System.out.println(sets);
		
		
		// ceiling(E ele): 	返回集合中大于等于指定元素的区间中，最小的元素
		// floor(E ele):	返回集合中小于等于指定元素的区间中，最大的元素
		// higher(E ele):	返回集合中大于指定元素的区间中，最小的元素
		// lower(E ele):	返回集合中大于指定元素的区间中，最小的元素
		// first(): 		返回集合中的首元素
		// last():			返回集合中的最后一个元素
		// headSet(E toElement): 	返回一个集合中小于指定元素的所有部分
		// tailSet(E fromElement): 	返回一个集合中大于指定元素的所有部分
		
		
		System.out.println(sets.ceiling(9));
		System.out.println(sets.floor(11));
		System.out.println(sets.first());
		System.out.println(sets.headSet(10));
		System.out.println(sets.higher(10));
		
		
		// Comparator<? super Integer> c = sets.comparator();
		
	}
}
