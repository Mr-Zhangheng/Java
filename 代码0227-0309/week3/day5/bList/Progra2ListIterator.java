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
		// ��ȡ������
		// next: �����Ų��һ��ָ���ٷ������ָ��ָ���Ԫ��
		// previous: �ȷ������Ԫ�أ�����ǰ�ƶ�һ��ָ��
		// set: �޸ĵ�ǰָ���Ԫ��
		// add: ��һ��Ԫ����ӵ���ǰָ�����һλ�ĺ��档��ָ�����������Ԫ�ء�
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
