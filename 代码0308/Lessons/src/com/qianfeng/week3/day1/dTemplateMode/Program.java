package com.qianfeng.week3.day1.dTemplateMode;

public class Program {
	public static void main(String[] args) {
		// 需求：我需要泡一杯咖啡，然后再泡一杯奶茶，然后再沏上一杯茶，然后再冲上一杯板蓝根，然后再冲上一杯999感冒灵
		// 1. 烧开水
		// 2. 加东西
		// 3. 倒开水
		new DoCoffee().doDrink();
		new DoMilk().doDrink();
	}
}
