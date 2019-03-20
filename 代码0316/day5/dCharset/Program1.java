package com.qianfeng.week4.day5.dCharset;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.util.Map;
import java.util.Set;

/**
 * �ַ�����Charset����
 *
 * ���룺���ַ���ת���ֽ����顣
 * ���룺���ֽ�����ת���ַ�����
 */
public class Program1 {
	public static void main(String[] args) throws CharacterCodingException {
		// ͨ�����֣���ȡָ�����ַ���
		Charset cs = Charset.forName("GBK");
		
		CharBuffer buffer = CharBuffer.allocate(1024);
		buffer.put("��ã�ʦ��");
		buffer.flip();
				
		// ��������
		// ��ȡ��������
		CharsetEncoder encoder = cs.newEncoder();
		ByteBuffer byteBuffer = encoder.encode(buffer);
		
		
		// ��������
		// CharsetDecoder decoder = cs.newDecoder();
		// CharBuffer cb = decoder.decode(byteBuffer);
		
		// System.out.println(cb.toString());
		System.out.println("-------------------");
		
		
		
		
		CharBuffer cb2 = Charset.forName("GBK").newDecoder().decode(byteBuffer);
		System.out.println(cb2.toString());
		System.out.println("------------");
		
		
	}
	
	public static void showAll() {
		Map<String, Charset> map = Charset.availableCharsets();
		
		Set<String> keys = map.keySet();
		
		for (String k : keys) {
			System.out.println(k);
		}
		
	}
}
