package com.qianfeng.week4.day4.bBufferedStream;

import java.io.*;

public class BufferedWriterDemo {
	public static void main(String[] args) {
		
		
		BufferedWriter writer = null;
		
		try {
			writer = new BufferedWriter(new FileWriter("file\\out", true));
			
			
			writer.write("你好，世界");
			writer.flush();
			
			// 写一行（写一个换行）
			writer.newLine();
			writer.write("你好，师姐");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
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
