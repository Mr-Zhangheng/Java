package com.qianfeng.week4.aList;

import java.util.*;

public class CollectionsDemo {
	public static void main(String[] args) {
		// Collections: ��һ�������࣬�����������ϵ�һ�������࣬������Arrays�ṩ������������������ķ�����
		// ��ȡһ���ռ��ϡ�
		// Collections.EMPTY_LIST;
		// List<Object> list = Collections.emptyList();
		
		

		LinkedList<Integer> list = new LinkedList<>();
		// ��һ��Collection���������Ԫ��
		Collections.addAll(list, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println(list);
		
		// ʹ�ö��ֲ��ҷ��ڼ����в�ѯָ����Ԫ�س��ֵ��±꣬���������Ҫ����Ҫ��
		// �����е�Ԫ�أ���Ӧ���࣬��Ҫʵ��Comparable�ӿڡ�
		// binarySearch(List<? extends Comparable<? super T>> list, T key) 
		
		
		// ʹ��ָ����Ԫ�����һ�����ϡ�
		// fill(List<? super T> list, T obj)
		Collections.fill(list, 100);
		System.out.println(list);
		
		
		// ʹ��ָ����Ԫ�����滻��������ԭ�е�Ԫ��
		// replaceAll(List<T> list, T oldVal, T newVal)
		Collections.replaceAll(list, 100, 0);
		System.out.println(list);
		
		// ��һ�����ϵ���
		// reverse(List<?> list)
		Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);	
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		
		// �Լ����е�Ԫ�ؽ������������
		// shuffle(List<?> list)
		Collections.shuffle(list);

		System.out.println(list);
		
		
		
		// ��һ���̲߳���ȫ�ļ��ϣ�ת��һ���̰߳�ȫ�ļ��ϡ�
		List<Integer> synchronizedList = Collections.synchronizedList(list);
		
		
		// Collections.sort(list, c);
		
		
		
	}
}
