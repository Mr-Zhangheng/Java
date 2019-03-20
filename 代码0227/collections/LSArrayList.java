package com.luds.collections;

import java.util.*;

/**
 * 仿ArrayList实现的一个容器，可实现数据的增删改查功能
 * @author luds
 */
public class LSArrayList<T> implements LSList<T> {
	/**
	 * 真正用来存储数据的容器，底层实现是数组
	 */
	private Object[] dataElements = {};
	
	
	/**
	 * 集合中数据的数量
	 * @return
	 */
	public int size() {
		return dataElements.length;
	}
	
	/**
	 * 集合元素数量自增
	 * @param capcity
	 */
	private void growUp(int capcity) {
		// 将原数组中的元素拷贝到新的数组中, 并重新指向
		dataElements = Arrays.copyOf(dataElements, size() + capcity);
	}
	
	/**
	 * 在数组最后位添加一个新的元素
	 * @param ele
	 */
	@Override
	public void add(T ele) {
		// 1. 数组容量+1
		growUp(1);
		// 2. 在最后位添加新的元素
		dataElements[size() - 1] = ele;
	}
	
	/**
	 * 在数组指定位添加一个新的元素
	 * @param index
	 * @param ele
	 */
	@Override
	public void add(int index, T ele) {
		// 1. 数组长度自增1
		growUp(1);
		// 2. 将index之后部分向后挪动一位
		System.arraycopy(dataElements, index, dataElements, index+1, size() - 1 - index);
		// 3. 将要添加的元素添加到指定位置
		dataElements[index] = ele;
	}
	
	/**
	 * 批量添加元素
	 * @param ele
	 */
	@Override
	public void addRange(T[] ele) {
		// 1. 数组长度自增
		growUp(ele.length);
		// 2. 后续拷贝
		System.arraycopy(ele, 0, dataElements, size() - ele.length, ele.length);
	}
	
	/**
	 * 在指定的位置批量插入元素
	 * @param index
	 * @param ele
	 */
	@Override
	public void addRange(int index, T[] ele) {
		// 1. 数组长度自增
		growUp(ele.length);
		// 2. 元素拷贝
		System.arraycopy(dataElements, index, dataElements, index + ele.length, size() - index - ele.length);
		System.arraycopy(ele, 0, dataElements, index, ele.length);
	}
	
	
	/**
	 * 删除元素
	 * @param ele
	 * @return
	 */
	@Override
	public T remove(T ele) {
		// 1. 判断是否包含指定元素
		int index = indexOf(ele);
		if (index == -1)
			return null;
		// 2. 删除元素
		return removeAt(index);
	}
	
	/**
	 * 删除指定下标的元素
	 * @param index
	 * @return
	 */
	@Override
	public T removeAt(int index) {
		// 1. 获取要删除的元素
		T ele = get(index);
		// 2. 删除元素
		System.arraycopy(dataElements, index + 1, dataElements, index, size() - index - 1);
		dataElements = Arrays.copyOf(dataElements, size() - 1);
		
		return ele;
	}
	
	@Override
	/**
	 * 删除[fromIndex, toIndex)的元素
	 */
	public int removeRange(int fromIndex, int toIndex) {
		// 边界处理
		if (toIndex >= size())
			toIndex = size();
		
		// 计算删除数量
		int count = toIndex - fromIndex;
		
		// 将toIndex后面的元素往前提
		System.arraycopy(dataElements, toIndex, dataElements, fromIndex, size() - toIndex);
		dataElements = Arrays.copyOf(dataElements, size() - count);
		
		return count;
	}

	@Override
	/**
	 * 清除所有元素
	 */
	public void clear() {
		// 删除全部
		dataElements = new Object[0];
	}
	
	
	/**
	 * 判断是否包含指定元素
	 * @param ele
	 * @return
	 */
	@Override
	public boolean contains(T ele) {
		return indexOf(ele) >= 0;
	}
	
	
	
	
	
	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		return (T)dataElements[index];
	}

	@SuppressWarnings("unchecked")
	@Override
	public LSList<T> getRange(int fromIndex, int toIndex) {

		T[] elements = (T[])Arrays.copyOfRange(dataElements, fromIndex, toIndex);
		
		LSArrayList<T> ret = new LSArrayList<>();
		ret.addRange(elements);
		
		return ret;
	}
	

	@Override
	/**
	 * 修改指定位的元素
	 */
	public T set(int index, T ele) {
		// 先获取这一位的元素
		T obj = get(index);
		// 替换
		dataElements[index] = ele;
		
		return obj;
	}

	@Override
	/**
	 * 批量替换
	 */
	public void setRange(int fromIndex, int toIndex, T[] ele) {
		// 1. 边界判断
		if (toIndex >= size())
			toIndex = size() - 1;
		// 2. 删除指定部分的元素
		removeRange(fromIndex, toIndex);
		// 3. 将指定元素插入到指定下标
		addRange(fromIndex, ele);
	}
	
	/**
	 * 获取元素存在的下标
	 * @param ele
	 * @return
	 */
	@Override
	public int indexOf(T ele) {
		for (int i = 0; i < dataElements.length; i++) {
			if (ele.equals(get(i))) {
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * 获取元素最后一次出现的下标
	 */
	@Override
	public int lastIndexOf(T ele) {
		
		for (int i = size() - 1; i >= 0; i--) {
			if (ele.equals(get(i))) {
				return i;
			}
		}
		
		return -1;
	}

	

	/**
	 * 判断两个集合中的元素是否相同
	 */
	@Override
	public boolean equals(LSList<?> other) {

		if (other == null) return false;
		if (this.size() != other.size()) return false;
		
		for (int index = 0; index < size(); index++) {
			if (!this.get(index).equals(other.get(index))) {
				return false;
			}
		}
		
		return true;
	}

	
	@Override
	public void sort() {
		Arrays.sort(dataElements);
	}

	@Override
	public void sort(LSComparator<T> c) {
		int length = size(), minIndex;
		T tmp;
		for (int i = 0; i < length - 1; i++) {
			minIndex = i;
			for (int j = i + 1; j < length; j++) {
				// 比较
				if (c.compare(get(minIndex), get(j)) > 0) {
					minIndex = j;
				}
			}
			// 交换
			tmp = get(i);
			set(i, get(minIndex));
			set(minIndex, tmp);
		}
	}
	
	/**
	 * 倒序
	 */
	@Override
	public void reverse() {
		Object tmp;
		int length = size();
		for (int i = 0; i < length / 2; i++) {
			tmp = dataElements[i];
			dataElements[i] = dataElements[length - i - 1];
			dataElements[length - i - 1] = tmp;
		}
	}

	@Override
	@SuppressWarnings("unchecked")
	public T[] toArray() {
		return (T[])dataElements;
	}
	
}
