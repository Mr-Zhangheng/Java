package com.qianfeng.week4.day2.exercise;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DVD {
	/**
	 * DVD״̬
	 * @author luds
	 */
	public enum Status {
		Borrowed("�ѽ��"), UnBorrowed("δ���");
		
		private String message;
		private Status(String msg) {
			this.message = msg;
		}
		
		public String value() {
			return this.message;
		}
	}
	
	/**
	 * DVD ����
	 */
	private String dvdName;
	/**
	 * DVD ״̬
	 */
	private Status dvdStatus;
	/**
	 * DVD �������
	 */
	private Date dvdDate;
	/**
	 * DVD �������
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
		// return this.dvdStatus == Status.Borrowed ? "�ѽ��" : "δ���";
		return this.dvdStatus.value();
	}
	
	public Status getStatus() {
		
		return this.dvdStatus;
	}

	
	
	/**
	 * ��DVD
	 * @return
	 */
	public boolean borrow() {
		// 1. �ж����DVD��״̬
		if (this.dvdStatus == Status.Borrowed) {
			return false;
		}
		// 2. ������DVD��û�б����
		this.dvdStatus = Status.Borrowed;
		// 3. ��¼���ʱ��
		this.dvdDate = new Date();
		// 4. �������+1
		this.count++;
		
		return true;
	}
	
	/**
	 * ��DVD
	 * @return
	 */
	public boolean send() {
		// 1. �ж����DVD״̬
		if (this.dvdStatus == Status.UnBorrowed) {
			return false;
		}
		// 2. ���״̬
		this.dvdStatus = Status.UnBorrowed;
		// 3. ���ϴν����������
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
	 * ����һ����������ڣ��ַ�������ʽ��
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
		String str = String.format("��%s��\t%s\t%s\t%d", this.dvdName, this.getDvdStatus(), this.getDvdDateStr(), this.count);
		return str;
	}
	
	
}
