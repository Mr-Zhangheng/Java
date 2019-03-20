package com.qianfeng.week4.day5.c;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Program {
	public static void main(String[] args) throws IOException {
		// 
		FileChannel inChannel = FileChannel.open(Paths.get("file\\test"), StandardOpenOption.READ);
		
		// 将一个通道inChannal中的数据读取到多个缓冲区。
		ByteBuffer buffer1 = ByteBuffer.allocate(128);
		ByteBuffer buffer2 = ByteBuffer.allocate(128);
		
		ByteBuffer[] buffers = { buffer1, buffer2 };
		
		inChannel.read(buffers);
		
		for (ByteBuffer b : buffers) {
			b.flip();
		}
		System.out.println(new String(buffer1.array(), 0, buffer1.limit()));
		System.out.println("------------------------");
		System.out.println(new String(buffer2.array(), 0, buffer2.limit()));
		
		
		// 打开通道
		FileChannel outChannel = FileChannel.open(Paths.get("file\\test3"), StandardOpenOption.WRITE, StandardOpenOption.CREATE);
		// 聚合写入
		outChannel.write(buffers);
		
		
		
		
	}
}
