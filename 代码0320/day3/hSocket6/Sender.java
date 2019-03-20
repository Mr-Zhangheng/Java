package com.qianfeng.week5.day3.hSocket6;

import java.io.IOException;
import java.net.*;

public class Sender {
	public static void main(String[] args) {
		
		DatagramSocket socket = null;
		
		try {
			// 直接实例化即可，不需要设置接收方IP和端口号
			socket = new DatagramSocket();
			
			// byte[] message = "how are you ?".getBytes();
			
			
			String message = "how are you?";
			
			// 封装一个数据报包
			// byte[] : 需要发送的数据
			// int :	数据包的大小
			// InetAddress: 接收方IP
			// int : 接收方端口号
			DatagramPacket packet = new DatagramPacket(message.getBytes(), message.length(), InetAddress.getByName("127.0.0.1"), 6789); 
			
			// 直接发送这个数据报包
			socket.send(packet);
			
			System.out.println("数据发送成功");
			
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
				
	}
}
