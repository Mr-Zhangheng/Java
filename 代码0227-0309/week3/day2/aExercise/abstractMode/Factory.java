package com.qianfeng.week3.day2.aExercise.abstractMode;

public interface Factory {
	Shoes createShoes(String color);
	SportTrousers createTrousers(String color);
}

class NikeFactory implements Factory {
	@Override
	public Shoes createShoes(String color) {
		NikeShoes shoes = new NikeShoes();
		shoes.color = color;
		return shoes;
	}
	
	@Override
	public SportTrousers createTrousers(String color) {
		return null;
	}
	
}


