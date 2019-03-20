package com.qianfeng.week4.day4.bBufferedStream;

import java.io.*;

public class BufferedInputStreamDemo2 {

	public static void main(String[] args) throws IOException {
		
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("file\\test"));
		

		byte[] contents = new byte[128];
		
		bis.mark(0);
		
		// ∂¡»°“ª¥Œ
		bis.read(contents);
		
		System.out.println(new String(contents));
		
		bis.reset();
		
		bis.read(contents);
		
		
		System.out.println(new String(contents));
		
		
		bis.close();
	}
}
