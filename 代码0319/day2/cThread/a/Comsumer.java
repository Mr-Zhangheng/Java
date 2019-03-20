package com.qianfeng.week5.day2.cThread.a;

/**
 * 消费者：负责消费产品
 * 1. 开始消费的时候，先判断是否有产品可以消费
 * 2. 如果有产品，就去消费这个产品
 * 3. 如果没有产品，就通知生产者去生产
 * @author luds
 */
public class Comsumer implements Runnable {
	
	/**
	 * 用来表示这个消费者需要消费的产品
	 */
	private Good good;
	
	public Comsumer(Good good) {
		this.good = good;
	}
	
	@Override
	public void run() {
		while (true) {
			synchronized ("") {
				// 1. 判断是否可以消费
				if (Constants.shouldProduct == false) {
					// 模拟消费：输出消费的详情
					System.out.println("消费者【" + Thread.currentThread().getName() + "】消费了一个产品【" + this.good.name + "】");
					// 把生产标记修改一下
					Constants.shouldProduct = true;
					// 通知生产者生产
					"".notifyAll();
				}
				else {
					// 说明需要生产
					try {
						"".wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}
