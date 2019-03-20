package com.qianfeng.week5.day3.dSocket2;

public class Program {
	public static void main(String[] args) {
		
		Server server = new Server();
		Client c = new Client();
		
		
		
//		server.start(7890);
		c.start("127.0.0.1", 7890);
	}
}
