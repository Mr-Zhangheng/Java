package com.qianfeng.week5.day3.cSocket1;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端
 * @author luds
 */
public class Server {
	
	/**
	 * 开启一个服务端，监听port端口的数据
	 * @param port
	 */
	public void start(int port) {
		
		ServerSocket server = null;
		
		try {
			// 实例化一个服务端，用来监听指定的端口传入的信息
			server = new ServerSocket(port);
			
			System.out.println("服务端已经启动，正在监听端口：" + port);
			
			// 服务端等待客户端的连接
			// 阻塞当前的线程，直到有客户端的连接进来
			// 返回值：连接进来的客户端
			Socket socket = server.accept();
			
			// 将连接进来的客户端的信息输出
			System.out.println("客户端" + socket + "已连接！");

			
			// 接收从客户端发送过来的数据
			InputStream is = socket.getInputStream();
			
			
			byte[] contents = new byte[1024];
			int length = 0;
			String str = "";
			while ((length = is.read(contents)) != -1) {
				str += new String(contents, 0, length);
			}
			
			// 将客户端发送过来的数据做一个输出
			String hostName = socket.getInetAddress().getHostName();
			String ip = socket.getInetAddress().getHostAddress();
			// 获取端口：数据从客户端的哪一个端口出来的
			int p = socket.getPort();
			
			// 格式化输出
			System.out.println(String.format("客户端%s[%s:%d]对您说：%s", hostName, ip, p, str));
			
			
			
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
