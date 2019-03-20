package com.qianfeng.week2.day5.aExercise.exercise6;

/**
 * 可以去自定义一个排序的规则
 * @author luds
 *
 */
class MySortByAge implements MyComparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		if (obj1 instanceof Person && obj2 instanceof Person) {
			Person p1 = (Person)obj1;
			Person p2 = (Person)obj2;
			
			
			return p1.age - p2.age;
		}
		return 0;
	}
}

class MySortByHeight implements MyComparator {
	@Override
	public int compare(Object obj1, Object obj2) {
		if (obj1 instanceof Person && obj2 instanceof Person) {
			Person p1 = (Person)obj1;
			Person p2 = (Person)obj2;
			
			if (p1.height > p2.height) {
				return 1;
			}
			else if (p1.height < p2.height) {
				return -1;
			}
			else {
				return 0;
			}
		}
		return 0;
	}
}



