package com.qianfeng.week3.day5.bList;

import java.util.*;
import java.util.function.Consumer;

public class ArrayListDemo {
	public static void main(String[] args) {
		// ArrayList作为List接口的实现类，这个类一定实现了List接口中所有的方法。
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			list.add(i);
		}
		// 希望将这个元素分别x10输出
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
