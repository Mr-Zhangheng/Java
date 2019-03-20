package com.luds.collections;

/**
 * ˫����ʵ�ֵļ���
 * @author luds
 */
public class LSLinkedList<T> implements LSList<T> {
	/**
	 * �ڵ���
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
	// �׽ڵ�
	private Node first = null;
	// β�ڵ�
	private Node last = null;
	// �ڵ�����
	private int size = 0;
	
	/** 
	 * ����±�
	 */
	private boolean checkIndex(int index) throws IndexOutOfBoundsException {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		return true;
	}
	
	/**
	 * �ҵ�ָ���Ľڵ�
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
		// 1. ����һ���ڵ�
		Node node = new Node(ele);
		// 2. ���û���׽ڵ�
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
	 * �ڼ�����λ���Ԫ��
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
	 * ��ָ�����±����Ԫ��
	 */
	public void add(int index, T ele) {
		checkIndex(index);
		// 1. ��ȡָ���±�Ľڵ�
		Node node = getNode(index);
		// 2. ʵ����һ���µĽڵ�
		Node newNode = new Node(ele);
		// 3. �ض���
		
		// �ҵ�node����һ���ڵ�
		Node previous = node.previous;
		
		if (previous == null) {
			// ˵�����׽ڵ�
			this.first = newNode;
		}
		else {
			// ˵�������׽ڵ�
			previous.next = newNode;
			newNode.previous = previous;
		}
		
		newNode.next = node;
		node.previous = newNode;
		size++;
	}
	
	

	@Override
	/**
	 * �������Ԫ��
	 */
	public void addRange(T[] ele) {
		for (T e : ele) {
			add(e);
		}
	}

	@Override
	/**
	 * �������Ԫ��
	 */
	public void addRange(int index, T[] ele) {
		for (int i = 0; i < ele.length; i++) {
			add(index + i, ele[i]);
		}
	}

	@Override
	public T remove(T ele) {
		// 1. �ҵ����Ԫ�ض�Ӧ�Ľڵ�
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
		// 1. �ҵ�ָ���Ľڵ�
		Node node = getNode(index);
		// 2. ɾ���ڵ�
		removeNode(node);
		
		return null;
	}
	
	private void removeNode(Node node) {
		// �ҵ���һ���ڵ����һ���ڵ�
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
		// �ҵ�Ҫɾ���Ľڵ�������˵�
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
				// ˵���ҵ���ָ����Ԫ��
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
				// ˵���ҵ���Ԫ��
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
	 * ͨ��Ԫ���ҽڵ�
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
