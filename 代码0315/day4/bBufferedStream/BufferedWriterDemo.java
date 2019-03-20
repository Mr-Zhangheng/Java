package com.qianfeng.week4.day4.bBufferedStream;

import java.io.*;

public class BufferedWriterDemo {
	public static void main(String[] args) {
		
		
		BufferedWriter writer = null;
		
		try {
			writer = new BufferedWriter(new FileWriter("file\\out", true));
			
			
			writer.write("��ã�����");
			writer.flush();
			
			// дһ�У�дһ�����У�
			writer.newLine();
			writer.write("��ã�ʦ��");
			
			
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
