package com.qianfeng.week4.day4.bBufferedStream;

import java.io.*;

/**
 * ʹ�û����ֽ�������
 * @author luds
 */
public class BufferedInputStreamDemo {

	public static void main(String[] args) {
		
		// ���󣺶�ȡһ���ļ����ڴ��У����ڿ���̨�������
		// ����
		BufferedInputStream bis = null;
		
		try {
			// ʵ����
			bis = new BufferedInputStream(new FileInputStream(new File("file\\test")));
			
			// ���ڶ�ȡ
			byte[] contents = new byte[1024];
			
			int length = 0;
			
			while ((length = bis.read(contents)) != -1) {
				
				String str = new String(contents, 0, length);
				
				System.out.println(str);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// �ر���
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
