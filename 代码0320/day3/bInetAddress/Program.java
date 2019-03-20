package com.qianfeng.week5.day3.bInetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Program {
	public static void main(String[] args) {
		
		try {
			// 获取主机
			InetAddress local = InetAddress.getLocalHost();
			System.out.println(local);
			
			// 获取主机名字字符串
			String name = local.getHostName();
			System.out.println(name);
			
			// 获取主机地址字符串
			String address = local.getHostAddress();
			System.out.println(address);
			
			// 通过主机名获取
			InetAddress hry = InetAddress.getByName("HRY");
			System.out.println(hry);
			
			// 通过一个域名获取
			InetAddress baidu = InetAddress.getByName("www.taobao.com");
			System.out.println(baidu);
			
			// 也可以通过IP来获取InetAddress对象（无法获取主机名）
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
