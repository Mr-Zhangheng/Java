package com.qianfeng.week4.day3.bReaderWriter;

import java.io.*;

public class ReaderDemo {
	public static void main(String[] args) {
		
		Reader reader = null;
		
		try {
			// 实例化一个字符输入流
			reader = new FileReader("file\\test");
			
			// 实例化一个字符数组，用来读取文本
			char[] contents = new char[10];
			
			// 每次读取到了多少个字符
			int length = 0;
			
			while ((length = reader.read(contents)) != -1) {
				String str = new String(contents, 0, length);
				System.out.print(str);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
		
	}
}
