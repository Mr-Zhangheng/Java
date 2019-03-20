package com.qianfeng.week4.day5.aBuffer;

import java.nio.*;
/**
 * ���ڻ�����
 * @author luds
 */
public class BufferDemo1 {
	public static void main(String[] args) {
		// ���������󣬲���ͨ��new����ʵ������ȡ�ġ�����ͨ�����ṩ��һ����̬��������ȡ�ġ�
		ByteBuffer buffer = ByteBuffer.allocate(1024);
		showInfo(buffer, "allocate");
		
		// ʹ��put��������������������
		buffer.put("hello".getBytes());
		showInfo(buffer, "put");
		
		// �л��ɶ�ģʽ
		buffer.flip();
		showInfo(buffer, "flip");
		
		// ��ȡ����
		byte[] dst = new byte[buffer.limit()];
		buffer.get(dst);
		showInfo(buffer, "get");
		
		// ���¶�ȡ
		buffer.rewind();
		showInfo(buffer, "rewind");
		
		// ��ջ�����
		buffer.clear();
		showInfo(buffer, "clear");
		
		dst = new byte[5];
		buffer.get(dst);
		System.out.println(new String(dst));
	}
	
	private static void showInfo(ByteBuffer buffer, String operation) {
		System.out.println(operation + "()����֮��");
		System.out.println("capacity: " + buffer.capacity());
		System.out.println("limit: " + buffer.limit());
		System.out.println("position: " + buffer.position());
		System.out.println("--------------------------------");
	}
}
