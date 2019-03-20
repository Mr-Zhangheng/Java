package com.qianfeng.week4.day3.aFile;

import java.io.*;

public class Program4 {
	public static void main(String[] args) {
		// 需求： 设计一个方法，判断一个路径下有没有图片（jpg/png/jpeg/bmp/），
		// 如果有，输出他们的绝对路径。
		// 如果没有，输出没有图片
		// 如果给定的路径不是一个文件夹，输出不是文件夹
	}
	
	public static void check(String path) {
		// 1. 实例化一个File对象
		File file = new File(path);
		// 2. 判断是不是文件夹
		if (!file.exists()) {
			System.out.println("这个路径下什么都没有！");
			return;
		}
		if (!file.isDirectory()) {
			System.out.println("不是文件夹");
			return;
		}
		// 3. 列举出所有的文件，依次判断
		// 3. 列举出所有满足条件的文件
		/*File[] files = file.listFiles(f -> {
			// 1. 获取文件的名字
			String fileName = f.getName();
			// 2. 判断是否是图片
			// return fileName.endsWith("jpg") || fileName.endsWith("png") || fileName.endsWith("bmp") || fileName.endsWith("jpeg");
			// 正则："^[^ ]+\\.(jpg|png|bmp|jpeg)$"
			return fileName.matches("^[^ ]+\\.(jpg|png|bmp|jpeg)$");
		});
		*/
		
		File[] files = file.listFiles(f -> f.getName().matches("^[^ ]+\\.(jpg|png|bmp|jpeg)$"));
	
		if (files.length == 0) {
			System.out.println("没有图片文件");
		}
		else {
			for (File f : files) {
				System.out.println(f.getAbsolutePath());
			}
		}
	}
}
