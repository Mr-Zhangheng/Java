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
		
		System.out.println("��������������ȴ��ͻ�������");
		
		
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\luds\\Desktop\\server.png"));
		
		InputStream is = socket.getInputStream();
		
		byte[] contents = new byte[1024];
		int length = 0;
		
		while ((length = is.read(contents)) != -1) {
			
			bos.write(contents, 0, length);
			bos.flush();
		}
		
		System.out.println("ͼƬ���ɹ�");
		
		bos.close();
		server.close();
	}
}
