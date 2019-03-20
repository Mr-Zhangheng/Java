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
		// 1. 声明一个对象输入流
		ObjectInputStream ois = null;
		try {
			// 2. 实例化
			ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(path)));
			
			// 3. 读取指定路径下序列化的文件
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
	 * 序列化
	 * @param path
	 */
	public static void save(List<? super Dog> list, String path) {
		// 1. 声明一个对象输出流
		ObjectOutputStream oos = null;
		try {
			// 2. 实例化（使用一个字节输出流）
			oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(path)));
			
			// 3. 将一个对象的信息保存到本地
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
