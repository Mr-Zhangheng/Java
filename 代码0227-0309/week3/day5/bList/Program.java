package com.qianfeng.week3.day5.bList;

import java.util.*;

/**
 * List�ӿ��ж���ķ���
 * @author luds
 */
public class Program {
	public static void main(String[] args) {
		// ͨ��ArrayListʵ��������List�ӿ��еķ���
		List<Integer> list = new ArrayList<>();
		// List�ӿ��еķ�����
		// ����ɾ���ġ���
		// ����
		list.add(10);					// ��һ��Ԫ����ӵ����ϵ����
		list.add(0, 20);				// ��ָ�����±����һ��Ԫ��
		list.addAll(list);				// ��һ��ָ�����������е�Ԫ����ӵ���ǰ���ϵ����
		list.addAll(3, list);			// ��һ��ָ�����������е�Ԫ����ӵ���ǰ���ϵ�ָ���±�λ��
		// 20, 10, 20, 20, 10, 20, 10, 10 
		for (Integer i : list) {
			System.out.print(i + ", ");
		}
		System.out.println("\n---------------------------------------");
		// ɾ��
		// E remove(int index)								: ɾ��ָ���±��Ԫ��, ����ֵ��ʾ�ոձ�ɾ����Ԫ����˭
		// boolean remove(Object obj)						: ɾ��ָ����Ԫ��
		// boolean removeAll(Collection<?> collection)		: ɾ�����е���ָ�������д��ڵ�Ԫ��
		// boolean removeIf(Predicate<? super E> predicate)	: ɾ�����е�����������Ԫ��
		// void clear();									: ��ռ���			
		System.out.println(list.remove(4));
		System.out.println(list.remove(Integer.valueOf(20)));
		// 10, 20, 20, 20, 10, 10 
		// ��
		System.out.println(list.set(2, 200));				// ��ָ���±�λ��Ԫ�أ��滻Ϊָ�����µ�Ԫ�ء������ر��滻���Ǹ�Ԫ�ء�
		// ��
		System.out.println(list.get(2));					// ��ȡָ���±��Ԫ�ء�
		List<Integer> result = list.subList(2, 6); 			// ��ȡһ���Ӽ���
		System.out.println(result);
		
	}
}
