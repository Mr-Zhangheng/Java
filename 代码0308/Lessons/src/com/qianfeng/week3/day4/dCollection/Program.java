package com.qianfeng.week3.day4.dCollection;

import java.util.*;
import java.util.function.Predicate;

public class Program {
	// Collection�ӿڡ�Map�ӿ�
	// Collection: 
	public static void main(String[] args) {
		// ��ArrayListΪ������Collection�еķ���
		Collection<Integer> list = new ArrayList<>();
		
		// Χ�ƺ��ģ�����ɾ���ġ��顢������
		
		// ����
		// add(E e): ���һ��Ԫ��
		// addAll(Collection<? extends E> e): ��һ�������е�Ԫ��������ӵ�����һ��������
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list);
		list.addAll(list);
		list.addAll(list);
		System.out.println(list);
		
		// ɾ��
		// boolean remove(Object obj): �Ӽ�����ɾ����һ��ָ����Ԫ��, ����ֵ�������ɾ������������û��ɾ��Ԫ��
		System.out.println(list.remove(10));
		
		// boolean removeAll(Collection<?> e): �Ӽ�����ɾ��������ָ�������д��ڵ�Ԫ�ء�ֻҪ��Ԫ��ɾ��������ֵ����true
		Collection<Integer> remove = new ArrayList<>();
		remove.add(2);
		remove.add(30);
		// System.out.println(list.removeAll(remove));
		
		// ���ν�list�����е�ÿһ��Ԫ�ش��뵽Predicate�ӿڵ�test�����У��������ֵ��true����ɾ�����Ԫ��
		/*list.removeIf(new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				return t % 2 == 0;
			}			
		});*/
		// list.removeIf(ele -> ele % 2 == 0);
		
		// clear();  ��ռ���
		
		
		// contains �жϼ������Ƿ����ָ����Ԫ��
		
		// containsAll���ж�һ�������е�Ԫ���Ƿ���list�����ж�����
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
