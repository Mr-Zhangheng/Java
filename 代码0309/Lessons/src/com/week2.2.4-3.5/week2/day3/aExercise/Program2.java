package com.qianfeng.week2.day3.aExercise;

public class Program2 {
	public static void main(String[] args) {
		
		HeroManager manager = new HeroManager();
		
		manager.add(new Hero("德玛西亚", "肉", 800, 0));
		manager.add(new Hero("赵信", "战士", 600, 200));
		manager.add(new Hero("德玛西亚", "肉", 800, 0));
		manager.add(new Hero("赵信", "战士", 600, 200));
		manager.add(new Hero("德玛西亚", "肉", 800, 0));
		manager.add(new Hero("赵信", "战士", 600, 200));
		manager.add(new Hero("德玛西亚", "肉", 800, 0));
		manager.add(new Hero("赵信", "战士", 600, 200));
		manager.add(new Hero("德玛西亚", "肉", 800, 0));
		manager.add(new Hero("赵信", "战士", 600, 200));
		
		manager.add(new Hero("德玛西亚", "肉", 800, 0));
		manager.add(new Hero("赵信", "战士", 600, 200));
		manager.displayAll();
	}
}

// a, b, c, null, null, null, null, null, null, null

class HeroManager {
	Hero[] data;
	int count = 0;
	
	HeroManager() {
		this.data = new Hero[10];
	}
	
	public void add(Hero hero) {
		// 1. 判断是否已经加满了
		if (count >= 10) {
			System.err.println("已经加满了");
			return;
		}
		
		// 2. 
		data[count++] = hero;
	}
	
	public void displayAll() {
		for (Hero ele : data) {
			if (ele == null)
				break;
			// 输出信息
			System.out.println(ele.getInfo());
		}
	}
}

class Hero {
	String name;
	String type;
	int hp;
	int mp;
	
	
	
	/**
	 * @param name
	 * @param type
	 * @param hp
	 * @param mp
	 */
	public Hero(String name, String type, int hp, int mp) {
		super();
		this.name = name;
		this.type = type;
		this.hp = hp;
		this.mp = mp;
	}

	


	String getInfo() {
		return String.format("姓名: %s, 类型: %s, 初始血量: %d, 初始蓝量: %d", this.name, this.type, this.hp, this.mp);
	}
}