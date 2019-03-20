package com.luds.collections;

import java.util.*;

/**
 * ��ArrayListʵ�ֵ�һ����������ʵ�����ݵ���ɾ�Ĳ鹦��
 * @author luds
 */
public class LSArrayList<T> implements LSList<T> {
	/**
	 * ���������洢���ݵ��������ײ�ʵ��������
	 */
	private Object[] dataElements = {};
	
	
	/**
	 * ���������ݵ�����
	 * @return
	 */
	public int size() {
		return dataElements.length;
	}
	
	/**
	 * ����Ԫ����������
	 * @param capcity
	 */
	private void growUp(int capcity) {
		// ��ԭ�����е�Ԫ�ؿ������µ�������, ������ָ��
		dataElements = Arrays.copyOf(dataElements, size() + capcity);
	}
	
	/**
	 * ���������λ���һ���µ�Ԫ��
	 * @param ele
	 */
	@Override
	public void add(T ele) {
		// 1. ��������+1
		growUp(1);
		// 2. �����λ����µ�Ԫ��
		dataElements[size() - 1] = ele;
	}
	
	/**
	 * ������ָ��λ���һ���µ�Ԫ��
	 * @param index
	 * @param ele
	 */
	@Override
	public void add(int index, T ele) {
		// 1. ���鳤������1
		growUp(1);
		// 2. ��index֮�󲿷����Ų��һλ
		System.arraycopy(dataElements, index, dataElements, index+1, size() - 1 - index);
		// 3. ��Ҫ��ӵ�Ԫ����ӵ�ָ��λ��
		dataElements[index] = ele;
	}
	
	/**
	 * �������Ԫ��
	 * @param ele
	 */
	@Override
	public void addRange(T[] ele) {
		// 1. ���鳤������
		growUp(ele.length);
		// 2. ��������
		System.arraycopy(ele, 0, dataElements, size() - ele.length, ele.length);
	}
	
	/**
	 * ��ָ����λ����������Ԫ��
	 * @param index
	 * @param ele
	 */
	@Override
	public void addRange(int index, T[] ele) {
		// 1. ���鳤������
		growUp(ele.length);
		// 2. Ԫ�ؿ���
		System.arraycopy(dataElements, index, dataElements, index + ele.length, size() - index - ele.length);
		System.arraycopy(ele, 0, dataElements, index, ele.length);
	}
	
	
	/**
	 * ɾ��Ԫ��
	 * @param ele
	 * @return
	 */
	@Override
	public T remove(T ele) {
		// 1. �ж��Ƿ����ָ��Ԫ��
		int index = indexOf(ele);
		if (index == -1)
			return null;
		// 2. ɾ��Ԫ��
		return removeAt(index);
	}
	
	/**
	 * ɾ��ָ���±��Ԫ��
	 * @param index
	 * @return
	 */
	@Override
	public T removeAt(int index) {
		// 1. ��ȡҪɾ����Ԫ��
		T ele = get(index);
		// 2. ɾ��Ԫ��
		System.arraycopy(dataElements, index + 1, dataElements, index, size() - index - 1);
		dataElements = Arrays.copyOf(dataElements, size() - 1);
		
		return ele;
	}
	
	@Override
	/**
	 * ɾ��[fromIndex, toIndex)��Ԫ��
	 */
	public int removeRange(int fromIndex, int toIndex) {
		// �߽紦��
		if (toIndex >= size())
			toIndex = size();
		
		// ����ɾ������
		int count = toIndex - fromIndex;
		
		// ��toIndex�����Ԫ����ǰ��
		System.arraycopy(dataElements, toIndex, dataElements, fromIndex, size() - toIndex);
		dataElements = Arrays.copyOf(dataElements, size() - count);
		
		return count;
	}

	@Override
	/**
	 * �������Ԫ��
	 */
	public void clear() {
		// ɾ��ȫ��
		dataElements = new Object[0];
	}
	
	
	/**
	 * �ж��Ƿ����ָ��Ԫ��
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
	 * �޸�ָ��λ��Ԫ��
	 */
	public T set(int index, T ele) {
		// �Ȼ�ȡ��һλ��Ԫ��
		T obj = get(index);
		// �滻
		dataElements[index] = ele;
		
		return obj;
	}

	@Override
	/**
	 * �����滻
	 */
	public void setRange(int fromIndex, int toIndex, T[] ele) {
		// 1. �߽��ж�
		if (toIndex >= size())
			toIndex = size() - 1;
		// 2. ɾ��ָ�����ֵ�Ԫ��
		removeRange(fromIndex, toIndex);
		// 3. ��ָ��Ԫ�ز��뵽ָ���±�
		addRange(fromIndex, ele);
	}
	
	/**
	 * ��ȡԪ�ش��ڵ��±�
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
	 * ��ȡԪ�����һ�γ��ֵ��±�
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
	 * �ж����������е�Ԫ���Ƿ���ͬ
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
				// �Ƚ�
				if (c.compare(get(minIndex), get(j)) > 0) {
					minIndex = j;
				}
			}
			// ����
			tmp = get(i);
			set(i, get(minIndex));
			set(minIndex, tmp);
		}
	}
	
	/**
	 * ����
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
