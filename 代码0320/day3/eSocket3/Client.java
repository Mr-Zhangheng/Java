package com.qianfeng.week5.day3.eSocket3;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.*;


// �����˷���һ��ͼƬ
public class Client {
	
	public void start(String name, int port) {
		Socket socket = null;
		BufferedInputStream bis = null;
		
		try {
			socket = new Socket(name, port);
			
			OutputStream os = socket.getOutputStream();
			
			bis = new BufferedInputStream(new FileInputStream("C:\\Users\\luds\\Desktop\\client.png"));
			
			byte[] contents = new byte[1024];
			int length = 0;
			while ((length = bis.read(contents)) != -1) {
				
				// д������
				os.write(contents, 0, length);
				os.flush();
			}
			
			System.out.println("ͼƬ�ϴ���ɣ�");
			
			
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
