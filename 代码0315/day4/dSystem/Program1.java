package com.qianfeng.week4.day4.dSystem;

import java.io.*;

public class Program1 {
	public static void main(String[] args) {
		// ��׼�����
		// �Ա�׼����������ض���
		
		
		PrintStream out = System.out;
	
		PrintStream ps = null;
		
		try {
			// ʵ����һ����ӡ��
			ps = new PrintStream(new BufferedOutputStream(new FileOutputStream("file\\out", true)));
			
			// �������ӡ������Ϊϵͳ��׼�����
			System.setOut(ps);
			
			
			// ��ʱ����������ʹ�� System.out.println(); ���������ʱ����ʵ�ǽ������������ָ�����ļ��С�
			System.out.println("hello world");
			
			System.out.println("��ã�����");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (ps != null) {
				ps.close();
			}
		}
		
		System.setOut(out);
		
		System.out.println("end");
	}
}
