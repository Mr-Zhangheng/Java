package com.qianfeng.week5.day3.fSocket4;

import java.net.*;
import java.io.*;

public class Program {
	public static void main(String[] args) {
		// 客户端向服务端做一个下载请求，服务端将数据告诉客户端
		// new Server().start(7890);
		new Client().start("127.0.0.1", 7890);
	}
}


class Server {
	public void start(int port) {
		try (ServerSocket server = new ServerSocket(port)) {
			// 等待客户端连接
			Socket socket = server.accept();
			
			// 接收客户端发送过来的消息
			InputStream is = socket.getInputStream();
			byte[] contents = new byte[1024];
			int length = is.read(contents);
			
			
			OutputStream os = socket.getOutputStream();
			
			// 客户端发送过来的下载请求
			String request = new String(contents, 0, length);
			
			// 从资源库中查找到指定的文件返回给客户端
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\luds\\Desktop\\" + request));
			
			while ((length = bis.read(contents)) != -1) {
				os.write(contents, 0, length);
				os.flush();
			}			
			
			System.out.println("已经将数据发送给客户端");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


class Client {
	public void start(String name, int port) {
		// 此时，这个socket只在try代码段中生效
		// 并且，此时，这个socket是自带关闭的
		try (Socket socket = new Socket(name, port); BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\luds\\Desktop\\download.png"))) {
			// 向服务端发送一个下载请求
			OutputStream os = socket.getOutputStream();
			os.write("server.png".getBytes());
			os.flush();
			
			// 接收从服务端发送来的数据
			InputStream is = socket.getInputStream();
			
			byte[] contents = new byte[1024];
			int length = 0;
			while ((length = is.read(contents)) != -1) {
				bos.write(contents, 0, length);
				bos.flush();
			}
			System.out.println("数据下载成功！");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}


