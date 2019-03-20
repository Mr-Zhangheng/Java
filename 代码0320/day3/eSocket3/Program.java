package com.qianfeng.week5.day3.eSocket3;

public class Program {
	public static void main(String[] args) throws Exception {
		
//		new Server().start(6789);

		
		new Client().start("127.0.0.1", 6789);
	}
}
