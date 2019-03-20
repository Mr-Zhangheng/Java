package com.qianfeng.week4.day4.bBufferedStream;

import java.io.*;

public class BufferedOutputStreamDemo {
	public static void main(String[] args) {
		
		// ʹ�û����ֽ��������д
		BufferedOutputStream bos = null;
		
		try {
			bos = new BufferedOutputStream(new FileOutputStream("file\\out"));
			
			bos.write("hello world".getBytes());
			
			bos.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bos != null) {
				try {
					bos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
	}
}
