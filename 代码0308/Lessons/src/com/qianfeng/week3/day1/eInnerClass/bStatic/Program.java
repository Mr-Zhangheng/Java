package com.qianfeng.week3.day1.eInnerClass.bStatic;

import com.qianfeng.week3.day1.eInnerClass.bStatic.OutterClass.InnerClass;

public class Program {
	public static void main(String[] args) {
		// 
		OutterClass outter = new OutterClass();
		outter.show();
		
		// 实例化一个静态内部类的对象
		// OutterClass.InnerClass inner = new OutterClass.InnerClass();
		// inner.show();
		InnerClass inner = new InnerClass();
		inner.show();
	}
}
