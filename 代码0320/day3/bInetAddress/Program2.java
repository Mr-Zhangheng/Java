package com.qianfeng.week5.day3.bInetAddress;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class Program2 {
	public static void main(String[] args) {
		// URLEncoder: ������
		// URLDecoder: ������
		
		try {
			// ��һ���ı���ָ�����ַ������б���
			String encodedStr = URLEncoder.encode("��ã�����", "GBK");
			System.out.println(encodedStr);
			
			String decodedStr = URLDecoder.decode(encodedStr, "GBK");
			System.out.println(decodedStr);
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
