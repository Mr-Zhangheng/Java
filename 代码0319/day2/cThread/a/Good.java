package com.qianfeng.week5.day2.cThread.a;

/**
 * 商品，消费品类，作为生产者和消费者都需要访问的临界资源。
 * @author luds
 */
public class Good {
	public String name;

	/**
	 * @param name
	 */
	public Good(String name) {
		super();
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Good [name=" + name + "]";
	}
	
}
