package com.qianfeng.week2.day3.aExercise;

public class Program2 {
	public static void main(String[] args) {
		
		HeroManager manager = new HeroManager();
		
		manager.add(new Hero("��������", "��", 800, 0));
		manager.add(new Hero("����", "սʿ", 600, 200));
		manager.add(new Hero("��������", "��", 800, 0));
		manager.add(new Hero("����", "սʿ", 600, 200));
		manager.add(new Hero("��������", "��", 800, 0));
		manager.add(new Hero("����", "սʿ", 600, 200));
		manager.add(new Hero("��������", "��", 800, 0));
		manager.add(new Hero("����", "սʿ", 600, 200));
		manager.add(new Hero("��������", "��", 800, 0));
		manager.add(new Hero("����", "սʿ", 600, 200));
		
		manager.add(new Hero("��������", "��", 800, 0));
		manager.add(new Hero("����", "սʿ", 600, 200));
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
		// 1. �ж��Ƿ��Ѿ�������
		if (count >= 10) {
			System.err.println("�Ѿ�������");
			return;
		}
		
		// 2. 
		data[count++] = hero;
	}
	
	public void displayAll() {
		for (Hero ele : data) {
			if (ele == null)
				break;
			// �����Ϣ
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
		return String.format("����: %s, ����: %s, ��ʼѪ��: %d, ��ʼ����: %d", this.name, this.type, this.hp, this.mp);
	}
}