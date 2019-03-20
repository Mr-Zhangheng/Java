package com.qianfeng.week4.cMap;

import java.util.HashMap;
import java.util.Map;

public class Program2 {
	public static void main(String[] args) {
		
		Map<Dog, String> map = new HashMap<>();
		map.put(new Dog("xiaobai", 10), "xiaobai");
		map.put(new Dog("xiaobai", 10), "xiaohei");
		
		System.out.println(map);
	}
}

class Dog {
	public String name;
	public int age;
	/**
	 * @param name
	 * @param age
	 */
	public Dog(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}