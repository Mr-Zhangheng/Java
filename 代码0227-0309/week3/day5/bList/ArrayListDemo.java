package com.qianfeng.week3.day5.bList;

import java.util.*;
import java.util.function.Consumer;

public class ArrayListDemo {
	public static void main(String[] args) {
		// ArrayList��ΪList�ӿڵ�ʵ���࣬�����һ��ʵ����List�ӿ������еķ�����
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			list.add(i);
		}
		// ϣ�������Ԫ�طֱ�x10���
		list.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				// System.out.println(t * 10);
				t = 0;
			}
		});
		list.forEach(ele -> System.out.println(ele * 10));
		System.out.println(list);
	}
}
class MyArrayList<E> extends ArrayList<E> {
	@Override
	public void removeRange(int from, int to) {
	}
}
