package com.qianfeng.week5.day3.bInetAddress;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class Program2 {
	public static void main(String[] args) {
		// URLEncoder: 编码器
		// URLDecoder: 解码器
		
		try {
			// 对一段文本以指定的字符集进行编码
			String encodedStr = URLEncoder.encode("你好，世界", "GBK");
			System.out.println(encodedStr);
			
			String decodedStr = URLDecoder.decode(encodedStr, "GBK");
			System.out.println(decodedStr);
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
