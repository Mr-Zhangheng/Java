package com.qianfeng.week4.day5.aBuffer;

import java.nio.*;
/**
 * 关于缓冲区
 * @author luds
 */
public class BufferDemo1 {
	public static void main(String[] args) {
		// 缓冲区对象，不是通过new进行实例化获取的。而是通过类提供的一个静态方法来获取的。
		ByteBuffer buffer = ByteBuffer.allocate(1024);
		showInfo(buffer, "allocate");
		
		// 使用put方法，往缓冲区放数据
		buffer.put("hello".getBytes());
		showInfo(buffer, "put");
		
		// 切换成读模式
		buffer.flip();
		showInfo(buffer, "flip");
		
		// 读取数据
		byte[] dst = new byte[buffer.limit()];
		buffer.get(dst);
		showInfo(buffer, "get");
		
		// 重新读取
		buffer.rewind();
		showInfo(buffer, "rewind");
		
		// 清空缓冲区
		buffer.clear();
		showInfo(buffer, "clear");
		
		dst = new byte[5];
		buffer.get(dst);
		System.out.println(new String(dst));
	}
	
	private static void showInfo(ByteBuffer buffer, String operation) {
		System.out.println(operation + "()方法之后：");
		System.out.println("capacity: " + buffer.capacity());
		System.out.println("limit: " + buffer.limit());
		System.out.println("position: " + buffer.position());
		System.out.println("--------------------------------");
	}
}
