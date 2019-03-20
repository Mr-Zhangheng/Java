package com.qianfeng.week4.aList;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Vector
 * @author luds
 */
public class VectorDemo {
	public static void main(String[] args) {
		Vector<Integer> list = new Vector<>();
		
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		
		Enumeration<Integer> enumera = list.elements();
		
		while (enumera.hasMoreElements()) {
			System.out.println(enumera.nextElement());
		}
		
		
		
		
		/*
		Object[] objs = new Object[15];
		list.copyInto(objs);

		
		for (Object obj : objs) {
			System.out.println(obj);
		}
		*/
		
	}
}
