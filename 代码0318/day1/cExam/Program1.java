package com.qianfeng.week5.day1.cExam;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Program1 {
	public static void main(String[] args) {
		FileTools.copy("", "");
		FileTools.cut("", "");
	}
}

class FileTools {
	
	public static void cut(String original, String target) {
		
		// ɾ��Դ�ļ�������Դ�ļ���ɾ��Դ�ļ��е�����
		
		BufferedReader reader = null;
		BufferedWriter writer = null;
		
		try {
			reader = new BufferedReader(new FileReader(original)) ;
			writer = new BufferedWriter(new FileWriter(target));
			
			String content = "";
			
			while ((content = reader.readLine()) != null) {
				writer.write(content);
				writer.flush();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		// ɾ��Դ�ļ�
		// new File(original).delete();
		
	}
	
	
	
	/**
	 * ʹ���ֽ������п���
	 * @param original
	 * @param target
	 */
	public static void copy(String original, String target) {
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			bis = new BufferedInputStream(new FileInputStream(original));
			bos = new BufferedOutputStream(new FileOutputStream(target));
			
			byte[] contents = new byte[1024];
			int length = 0;
			
			while ((length = bis.read(contents)) != -1) {
				bos.write(contents, 0, length);
				bos.flush();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			if (bis != null) {
				try {
					bis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (bos != null) {
				try {
					bos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
