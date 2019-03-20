package com.qianfeng.week4.day2.myCollectionTest;

import java.util.List;

import com.qianfeng.week4.day2.myCollections.Compare;
import com.qianfeng.week4.day2.myCollections.LSArrayList;
import com.qianfeng.week4.day2.myCollections.LSLinkedList;
import com.qianfeng.week4.day2.myCollections.MyTree;

public class Program {
	public static void main(String[] args) {
		
		/*
		// 实例化一个集合，存若干个Integer
		LSArrayList<Integer> list = new LSArrayList<>();
		
		for (int i = 0; i < 20; i++) {
			list.add(i + 1);
		}
		
		// list.remove(10);
		// list.remove(Integer.valueOf(10));
		// list.removeRange(5, 10);
		
		list.clear();
		*/
		
		/*
		LSLinkedList<Integer> list = new LSLinkedList<>();
		
		for (int i = 0; i < 20; i++) {
			list.add(i);
		}
		
		// list.add(0, 100);
		
		list.add(20, 100);
		
		System.out.println(list);
		*/
		
		
		MyTree<MyInteger> tree = new MyTree<>();
		
		for (int i = 20; i >= 0; i--) {
			tree.add(MyInteger.valueOf(i));
		}
		
		tree.print();
		
		
		
	}
}


class MyInteger implements Compare<MyInteger> {
	
	private int value;
	
	public static MyInteger valueOf(int value) {
		return new MyInteger(value);
	}
	
	public MyInteger(int value) {
		this.value = value;
	}
	
	public int intValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return String.valueOf(value);
	}

	@Override
	public int compare(MyInteger ele1) {
		return this.value - ele1.value;
	}
}




















