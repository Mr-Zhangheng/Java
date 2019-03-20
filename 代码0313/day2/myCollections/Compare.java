package com.qianfeng.week4.day2.myCollections;

public interface Compare<E> {
	// 实现两个元素的大小比较规则
	int compare(E ele1);
}