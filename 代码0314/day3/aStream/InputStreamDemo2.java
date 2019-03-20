package com.qianfeng.week4.day3.aStream;

import java.io.*;

public class InputStreamDemo2 {
	public static void main(String[] args) {
		
		InputStream is = null;
		
		try {
			is = new FileInputStream("file\\test");
			
			// 字节数组
			// is.read() 读一个字节
			
			int content = 0;
			while ((content = is.read()) != -1) {
				System.out.println(content);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally  {
			if (is != null)
			{
				try {
					is.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}
