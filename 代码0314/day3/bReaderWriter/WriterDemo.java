package com.qianfeng.week4.day3.bReaderWriter;

import java.io.*;

public class WriterDemo {
	public static void main(String[] args) {
		
		Writer writer = null;
		
		try {
			writer = new FileWriter("file\\result", true);
			
			writer.write("������磬����һ�����ַ������д������");
			
			writer.flush();
			
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
