package com.qianfeng.week5.day1.cExam;

import java.io.File;

public class Program4 {
	
	public static void main(String[] args) {
		showJava(".");
	}
	
	public static void showJava(String path) {
		// 将一个路径的文件封装成File对象
		File file = new File(path);
		// 获取所有的子文件（夹）
		File[] files = file.listFiles();
		
		for (File f : files) {
			// 判断f是文件还是文件夹
			if (f.isFile()) {
				if (f.getName().endsWith(".java"))
					System.out.println(f.getName());
			}
			else {
				showJava(f.getAbsolutePath());
			}
		}
		
	}
}
