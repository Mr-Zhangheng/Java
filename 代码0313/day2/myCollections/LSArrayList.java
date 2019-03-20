package com.qianfeng.week4.day2.myCollections;

import java.util.Arrays;

/**
 * 使用数组实现的集合，模拟ArrayList
 * @author luds
 *
 * @param <E>
 */
public class LSArrayList<E> implements MyList<E> {
	
	// 需要有一个数组，来进行元素的存储。
	private Object[] dataElements = {};
	
	
	/**
	 * 对数组进行扩容
	 * @param capicity 扩容的容量
	 */
	private void growUp(int capicity) {
		this.dataElements = Arrays.copyOf(this.dataElements, this.size() + capicity);
	}
	
	@Override
	public void add(E ele) {
		// 1. 对数组扩容1
		growUp(1);
		// 2. 将数组最后一位赋值为ele
		this.dataElements[this.size() - 1] = ele;
	}

	@Override
	public void add(int index, E ele) {
		// 1. 对数组扩容
		growUp(1);
		// 2. 将数组中的元素从index位开始依次向后移动1
		System.arraycopy(this.dataElements, index, this.dataElements, index + 1, this.size() - index - 1);
		// 3. 将数组的指定位设置为ele
		this.set(index, ele);
	}

	@Override
	public void addAll(MyList<? super E> list) {
		// 1. 对数组扩容
		growUp(list.size());
		// 2. 将list中的元素依次拷贝到当前的数组中
		System.arraycopy(list.toArray(), 0, this.dataElements, this.size() - list.size(), list.size());
	}

	@Override
	public void addAll(int index, MyList<? super E> list) {
		// 1. 扩容
		growUp(list.size());
		// 2. 将原数组从第index位开始，后面的每一个元素依次向后移动list.size()位
		System.arraycopy(this.dataElements, index, this.dataElements, index + list.size(), this.size() - list.size() - index);
		// 3. 将list中的元素依次拷贝到当前数组中
		System.arraycopy(list.toArray(), 0, this.dataElements, index, list.size());
	}

	@Override
	public boolean remove(E ele) {
		// 1. 先找下标
		int index = this.indexOf(ele);
		
		if (index == -1)
			return false;
		
		// 2. 删除
		this.remove(index);
		
		return true;
	}

	@Override
	public E remove(int index) {
		// 1. 获取删除之前的元素
		E element = this.get(index);
		
		// 2. 将数组从index+1位开始，后面所有的元素依次向前移动1位
		System.arraycopy(this.dataElements, index + 1, this.dataElements, index, this.size() - (index + 1));
		
		// 3. 
		growUp(-1);
	
		return element;
	}

	@Override
	// 删除的 [start, end) 范围的元素
	public void removeRange(int start, int end) {
		// 1. 计算删除的元素的数量
		// int count = end - start;
		// 2. 将从end位开始的元素依次向前移动count位
		System.arraycopy(this.dataElements, end, this.dataElements, start, this.size() - end);
		// 3. 负增长 
		growUp(start - end);
		
	}

	@Override
	public void clear() {
		this.dataElements = new Object[0];
	}

	@SuppressWarnings("unchecked")
	@Override
	public E set(int index, E ele) {
		Object original = this.dataElements[index];
		this.dataElements[index] = ele;
		return (E)original;
	}

	@Override
	@SuppressWarnings("unchecked")
	public E get(int index) {
		return (E)this.dataElements[index];
	}

	@Override
	public int size() {
		// 返回数组长度即可
		return this.dataElements.length;
	}

	@Override
	public int indexOf(E ele) {
		
		for (int i = 0; i < this.dataElements.length; i++) {
			if (this.dataElements[i].equals(ele))
				return i;
		}
		
		return -1;
	}
	
	@Override
	public int lastIndexOf(E ele) {
		for (int i = this.size() - 1; i >= 0; i--) {
			if (this.dataElements[i].equals(ele))
				return i;
		}
		
		return -1;
	}

	@Override
	public boolean contains(E ele) {
		return this.indexOf(ele) != -1;
	}

	@Override
	public boolean equals(MyList<? super E> list) {
		if (list == null)
			return false;
		if (list == this)
			return true;
		if (this.size() != list.size())
			return false;
		
		for (int i = 0; i < this.size(); i++) {
			if (this.get(i) != null && list.get(i) != null) {
				if (this.get(i).equals(list.get(i)) == false)
					return false;
			}
			else if (this.get(i) == null && list.get(i) == null) {
				
			}
			else {
				return false;
			}
		}
		
		return true;
	}
	
	// [1, 2, 3]
	@Override
	public String toString() {
		if (this.size() == 0)
			return "[]";
		
		String result = "[";
		for (Object ele : this.dataElements) {
			result += ele + ", ";
		}
		return result.substring(0, result.length() - 2) + "]";
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public E[] toArray() {
		return (E[])this.dataElements;
	}
}
