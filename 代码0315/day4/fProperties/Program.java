package com.qianfeng.week4.day4.fProperties;

import java.util.*;
import java.io.*;


public class Program {
	public static void main(String[] args) throws IOException {
		// 实例化一个Properties
		Properties properties = new Properties();
		
	
		// 从一个指定的properties文件中读取数据
		properties.load(new BufferedInputStream(new FileInputStream("file\\test.properties")));
		
		
		// 遍历properties
		Set<Object> keys = properties.keySet();
		for (Object k : keys) {
			System.out.println(k + " = " + properties.getProperty((String)k, "abc"));
		}
		
		
		/*
		// 
		properties.put("name", "xiaoming");
		// 在Properties中，建议使用这一种方式来添加键值对。
		properties.setProperty("age", "20");
		properties.setProperty("height", "170");
		properties.setProperty("weight", "170");
		
		
		
		// 将键值对存储到指定的文件中。
		properties.store(new BufferedOutputStream(new FileOutputStream("file\\test.properties")), "add key weight = 170");
	*/
		
		
	}
}
