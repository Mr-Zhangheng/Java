package com.qianfeng.week4.day5.bChannel;

import java.nio.*;
import java.nio.channels.*;
import java.nio.channels.FileChannel.MapMode;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.io.*;

public class ChannelDemo1 {
	public static void main(String[] args) throws IOException {
		// 需求：复制文件。
		
		long time1 = System.currentTimeMillis();
		
		// channel1();		// 2191, 2459, 1675, 2383
		// channel2();		// 672, 556, 584, 563
		channel3();
		
		long time2 = System.currentTimeMillis();
		
		System.out.println(time2 - time1);
	}
	
	
	
	public static void channel3() throws IOException {
		FileChannel inChannel = FileChannel.open(Paths.get("C:\\Users\\luds\\Desktop\\1.mp4"), StandardOpenOption.READ);
		FileChannel outChannel = FileChannel.open(Paths.get("C:\\Users\\luds\\Desktop\\3.mp4"), StandardOpenOption.WRITE, StandardOpenOption.READ, StandardOpenOption.CREATE);
		
		// 通道之间的数据传输
		// inChannel.transferTo(0, inChannel.size(), outChannel);
		outChannel.transferFrom(inChannel, 0, inChannel.size());
		
		
		inChannel.close();
		outChannel.close();
		
	}
	
	
	/**
	 * 2. 使用Channel提供的一个静态方法open()
	 * @throws IOException 
	 */
	public static void channel2() throws IOException {
		// 获取一个用来读取文件内容的通道
		// Path: 用来描述一个文件的路径，Paths.get()
		FileChannel inChannel = FileChannel.open(Paths.get("C:\\Users\\luds\\Desktop\\1.mp4"), StandardOpenOption.READ);
		FileChannel outChannel = FileChannel.open(Paths.get("C:\\Users\\luds\\Desktop\\3.mp4"), StandardOpenOption.WRITE, StandardOpenOption.READ, StandardOpenOption.CREATE);
		
	
		// 使用直接缓冲区：
		// 内存映射文件：
		MappedByteBuffer inBuffer = inChannel.map(MapMode.READ_ONLY, 0, inChannel.size());
		MappedByteBuffer outBuffer = outChannel.map(MapMode.READ_WRITE, 0, inChannel.size());
		
		
		// 直接缓冲区数据的读写
		byte[] dst = new byte[inBuffer.limit()];
		inBuffer.get(dst);
		outBuffer.put(dst);
		
		inChannel.close();
		outChannel.close();
	}
	
	
	
	
	
	/**
	 * 1. 使用支持通道的类
	 */
	public static void channel1() {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		FileChannel inChannel = null;
		FileChannel outChannel = null;
		
		try {
			fis = new FileInputStream("C:\\Users\\luds\\Desktop\\1.mp4");
			fos = new FileOutputStream("C:\\Users\\luds\\Desktop\\2.mp4");
			
			// 获取通道
			inChannel = fis.getChannel();
			outChannel = fos.getChannel();
			
			// 1. 获取缓冲区
			ByteBuffer buffer = ByteBuffer.allocate(1024);
			
			// 2. 将通道中的数据读取到缓冲区，如果返回-1说明读取结束
			while (inChannel.read(buffer) != -1) {
				// 将buffer切换成读模式
				buffer.flip();
				// 3. 将缓冲区中的数据写出来
				outChannel.write(buffer);
				// 4. 清空缓冲区的数据
				buffer.clear();
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			if (inChannel != null) {
				try {
					inChannel.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (outChannel != null) {
				try {
					outChannel.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		 
	}

}
