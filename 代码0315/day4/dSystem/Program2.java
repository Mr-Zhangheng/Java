package com.qianfeng.week4.day4.dSystem;


import java.io.*;
import java.util.Scanner;

/**
 * ��׼������
 * @author luds
 */
public class Program2 {
	public static void main(String[] args) throws IOException {
		// ʵ������һ���ֽ�������
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("file\\test"));
		// �ֶ�����System.in��ʲô
		System.setIn(bis);
		
		Scanner scanner = new Scanner(new File("file\\test"));
		
		// ѭ����ȡ����������hasNextLine()�����ж��Ƿ�����һ������
		while (scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
		}
		
		
		scanner.close();
			
	}
}
