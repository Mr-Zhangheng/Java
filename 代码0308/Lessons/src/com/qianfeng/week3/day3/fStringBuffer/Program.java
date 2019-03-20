package com.qianfeng.week3.day3.fStringBuffer;

public class Program {
	public static void main(String[] args) {
		// ÈÃString¡¢StringBuffer¡¢StringBuilder×ö×Ö·û´®Æ´½Ó
		
		String str = "";
		StringBuffer buffer = new StringBuffer("");
		StringBuilder builder = new StringBuilder("");
		
		int times = 1000000;
		
		long time1 = System.currentTimeMillis();
		
		for (int i = 0; i < times; i++) {
			str += i;
		}
		
		long time2 = System.currentTimeMillis();	
		
		for (int i = 0; i < times; i++) {
			buffer.append(i);
		}
		
		long time3 = System.currentTimeMillis();
		
		for (int i = 0; i < times; i++) {
			builder.append(i);
		}
		
		long time4 = System.currentTimeMillis();
		
		
		System.out.println("String: " + (time2 - time1));
		System.out.println("StringBuffer: " + (time3 - time2));
		System.out.println("StringBuilder: " + (time4 - time3));
	}
	
	
}
