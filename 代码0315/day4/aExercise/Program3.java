package com.qianfeng.week4.day4.aExercise;

import java.io.*;

public class Program3 {

	// ���һ��������ʵ���ļ��еĿ���
	public static void main(String[] args) {
		
		copyDir("C:\\Users\\luds\\Desktop\\������19��\\4.3", "C:\\Users\\luds\\Desktop\\4.3");
		
	}
	
	/**
	 * ʵ���ļ��еĿ���
	 * @param original
	 * @param target
	 */
	public static void copyDir(String original, String target) {
		// 1. ��ָ����λ�ô���һ���ļ���
		new File(target).mkdir();
		
		// 2. ��ȡ��ǰ�ļ����������е����ļ����У�
		File[] files = new File(original).listFiles();
		
		// 3. ��������ļ���
		for (File f : files) {
			// 4. �ж����ļ������ļ���
			if (f.isFile()) {
				copyFile(f.getAbsolutePath(), target + File.separator + f.getName());
			}
			else {
				// ˵�����ļ���
				copyDir(f.getAbsolutePath(), target + File.separator + f.getName());
			}
		}
	}
	
	/**
	 * ʵ���ļ��Ŀ���
	 * @param source
	 * @param target
	 */
	public static void copyFile(String source, String target) {
		InputStream is = null;
		OutputStream os = null;
		
		try {
			is = new FileInputStream(source);
			os = new FileOutputStream(target);
			
			
			byte[] array = new byte[1024];
			int length = 0;
			
			while ((length = is.read(array)) != -1) {
				os.write(array, 0, length);
				os.flush();
			}
		} catch (IOException e) {
			
		} finally {
			if (is != null) {
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (os != null) {
				try {
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	
}
