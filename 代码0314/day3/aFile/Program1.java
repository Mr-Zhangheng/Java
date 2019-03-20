package com.qianfeng.week4.day3.aFile;

// �ļ�������IO�����֣���Ҫ���������
import java.io.*;
import java.util.Date;

public class Program1 {
	public static void main(String[] args) {
		// ����ж��·��ƴ�ӣ��ָ���Щ·��ʹ��
		// ���磺��������
		System.out.println(File.pathSeparator);
		System.out.println(File.pathSeparatorChar);
		
		// �ָ��㼶��ϵ��·���ָ���	\
		// C:\Users\Administrator\Desktop
		System.out.println(File.separator);
		System.out.println(File.separatorChar);
		
		
		
		// File�ࣺ��һ���ļ���Ŀ¼�ĳ�ȡ��
		File file = new File("C:\\Users\\luds\\Desktop\\��ҵ��.txt");
		// File file = new File("C:\\Users\\luds\\Desktop", "jdk api 1.8_google");
		
		// ָ����·������û���ļ����У��Ĵ��ڡ�
		System.out.println(file.exists());
		// �ж�ָ��·���������ǲ���һ���ļ�
		System.out.println(file.isFile());
		// �ж�ָ��·���������ǲ���һ���ļ���
		System.out.println(file.isDirectory());
		
		// ����ָ�����ļ���
		// ����ʧ�ܣ�
		// 1. ָ��·�����Ѿ���һ��ͬ�����ļ�(��)���ڡ�
		// 2. �����༶Ŀ¼�ǲ�֧�ֵġ�
		// System.out.println(file.mkdir());
		// ���Դ����༶Ŀ¼
		// System.out.println(file.mkdirs());
		
		
		try {
			// ��ָ����·���´���һ���ļ�
			System.out.println(file.createNewFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		System.out.println(file.isHidden());			// �ж�һ���ļ��Ƿ������ص�
		System.out.println(file.canRead());				// �ж�һ���ļ��Ƿ��ǿɶ���
		System.out.println(file.canWrite());			// �ж�һ���ļ��Ƿ��ǿ�д��
		System.out.println(file.canExecute());			// �ж�һ���ļ��Ƿ��ǿ�ִ�е�
		
		System.out.println(file.length());				// ��ȡһ���ļ��Ĵ�С���ֽڣ�
		
		
		System.out.println(file.getName());				// ��ȡ�ļ���
		System.out.println(file.getPath());				// ��ȡ·��
		System.out.println(file.getAbsolutePath());		// ��ȡһ���ļ��ľ���·��
		
		System.out.println(file.getParent());			// ��ȡ��һ����·��
		System.out.println(file.getParentFile());		// ��ȡ��һ���ļ�
		
		System.out.println(file.lastModified());		// ��ȡ����޸ĵ�ʱ��
		System.out.println(new Date(file.lastModified()));
		
		
		
		// System.out.println(file.setReadOnly());			// ��Ϊֻ��
		System.out.println(file.setReadable(true));		
		System.out.println(file.setWritable(false));
		
		// ���󣺰�����ļ�����Ϊ exercise.txt�������浽ͬ����Ŀ¼��
		// System.out.println(file.renameTo(new File("exercise.txt")));
		// System.out.println(new File("exercise.txt").getAbsolutePath());
		// System.out.println(file.renameTo(new File(file.getParent(), "exercise.txt")));
		
		// ɾ���ļ�����ע�����ɾ���ļ�����ֱ�ӽ�����ļ��Ӵ���ɾ������������վ��
		file.delete();
		
		
		
		/*
		String[] names = {"��ǿ", "����", "����", "��г", "����", "ƽ��", "����", "����", "����", "��ҵ", "����", "����"};
		
		String path = "";
		for (String name : names) {
			path += name + "\\";
		}
		
		new File("C:\\Users\\luds\\Desktop", path).mkdirs();
		*/
		
	}
}
