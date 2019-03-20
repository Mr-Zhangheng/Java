package com.qianfeng.week4.day3.aStream;

import java.io.*;

public class OutputStreamDemo {
	public static void main(String[] args) {
		// �����������������һ����
		// ����һ�������
		OutputStream os = null;
		
		try {
			// 1. ʵ����һ���ļ��ֽ������
			// ���ַ�ʽ��ʵ�����Ḳ�ǵ�֮ǰ������
			// os = new FileOutputStream("file\\result");
			// ���ַ�����ʵ��������ԭ�����ݵ�������׷��
			os = new FileOutputStream("file\\result", true);
			
			// 2. ��һ���ı�д��ָ�����ļ���  hello world
			// os.write("hello world".getBytes());
			os.write("��ã�����".getBytes());
			
			// 3. �ڽ���д������ʱ��д����ɺ�������һ��flush����
			// ��ˢ�����������ٹܵ��е�������ͨ���ļ��С�
			os.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (os != null) {
				try {
					// �ر���
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
