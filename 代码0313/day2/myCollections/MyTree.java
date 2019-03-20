package com.qianfeng.week4.day2.myCollections;

public class MyTree<E extends Compare<E>> {
	/**
	 * �ڵ���
	 * @author luds
	 */
	class Node {
		// �洢��Ԫ��
		E element;
		// ��ڵ�
		Node left;
		// �ҽڵ�
		Node right;
		
		
		public void add(E element) {
			// �Ƚ�this.element �� element �Ĵ�С��ϵ
			if (this.element.compare(element) > 0) {
				// 1. �ж���û���ҽڵ�
				if (this.right == null) {
					Node node = new Node();
					node.element = element;
					this.right = node;
				}
				else {
					// ���ҽڵ�
					this.right.add(element);
				}
			}
			else {
				// 2. �ж���û����ڵ�
				if (this.left == null) {
					Node node = new Node();
					node.element = element;
					this.left = node;
				}
				else {
					this.left.add(element);
				}
			}
		}
		
		/**
		 * ���һ���ڵ������е�Ԫ��
		 */
		public void print() {
			// ��
			if (this.left != null)
				this.left.print();
			// ��
			System.out.println(this.element);
			// ��
			if (this.right != null)
				this.right.print();
		}
	}
	
	// ���ڵ�
	private Node root;
	
	/**
	 * ���Ԫ��
	 * @param element
	 */
	public void add(E element) {
		// 1. �ж���û�и��ڵ�
		if (this.root == null) {
			Node node = new Node();
			node.element = element;
			this.root = node;
		}
		else {
			this.root.add(element);
		}
	}
	
	
	public void print() {
		if (this.root != null)
			this.root.print();
	}
	
}


