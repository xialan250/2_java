
package com.itmayiedu;

class ThreadTrain2 implements Runnable {
	// �ܹ���һ���Ż� ��һ������static���εĻ����������������class�ļ������ص�ʱ��ͻᱻ��ʼ����
	private static int train1Count = 100;
	private Object oj = new Object();
	public boolean flag = true;

	@Override
	public void run() {
		// Ϊ���ܹ�ģ�����һֱ����Ʊ�Ļ��� where
		if (flag) {
                  //ִ��ͬ�������this��
                  while (train1Count > 0) {
            
          			synchronized (this) {
          				if(train1Count>0){
          					try {
          						Thread.sleep(50);
          					} catch (Exception e) {
          						// TODO: handle exception
          					}
          					System.out.println(Thread.currentThread().getName()+ ",���۵�" + (100 - train1Count + 1) + "Ʊ");
          					train1Count--;
          				}
          			}
					
				}
		}
		else{
			 // ͬ������
			while (train1Count > 0) {
			
				// ���ۻ�܇Ʊ
				sale();
			}
		}
		
	}

	public   synchronized void sale() {

		// ͬ������� synchronized ������Ҫ�̰߳�ȫ�����⡣
		// synchronized (oj) {
		if (train1Count > 0) {
			try {
				Thread.sleep(50);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println(Thread.currentThread().getName() + ",���۵�" + (100 - train1Count + 1) + "Ʊ");
			train1Count--;
		}
		// }

	}
}

public class ThreadDemo2 {

	public static void main(String[] args) throws InterruptedException {
		ThreadTrain2 threadTrain2 = new ThreadTrain2();
		Thread t1 = new Thread(threadTrain2, "���ڢ�");
		Thread t2 = new Thread(threadTrain2, "���ڢ�");
		t1.start();
	    Thread.sleep(40);
	    threadTrain2.flag=false;
		t2.start();
	}

}
