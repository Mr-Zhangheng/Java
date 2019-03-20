package com.qianfeng.week5.day3.dSocket2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;


/**
 * �ͻ���
 * @author luds
 */
public class Client {
	
	public void start(String ip, int port) {
		// Socket������������ͻ���
		Socket socket = null;
		try {
			// ʵ������һ��Socket����
			// ��ʵ�����Ĺ����У��ײ��Ѿ�ʵ�����������֣���������һ����ȫ������
			socket = new Socket(InetAddress.getByName(ip), port);
			
			// socket
			// socket.getInputStream();
			// socket.getOutputStream();
			// ��ȡһ���������������ȥд����
			OutputStream os = socket.getOutputStream();
			
			// ����Ҫ���͸�����˵���Ϣд������
			os.write("���".getBytes());
			os.flush();
			
			System.out.println("�ͻ��������˷�����Ϣ��ɣ�");
			
			
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
			InputStream is = socket.getInputStream();
			
			byte[] contents = new byte[1024];
			int length = is.read(contents);
			System.out.println("����˻���Ϣ��" + new String(contents, 0, length));
			
			
			
			
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (socket != null) {
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
