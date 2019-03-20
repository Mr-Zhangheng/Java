package com.qianfeng.week4.day3.aFile;

import java.io.*;

public class Program2 {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\luds\\Desktop");
		
		// ��ȡһ��·�������е��ļ����У����������أ�
		// String[] files = file.list();
		
		// ��ȡһ��·�������е��ļ����У�����File�������ʽ��
		// File[] files = file.listFiles();
		/*
		String[] files = file.list(new FilenameFilter() {
			@Override
			// ��������
			// File dir: �ļ��ĸ�Ŀ¼
			// String name: �ļ�������
			public boolean accept(File dir, String name) {
				// ��ȡ���е�txt�ļ�
				// return name.endsWith(".txt");
				// ��ȡ���е������ļ�
				// return new File(dir, name).isHidden();
				// ��ȡ���е��ļ���
				return new File(dir, name).isDirectory();
			}
		});
		*/
		
		File[] files = file.listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				// �оٳ����е�txt�ļ�
				// return pathname.getName().endsWith(".txt");
				// �о����е������ļ�
				return pathname.isHidden();
			}
		});
		
		
		for (File f : files) {
			System.out.println(f);
		}
		
	}
	
}
