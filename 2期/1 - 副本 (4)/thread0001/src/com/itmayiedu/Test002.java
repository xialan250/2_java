
package com.itmayiedu;

import java.util.concurrent.CountDownLatch;

public class Test002 {

	public static void main(String[] args) throws InterruptedException {
	   CountDownLatch countDownLatch = new CountDownLatch(3);
		new Thread(new Runnable() {
			public void run() {
				System.out.println("我是子线程开始执行任务......1");
				try {
					//子线程正在处理事情
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO: handle exception
				}
				countDownLatch.countDown();//每次减1
				System.out.println("我是子线程开始执行任务......1");
			}
		}).start();;
		new Thread(new Runnable() {
			public void run() {
				System.out.println("我是子线程开始执行任务......2");
				try {
					//子线程正在处理事情
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO: handle exception
				}
				countDownLatch.countDown();//每次减1
				System.out.println("我是子线程开始执行任务......2");
			}
		}).start();;
		countDownLatch.await();//如果不为0的时候，一致等待
		System.out.println("主线程开始执行任务");
		for (int i = 0; i < 10; i++) {
			System.out.println("main i:"+i);
		}
	}

}
