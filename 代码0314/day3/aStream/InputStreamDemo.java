package com.qianfeng.week4.day3.aStream;

import java.io.*;

public class InputStreamDemo {
	public static void main(String[] args) {
		// ��ȡһ���ı��е����ݣ��������ڿ���̨�����
		
		// ������
		InputStream is = null;
		try {
			// ʵ����һ����
			// is = new FileInputStream(new File("file\\test"));
			is = new FileInputStream("file\\test");
			
			// InputStream: �ֽ������������������ֽ�Ϊ��λ
			// �ӹܵ��ж�ȡ���ݣ�
			
			// ʵ����һ�����飬�����洢ÿ�ζ�ȡ��������
			byte[] contents = new byte[100];
			// ������¼ÿ�ζ�ȡ���˶�������
			int length = 0;
			// ѭ����ȡ����ÿ�ζ�ȡ�������ݳ��ȸ�length��ֵ�����ж��Ƿ�Ϊ-1
			while ((length = is.read(contents)) != -1) {
				// ͨ��һ���ֽ�����ʵ����һ���ַ���
				String str = new String(contents, 0, length);
				System.out.print(str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// �ж��Ƿ�Ϊ�գ���Ϊ����ʼʵ������ʱ���ļ������ڣ���isʵ����ʧ�ܣ���ȻΪnull
			// ��ʱ�����is��null����ô��ȥ�رյ�ʱ�򣬾ͻ����NullPointerException
			if (is != null) {
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
