package com.qianfeng.week5.day3.aExercise;

import java.util.Random;

public class Program2 {
	// 模拟银行存取钱
	public static void main(String[] args) {
		
		Person xiaoming = new Person("小明", Person.Operation.save);
		Person laowang = new Person("小明媳妇儿", Person.Operation.get);
		
		xiaoming.start();
		laowang.start();
		
	}
}

class Person extends Thread {
	
	
	enum Operation {
		save, get
	}
	// 记录这个人的操作
	private Operation operation;
	
	public Person(String name, Operation operation) {
		super(name);
		this.operation = operation;
	}
	
	@Override
	public void run() {
		
		Random random = new Random();
		
		while (true) {
			if (operation == Operation.save) {
				saveMoney(random.nextInt(900) + 100);
			}
			else {
				getMoney(random.nextInt(700) + 100);
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	private void saveMoney(int money) {
		// 调用卡的存钱方法
		Card.getCard().save(money);
	}
	
	private void getMoney(int money) {
		// 调用卡的存钱方法
		Card.getCard().get(money);
	}
}











class Card {
	private int rest = 0;
	
	private static Card instance ;
	
	public static synchronized Card getCard() {
		if (instance == null)
			instance = new Card();
		
		return instance;
	}
	
	public int getRest() {
		return this.rest;
	}
	
	
	
	public synchronized void save(int money) {
		rest += money;
		System.out.println(Thread.currentThread().getName() + "往卡里存了" + money + "块钱，余额" + Card.getCard().getRest());
	}
	
	public synchronized int get(int money) {
		// 真正取到的钱
		int get = money;
		
		if (money > this.rest) {
			get = this.rest;
		}
		
		this.rest -= get;
		
		System.out.println(Thread.currentThread().getName() + "从卡里取了" + get + "块钱，余额" + Card.getCard().getRest());
		
		
		return get;
	}
	
	
	
}
