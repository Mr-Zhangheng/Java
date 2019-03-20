package com.qianfeng.week4.day2.exercise;

import java.util.*;

import com.qianfeng.week4.day2.exercise.DVD.Status;

/**
 * DVD 仓库
 * @author luds
 */
public class DVDRepo {
	private static DVDRepo instance ;
	public static DVDRepo getInstance() {
		if (instance == null)
			instance = new DVDRepo();
		return instance;
	}
	
	// 需要有一个容器，来存储所有的DVD
	private LinkedList<DVD> datas = new LinkedList<>();
	
	/**
	 * 增
	 * @param dvd
	 */
	public boolean add(DVD dvd) {
		// 1. 判断是否存在
		if (contains(dvd.getDvdName())) {
			return false;
		}
		// 2. 说明不存在这个名字的DVD
		return this.datas.add(dvd);
	}
	
	/**
	 * 删
	 * @param name
	 */
	public boolean remove(String name) {
		// 1. 先找到这个DVD
		DVD dvd = getDVD(name);
		
		if (dvd == null)
			// 说明不存在这个DVD
			return false;
		
		// 2. 说明存在这个DVD
		return this.datas.remove(dvd);
	}
	
	
	
	/**
	 * 通过一个名字来查找DVD
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
	 * 查询某一个名字的DVD是否存在
	 * @param name
	 * @return
	 */
	public boolean contains(String name) {
		return getDVD(name) != null;
	}
	
	
	/**
	 * 获取所有的元素
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














