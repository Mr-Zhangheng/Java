package com.qianfeng.week4.day4.dSystem;


import java.io.*;
import java.util.Scanner;

/**
 * 标准输入流
 * @author luds
 */
public class Program2 {
	public static void main(String[] args) throws IOException {
		// 实例化了一个字节输入流
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("file\\test"));
		// 手动定义System.in是什么
		System.setIn(bis);
		
		Scanner scanner = new Scanner(new File("file\\test"));
		
		// 循环读取：可以是用hasNextLine()进行判断是否有下一行数据
		while (scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
		}
		
		
		scanner.close();
			
	}
}
