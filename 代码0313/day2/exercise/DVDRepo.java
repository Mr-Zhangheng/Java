package com.qianfeng.week4.day2.exercise;

import java.util.*;

import com.qianfeng.week4.day2.exercise.DVD.Status;

/**
 * DVD �ֿ�
 * @author luds
 */
public class DVDRepo {
	private static DVDRepo instance ;
	public static DVDRepo getInstance() {
		if (instance == null)
			instance = new DVDRepo();
		return instance;
	}
	
	// ��Ҫ��һ�����������洢���е�DVD
	private LinkedList<DVD> datas = new LinkedList<>();
	
	/**
	 * ��
	 * @param dvd
	 */
	public boolean add(DVD dvd) {
		// 1. �ж��Ƿ����
		if (contains(dvd.getDvdName())) {
			return false;
		}
		// 2. ˵��������������ֵ�DVD
		return this.datas.add(dvd);
	}
	
	/**
	 * ɾ
	 * @param name
	 */
	public boolean remove(String name) {
		// 1. ���ҵ����DVD
		DVD dvd = getDVD(name);
		
		if (dvd == null)
			// ˵�����������DVD
			return false;
		
		// 2. ˵���������DVD
		return this.datas.remove(dvd);
	}
	
	
	
	/**
	 * ͨ��һ������������DVD
	 * @param name
	 * @return
	 */
	public DVD getDVD(String name) {
		Iterator<DVD> it = this.datas.iterator();
		while (it.hasNext()) {
			DVD temp = it.next();
			if (temp.getDvdName().equals(name)) {
				return temp;
			}
		}
		return null;
	}
	
	/**
	 * ��ѯĳһ�����ֵ�DVD�Ƿ����
	 * @param name
	 * @return
	 */
	public boolean contains(String name) {
		return getDVD(name) != null;
	}
	
	
	/**
	 * ��ȡ���е�Ԫ��
	 * @return
	 */
	public DVD[] getAll(Query query) {
		
		LinkedList<DVD> temp = new LinkedList<>();
		
		
		this.datas.forEach(ele -> {
			
			if (ele.getStatus() == Status.Borrowed && query == Query.Borrowed) {
				temp.add(ele);
			}
			else if (ele.getStatus() == Status.UnBorrowed && query == Query.UnBorrowed) {
				temp.add(ele);
			}
			else if (query == Query.All) {
				temp.add(ele);
			}
		});
		
		return temp.toArray(new DVD[0]);
	}
	
}


enum Query {
	All,
	Borrowed,
	UnBorrowed
}














