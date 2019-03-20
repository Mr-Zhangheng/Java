package com.qianfeng.week4.bSet;

import java.util.*;

public class TreeSetDemo2 {
	public static void main(String[] args) {
		// ʵ����һ��TreeSet
		TreeSet<Integer> sets = new TreeSet<>();
		Collections.addAll(sets, 10, 20, 30, 5, 8, 0, 9, 10, 62, 8, 6, 30);
		// [0, 5, 6, 8, 9, 10, 20, 30, 62]
		System.out.println(sets);
		
		
		// ceiling(E ele): 	���ؼ����д��ڵ���ָ��Ԫ�ص������У���С��Ԫ��
		// floor(E ele):	���ؼ�����С�ڵ���ָ��Ԫ�ص������У�����Ԫ��
		// higher(E ele):	���ؼ����д���ָ��Ԫ�ص������У���С��Ԫ��
		// lower(E ele):	���ؼ����д���ָ��Ԫ�ص������У���С��Ԫ��
		// first(): 		���ؼ����е���Ԫ��
		// last():			���ؼ����е����һ��Ԫ��
		// headSet(E toElement): 	����һ��������С��ָ��Ԫ�ص����в���
		// tailSet(E fromElement): 	����һ�������д���ָ��Ԫ�ص����в���
		
		
		System.out.println(sets.ceiling(9));
		System.out.println(sets.floor(11));
		System.out.println(sets.first());
		System.out.println(sets.headSet(10));
		System.out.println(sets.higher(10));
		
		
		// Comparator<? super Integer> c = sets.comparator();
		
	}
}
