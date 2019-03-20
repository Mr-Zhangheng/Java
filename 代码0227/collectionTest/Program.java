package com.luds.collectionTest;

import com.luds.collections.*;

public class Program {
	public static void main(String[] args) {
		
		LSArrayList<Integer> ls = new LSArrayList<>();

		
		ls.addRange(new Integer[] {0, 12, 8, 16, 9, 22, 1, 34, 100, 7});
		// 0, 100, 1, 12, 22, 34, 16, 7, 8, 9
		
		
//		ls.add(1, 100);
//		
//		ls.addRange(new Integer[] {1000, 2000, 3000, 4000});
//		
//		ls.addRange(1, new Integer[] {10000, 20000, 30000});
//		
		
//		ls.remove(4);
//		ls.removeAt(4);
		// [1, 5)
		// ls.removeRange(1, 50);
		
//		ls.clear();
		
//		ls.set(3, 300);
//		ls.setRange(1, 4, new Integer[] {100, 200, 300, 400, 500, 600});
		
		// LSList<Integer> ls = ls.getRange(1, 3);
		
//		ls.sort();
		
//		ls.sort((ele1, ele2) -> ele1 % 10 - ele2 % 10);
		
//		Integer[] array = ls.toArray();
		
		for (int i = 0; i < ls.size(); i++) {
			System.out.println(ls.get(i));
		}
		
	}
}
