package com.qianfeng.week4.day4.bBufferedStream;

import java.io.*;

/**
 * 使用缓冲字节输入流
 * @author luds
 */
public class BufferedInputStreamDemo {

	public static void main(String[] args) {
		
		// 需求：读取一个文件到内存中，并在控制台进行输出
		// 声明
		BufferedInputStream bis = null;
		
		try {
			// 实例化
			bis = new BufferedInputStream(new FileInputStream(new File("file\\test")));
			
			// 关于读取
			byte[] contents = new byte[1024];
			
			int length = 0;
			
			while ((length = bis.read(contents)) != -1) {
				
				String str = new String(contents, 0, length);
				
				System.out.println(str);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 关闭流
			if (bis != null) {
				try {
					bis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
