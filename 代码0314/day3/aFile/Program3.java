package com.qianfeng.week4.day3.aFile;

import java.io.File;
import java.io.IOException;

public class Program3 {
	public static void main(String[] args) throws IOException {
		// 相对路径和绝对路径
		// 绝对路径：指的是一个文件在磁盘上，从根目录开始的路径
		// C:\\Users\\luds\\Desktop\\练习题.txt
		// /etc/profile/xx
		// 相对路径：指的是一个文件相对于某一个给定的文件夹的路径
		// 默认：相对于项目路径 
		// . : 当前路径
		// ..: 上一级路径
		File file = new File("src\\com\\qianfeng\\week4\\day3\\aFile");

		String[] files = file.list();
		for (String f : files) {
			System.out.println(f);
		}
		
		
		System.out.println(file.getPath());				// 获取相对路径
		System.out.println(file.getAbsolutePath());		// 获取绝对路径
	}
}
