package com.qianfeng.week5.day3.cSocket1;

public class Program {
	public static void main(String[] args) {
		
		// Server server = new Server();
		// server.start(7890);
		
		
		Client c = new Client();
		c.start("127.0.0.1", 7890);
	}
}
