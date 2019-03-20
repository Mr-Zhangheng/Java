package com.qianfeng.week4.day2.myCollections;

/**
 * ʹ��˫����ʵ��һ������
 * @author luds
 */
public class LSLinkedList<E> implements MyList<E> {
	
	// �����еĽڵ�
	class Node {
		// ����ڵ�洢��Ԫ����˭
		E element;
		// ��һ���ڵ�
		Node next;
		// ��һ���ڵ�
		Node previous;
		
		public Node(E element) {
			this.element = element;
		}
		
		public Node(Node previous, E element, Node next) {
			this.previous = previous;
			this.element = element;
			this.next = next;
		}
	}
	
	// �׽ڵ�
	public Node first;
	// β�ڵ�
	public Node last;
	// ��¼����������ж��ٸ��ڵ�
	private int count = 0;
	
	

	/**
	 * ��֤�±�
	 * @param index
	 * @throws IndexOutOfBoundsException
	 */
	private void checkIndex(int index) throws IndexOutOfBoundsException {
		if (index < 0 || index >= this.size()) {
			throw new IndexOutOfBoundsException("�±곬����Χ��[0, " + (this.size() - 1) + "]");
		}
	}
	
	/**
	 * ͨ���±꣬��ȡ�ڵ�
	 * @param index
	 * @return
	 */
	private Node getNode(int index) {
		Node node = this.first;
		for (int i = 0; i < index; i++) {
			node = node.next;
		}
		return node;
	}
	
	@Override
	public void add(E ele) {
		// 1. ����һ���µĽڵ�
		Node node = new Node(ele);
		
		// 2. �жϵ�ǰ�����Ƿ�Ϊ������
		if (this.size() == 0) {
			// ˵���ǿ�����
			this.first = node;
			this.last = node;
		}
		else {
			// ˵����ǰ�����ǿ�
			// ������µĽڵ�ҵ�ԭ�����Ľڵ�֮��
			this.last.next = node;
			node.previous = this.last;
			// ��ʱ�����node�����µ�last
			this.last = node;
		}
		count++;
	}

	@Override
	public void add(int index, E ele) {
		// 1. ��֤�±��Ƿ�Ϸ�
		checkIndex(index);
		// 2. ʵ����һ���µĽڵ�
		Node node = new Node(ele);
		// 3. ��ȡindexλ�Ľڵ�
		Node target = getNode(index);
		
		// target.previous  node   target
		
		if (target.previous == null) {
			// ˵��target�������׽ڵ�
			this.first = node;
		}
		else {
			target.previous.next = node;
			node.previous = target.previous;
		}
		
		node.next = target;
		target.previous = node;
		
		count++;
	}

	@Override
	public void addAll(MyList<? super E> list) {
		for (int i = 0; i < list.size(); i++) {
			this.add((E)list.get(i));
		}
	}

	@Override
	public void addAll(int index, MyList<? super E> list) {
		
		checkIndex(index);
		
		for (int i = 0; i < list.size(); i++) {
			this.add(index++, (E)list.get(i));
		}
	}

	@Override
	public boolean remove(E ele) {
		// 1. ��ѯeleԪ�ص��±�
		int index = indexOf(ele);
		
		if (index == -1)
			return false;
		
		// �����±����ɾ��
		this.remove(index);
		
		return true;
	}

	@Override
	public E remove(int index) {
		
		checkIndex(index);
		
		// 1. �ҵ�ָ���±�Ľڵ�
		Node target = getNode(index);
		
		if (target == this.first) {
			this.first = target.next;
			this.first.previous = null;
		}
		else if (target == this.last) {
			this.last = target.previous;
			this.last.next = null;
		}
		else {
			target.previous.next = target.next;
			target.next.previous = target.previous;
		}
		
		count--;
		
		return target.element;
	}

	@Override
	// ɾ��[start, end)��Χ��Ԫ��
	public void removeRange(int start, int end) {
		// ˼·��У�飺start��end��û��Խ��
		// 1. �ҵ�start�ڵ��end�ڵ�
		// 2. ������start�ڵ����һ���ڵ��end�ڵ�
		// count-
	}

	@Override
	public void clear() {
		count = 0;
		this.first = null;
		this.last = null;
	}

	@Override
	public E set(int index, E ele) {
		// 1. �ж��±�
		checkIndex(index);
		
		Node node = getNode(index);
		
		E temp = node.element;
		
		node.element = ele;
		
		return temp;
	}

	@Override
	public E get(int index) {
		return getNode(index).element;
	}

	@Override
	public int size() {
		return this.count;
	}

	@Override
	public int indexOf(E ele) {
		Node node = this.first;
		for (int i = 0; i < size(); i++, node = node.next) {
			if (node.element.equals(ele)) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public int lastIndexOf(E ele) {
		// �Ӻ���ǰ����
		return 0;
	}

	@Override
	public boolean contains(E ele) {
		return indexOf(ele) != -1;
	}

	@Override
	public boolean equals(MyList<? super E> list) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public String toString() {
		if (count == 0)
			return "[]";
		
		String result = "[";
		Node node = this.first;
		while (node != null) {
			result += node.element + ", ";
			node = node.next;
		}
		
		// result += node.element + "]";
		
		return result.substring(0, result.length() - 2) + "]";
	}

	@Override
	public E[] toArray() {

		// 1. ʵ����һ���µ����飬����Ϊsize()
		// 2. ��������������ν�ÿһ��Ԫ�ض���䵽������
		
		
		return null;
	}
	
}
