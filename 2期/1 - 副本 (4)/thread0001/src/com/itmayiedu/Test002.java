
package com.itmayiedu;

import java.util.concurrent.CountDownLatch;

public class Test002 {

	public static void main(String[] args) throws InterruptedException {
	   CountDownLatch countDownLatch = new CountDownLatch(3);
		new Thread(new Runnable() {
			public void run() {
				System.out.println("�������߳̿�ʼִ������......1");
				try {
					//���߳����ڴ�������
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO: handle exception
				}
				countDownLatch.countDown();//ÿ�μ�1
				System.out.println("�������߳̿�ʼִ������......1");
			}
		}).start();;
		new Thread(new Runnable() {
			public void run() {
				System.out.println("�������߳̿�ʼִ������......2");
				try {
					//���߳����ڴ�������
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO: handle exception
				}
				countDownLatch.countDown();//ÿ�μ�1
				System.out.println("�������߳̿�ʼִ������......2");
			}
		}).start();;
		countDownLatch.await();//�����Ϊ0��ʱ��һ�µȴ�
		System.out.println("���߳̿�ʼִ������");
		for (int i = 0; i < 10; i++) {
			System.out.println("main i:"+i);
		}
	}

}
