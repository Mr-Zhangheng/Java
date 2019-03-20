package com.qianfeng.week4.day2.exercise;

import java.util.Scanner;

public class UI {
	
	static Scanner scanner = new Scanner(System.in);
	// 管理员
	static DVDRepoManager manager = new DVDRepoManager();
	
	public static void mainPage() {
		System.out.println("妲己陪你玩");
		
		while (true) {
			System.out.println("请选择你的身份：");
			System.out.println("1. 管理员");
			System.out.println("2. 普通用户");
			System.out.println("3. 退出程序");
			
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
				System.err.println("妲己不懂你在说什么！");
			}
		}
		System.out.println("啊~被玩坏了~");
	}
	
	/**
	 * 管理员界面
	 */
	private static void managerPage() {
		while (true) {
			System.out.println("1. 添加一个DVD");
			System.out.println("2. 删除一个DVD");
			System.out.println("3. 显示DVD");
			System.out.println("4. 返回上一层");
			
			String choice = scanner.nextLine();
			
			if (choice.trim().equals("1")) {
				// 增
				System.out.println("请输入要添加的DVD名字");
				String name = scanner.nextLine();
				
				boolean status = manager.add(name);
				
				if (status) {
					System.out.println("添加成功!");
				}
				else {
					System.out.println("添加失败！这个DVD已经存在！");
				}
			}
			else if (choice.trim().equals("2")) {
				// 删
				System.out.println("请输入要删除的DVD名字");
				String name = scanner.nextLine();
				
				boolean status = manager.remove(name);
				
				if (status) {
					System.out.println("删除成功!");
				}
				else {
					System.out.println("删除失败！这个DVD不存在！");
				}
			}
			else if (choice.trim().equals("3")) {
				// 显示
				display();
			}
			else if (choice.trim().equals("4")) {
				break;
			}
		}
	}
	
	private static void display() {
		while (true) {
			System.out.println("1. 显示所有的DVD");
			System.out.println("2. 显示所有已借出的DVD");
			System.out.println("3. 显示所有未借出的DVD");
			System.out.println("4. 返回上一级");
			
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
			
			// 列举出来数组中的元素
			for (DVD dvd : datas) {
				System.out.println(dvd);
			}
			
		}
	}
	
	
	
	
	
	
	
	/**
	 * 普通用户界面
	 */
	private static void userPage() {
		while (true) {
			System.out.println("1. 借DVD");
			System.out.println("2. 还DVD");
			System.out.println("3. 显示DVD");
			System.out.println("4. 返回上一级");
			
			String choice = scanner.nextLine();
			
			if (choice.trim().equals("1")) {
				System.out.println("输入要借的名字：");
				String name = scanner.nextLine();
				OperationStatus status = manager.borrow(name);
				
				
				if (status == OperationStatus.NotFound) {
					System.out.println("这个DVD没找到！！！");
				}
				else if (status == OperationStatus.StatusError) {
					System.out.println("这个DVD已借出");
				}
				else {
					System.out.println("成功借出！");
				}
				
			}
			else if (choice.trim().equals("2")) {
				System.out.println("输入要还的名字：");
				String name = scanner.nextLine();
				OperationStatus status = manager.send(name);
				
				
				if (status == OperationStatus.NotFound) {
					System.out.println("这个DVD没找到！！！");
				}
				else if (status == OperationStatus.StatusError) {
					System.out.println("这个DVD已归还");
				}
				else {
					System.out.println("成功归还！");
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





















