
package com.itmayiedu;

import java.util.Random;
import java.util.concurrent.Semaphore;

class Parent extends  Thread {
	Semaphore wc;
	String name;

	public Parent(Semaphore wc, String name) {
		this.wc = wc;
		this.name = name;
	}

	@Override
	public void run() {
		// ��ȡ����Դ����ȥ1
		int availablePermits = wc.availablePermits();
		if (availablePermits > 0) {
			System.out.println(name + "������Ҳ������é����!!");
		} else {
			System.out.println(name + "��ôû��é����.....");
		}
		try {
			wc.acquire();
			System.out.println(name+"�������ϲ����ˣ�ˬ!!!");
			
			Thread.sleep(new Random().nextInt(1000)); // ģ���ϲ���ʱ�䡣
			System.out.println(name+"��������������!");
			
		} catch (InterruptedException e) {

		}finally {
			//�ͷ�é��
			wc.release();
		}

	}
}

public class Test004 {

	public static void main(String[] args) throws InterruptedException {
//		// ���֧�ֶ����Դ����
//		Semaphore semaphore = new Semaphore(5);
//		// ��ȡ����Դ����ȥ1
//		semaphore.availablePermits();
//		// �ͷ���Դ
//		semaphore.release();
		
		
		
		Semaphore semaphore = new Semaphore(3);
		for (int i = 1; i <=10; i++) {
			  new Parent(semaphore,"��"+i+"��"+",").start();
		}
	}

}
