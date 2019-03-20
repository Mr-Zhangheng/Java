package com.qianfeng.week4.day3.aStream;

import java.io.*;

/**
 * 综合读写进行一个文件的复制
 * @author luds
 */
public class InputOutputStreamDemo {
	public static void main(String[] args) {
		CopyResult result = copy("C:\\Users\\luds\\Desktop\\颈椎操.avi", "C:\\Users\\luds\\Desktop\\颈椎操2.avi");
		System.out.println(result.message());
	}
	
	/**
	 * 
	 * @param source
	 * @param destination
	 * @return
	 */
	public static CopyResult copy(String source, String destination) {
		// 拷贝的思路：使用字节输入流一点点的读取源文件，每次读取到一部分，就将读取的内容写入到目标文件中。
		InputStream is = null;
		OutputStream os = null;
		
		try {
			// 实例化一个源文件和目标文件
			File sourceFile = new File(source);
			File targetFile = new File(destination);
			
			// 1. 判断源文件和目标文件是否存在
			if (sourceFile.exists() == false) 
				return CopyResult.FileNotFound;
			if (targetFile.exists())
				return CopyResult.TargetExists;
			
			// 2. 实例化相应的流
			is = new FileInputStream(sourceFile);
			os = new FileOutputStream(targetFile);
			
			// 3. 循环读取数据
			byte[] contents = new byte[1024];
			
			// 4. 用来记录每次读取数据长度的变量
			int length = 0;
			
			// 5. 循环读取数据
			while ((length = is.read(contents)) != -1) {
				
				// 将读取到的数据写到输出流中
				// os.write(contents, 0, length);
				os.write(contents);
				
				// 冲刷
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
	Success("拷贝成功"),
	FileNotFound("源文件不存在"),
	TargetExists("目标文件已经存在"),
	ProcessError("拷贝过程出错");
	
	private String message;
	
	private CopyResult(String msg) {
		this.message = msg;
	}
	
	public String message() {
		return this.message;
	}
}
