package com.qianfeng.week4.day4.aExercise;

import java.io.*;

public class Program2 {
	public static void main(String[] args) {
		
	}
	
	/**
	 * 
	 * @param original
	 * @param target
	 */
	public static void copy(String original, String target) {
		
		Reader reader = null;
		Writer writer = null;
		
		try {
			reader = new FileReader(original);
			writer = new FileWriter(target);
			
			// 使用一个字符数组来读取数据
			char[] array = new char[10];
			
			int length = 0;
			
			while ((length = reader.read(array)) != -1) {
				writer.write(array, 0, length);
				writer.flush();
			}
			
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
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
