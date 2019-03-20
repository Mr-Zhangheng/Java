package com.qianfeng.week2.day3.aExercise.SJB;

import java.util.Scanner;

public class GameControl {
	public static void start() {
		
		Scanner scanner = new Scanner(System.in);
		
		
		while (true) {
			System.out.println("��ӭ����ʯͷ������������������, ����0����");
			String name = scanner.nextLine();
			
			System.out.println(name);
			if (name.equals("0"))
				break;
			
			// 1. ���ж�������������а�����û��
			User user = RankList.current().get(name);
			if (user == null) {
				// �������֣�ʵ����һ���û�
				user = new User(name);
				boolean ret = RankList.current().add(user);
				if (ret == false) {
					// ˵�����а����Ѿ�������
					System.err.println("�����û�����");
					break;
				}
			}
			
			// 2. ����Ϸ
			playGame(user);
		}
		
		// ������а�
		RankList.current().getAll();
		
	}
	/**
	 * ����Ϸ
	 * @param user
	 */
	public static void playGame(User user) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("1. ʯͷ�� 2. ������ 3. ���� 0. �˳�");
			int choice = scanner.nextInt();
			
			if (choice == 0) {
				break;
			}
			
			// ����
			int result = judge(choice);
			
			
			if (result > 0) {
				user.success++;
				System.out.println("���ʤ");
			}
			else if (result < 0) {
				user.defeat++;
				System.out.println("����ʤ");
			}
			else {
				System.out.println("ƽ��");
			}
			
			user.total++;
		}
	}
	
	/**
	 * ����
	 * @param choice
	 * @return 
	 * 0: ƽ��
	 * >: ���ʤ
	 * <: ����ʤ
	 */
	private static int judge(int choice) {
		// 1. ��ȡ���ԵĽ��
		int ai = AI.get();
		
		// 2. 
		int result = choice - ai;
		
		// �������
		if (result == 2) {
			return -1;
		}
		if (result == -2) {
			return 1;
		}
		
		return result;		
	}
}
