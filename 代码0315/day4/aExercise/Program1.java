package com.qianfeng.week4.day4.aExercise;

import java.io.*;

public class Program1 {
	public static void main(String[] args) {
		
		
		show("C:\\Users\\luds\\Desktop\\大数据19期\\4.3", 0);
		
	}
	
	// 删除一个文件夹下面所有的mp3文件
	public static void delete(String path) {
		
		// 1. 获取所有的mp3文件
		File[] files = new File(path).listFiles(f -> f.getName().endsWith(".mp3"));
		
		// 2. 遍历删除
		for (File f : files) {
			f.delete();
		}
	}
	
	
	// 输出一个文件下下面所有的文件
	public static void show(String path, int level) {
		// 1. 获取到这个路径下所有的文件（文件夹）
		File[] files = new File(path).listFiles();
		
		String tab = "";
		for (int i = 0; i < level; i++) {
			tab += "|--";
		}
		
		
		// 2. 遍历所有的文件，依次判断是文件还是文件夹
		for (File f : files) {
	
			// 无论是文件还是文件夹，都需要输出名字
			System.out.println(tab + f.getName());	
			// 如果是文件夹，则进行递归调用，再去输出新的文件夹中的文件
			if (f.isDirectory())
				show(f.getAbsolutePath(), level + 1);
		}
	}
	

	/**
	 * 文件剪切
	 * @param path1
	 * @param path2
	 */
	public static void cut(String path1, String path2) {
		new File(path1).renameTo(new File(path2));
	}
}
