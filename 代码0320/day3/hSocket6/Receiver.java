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
			
			// �������ݱ���
			// 1. ��ȥʵ����һ�����ݱ���
			byte[] arr = new byte[1024];
			DatagramPacket packet = new DatagramPacket(arr, arr.length);
			
			System.out.println("��ʼ��������");
			// 2. �ڽ������ݵ�ʱ��ʵ���ǽ��յ������ݶ��浽������ݱ�����
			socket.receive(packet);
			
			System.out.println("�յ�������");
			
			// 3. ��ȡ���ͷ�����Ϣ
			InetAddress address = packet.getAddress();
			int port = packet.getPort();
			
			// ��ȡ���յ�������
			byte[] array = packet.getData();
			
			String message = String.format("%s:%d����˵��%s", address, port, new String(array, 0, packet.getLength()));
			System.out.println(message);
			
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
