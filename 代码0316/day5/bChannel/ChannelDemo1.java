package com.qianfeng.week4.day5.bChannel;

import java.nio.*;
import java.nio.channels.*;
import java.nio.channels.FileChannel.MapMode;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.io.*;

public class ChannelDemo1 {
	public static void main(String[] args) throws IOException {
		// ���󣺸����ļ���
		
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
		
		// ͨ��֮������ݴ���
		// inChannel.transferTo(0, inChannel.size(), outChannel);
		outChannel.transferFrom(inChannel, 0, inChannel.size());
		
		
		inChannel.close();
		outChannel.close();
		
	}
	
	
	/**
	 * 2. ʹ��Channel�ṩ��һ����̬����open()
	 * @throws IOException 
	 */
	public static void channel2() throws IOException {
		// ��ȡһ��������ȡ�ļ����ݵ�ͨ��
		// Path: ��������һ���ļ���·����Paths.get()
		FileChannel inChannel = FileChannel.open(Paths.get("C:\\Users\\luds\\Desktop\\1.mp4"), StandardOpenOption.READ);
		FileChannel outChannel = FileChannel.open(Paths.get("C:\\Users\\luds\\Desktop\\3.mp4"), StandardOpenOption.WRITE, StandardOpenOption.READ, StandardOpenOption.CREATE);
		
	
		// ʹ��ֱ�ӻ�������
		// �ڴ�ӳ���ļ���
		MappedByteBuffer inBuffer = inChannel.map(MapMode.READ_ONLY, 0, inChannel.size());
		MappedByteBuffer outBuffer = outChannel.map(MapMode.READ_WRITE, 0, inChannel.size());
		
		
		// ֱ�ӻ��������ݵĶ�д
		byte[] dst = new byte[inBuffer.limit()];
		inBuffer.get(dst);
		outBuffer.put(dst);
		
		inChannel.close();
		outChannel.close();
	}
	
	
	
	
	
	/**
	 * 1. ʹ��֧��ͨ������
	 */
	public static void channel1() {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		FileChannel inChannel = null;
		FileChannel outChannel = null;
		
		try {
			fis = new FileInputStream("C:\\Users\\luds\\Desktop\\1.mp4");
			fos = new FileOutputStream("C:\\Users\\luds\\Desktop\\2.mp4");
			
			// ��ȡͨ��
			inChannel = fis.getChannel();
			outChannel = fos.getChannel();
			
			// 1. ��ȡ������
			ByteBuffer buffer = ByteBuffer.allocate(1024);
			
			// 2. ��ͨ���е����ݶ�ȡ�����������������-1˵����ȡ����
			while (inChannel.read(buffer) != -1) {
				// ��buffer�л��ɶ�ģʽ
				buffer.flip();
				// 3. ���������е�����д����
				outChannel.write(buffer);
				// 4. ��ջ�����������
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
