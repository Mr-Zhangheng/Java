package com.qianfeng.week4.day2.exercise;

import java.util.Scanner;

public class UI {
	
	static Scanner scanner = new Scanner(System.in);
	// ����Ա
	static DVDRepoManager manager = new DVDRepoManager();
	
	public static void mainPage() {
		System.out.println("槼�������");
		
		while (true) {
			System.out.println("��ѡ�������ݣ�");
			System.out.println("1. ����Ա");
			System.out.println("2. ��ͨ�û�");
			System.out.println("3. �˳�����");
			
			String choice = scanner.nextLine();
			
			if (choice.trim().equals("1")) {
				managerPage();
			}
			else if (choice.trim().equals("2")) {
				userPage();
			}
			else if (choice.trim().equals("3")) {
				break;
			}
			else {
				System.err.println("槼���������˵ʲô��");
			}
		}
		System.out.println("��~���滵��~");
	}
	
	/**
	 * ����Ա����
	 */
	private static void managerPage() {
		while (true) {
			System.out.println("1. ���һ��DVD");
			System.out.println("2. ɾ��һ��DVD");
			System.out.println("3. ��ʾDVD");
			System.out.println("4. ������һ��");
			
			String choice = scanner.nextLine();
			
			if (choice.trim().equals("1")) {
				// ��
				System.out.println("������Ҫ��ӵ�DVD����");
				String name = scanner.nextLine();
				
				boolean status = manager.add(name);
				
				if (status) {
					System.out.println("��ӳɹ�!");
				}
				else {
					System.out.println("���ʧ�ܣ����DVD�Ѿ����ڣ�");
				}
			}
			else if (choice.trim().equals("2")) {
				// ɾ
				System.out.println("������Ҫɾ����DVD����");
				String name = scanner.nextLine();
				
				boolean status = manager.remove(name);
				
				if (status) {
					System.out.println("ɾ���ɹ�!");
				}
				else {
					System.out.println("ɾ��ʧ�ܣ����DVD�����ڣ�");
				}
			}
			else if (choice.trim().equals("3")) {
				// ��ʾ
				display();
			}
			else if (choice.trim().equals("4")) {
				break;
			}
		}
	}
	
	private static void display() {
		while (true) {
			System.out.println("1. ��ʾ���е�DVD");
			System.out.println("2. ��ʾ�����ѽ����DVD");
			System.out.println("3. ��ʾ����δ�����DVD");
			System.out.println("4. ������һ��");
			
			String choice = scanner.nextLine();
			
			DVD[] datas = null;
			
			if (choice.trim().equals("1")) {
				datas = manager.getAll(Query.All);
			}
			else if (choice.trim().equals("2")) {
				datas = manager.getAll(Query.Borrowed);
			}
			else if (choice.trim().equals("3")) {
				datas = manager.getAll(Query.UnBorrowed);
			}
			else if (choice.trim().equals("4")) {
				break;
			}
			else {
				continue;
			}
			
			// �оٳ��������е�Ԫ��
			for (DVD dvd : datas) {
				System.out.println(dvd);
			}
			
		}
	}
	
	
	
	
	
	
	
	/**
	 * ��ͨ�û�����
	 */
	private static void userPage() {
		while (true) {
			System.out.println("1. ��DVD");
			System.out.println("2. ��DVD");
			System.out.println("3. ��ʾDVD");
			System.out.println("4. ������һ��");
			
			String choice = scanner.nextLine();
			
			if (choice.trim().equals("1")) {
				System.out.println("����Ҫ������֣�");
				String name = scanner.nextLine();
				OperationStatus status = manager.borrow(name);
				
				
				if (status == OperationStatus.NotFound) {
					System.out.println("���DVDû�ҵ�������");
				}
				else if (status == OperationStatus.StatusError) {
					System.out.println("���DVD�ѽ��");
				}
				else {
					System.out.println("�ɹ������");
				}
				
			}
			else if (choice.trim().equals("2")) {
				System.out.println("����Ҫ�������֣�");
				String name = scanner.nextLine();
				OperationStatus status = manager.send(name);
				
				
				if (status == OperationStatus.NotFound) {
					System.out.println("���DVDû�ҵ�������");
				}
				else if (status == OperationStatus.StatusError) {
					System.out.println("���DVD�ѹ黹");
				}
				else {
					System.out.println("�ɹ��黹��");
				}
			}
			else if (choice.trim().equals("3")) {
				display();
			}
			else if (choice.trim().equals("4")) {
				break;
			}
		}
	}
}





















