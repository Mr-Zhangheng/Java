package com.qianfeng.week2.day4.cDuotai.example;

public class Program {
	// 一个新的动物园开张，老王作为动物园管理员，需要将动物园中的动物信息录入系统，
	// 要登记的信息：动物的名字、年龄
	// 如果这个动物是老虎，还要再登记一下性别
	public static void main(String[] args) {
		
		ZooManager zoo = new ZooManager();
		
		// 实参给形参赋值
		// Animal animal = new Monkey(); 
		zoo.recordInfo(new Monkey());
		zoo.recordInfo(new Elephent());
	}
}
