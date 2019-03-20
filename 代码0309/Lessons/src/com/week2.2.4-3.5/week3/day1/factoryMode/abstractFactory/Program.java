package com.qianfeng.week3.day1.factoryMode.abstractFactory;

public class Program {
	// 已知所有的汽车可以划分成：SUV、Jiaoche、MPV、Paoche
	// BMW、Audi、BYD
	public static void main(String[] args) {
		// 买一台黑色的宝马SUV
		SUV suv = new BMWFactory().createSUV("黑色");
	}
}
