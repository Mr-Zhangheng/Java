package com.qianfeng.week3.day5.aCollection;

import java.util.*;

public class Program {
	public static void main(String[] args) {
		// ͨ��ArrayList��ʵ����һ�����ϣ���Collection�еķ�����
		Collection<Integer> list = new ArrayList<>();
		
		// ��Ԫ��
		for (int i = 0; i < 100; i++) 
			list.add(i);
		
		// ��ȡһ�����Ա���list������ϵĵ�����
		Iterator<Integer> it = list.iterator();
		
		// ��ʹ�õ��������е�����ʱ��һ�������hasNext����ʹ�õġ�
		while (it.hasNext()) {
			// ��ȡ��һ��Ԫ��
			Integer element = it.next();
			// ���
			System.out.print(element + ", ");
			
			
			it.remove();
		}
		
		System.out.println(list.size());
	}
}
