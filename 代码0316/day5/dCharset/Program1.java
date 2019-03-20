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
 * 字符集（Charset）：
 *
 * 编码：由字符串转成字节数组。
 * 解码：由字节数组转成字符串。
 */
public class Program1 {
	public static void main(String[] args) throws CharacterCodingException {
		// 通过名字，获取指定的字符集
		Charset cs = Charset.forName("GBK");
		
		CharBuffer buffer = CharBuffer.allocate(1024);
		buffer.put("你好，师妹");
		buffer.flip();
				
		// 编码器：
		// 获取编码器：
		CharsetEncoder encoder = cs.newEncoder();
		ByteBuffer byteBuffer = encoder.encode(buffer);
		
		
		// 解码器：
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
