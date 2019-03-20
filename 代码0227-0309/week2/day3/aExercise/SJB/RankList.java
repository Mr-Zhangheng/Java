package com.qianfeng.week2.day3.aExercise.SJB;

public class RankList {
	User[] users;
	
	private static RankList list = new RankList();
	public static RankList current() {
		return list;
	}
	
	
	
	int count = 0;
	
	// 设置一个常量，用来记录最多能存多少条数据
	private final int MAX_CAPICITY = 10;
	
	RankList() {
		users = new User[MAX_CAPICITY];
	}
	
	/**
	 * 
	 * @param user
	 * @return
	 */
	boolean add(User user) {
		if (count >= MAX_CAPICITY) {
			return false;
		}
		
		users[count++] = user;
		return true;
	}
	
	
	User get(String name) {
		for (User user : users) {
			if (user != null && user.name.equals(name)) {
				return user;
			}
		}
		
		return null;
	}
	
	
	/**
	 * 获取排行榜上面所有的内容
	 */
	void getAll() {
		System.out.println("姓名\t\t\t总场数\t\t胜场\t\t平场\t\t负场\t\t胜率");
		for (User user : users) {
			if (user != null) {
				String message = String.format("%s\t\t\t%d\t\t%d\t\t%d\t\t%d\t\t%.1f%%", user.name, user.total, user.success, user.total - user.success - user.defeat, user.defeat, user.getRadio() * 100);
				System.out.println(message);
			}
		}
	}
	
	void sort() {
		for (int i = 0; i < count - 1; i++) {
			int minIndex = i;
			User tmp;
			for (int j = i + 1; j < count; j++) {
				if (users[minIndex].getRadio() > users[j].getRadio()) {
					minIndex = j;
				}
			}
			
			tmp = users[minIndex];
			users[minIndex] = users[i];
			users[i] = tmp;
		}
	}
	
}
