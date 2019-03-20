package com.qianfeng.week3.day1.eInnerClass.bStatic;

public class OutterClass {
	
	public String name;
	public static int a;

	/**
	 * ¾²Ì¬ÄÚ²¿Àà
	 * @author luds
	 */
	public static class InnerClass {
		
		public String name;
		
		public void show() {
			System.out.println("InnerClass Show");
			
			System.out.println(this.name);
			System.out.println(new OutterClass().name);
			System.out.println(OutterClass.a);
		}
	}
	
	public void show() {
		System.out.println("OutterClass Show");
	}
}
