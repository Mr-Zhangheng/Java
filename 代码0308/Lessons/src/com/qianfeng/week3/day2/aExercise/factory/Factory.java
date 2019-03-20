package com.qianfeng.week3.day2.aExercise.factory;

/*
public abstract class Factory {

}
*/

public interface Factory {
	Shoes createShoes(String color);
}


// 设计两个工厂，分别用来生产耐克的球鞋和阿迪的球鞋
class NikeFactory implements Factory {

	@Override
	public Shoes createShoes(String color) {
		NikeShoes shoes = new NikeShoes();
		shoes.color = color;
		
		return shoes;
	}
	
}

class AdiFactory implements Factory {

	@Override
	public Shoes createShoes(String color) {
		AdidasShoes shoes = new AdidasShoes();
		shoes.color = color;
		
		return shoes;
	}
	
}