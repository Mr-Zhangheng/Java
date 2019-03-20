package com.qianfeng.week4.day3.aStream;

import java.io.*;

/**
 * �ۺ϶�д����һ���ļ��ĸ���
 * @author luds
 */
public class InputOutputStreamDemo {
	public static void main(String[] args) {
		CopyResult result = copy("C:\\Users\\luds\\Desktop\\��׵��.avi", "C:\\Users\\luds\\Desktop\\��׵��2.avi");
		System.out.println(result.message());
	}
	
	/**
	 * 
	 * @param source
	 * @param destination
	 * @return
	 */
	public static CopyResult copy(String source, String destination) {
		// ������˼·��ʹ���ֽ�������һ���Ķ�ȡԴ�ļ���ÿ�ζ�ȡ��һ���֣��ͽ���ȡ������д�뵽Ŀ���ļ��С�
		InputStream is = null;
		OutputStream os = null;
		
		try {
			// ʵ����һ��Դ�ļ���Ŀ���ļ�
			File sourceFile = new File(source);
			File targetFile = new File(destination);
			
			// 1. �ж�Դ�ļ���Ŀ���ļ��Ƿ����
			if (sourceFile.exists() == false) 
				return CopyResult.FileNotFound;
			if (targetFile.exists())
				return CopyResult.TargetExists;
			
			// 2. ʵ������Ӧ����
			is = new FileInputStream(sourceFile);
			os = new FileOutputStream(targetFile);
			
			// 3. ѭ����ȡ����
			byte[] contents = new byte[1024];
			
			// 4. ������¼ÿ�ζ�ȡ���ݳ��ȵı���
			int length = 0;
			
			// 5. ѭ����ȡ����
			while ((length = is.read(contents)) != -1) {
				
				// ����ȡ��������д���������
				// os.write(contents, 0, length);
				os.write(contents);
				
				// ��ˢ
				os.flush();
			}
			
			return CopyResult.Success;
		}
		catch (IOException e) {
			e.printStackTrace();
			return CopyResult.ProcessError;
		}
		finally {
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

enum CopyResult {
	Success("�����ɹ�"),
	FileNotFound("Դ�ļ�������"),
	TargetExists("Ŀ���ļ��Ѿ�����"),
	ProcessError("�������̳���");
	
	private String message;
	
	private CopyResult(String msg) {
		this.message = msg;
	}
	
	public String message() {
		return this.message;
	}
}
