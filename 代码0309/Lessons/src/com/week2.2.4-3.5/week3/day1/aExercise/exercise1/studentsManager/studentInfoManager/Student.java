package com.qianfeng.week3.day1.aExercise.exercise1.studentsManager.studentInfoManager;

import com.qianfeng.week3.day1.aExercise.exercise1.commonModule.MathUtil;

public class Student {
	public String name;
	public String className;
	public float score;
	public float secondScore;
	private int totalScore;
	
	
	public int getTotalScore() {
		float result = MathUtil.pow(this.secondScore * 0.4f + this.score * 0.6f);
		
		return MathUtil.getRound(result);
	}
	
	
	@Override
	public String toString() {
		return "";
	}
	
	public void introduceSelf() {
		System.out.println();
	}
	
	public Student(String name, String className) {
		this.name = name;
		this.className = className;
	}
}
