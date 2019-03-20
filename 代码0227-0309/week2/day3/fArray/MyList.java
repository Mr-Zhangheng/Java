package com.qianfeng.week2.day3.fArray;

// ģ��˫����ʵ��һ������

public class MyList {
	// ������¼��ǰ�ж��ٸ����㣨�洢�˶��ٸ�Ԫ�أ�
	public int size;
	// �׽ڵ�
	Node first;
	// β�ڵ�
	Node last;
	
	public void add(int ele) {
		
		Node node = new Node(ele);
		if (size == 0) {
			// ˵����һ���յ�����
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
	// ��һλ�ϴ洢��Ԫ��
	int ele;
	// ��һ���ڵ�
	Node previous;
	// ��һ���ڵ�
	Node next;
	
	public Node(int ele) {
		this.ele = ele;
	}
}
