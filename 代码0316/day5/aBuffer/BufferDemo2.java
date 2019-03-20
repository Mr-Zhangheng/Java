package com.qianfeng.week4.day5.aBuffer;

import java.nio.*;

public class BufferDemo2 {
	public static void main(String[] args) {
		ByteBuffer buffer = ByteBuffer.allocate(1024);
		
		System.out.println("allocate()方法之后：");
		System.out.println("capacity: " + buffer.capacity());
		System.out.println("limit: " + buffer.limit());
		System.out.println("position: " + buffer.position());
		System.out.println("--------------------------------");
		
		
		buffer.put("hello".getBytes());
		System.out.println("put()方法之后：");
		System.out.println("capacity: " + buffer.capacity());
		System.out.println("limit: " + buffer.limit());
		System.out.println("position: " + buffer.position());
		System.out.println("--------------------------------");
		
		// 切换成读模式
		buffer.flip();
		
		byte[] dst = new byte[2];
		buffer.get(dst);
		System.out.println(new String(dst));
		
		System.out.println("get()方法之后：");
		System.out.println("capacity: " + buffer.capacity());
		System.out.println("limit: " + buffer.limit());
		System.out.println("position: " + buffer.position());
		System.out.println("--------------------------------");
		
		// 在指定的position做一个标记
		buffer.mark();
		
		buffer.get(dst);
		System.out.println(new String(dst));
		System.out.println("第二次get()方法之后：");
		System.out.println("capacity: " + buffer.capacity());
		System.out.println("limit: " + buffer.limit());
		System.out.println("position: " + buffer.position());
		System.out.println("--------------------------------");
		
		// 将position的位置重置为mark的位置
		buffer.reset();
		System.out.println("reset()方法之后：");
		System.out.println("capacity: " + buffer.capacity());
		System.out.println("limit: " + buffer.limit());
		System.out.println("position: " + buffer.position());
		System.out.println("--------------------------------");
		
		buffer.get(dst);
		System.out.println(new String(dst));
	}
}
