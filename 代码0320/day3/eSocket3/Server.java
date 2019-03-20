package com.qianfeng.week5.day3.eSocket3;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public void start(int port) throws Exception {
		
		ServerSocket server = new ServerSocket(port);
		
		Socket socket = server.accept();
		
		System.out.println("服务端已启动，等待客户端连接");
		
		
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\luds\\Desktop\\server.png"));
		
		InputStream is = socket.getInputStream();
		
		byte[] contents = new byte[1024];
		int length = 0;
		
		while ((length = is.read(contents)) != -1) {
			
			bos.write(contents, 0, length);
			bos.flush();
		}
		
		System.out.println("图片另存成功");
		
		bos.close();
		server.close();
	}
}
