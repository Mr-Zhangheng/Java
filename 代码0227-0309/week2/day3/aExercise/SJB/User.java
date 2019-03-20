package com.qianfeng.week2.day3.aExercise.SJB;

public class User {
	String name;
	int total;
	int success;
	int defeat;
	
	
	
	/**
	 * @param name
	 */
	public User(String name) {
		super();
		this.name = name;
	}



	/**
	 * @param name
	 * @param total
	 * @param success
	 * @param defeat
	 */
	public User(String name, int total, int success, int defeat) {
		super();
		this.name = name;
		this.total = total;
		this.success = success;
		this.defeat = defeat;
	}



	/**
	 * »ñÈ¡Ê¤ÂÊ
	 * @return
	 */
	double getRadio() {
		return (double)success / total;
	}
}
