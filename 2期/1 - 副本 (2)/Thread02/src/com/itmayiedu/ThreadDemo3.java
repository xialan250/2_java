
package com.itmayiedu;

class ThreadTrain3 implements Runnable {
	// �ܹ���һ���Ż� ��һ������static���εĻ����������������class�ļ������ص�ʱ��ͻᱻ��ʼ����
	private static int train1Count = 100;
	private Object oj = new Object();
	public boolean flag = true;

	@Override
	public void run() {
		// Ϊ���ܹ�ģ�����һֱ����Ʊ�Ļ��� where
		if (flag) {
			// ִ��ͬ�������this��
			while (true) {
				synchronized (oj) {
					sale();
				}
			}
		} else {
			// ͬ������
			while (true) {

				// ���ۻ�܇Ʊ
				sale();
			}
		}

	}

	public synchronized void sale() {

		// ͬ������� synchronized ������Ҫ�̰߳�ȫ�����⡣
		synchronized (oj) {
			if (train1Count > 0) {
				try {
					Thread.sleep(50);
				} catch (Exception e) {
					// TODO: handle exception
				}
				System.out.println(Thread.currentThread().getName() + ",���۵�" + (100 - train1Count + 1) + "Ʊ");
				train1Count--;
			}
		}

	}
}

public class ThreadDemo3 {

	public static void main(String[] args) throws InterruptedException {
		ThreadTrain3 threadTrain3 = new ThreadTrain3();
		Thread t1 = new Thread(threadTrain3, "���ڢ�");
		Thread t2 = new Thread(threadTrain3, "���ڢ�");
		t1.start();
		Thread.sleep(40);
		threadTrain3.flag = false;
		t2.start();
	}

}
