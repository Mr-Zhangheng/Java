package com.qianfeng.week5.day3.bInetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Program {
	public static void main(String[] args) {
		
		try {
			// ��ȡ����
			InetAddress local = InetAddress.getLocalHost();
			System.out.println(local);
			
			// ��ȡ���������ַ���
			String name = local.getHostName();
			System.out.println(name);
			
			// ��ȡ������ַ�ַ���
			String address = local.getHostAddress();
			System.out.println(address);
			
			// ͨ����������ȡ
			InetAddress hry = InetAddress.getByName("HRY");
			System.out.println(hry);
			
			// ͨ��һ��������ȡ
			InetAddress baidu = InetAddress.getByName("www.taobao.com");
			System.out.println(baidu);
			
			// Ҳ����ͨ��IP����ȡInetAddress�����޷���ȡ��������
			InetAddress ip = InetAddress.getByName("10.0.16.25");
			System.out.println(ip);
			
			// System.out.println(InetAddress.getByAddress("10.0.16.25".getBytes()));
			
			
			InetAddress[] addresses = InetAddress.getAllByName("www.taobao.com");
			for (InetAddress addr : addresses) {
				System.out.println(addr);
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
