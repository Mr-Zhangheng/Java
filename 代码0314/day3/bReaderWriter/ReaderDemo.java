package com.qianfeng.week4.day3.bReaderWriter;

import java.io.*;

public class ReaderDemo {
	public static void main(String[] args) {
		
		Reader reader = null;
		
		try {
			// ʵ����һ���ַ�������
			reader = new FileReader("file\\test");
			
			// ʵ����һ���ַ����飬������ȡ�ı�
			char[] contents = new char[10];
			
			// ÿ�ζ�ȡ���˶��ٸ��ַ�
			int length = 0;
			
			while ((length = reader.read(contents)) != -1) {
				String str = new String(contents, 0, length);
				System.out.print(str);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
		
	}
}
