package com.qianfeng.week4.day2.myCollections;

/**
 * �ӿڹ淶���������еļ������������������ķ�����
 * @author luds
 */
public interface MyList<E> {
	// ����ɾ���ġ���
	void add(E ele);
	void add(int index, E ele);
	void addAll(MyList<? super E> list);
	void addAll(int index, MyList<? super E> list);
	
	
	boolean remove(E ele);
	E remove(int index);
	void removeRange(int start, int end);
	void clear();
	
	E set(int index, E ele);
	E get(int index);
	
	int size();
	int indexOf(E ele);
	int lastIndexOf(E ele);
	boolean contains(E ele);
	boolean equals(MyList<? super E> list);
	String toString();
	
	E[] toArray();
}
