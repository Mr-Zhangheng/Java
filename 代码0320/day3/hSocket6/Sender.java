package com.qianfeng.week5.day3.hSocket6;

import java.io.IOException;
import java.net.*;

public class Sender {
	public static void main(String[] args) {
		
		DatagramSocket socket = null;
		
		try {
			// ֱ��ʵ�������ɣ�����Ҫ���ý��շ�IP�Ͷ˿ں�
			socket = new DatagramSocket();
			
			// byte[] message = "how are you ?".getBytes();
			
			
			String message = "how are you?";
			
			// ��װһ�����ݱ���
			// byte[] : ��Ҫ���͵�����
			// int :	���ݰ��Ĵ�С
			// InetAddress: ���շ�IP
			// int : ���շ��˿ں�
			DatagramPacket packet = new DatagramPacket(message.getBytes(), message.length(), InetAddress.getByName("127.0.0.1"), 6789); 
			
			// ֱ�ӷ���������ݱ���
			socket.send(packet);
			
			System.out.println("���ݷ��ͳɹ�");
			
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
				
	}
}
