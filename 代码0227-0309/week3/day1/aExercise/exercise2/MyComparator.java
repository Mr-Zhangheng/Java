package com.qianfeng.week3.day1.aExercise.exercise2;

public interface MyComparator {
	/**
	 * �趨һ�������Ƚ�����Person����ķ�����
	 * @param p1
	 * @param p2
	 * @return
	 * > 0: p1 > p2
	 * ==0: p1 ==p2
	 * < 0: p1 < p2
	 */
	int compare(Person p1, Person p2);
}
