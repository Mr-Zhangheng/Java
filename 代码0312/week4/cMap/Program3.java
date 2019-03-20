package com.qianfeng.week4.cMap;

import java.util.LinkedHashMap;

public class Program3 {
	public static void main(String[] args) {
		// LinkedHashMap
		// 底层实现：链表
		// 有序的
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		
		map.put("name", "xiaoming");
		map.put("age", "10");
		map.put("gender", "unknown");
		map.put("height", "180");
		map.put("weight", "180");
		
		System.out.println(map);
	}
}
