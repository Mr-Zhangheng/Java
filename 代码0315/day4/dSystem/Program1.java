package com.qianfeng.week4.day4.dSystem;

import java.io.*;

public class Program1 {
	public static void main(String[] args) {
		// 标准输出流
		// 对标准输出流进行重定项
		
		
		PrintStream out = System.out;
	
		PrintStream ps = null;
		
		try {
			// 实例化一个打印流
			ps = new PrintStream(new BufferedOutputStream(new FileOutputStream("file\\out", true)));
			
			// 将这个打印流，作为系统标准输出流
			System.setOut(ps);
			
			
			// 此时，当我们再使用 System.out.println(); 这个方法的时候，其实是将内容输出到了指定的文件中。
			System.out.println("hello world");
			
			System.out.println("你好，世界");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (ps != null) {
				ps.close();
			}
		}
		
		System.setOut(out);
		
		System.out.println("end");
	}
}
