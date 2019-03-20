package com.qianfeng.week4.day4.bBufferedStream;

import java.io.*;

public class BufferedReaderDemo {
	public static void main(String[] args) {
		
		// 
		BufferedReader reader = null;
		
		try {
			reader = new BufferedReader(new FileReader("file\\test"));
			
			/*
		 	String line = reader.readLine();
		 	System.out.println(line);
			*/
			
			String content;
			while ((content = reader.readLine()) != null) {
				System.out.println(content);
			}
			
			/*
			char[] contents = new char[10];
			
			int length = 0;
			
			while ((length = reader.read(contents)) != -1) {
				String str = new String(contents, 0, length);
				System.out.print(str);
			}*/
			
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
