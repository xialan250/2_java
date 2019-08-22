
package com.itmayiedu;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

class ProducerThread extends Thread {
	private BlockingQueue queue;
	private volatile boolean flag = true;
	private static AtomicInteger count = new AtomicInteger();

	ProducerThread(BlockingQueue blockingQueue) {
		this.queue = blockingQueue;
	}

	@Override
	public void run() {
		System.out.println("�������߳�����...");

		try {
			while (flag) {

				System.out.println("������������");
				String data = count.incrementAndGet() + "";
				// ��Ӷ���
				boolean offer = queue.offer(data);
				if (offer) {
					System.out.println("��������Ӷ���" + data + "�ɹ�!");
				} else {
					System.out.println("��������Ӷ���" + data + "ʧ��!");
				}
				Thread.sleep(1000);

			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			System.out.println("�������߳�ֹͣ...");
		}
	}

	public void stopThread() {
		this.flag = false;
	}

}

class ConsumerThread extends Thread {
	private BlockingQueue queue;
	private volatile boolean flag = true;

	ConsumerThread(BlockingQueue blockingQueue) {
		this.queue = blockingQueue;
	}

	@Override
	public void run() {
		System.out.println("�������߳�����....");
		try {
			while (flag) {
				// ��ȡ��ϣ����л�ɾ����
				String data = (String) queue.poll(2, TimeUnit.SECONDS);
				if (data != null) {
					System.out.println("�����߻�ȡ data:" + data + "�ɹ�...");
				} else {
					System.out.println("�����߻�ȡ data:" + data + "ʧ��..");
					this.flag = false;
				}

			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			System.out.println("����ֹͣ....");
		}
	}
}

public class Test006 {
	public static void main(String[] args) throws InterruptedException {

		BlockingQueue<String> queue = new LinkedBlockingQueue<String>(10);
		ProducerThread p1 = new ProducerThread(queue);
		// ProducerThread p2 = new ProducerThread(queue);
		ConsumerThread c1 = new ConsumerThread(queue);
		p1.start();
		// p2.start();
		c1.start();

		// ִ��10s
		Thread.sleep(10 * 1000);
		p1.stopThread();
		// p2.stopThread();

	}

}
