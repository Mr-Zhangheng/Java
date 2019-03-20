package com.qianfeng.week4.day4.eObjectStream;

import java.io.*;

/**
 * NotSerializableException
 * 在使用对象流来序列化数据时候，如果遇到了上面的异常，原因只有一个： 
 * 要序列化的对象，不支持序列化操作。
 * 如何解决：
 * 让对应的类实现 Serializable接口
 */

public class Program {
	public static void main(String[] args) {
		// 实例化一个Person对象
//		Person xiaoming = new Person("xiaoming", 10, '男', 172.5f, 80.2f);
//		xiaoming.pet = new Dog("hashiqi", 2);
//		xiaoming.pet.gender = Gender.Male;
		// 需求: 将xiaoming这个对象的信息保存到本地，
		// 使用ObjectStream
//		save(xiaoming, "file\\xiaoming");
		
		 Person xiaoming = load("file\\xiaoming");
		 System.out.println(xiaoming);
	}
	
	/**
	 * 反序列化
	 * @param path
	 * @return
	 */
	public static Person load(String path) {
		// 1. 声明一个对象输入流
		ObjectInputStream ois = null;
		try {
			// 2. 实例化
			ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(path)));
			
			// 3. 读取指定路径下序列化的文件
			Object obj = ois.readObject();
			
			// 4. 
			if (obj instanceof Person) {
				return (Person)obj;
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
	public static void save(Person person, String path) {
		// 1. 声明一个对象输出流
		ObjectOutputStream oos = null;
		try {
			// 2. 实例化（使用一个字节输出流）
			oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(path)));
			
			// 3. 将一个对象的信息保存到本地
			oos.writeObject(person);
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
