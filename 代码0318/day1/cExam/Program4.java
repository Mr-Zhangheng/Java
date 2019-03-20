package com.qianfeng.week5.day1.cExam;

import java.io.File;

public class Program4 {
	
	public static void main(String[] args) {
		showJava(".");
	}
	
	public static void showJava(String path) {
		// ��һ��·�����ļ���װ��File����
		File file = new File(path);
		// ��ȡ���е����ļ����У�
		File[] files = file.listFiles();
		
		for (File f : files) {
			// �ж�f���ļ������ļ���
			if (f.isFile()) {
				if (f.getName().endsWith(".java"))
					System.out.println(f.getName());
			}
			else {
				showJava(f.getAbsolutePath());
			}
		}
		
	}
}
