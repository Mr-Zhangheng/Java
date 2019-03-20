package com.qianfeng.week3.day1.aExercise.exercise1.studentsManager.scoreManager;

import java.util.Scanner;

import com.qianfeng.week3.day1.aExercise.exercise1.commonModule.MathUtil;
import com.qianfeng.week3.day1.aExercise.exercise1.studentsManager.studentInfoManager.Student;

public class MyTest {
	public static void main(String[] args) {
		// 
		Student xiaoming = new Student("xiaoming", "XSQ_BigData_19");
		Student xiaoli = new Student("xiaoli", "XSQ_BigData_19");
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个考试成绩");
		// 考试成绩
		float score = scanner.nextFloat();
		xiaoming.score = MathUtil.abs(score); 
				
		System.out.println("请输入一个平时成绩");
		// 考试成绩
		float secondScore = scanner.nextFloat();
		xiaoming.secondScore = MathUtil.abs(secondScore); 
		
		
	}
}
