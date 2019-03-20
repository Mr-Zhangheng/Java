package com.qianfeng.week5.day3.gSocket5;

import java.io.IOException;
import java.io.InputStream;
import java.net.*;

public class Server {
	
	public void start(int port) {
		ServerSocket server = null;
		
		try {
			server = new ServerSocket(port);
			
			while (true) {
				Socket socket = server.accept();
				
				// ��һ���̣߳�����һ���ͻ��˵�����
				new ServerThread(socket).start();
			}			
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

class ServerThread extends Thread {
	
	// ��¼��Ҫ����Ŀͻ�����˭
	private Socket socket;
	public ServerThread(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		
		try {
			InputStream is = socket.getInputStream();
			
			byte[] contents = new byte[1024];
			
			int length = 0;
			
			String message = "";
			
			while ((length = is.read(contents)) != -1) {
				message += new String(contents, 0, length);
			}
			
			System.out.println(String.format("�ͻ���%s[%s:%d]����˵��%s", socket.getInetAddress().getHostName(), socket.getInetAddress().getHostAddress(), socket.getPort(), message));
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
