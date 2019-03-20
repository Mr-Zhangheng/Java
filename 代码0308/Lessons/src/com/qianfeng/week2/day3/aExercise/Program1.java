package com.qianfeng.week2.day3.aExercise;

public class Program1 {
	public static void main(String[] args) {
		
		Computer computer = new Computer();
		
		CPU cpu = new CPU("Core i9", 8);
		MainBoard mb = new MainBoard("ASUS", 5);
		Display dis = new Display("RTX 2080Ti", 12);
		Disk di = new Disk("1P SSD", 15);
		Memory ram = new Memory("1024T", 10);
		
		computer.cpu = cpu;
		computer.mb = mb;
		computer.dis = dis;
		computer.di = di;
		computer.ram = ram;
		
		System.out.println(computer.getPrice());
	}
}


class Computer {
	CPU cpu;
	MainBoard mb;
	Display dis;
	Disk di;
	Memory ram;
	
	double getPrice() {
		return this.cpu.price + this.mb.price + this.dis.price + this.di.price + this.ram.price;
	}
}

class CPU {
	String name;
	double price;
	public CPU() {}
	public CPU(String name, double price) {
		this.name = name;
		this.price = price;
	}
}
class Disk {
	String name;
	double price;
	public Disk() {}
	public Disk(String name, double price) {
		this.name = name;
		this.price = price;
	}
}

class MainBoard {
	String name;
	double price;
	public MainBoard() {}
	public MainBoard(String name, double price) {
		this.name = name;
		this.price = price;
	}
}
class Memory {
	String name;
	double price;
	public Memory() {}
	public Memory(String name, double price) {
		this.name = name;
		this.price = price;
	}
}
class Display {
	String name;
	double price;
	public Display() {}
	public Display(String name, double price) {
		this.name = name;
		this.price = price;
	}
}
