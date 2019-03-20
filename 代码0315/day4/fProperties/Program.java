package com.qianfeng.week4.day4.fProperties;

import java.util.*;
import java.io.*;


public class Program {
	public static void main(String[] args) throws IOException {
		// ʵ����һ��Properties
		Properties properties = new Properties();
		
	
		// ��һ��ָ����properties�ļ��ж�ȡ����
		properties.load(new BufferedInputStream(new FileInputStream("file\\test.properties")));
		
		
		// ����properties
		Set<Object> keys = properties.keySet();
		for (Object k : keys) {
			System.out.println(k + " = " + properties.getProperty((String)k, "abc"));
		}
		
		
		/*
		// 
		properties.put("name", "xiaoming");
		// ��Properties�У�����ʹ����һ�ַ�ʽ����Ӽ�ֵ�ԡ�
		properties.setProperty("age", "20");
		properties.setProperty("height", "170");
		properties.setProperty("weight", "170");
		
		
		
		// ����ֵ�Դ洢��ָ�����ļ��С�
		properties.store(new BufferedOutputStream(new FileOutputStream("file\\test.properties")), "add key weight = 170");
	*/
		
		
	}
}
