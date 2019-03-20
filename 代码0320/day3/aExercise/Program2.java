package com.qianfeng.week5.day3.aExercise;

import java.util.Random;

public class Program2 {
	// ģ�����д�ȡǮ
	public static void main(String[] args) {
		
		Person xiaoming = new Person("С��", Person.Operation.save);
		Person laowang = new Person("С��ϱ����", Person.Operation.get);
		
		xiaoming.start();
		laowang.start();
		
	}
}

class Person extends Thread {
	
	
	enum Operation {
		save, get
	}
	// ��¼����˵Ĳ���
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
		// ���ÿ��Ĵ�Ǯ����
		Card.getCard().save(money);
	}
	
	private void getMoney(int money) {
		// ���ÿ��Ĵ�Ǯ����
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
		System.out.println(Thread.currentThread().getName() + "���������" + money + "��Ǯ�����" + Card.getCard().getRest());
	}
	
	public synchronized int get(int money) {
		// ����ȡ����Ǯ
		int get = money;
		
		if (money > this.rest) {
			get = this.rest;
		}
		
		this.rest -= get;
		
		System.out.println(Thread.currentThread().getName() + "�ӿ���ȡ��" + get + "��Ǯ�����" + Card.getCard().getRest());
		
		
		return get;
	}
	
	
	
}
