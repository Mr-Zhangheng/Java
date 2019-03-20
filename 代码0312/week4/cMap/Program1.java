package com.qianfeng.week4.cMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Program1 {
	public static void main(String[] args) {
		// 按照HashMap来看Map接口中的方法
		Map<String, String> map = new HashMap<>();
		
		// 增、删、改、查
		map.put("name", "xiaoming");		// Key: name, Value: xiaoming
		map.put("age", "10");
		map.put("gender", null);
		map.put(null, null);
		
		map.put("name", "xiaobai");
		map.put(null, "hello world");
		
		// 通过键，删除指定的键值对
		map.remove("name");
		// 只有当键和值都匹配上，才可以删除
		map.remove("age", "12");
		// map.clear();
		
		// 通过键来修改值
		map.replace("age", "20");
		// 只有当键和值都匹配上，才进行修改
		map.replace("age", "11", "10");
		
	
		// 查
		// 通过键来获取值
		System.out.println(map.get("age"));
		// 通过键来查询值，如果查不到值（说明这个键值对不存在!），返回第二个参数中的值
		System.out.println(map.getOrDefault("name", "default name"));
		
		// 遍历
		// 获取由所有的键组成的一个Set集合
		Set<String> keys = map.keySet();
		
		for (String key : keys) {
			System.out.println(key + " = " + map.get(key));
		}
		
		// map.size();
		System.out.println(map.containsKey("age"));
		System.out.println(map.containsValue("20"));
		// 获取由所有的值组成的集合
		Collection<String> values = map.values();
		
		
		// 关于集合遍历：
		// entrySet: 获取由所有的Entry组成的一个集合
		// Entry: 是Map中的一个接口，其实现类是用来描述map集合中存储的键值对的。
		Set<Entry<String, String>> sets = map.entrySet();
		for (Entry<String, String> entry : sets) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
			
			// 需求：如果发现某一个值是null, 则改成"default"
			if (entry.getValue() == null) {
				entry.setValue("default");
			}
		}
		
	
		
		
		
		
		System.out.println(map);
		
	}
}
