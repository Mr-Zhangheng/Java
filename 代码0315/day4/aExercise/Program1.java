package com.qianfeng.week4.day4.aExercise;

import java.io.*;

public class Program1 {
	public static void main(String[] args) {
		
		
		show("C:\\Users\\luds\\Desktop\\������19��\\4.3", 0);
		
	}
	
	// ɾ��һ���ļ����������е�mp3�ļ�
	public static void delete(String path) {
		
		// 1. ��ȡ���е�mp3�ļ�
		File[] files = new File(path).listFiles(f -> f.getName().endsWith(".mp3"));
		
		// 2. ����ɾ��
		for (File f : files) {
			f.delete();
		}
	}
	
	
	// ���һ���ļ����������е��ļ�
	public static void show(String path, int level) {
		// 1. ��ȡ�����·�������е��ļ����ļ��У�
		File[] files = new File(path).listFiles();
		
		String tab = "";
		for (int i = 0; i < level; i++) {
			tab += "|--";
		}
		
		
		// 2. �������е��ļ��������ж����ļ������ļ���
		for (File f : files) {
	
			// �������ļ������ļ��У�����Ҫ�������
			System.out.println(tab + f.getName());	
			// ������ļ��У�����еݹ���ã���ȥ����µ��ļ����е��ļ�
			if (f.isDirectory())
				show(f.getAbsolutePath(), level + 1);
		}
	}
	

	/**
	 * �ļ�����
	 * @param path1
	 * @param path2
	 */
	public static void cut(String path1, String path2) {
		new File(path1).renameTo(new File(path2));
	}
}
