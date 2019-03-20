package com.qianfeng.week4.day2.myCollections;

/**
 * 使用双链表实现一个集合
 * @author luds
 */
public class LSLinkedList<E> implements MyList<E> {
	
	// 链表中的节点
	class Node {
		// 这个节点存储的元素是谁
		E element;
		// 下一个节点
		Node next;
		// 上一个节点
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
	
	// 首节点
	public Node first;
	// 尾节点
	public Node last;
	// 记录这个链表中有多少个节点
	private int count = 0;
	
	

	/**
	 * 验证下标
	 * @param index
	 * @throws IndexOutOfBoundsException
	 */
	private void checkIndex(int index) throws IndexOutOfBoundsException {
		if (index < 0 || index >= this.size()) {
			throw new IndexOutOfBoundsException("下标超出范围：[0, " + (this.size() - 1) + "]");
		}
	}
	
	/**
	 * 通过下标，获取节点
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
		// 1. 创建一个新的节点
		Node node = new Node(ele);
		
		// 2. 判断当前链表是否为空链表
		if (this.size() == 0) {
			// 说明是空链表
			this.first = node;
			this.last = node;
		}
		else {
			// 说明当前链表不是空
			// 将这个新的节点挂到原来最后的节点之后
			this.last.next = node;
			node.previous = this.last;
			// 此时，这个node就是新的last
			this.last = node;
		}
		count++;
	}

	@Override
	public void add(int index, E ele) {
		// 1. 验证下标是否合法
		checkIndex(index);
		// 2. 实例化一个新的节点
		Node node = new Node(ele);
		// 3. 获取index位的节点
		Node target = getNode(index);
		
		// target.previous  node   target
		
		if (target.previous == null) {
			// 说明target现在是首节点
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
		// 1. 查询ele元素的下标
		int index = indexOf(ele);
		
		if (index == -1)
			return false;
		
		// 按照下标进行删除
		this.remove(index);
		
		return true;
	}

	@Override
	public E remove(int index) {
		
		checkIndex(index);
		
		// 1. 找到指定下标的节点
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
	// 删除[start, end)范围的元素
	public void removeRange(int start, int end) {
		// 思路：校验：start和end有没有越界
		// 1. 找到start节点和end节点
		// 2. 连接上start节点的上一个节点和end节点
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
		// 1. 判断下标
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
		// 从后往前遍历
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

		// 1. 实例化一个新的数组，长度为size()
		// 2. 遍历这个链表，依次将每一个元素都填充到数组中
		
		
		return null;
	}
	
}
