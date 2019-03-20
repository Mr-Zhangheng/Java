package com.qianfeng.week4.day3.aFile;

import java.io.*;

public class Program2 {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\luds\\Desktop");
		
		// 获取一个路径下所有的文件（夹）（包括隐藏）
		// String[] files = file.list();
		
		// 获取一个路径下所有的文件（夹）（以File对象的形式）
		// File[] files = file.listFiles();
		/*
		String[] files = file.list(new FilenameFilter() {
			@Override
			// 过滤条件
			// File dir: 文件的父目录
			// String name: 文件的名字
			public boolean accept(File dir, String name) {
				// 获取所有的txt文件
				// return name.endsWith(".txt");
				// 获取所有的隐藏文件
				// return new File(dir, name).isHidden();
				// 获取所有的文件夹
				return new File(dir, name).isDirectory();
			}
		});
		*/
		
		File[] files = file.listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				// 列举出所有的txt文件
				// return pathname.getName().endsWith(".txt");
				// 列举所有的隐藏文件
				return pathname.isHidden();
			}
		});
		
		
		for (File f : files) {
			System.out.println(f);
		}
		
	}
	
}
