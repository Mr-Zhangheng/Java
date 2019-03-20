package com.qianfeng.week3.day1.factoryMode.factoryMethod;

// ²úÆ·×å£º
/*
public abstract class Factory {
	abstract Car create(String color);
}
*/

public interface Factory {
	Car create(String color);
}



class AudiFactory implements Factory {
	@Override
	public Audi create(String color) {
		Audi audi = new Audi();
		audi.color = color;
		return audi;
	}
}

class BMWFactory implements Factory {
	@Override
	public BMW create(String color) {
		BMW b = new BMW();
		b.color = color;
		return b;
	}
}

class FerriaFactory implements Factory {
	@Override
	public Ferria create(String color) {
		Ferria b = new Ferria();
		b.color = color;
		return b;
	}
}

class BYDFactory implements Factory {
	@Override
	public BYD create(String color) {
		BYD b = new BYD();
		b.color = color;
		return b;
	}
}