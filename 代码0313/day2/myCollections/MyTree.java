package com.qianfeng.week4.day2.myCollections;

public class MyTree<E extends Compare<E>> {
	/**
	 * 节点类
	 * @author luds
	 */
	class Node {
		// 存储的元素
		E element;
		// 左节点
		Node left;
		// 右节点
		Node right;
		
		
		public void add(E element) {
			// 比较this.element 和 element 的大小关系
			if (this.element.compare(element) > 0) {
				// 1. 判断有没有右节点
				if (this.right == null) {
					Node node = new Node();
					node.element = element;
					this.right = node;
				}
				else {
					// 有右节点
					this.right.add(element);
				}
			}
			else {
				// 2. 判断有没有左节点
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
		 * 输出一个节点下所有的元素
		 */
		public void print() {
			// 左
			if (this.left != null)
				this.left.print();
			// 根
			System.out.println(this.element);
			// 右
			if (this.right != null)
				this.right.print();
		}
	}
	
	// 根节点
	private Node root;
	
	/**
	 * 添加元素
	 * @param element
	 */
	public void add(E element) {
		// 1. 判断有没有根节点
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


