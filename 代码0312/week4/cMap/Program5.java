package com.qianfeng.week4.cMap;

import java.util.*;

/**
 * TreeMap,ÁªÏµTreeSet
 */
public class Program5 {
	public static void main(String[] args) {
		
//		TreeMap<String, String> map = new TreeMap<>();
		TreeMap<String, String> map = new TreeMap<>((str1, str2) -> str2.compareTo(str1));
		
		map.put("name", "xiaobai");
		map.put("age", "10");
		map.put("owner", "xiaoxin");
		map.put("color", "white");
		map.put("height", "50cm");
		
		// name, age, owner, color
		// 
		System.out.println(map);		
	}
}
