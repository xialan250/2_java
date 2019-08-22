
package com.itmayiedu;

class ThreadTrain1_1 implements Runnable {
	// �ܹ���һ���Ż�
	private int train1Count = 100;
    private Object oj =new Object();
	@Override
	public void run() {
		// Ϊ���ܹ�ģ�����һֱ����Ʊ�Ļ��� where
		while (train1Count > 0) {
			try {
				Thread.sleep(50);
			} catch (Exception e) {
				// TODO: handle exception
			}
			// ���ۻ�܇Ʊ
			sale();
		}
	}
     
	public void sale() {
		//ͬ������� synchronized  ������Ҫ�̰߳�ȫ�����⡣
		synchronized (oj) {
			if(train1Count>0){
				System.out.println(Thread.currentThread().getName()+ ",���۵�" + (100 - train1Count + 1) + "Ʊ");
				train1Count--;
			}
		}
		
	
	}
}

public class ThreadDemo_1 {

	public static void main(String[] args) {
		ThreadTrain1_1 threadTrain1 = new ThreadTrain1_1();
		Thread t1 = new Thread(threadTrain1,"���ڢ�");
		Thread t2 = new Thread(threadTrain1,"���ڢ�");
		t1.start();
		t2.start();
	}

}
