package com.qianfeng.week4.day3.aFile;

import java.io.File;
import java.io.IOException;

public class Program3 {
	public static void main(String[] args) throws IOException {
		// ���·���;���·��
		// ����·����ָ����һ���ļ��ڴ����ϣ��Ӹ�Ŀ¼��ʼ��·��
		// C:\\Users\\luds\\Desktop\\��ϰ��.txt
		// /etc/profile/xx
		// ���·����ָ����һ���ļ������ĳһ���������ļ��е�·��
		// Ĭ�ϣ��������Ŀ·�� 
		// . : ��ǰ·��
		// ..: ��һ��·��
		File file = new File("src\\com\\qianfeng\\week4\\day3\\aFile");

		String[] files = file.list();
		for (String f : files) {
			System.out.println(f);
		}
		
		
		System.out.println(file.getPath());				// ��ȡ���·��
		System.out.println(file.getAbsolutePath());		// ��ȡ����·��
	}
}
