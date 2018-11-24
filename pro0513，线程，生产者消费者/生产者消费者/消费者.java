﻿package pro0513.生产者消费者;

public class 消费者 extends Thread {

	private 经销商 j;

	public 消费者(经销商 j) {
		this.j = j;
	}

	public void run() {
		for (int i = 1; i < 21; i++) {
			
			商品 s = j.售卖();
			System.out.println("购买了" + s);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}

		}
	}
}
