package com.qianfeng.week3.day1.eInnerClass.bStatic;

import com.qianfeng.week3.day1.eInnerClass.bStatic.OutterClass.InnerClass;

public class Program {
	public static void main(String[] args) {
		// 
		OutterClass outter = new OutterClass();
		outter.show();
		
		// ʵ����һ����̬�ڲ���Ķ���
		// OutterClass.InnerClass inner = new OutterClass.InnerClass();
		// inner.show();
		InnerClass inner = new InnerClass();
		inner.show();
	}
}
