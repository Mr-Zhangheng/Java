package com.qianfeng.week4.day4.cTransfer;

import java.io.*;

/**
 * 字节字符转换输入流
 * @author luds
 */
public class InputStreamReaderDemo {

	public static void main(String[] args) {
		
		InputStreamReader reader = null;
		
		try {
			// utf8  unicode   gbk
			reader = new InputStreamReader(new FileInputStream("file\\test2"), "utf-8");
			
			char[] contents = new char[10];
			int length = 0;
			
			while((length = reader.read(contents)) != -1) {
				System.out.print(new String(contents, 0, length));
			}
			
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
