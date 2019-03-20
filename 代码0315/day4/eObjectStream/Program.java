package com.qianfeng.week4.day4.eObjectStream;

import java.io.*;

/**
 * NotSerializableException
 * ��ʹ�ö����������л�����ʱ�����������������쳣��ԭ��ֻ��һ���� 
 * Ҫ���л��Ķ��󣬲�֧�����л�������
 * ��ν����
 * �ö�Ӧ����ʵ�� Serializable�ӿ�
 */

public class Program {
	public static void main(String[] args) {
		// ʵ����һ��Person����
//		Person xiaoming = new Person("xiaoming", 10, '��', 172.5f, 80.2f);
//		xiaoming.pet = new Dog("hashiqi", 2);
//		xiaoming.pet.gender = Gender.Male;
		// ����: ��xiaoming����������Ϣ���浽���أ�
		// ʹ��ObjectStream
//		save(xiaoming, "file\\xiaoming");
		
		 Person xiaoming = load("file\\xiaoming");
		 System.out.println(xiaoming);
	}
	
	/**
	 * �����л�
	 * @param path
	 * @return
	 */
	public static Person load(String path) {
		// 1. ����һ������������
		ObjectInputStream ois = null;
		try {
			// 2. ʵ����
			ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(path)));
			
			// 3. ��ȡָ��·�������л����ļ�
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
	 * ���л�
	 * @param path
	 */
	public static void save(Person person, String path) {
		// 1. ����һ�����������
		ObjectOutputStream oos = null;
		try {
			// 2. ʵ������ʹ��һ���ֽ��������
			oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(path)));
			
			// 3. ��һ���������Ϣ���浽����
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
