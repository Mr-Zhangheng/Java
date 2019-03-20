package com.qianfeng.week4.day4.eObjectStream;

import java.util.*;
import java.io.*;

public class Program2 {
	public static void main(String[] args) {
		
		
		LinkedList<Dog> list = new LinkedList<>();
		
		Collections.addAll(list, new Dog("hashiqi", 10), new Dog("wangcai", 12), new Dog("tairitian", 8), new Dog("alasijia", 7), new Dog("demu", 6));
		
		
		// save(list, "file\\list");
		
		System.out.println(load("file\\list"));
		
	}
	
	public static LinkedList<Dog> load(String path) {
		// 1. ����һ������������
		ObjectInputStream ois = null;
		try {
			// 2. ʵ����
			ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(path)));
			
			// 3. ��ȡָ��·�������л����ļ�
			Object obj = ois.readObject();
			
			// 4. 
			if (obj instanceof LinkedList) {
				return (LinkedList<Dog>)obj;
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		return null;
	}
	
	/**
	 * ���л�
	 * @param path
	 */
	public static void save(List<? super Dog> list, String path) {
		// 1. ����һ�����������
		ObjectOutputStream oos = null;
		try {
			// 2. ʵ������ʹ��һ���ֽ��������
			oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(path)));
			
			// 3. ��һ���������Ϣ���浽����
			oos.writeObject(list);
			oos.flush();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
