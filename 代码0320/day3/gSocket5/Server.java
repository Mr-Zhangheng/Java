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
				
				// 开一个线程，处理一个客户端的请求
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
	
	// 记录需要处理的客户端是谁
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
			
			System.out.println(String.format("客户端%s[%s:%d]对您说：%s", socket.getInetAddress().getHostName(), socket.getInetAddress().getHostAddress(), socket.getPort(), message));
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
