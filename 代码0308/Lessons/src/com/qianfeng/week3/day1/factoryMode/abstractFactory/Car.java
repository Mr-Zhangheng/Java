package com.qianfeng.week3.day1.factoryMode.abstractFactory;

public class Car {
	String color;
}

class Audi extends Car {}
class BMW extends Car {}



class AudiSUV extends Audi implements SUV {
	
}

class BMWSUV extends BMW implements SUV {
	
}


