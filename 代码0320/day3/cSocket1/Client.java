package com.qianfeng.week5.day3.cSocket1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;


/**
 * 客户端
 * @author luds
 */
public class Client {
	
	public void start(String ip, int port) {
		// Socket这个类来描述客户端
		Socket socket = null;
		try {
			// 实例化了一个Socket对象
			// 在实例化的过程中，底层已经实现了三次握手，并建立了一个安全的连接
			socket = new Socket(InetAddress.getByName(ip), port);
			
			// socket
			// socket.getInputStream();
			// socket.getOutputStream();
			// 获取一个输出流，向网络去写数据
			OutputStream os = socket.getOutputStream();
			
			// 将需要发送给服务端的消息写到流中
			os.write("你好".getBytes());
			os.flush();
			
			System.out.println("客户端向服务端发送消息完成！");
			
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
