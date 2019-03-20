package com.qianfeng.week2.day3.fArray;

// 模拟双链表实现一个集合

public class MyList {
	// 用来记录当前有多少个几点（存储了多少个元素）
	public int size;
	// 首节点
	Node first;
	// 尾节点
	Node last;
	
	public void add(int ele) {
		
		Node node = new Node(ele);
		if (size == 0) {
			// 说明是一个空的链表
			this.first = node;
			this.last = node;
		}
		else {
			this.last.next = node;
			node.previous = this.last;
			this.last = node;
		}
		size++;
	}
	
	public int get(int index) {
		
		Node node = this.first;
		
		for (int i = 0; i < index; i++) {
			node = node.next;
		}
		
		return node.ele;
	}
	
}

class Node {
	// 这一位上存储的元素
	int ele;
	// 上一个节点
	Node previous;
	// 下一个节点
	Node next;
	
	public Node(int ele) {
		this.ele = ele;
	}
}
