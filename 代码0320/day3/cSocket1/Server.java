package com.qianfeng.week5.day3.cSocket1;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * �����
 * @author luds
 */
public class Server {
	
	/**
	 * ����һ������ˣ�����port�˿ڵ�����
	 * @param port
	 */
	public void start(int port) {
		
		ServerSocket server = null;
		
		try {
			// ʵ����һ������ˣ���������ָ���Ķ˿ڴ������Ϣ
			server = new ServerSocket(port);
			
			System.out.println("������Ѿ����������ڼ����˿ڣ�" + port);
			
			// ����˵ȴ��ͻ��˵�����
			// ������ǰ���̣߳�ֱ���пͻ��˵����ӽ���
			// ����ֵ�����ӽ����Ŀͻ���
			Socket socket = server.accept();
			
			// �����ӽ����Ŀͻ��˵���Ϣ���
			System.out.println("�ͻ���" + socket + "�����ӣ�");

			
			// ���մӿͻ��˷��͹���������
			InputStream is = socket.getInputStream();
			
			
			byte[] contents = new byte[1024];
			int length = 0;
			String str = "";
			while ((length = is.read(contents)) != -1) {
				str += new String(contents, 0, length);
			}
			
			// ���ͻ��˷��͹�����������һ�����
			String hostName = socket.getInetAddress().getHostName();
			String ip = socket.getInetAddress().getHostAddress();
			// ��ȡ�˿ڣ����ݴӿͻ��˵���һ���˿ڳ�����
			int p = socket.getPort();
			
			// ��ʽ�����
			System.out.println(String.format("�ͻ���%s[%s:%d]����˵��%s", hostName, ip, p, str));
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (server != null) {
				try {
					server.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
