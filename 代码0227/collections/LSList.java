package com.luds.collections;

/**
 * 集合接口
 * @author luds
 */
public interface LSList<T> {
	void add(T ele);
	void add(int index, T ele);
	void addRange(T[] ele);
	void addRange(int index, T[] ele);
	
	T remove(T ele);
	T removeAt(int index);
	int removeRange(int fromIndex, int toIndex);
	void clear();
	
	T set(int index, T ele);
	void setRange(int fromIndex, int toIndex, T[] ele);
	
	T get(int index);
	LSList<T> getRange(int fromIndex, int toIndex);
	
	int size();
	boolean contains(T ele);
	int indexOf(T ele);
	int lastIndexOf(T ele);
	boolean equals(LSList<?> other);
	
	void sort();
	void sort(LSComparator<T> c);
	
	void reverse();
	
	T[] toArray();
}
