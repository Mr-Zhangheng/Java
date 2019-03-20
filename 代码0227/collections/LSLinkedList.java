package com.luds.collections;

/**
 * 双链表实现的集合
 * @author luds
 */
public class LSLinkedList<T> implements LSList<T> {
	/**
	 * 节点类
	 * @author luds
	 */
	class Node {
		T element;
		Node previous;
		Node next;
		Node(T element) {
			this.element = element;
		}
	}
	// 首节点
	private Node first = null;
	// 尾节点
	private Node last = null;
	// 节点数量
	private int size = 0;
	
	/** 
	 * 检查下标
	 */
	private boolean checkIndex(int index) throws IndexOutOfBoundsException {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		return true;
	}
	
	/**
	 * 找到指定的节点
	 * @param index
	 * @return
	 */
	private Node getNode(int index) {
		checkIndex(index);
		Node node = this.first;
		for (int i = 0; i < index; i++) {
			node = node.next;
		}
		return node;
	}

	@Override
	public void add(T ele) {
		// 1. 创建一个节点
		Node node = new Node(ele);
		// 2. 如果没有首节点
		if (size == 0) {
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
	
	/**
	 * 在集合首位添加元素
	 * @param ele
	 */
	public void addFirst(T ele) {
		Node node = new Node(ele);
		if (size == 0) {
			this.first = node;
			this.last = node;
		}
		else {
			this.first.previous = node;
			node.next = this.first;
			this.first = node;
		}
		size++;
	}

	@Override
	/**
	 * 在指定的下标插入元素
	 */
	public void add(int index, T ele) {
		checkIndex(index);
		// 1. 获取指定下标的节点
		Node node = getNode(index);
		// 2. 实例化一个新的节点
		Node newNode = new Node(ele);
		// 3. 重定项
		
		// 找到node的上一个节点
		Node previous = node.previous;
		
		if (previous == null) {
			// 说明是首节点
			this.first = newNode;
		}
		else {
			// 说明不是首节点
			previous.next = newNode;
			newNode.previous = previous;
		}
		
		newNode.next = node;
		node.previous = newNode;
		size++;
	}
	
	

	@Override
	/**
	 * 批量添加元素
	 */
	public void addRange(T[] ele) {
		for (T e : ele) {
			add(e);
		}
	}

	@Override
	/**
	 * 批量添加元素
	 */
	public void addRange(int index, T[] ele) {
		for (int i = 0; i < ele.length; i++) {
			add(index + i, ele[i]);
		}
	}

	@Override
	public T remove(T ele) {
		// 1. 找到这个元素对应的节点
		Node node = getNode(ele);
		if (node != null) {
			
			removeNode(node);
			
			return node.element;
		}
		return null;
	}

	@Override
	public T removeAt(int index) {
		checkIndex(index);
		// 1. 找到指定的节点
		Node node = getNode(index);
		// 2. 删除节点
		removeNode(node);
		
		return null;
	}
	
	private void removeNode(Node node) {
		// 找到上一个节点和下一个节点
		Node previous = node.previous;
		Node next = node.next;

		if (previous != null)
			previous.next = next;
		else
			this.first = next;

		if (next != null)
			next.previous = previous;
		else
			this.last = previous;

		size--;
	}

	@Override
	public int removeRange(int fromIndex, int toIndex) {
		// 找到要删除的节点的两个端点
		Node fromNode, toNode, node = this.first;
		for (int i = 0; i < toIndex; i++) {
			if (i == fromIndex) {
				fromNode = node;
			}
			if (i == toIndex - 1) {
				toNode = node;
			}
			node = node.next;
		}
		
		
		
		
		return 0;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T set(int index, T ele) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setRange(int fromIndex, int toIndex, T[] ele) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T get(int index) {
		return this.getNode(index).element;
	}

	@Override
	public LSList<T> getRange(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean contains(T ele) {
		return indexOf(ele) >= 0;
	}

	@Override
	public int indexOf(T ele) {
		Node node = this.first;
		for(int i = 0; i < size; i++) {
			if (node.element.equals(ele)) {
				// 说明找到了指定的元素
				return i;
			}
			node = node.next;
		}
		return -1;
	}

	@Override
	public int lastIndexOf(T ele) {
		Node node = this.last;
		for (int i = size - 1; i >= 0; i--) {
			if (node.element.equals(ele)) {
				// 说明找到了元素
				return i;
			}
			node = node.previous;
		}
		return -1;
	}

	@Override
	public boolean equals(LSList<?> other) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void sort() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sort(LSComparator<T> c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reverse() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * 通过元素找节点
	 * @param ele
	 * @return
	 */
	private Node getNode(T ele) {
		Node node = this.first;
		while (node != null) {
			if (node.element.equals(ele))
				break;
			node = node.next;
		}
		return node;
	}
	
	
}
