package com.qianfeng.week5.day3.fSocket4;

import java.net.*;
import java.io.*;

public class Program {
	public static void main(String[] args) {
		// �ͻ�����������һ���������󣬷���˽����ݸ��߿ͻ���
		// new Server().start(7890);
		new Client().start("127.0.0.1", 7890);
	}
}


class Server {
	public void start(int port) {
		try (ServerSocket server = new ServerSocket(port)) {
			// �ȴ��ͻ�������
			Socket socket = server.accept();
			
			// ���տͻ��˷��͹�������Ϣ
			InputStream is = socket.getInputStream();
			byte[] contents = new byte[1024];
			int length = is.read(contents);
			
			
			OutputStream os = socket.getOutputStream();
			
			// �ͻ��˷��͹�������������
			String request = new String(contents, 0, length);
			
			// ����Դ���в��ҵ�ָ�����ļ����ظ��ͻ���
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\luds\\Desktop\\" + request));
			
			while ((length = bis.read(contents)) != -1) {
				os.write(contents, 0, length);
				os.flush();
			}			
			
			System.out.println("�Ѿ������ݷ��͸��ͻ���");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


class Client {
	public void start(String name, int port) {
		// ��ʱ�����socketֻ��try���������Ч
		// ���ң���ʱ�����socket���Դ��رյ�
		try (Socket socket = new Socket(name, port); BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\luds\\Desktop\\download.png"))) {
			// �����˷���һ����������
			OutputStream os = socket.getOutputStream();
			os.write("server.png".getBytes());
			os.flush();
			
			// ���մӷ���˷�����������
			InputStream is = socket.getInputStream();
			
			byte[] contents = new byte[1024];
			int length = 0;
			while ((length = is.read(contents)) != -1) {
				bos.write(contents, 0, length);
				bos.flush();
			}
			System.out.println("�������سɹ���");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}


