package com.qianfeng.week4.aList;

import java.util.Stack;

/**
 * Stack: ������ջ�ṹ���洢���ݵ�һ������
 * @author luds
 */
public class StackDemo {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		
		for (int i = 0; i < 10; i++) {
			s.push(i);
		}
		
		System.out.println(s.peek());
		
		System.out.println(s.pop());
		
		System.out.println(s);
	}
}
