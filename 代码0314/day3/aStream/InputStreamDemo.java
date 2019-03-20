package com.qianfeng.week4.day3.aStream;

import java.io.*;

public class InputStreamDemo {
	public static void main(String[] args) {
		// 读取一个文本中的内容，并将其在控制台做输出
		
		// 先声明
		InputStream is = null;
		try {
			// 实例化一个流
			// is = new FileInputStream(new File("file\\test"));
			is = new FileInputStream("file\\test");
			
			// InputStream: 字节输入流，数据是以字节为单位
			// 从管道中读取数据：
			
			// 实例化一个数组，用来存储每次读取到的数据
			byte[] contents = new byte[100];
			// 用来记录每次读取到了多少数据
			int length = 0;
			// 循环读取，将每次读取到的数据长度给length赋值，并判断是否为-1
			while ((length = is.read(contents)) != -1) {
				// 通过一个字节数组实例化一个字符串
				String str = new String(contents, 0, length);
				System.out.print(str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 判断是否为空，因为如果最开始实例化的时候，文件不存在，则is实例化失败，依然为null
			// 此时，如果is是null，那么再去关闭的时候，就会出现NullPointerException
			if (is != null) {
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
