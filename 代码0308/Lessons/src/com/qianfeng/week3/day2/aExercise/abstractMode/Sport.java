package com.qianfeng.week3.day2.aExercise.abstractMode;

public class Sport {
	String color;
}

class Nike extends Sport {}
class Adidas extends Sport {}




class NikeShoes extends Nike implements Shoes {
	
}

class AdidasTrousers extends Adidas implements SportTrousers {
	
}