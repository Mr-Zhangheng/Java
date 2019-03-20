package com.qianfeng.week4.day2.myCollections;

import java.util.Arrays;

/**
 * ʹ������ʵ�ֵļ��ϣ�ģ��ArrayList
 * @author luds
 *
 * @param <E>
 */
public class LSArrayList<E> implements MyList<E> {
	
	// ��Ҫ��һ�����飬������Ԫ�صĴ洢��
	private Object[] dataElements = {};
	
	
	/**
	 * �������������
	 * @param capicity ���ݵ�����
	 */
	private void growUp(int capicity) {
		this.dataElements = Arrays.copyOf(this.dataElements, this.size() + capicity);
	}
	
	@Override
	public void add(E ele) {
		// 1. ����������1
		growUp(1);
		// 2. ���������һλ��ֵΪele
		this.dataElements[this.size() - 1] = ele;
	}

	@Override
	public void add(int index, E ele) {
		// 1. ����������
		growUp(1);
		// 2. �������е�Ԫ�ش�indexλ��ʼ��������ƶ�1
		System.arraycopy(this.dataElements, index, this.dataElements, index + 1, this.size() - index - 1);
		// 3. �������ָ��λ����Ϊele
		this.set(index, ele);
	}

	@Override
	public void addAll(MyList<? super E> list) {
		// 1. ����������
		growUp(list.size());
		// 2. ��list�е�Ԫ�����ο�������ǰ��������
		System.arraycopy(list.toArray(), 0, this.dataElements, this.size() - list.size(), list.size());
	}

	@Override
	public void addAll(int index, MyList<? super E> list) {
		// 1. ����
		growUp(list.size());
		// 2. ��ԭ����ӵ�indexλ��ʼ�������ÿһ��Ԫ����������ƶ�list.size()λ
		System.arraycopy(this.dataElements, index, this.dataElements, index + list.size(), this.size() - list.size() - index);
		// 3. ��list�е�Ԫ�����ο�������ǰ������
		System.arraycopy(list.toArray(), 0, this.dataElements, index, list.size());
	}

	@Override
	public boolean remove(E ele) {
		// 1. �����±�
		int index = this.indexOf(ele);
		
		if (index == -1)
			return false;
		
		// 2. ɾ��
		this.remove(index);
		
		return true;
	}

	@Override
	public E remove(int index) {
		// 1. ��ȡɾ��֮ǰ��Ԫ��
		E element = this.get(index);
		
		// 2. �������index+1λ��ʼ���������е�Ԫ��������ǰ�ƶ�1λ
		System.arraycopy(this.dataElements, index + 1, this.dataElements, index, this.size() - (index + 1));
		
		// 3. 
		growUp(-1);
	
		return element;
	}

	@Override
	// ɾ���� [start, end) ��Χ��Ԫ��
	public void removeRange(int start, int end) {
		// 1. ����ɾ����Ԫ�ص�����
		// int count = end - start;
		// 2. ����endλ��ʼ��Ԫ��������ǰ�ƶ�countλ
		System.arraycopy(this.dataElements, end, this.dataElements, start, this.size() - end);
		// 3. ������ 
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
		// �������鳤�ȼ���
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
