package com.qianfeng.week4.day5.aBuffer;

import java.nio.*;

public class BufferDemo2 {
	public static void main(String[] args) {
		ByteBuffer buffer = ByteBuffer.allocate(1024);
		
		System.out.println("allocate()����֮��");
		System.out.println("capacity: " + buffer.capacity());
		System.out.println("limit: " + buffer.limit());
		System.out.println("position: " + buffer.position());
		System.out.println("--------------------------------");
		
		
		buffer.put("hello".getBytes());
		System.out.println("put()����֮��");
		System.out.println("capacity: " + buffer.capacity());
		System.out.println("limit: " + buffer.limit());
		System.out.println("position: " + buffer.position());
		System.out.println("--------------------------------");
		
		// �л��ɶ�ģʽ
		buffer.flip();
		
		byte[] dst = new byte[2];
		buffer.get(dst);
		System.out.println(new String(dst));
		
		System.out.println("get()����֮��");
		System.out.println("capacity: " + buffer.capacity());
		System.out.println("limit: " + buffer.limit());
		System.out.println("position: " + buffer.position());
		System.out.println("--------------------------------");
		
		// ��ָ����position��һ�����
		buffer.mark();
		
		buffer.get(dst);
		System.out.println(new String(dst));
		System.out.println("�ڶ���get()����֮��");
		System.out.println("capacity: " + buffer.capacity());
		System.out.println("limit: " + buffer.limit());
		System.out.println("position: " + buffer.position());
		System.out.println("--------------------------------");
		
		// ��position��λ������Ϊmark��λ��
		buffer.reset();
		System.out.println("reset()����֮��");
		System.out.println("capacity: " + buffer.capacity());
		System.out.println("limit: " + buffer.limit());
		System.out.println("position: " + buffer.position());
		System.out.println("--------------------------------");
		
		buffer.get(dst);
		System.out.println(new String(dst));
	}
}
