package com.qianfeng.week4.day5.aBuffer;

import java.nio.*;

public class BufferDemo3 {
	public static void main(String[] args) {
		// 获取一个直接缓冲区
		ByteBuffer buffer = ByteBuffer.allocateDirect(1024);
		
		// 验证一个缓冲区是不是直接缓冲区
		System.out.println(buffer.isDirect());
	}
}
