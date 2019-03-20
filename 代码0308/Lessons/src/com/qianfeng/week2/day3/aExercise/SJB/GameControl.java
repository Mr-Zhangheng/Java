package com.qianfeng.week2.day3.aExercise.SJB;

import java.util.Scanner;

public class GameControl {
	public static void start() {
		
		Scanner scanner = new Scanner(System.in);
		
		
		while (true) {
			System.out.println("欢迎来到石头剪刀布，请输入名字, 输入0结束");
			String name = scanner.nextLine();
			
			System.out.println(name);
			if (name.equals("0"))
				break;
			
			// 1. 先判断这个名字在排行榜中有没有
			User user = RankList.current().get(name);
			if (user == null) {
				// 根据名字，实例化一个用户
				user = new User(name);
				boolean ret = RankList.current().add(user);
				if (ret == false) {
					// 说明排行榜中已经加满了
					System.err.println("超过用户上限");
					break;
				}
			}
			
			// 2. 玩游戏
			playGame(user);
		}
		
		// 输出排行榜
		RankList.current().getAll();
		
	}
	/**
	 * 玩游戏
	 * @param user
	 */
	public static void playGame(User user) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("1. 石头、 2. 剪刀、 3. 布、 0. 退出");
			int choice = scanner.nextInt();
			
			if (choice == 0) {
				break;
			}
			
			// 裁判
			int result = judge(choice);
			
			
			if (result > 0) {
				user.success++;
				System.out.println("玩家胜");
			}
			else if (result < 0) {
				user.defeat++;
				System.out.println("电脑胜");
			}
			else {
				System.out.println("平局");
			}
			
			user.total++;
		}
	}
	
	/**
	 * 裁判
	 * @param choice
	 * @return 
	 * 0: 平局
	 * >: 玩家胜
	 * <: 电脑胜
	 */
	private static int judge(int choice) {
		// 1. 获取电脑的结果
		int ai = AI.get();
		
		// 2. 
		int result = choice - ai;
		
		// 极端情况
		if (result == 2) {
			return -1;
		}
		if (result == -2) {
			return 1;
		}
		
		return result;		
	}
}
