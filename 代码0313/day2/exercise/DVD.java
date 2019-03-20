package com.qianfeng.week4.day2.exercise;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DVD {
	/**
	 * DVD状态
	 * @author luds
	 */
	public enum Status {
		Borrowed("已借出"), UnBorrowed("未借出");
		
		private String message;
		private Status(String msg) {
			this.message = msg;
		}
		
		public String value() {
			return this.message;
		}
	}
	
	/**
	 * DVD 名字
	 */
	private String dvdName;
	/**
	 * DVD 状态
	 */
	private Status dvdStatus;
	/**
	 * DVD 借出日期
	 */
	private Date dvdDate;
	/**
	 * DVD 借出次数
	 */
	private int count;
	
	
	public DVD(String name) {
		this.dvdName = name;
		this.dvdStatus = Status.UnBorrowed;
	}
	
	/**
	 * @param dvdName
	 * @param dvdStatus
	 * @param dvdDate
	 * @param count
	 */
	public DVD(String dvdName, Status dvdStatus, Date dvdDate, int count) {
		super();
		this.dvdName = dvdName;
		this.dvdStatus = dvdStatus;
		this.dvdDate = dvdDate;
		this.count = count;
	}
	
	/**
	 * 
	 */
	public DVD() {
		this.dvdStatus = Status.UnBorrowed;
	}

	/**
	 * @return the dvdName
	 */
	public String getDvdName() {
		return dvdName;
	}


	/**
	 * @return the dvdStatus
	 */
	public String getDvdStatus() {
		// return this.dvdStatus == Status.Borrowed ? "已借出" : "未借出";
		return this.dvdStatus.value();
	}
	
	public Status getStatus() {
		
		return this.dvdStatus;
	}

	
	
	/**
	 * 借DVD
	 * @return
	 */
	public boolean borrow() {
		// 1. 判断这个DVD的状态
		if (this.dvdStatus == Status.Borrowed) {
			return false;
		}
		// 2. 如果这个DVD还没有被借出
		this.dvdStatus = Status.Borrowed;
		// 3. 记录借出时间
		this.dvdDate = new Date();
		// 4. 借出次数+1
		this.count++;
		
		return true;
	}
	
	/**
	 * 还DVD
	 * @return
	 */
	public boolean send() {
		// 1. 判断这个DVD状态
		if (this.dvdStatus == Status.UnBorrowed) {
			return false;
		}
		// 2. 标记状态
		this.dvdStatus = Status.UnBorrowed;
		// 3. 把上次借出日期清零
		this.dvdDate = null;
		
		return true;
	}
	
	

	/**
	 * @return the dvdDate
	 */
	public Date getDvdDate() {
		return dvdDate;
	}
	
	/**
	 * 返回一个借出的日期（字符串的形式）
	 * @return
	 */
	public String getDvdDateStr() {
		if (this.dvdDate == null)
			return "";
		return new SimpleDateFormat("yyyy-MM-dd").format(this.dvdDate);
	}

	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}

	
	
	@Override
	public String toString() {
		String str = String.format("《%s》\t%s\t%s\t%d", this.dvdName, this.getDvdStatus(), this.getDvdDateStr(), this.count);
		return str;
	}
	
	
}
