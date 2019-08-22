
package com.itmayiedu;

import java.util.concurrent.CyclicBarrier;

class Writer extends Thread {
	CyclicBarrier cyclicBarrier;
	public Writer(CyclicBarrier cyclicBarrier){
		this.cyclicBarrier=cyclicBarrier;
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "��ʼд������...");
		try {
			// ģ���ʱʱ��
			Thread.sleep(30);
			
			// ִ�в���ִ�гɹ�
			System.out.println(Thread.currentThread().getName() + "д�����ݳɹ�...");
			cyclicBarrier.await();
			System.out.println(Thread.currentThread().getName() + "��������ִ�����...");
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}

public class Test003 {

	public static void main(String[] args) {
		CyclicBarrier cyclicBarrier=	new CyclicBarrier(5);
		for (int i = 0; i < 5; i++) {
			new Writer(cyclicBarrier).start();
		}
	}

}
