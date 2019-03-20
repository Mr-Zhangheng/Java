package com.qianfeng.week4.day4.aExercise;

import java.io.*;

public class Program3 {

	// 设计一个方法，实现文件夹的拷贝
	public static void main(String[] args) {
		
		copyDir("C:\\Users\\luds\\Desktop\\大数据19期\\4.3", "C:\\Users\\luds\\Desktop\\4.3");
		
	}
	
	/**
	 * 实现文件夹的拷贝
	 * @param original
	 * @param target
	 */
	public static void copyDir(String original, String target) {
		// 1. 在指定的位置创建一个文件夹
		new File(target).mkdir();
		
		// 2. 获取当前文件夹下面所有的子文件（夹）
		File[] files = new File(original).listFiles();
		
		// 3. 遍历这个文件夹
		for (File f : files) {
			// 4. 判断是文件还是文件夹
			if (f.isFile()) {
				copyFile(f.getAbsolutePath(), target + File.separator + f.getName());
			}
			else {
				// 说明是文件夹
				copyDir(f.getAbsolutePath(), target + File.separator + f.getName());
			}
		}
	}
	
	/**
	 * 实现文件的拷贝
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
