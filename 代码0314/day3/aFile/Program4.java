package com.qianfeng.week4.day3.aFile;

import java.io.*;

public class Program4 {
	public static void main(String[] args) {
		// ���� ���һ���������ж�һ��·������û��ͼƬ��jpg/png/jpeg/bmp/����
		// ����У�������ǵľ���·����
		// ���û�У����û��ͼƬ
		// ���������·������һ���ļ��У���������ļ���
	}
	
	public static void check(String path) {
		// 1. ʵ����һ��File����
		File file = new File(path);
		// 2. �ж��ǲ����ļ���
		if (!file.exists()) {
			System.out.println("���·����ʲô��û�У�");
			return;
		}
		if (!file.isDirectory()) {
			System.out.println("�����ļ���");
			return;
		}
		// 3. �оٳ����е��ļ��������ж�
		// 3. �оٳ����������������ļ�
		/*File[] files = file.listFiles(f -> {
			// 1. ��ȡ�ļ�������
			String fileName = f.getName();
			// 2. �ж��Ƿ���ͼƬ
			// return fileName.endsWith("jpg") || fileName.endsWith("png") || fileName.endsWith("bmp") || fileName.endsWith("jpeg");
			// ����"^[^ ]+\\.(jpg|png|bmp|jpeg)$"
			return fileName.matches("^[^ ]+\\.(jpg|png|bmp|jpeg)$");
		});
		*/
		
		File[] files = file.listFiles(f -> f.getName().matches("^[^ ]+\\.(jpg|png|bmp|jpeg)$"));
	
		if (files.length == 0) {
			System.out.println("û��ͼƬ�ļ�");
		}
		else {
			for (File f : files) {
				System.out.println(f.getAbsolutePath());
			}
		}
	}
}
