package com.qianfeng.week5.day3.hSocket6;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Receiver {
	public static void main(String[] args) {
		
		DatagramSocket socket = null;
		
		try {
			socket = new DatagramSocket(6789);
			
			// 接收数据报包
			// 1. 先去实例化一个数据报包
			byte[] arr = new byte[1024];
			DatagramPacket packet = new DatagramPacket(arr, arr.length);
			
			System.out.println("开始接收数据");
			// 2. 在接收数据的时候，实际是将收到的数据都存到这个数据报包中
			socket.receive(packet);
			
			System.out.println("收到了数据");
			
			// 3. 获取发送方的信息
			InetAddress address = packet.getAddress();
			int port = packet.getPort();
			
			// 获取接收到的数据
			byte[] array = packet.getData();
			
			String message = String.format("%s:%d对您说：%s", address, port, new String(array, 0, packet.getLength()));
			System.out.println(message);
			
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
