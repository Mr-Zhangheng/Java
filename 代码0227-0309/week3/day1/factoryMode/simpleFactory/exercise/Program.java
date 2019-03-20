package com.qianfeng.week3.day1.factoryMode.simpleFactory.exercise;

public class Program {
	public static void main(String[] args) {
		Pet pet = Shop.getShop().getPet("dog", "ÈøÄ¦Ò®", "°×");
	}
}
