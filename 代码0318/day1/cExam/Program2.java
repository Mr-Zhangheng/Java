package com.qianfeng.week5.day1.cExam;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;

public class Program2 {
	
	
	public static void main(String[] args) {
		
		HashSet<Person> set = new HashSet<>();
		
		set.add(new Person("xiaoming", 10));
		set.add(new Person("xiaoli", 12));
		
		
		save(set, "");
		 
		HashSet<Person> result = load("");
		
		Iterator<Person> it = result.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	
	public static HashSet<Person> load(String path) {
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(path)));
			
			Object obj = ois.readObject();
			
			if (obj instanceof HashSet) {
				return (HashSet<Person>)obj;
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
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
	 * ´æ
	 * @param set
	 * @param path
	 */
	public static void save(HashSet<Person> set, String path) {
		ObjectOutputStream oos = null;
		
		try {
			oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(path)));
			
			oos.writeObject(set);
			oos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
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

class Person implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String name;
	public int id;

	/**
	 * @param name
	 * @param id
	 */
	public Person(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + "]";
	}
}
