package com.qianfeng.week4.day5.aBuffer;

import java.nio.*;

public class BufferDemo3 {
	public static void main(String[] args) {
		// ��ȡһ��ֱ�ӻ�����
		ByteBuffer buffer = ByteBuffer.allocateDirect(1024);
		
		// ��֤һ���������ǲ���ֱ�ӻ�����
		System.out.println(buffer.isDirect());
	}
}
