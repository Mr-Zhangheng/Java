package com.qianfeng.week4.day3.aStream;

import java.io.*;

public class OutputStreamDemo {
	public static void main(String[] args) {
		// 输出：基本和输入是一样的
		// 声明一个输出流
		OutputStream os = null;
		
		try {
			// 1. 实例化一个文件字节输出流
			// 这种方式的实例化会覆盖掉之前的内容
			// os = new FileOutputStream("file\\result");
			// 这种方法的实例化会在原来内容的最后进行追加
			os = new FileOutputStream("file\\result", true);
			
			// 2. 将一段文本写到指定的文件中  hello world
			// os.write("hello world".getBytes());
			os.write("你好，世界".getBytes());
			
			// 3. 在进行写操作的时候，写入完成后，最好添加一个flush操作
			// 冲刷缓冲区：加速管道中的数据流通到文件中。
			os.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (os != null) {
				try {
					// 关闭流
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
