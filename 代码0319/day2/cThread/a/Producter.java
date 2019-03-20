package com.qianfeng.week5.day2.cThread.a;

public class Producter implements Runnable {
	
	private Good good;
	public Producter(Good good) {
		this.good = good;
	}
	@Override
	public void run() {
		while (true) {
			synchronized ("") {
				if (Constants.shouldProduct) {
					// 模拟一个生产的过程
					this.good.name = "蒸羊羔"; 
					
					System.out.println("生产者【" + Thread.currentThread().getName() + "】生产了一个产品【" + this.good.name + "】");
					
					// 修改生产标记
					Constants.shouldProduct = false;
					
					// 通知消费者消费
					"".notifyAll();
				}
				else {
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
