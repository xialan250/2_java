
package com.itmayiedu;

public class Thread005 {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 60; i++) {
                      System.out.println("���߳�,i:"+i);
				}
			}
		});
		thread.start();
		// ���߳������߳���ִ����ϵĻ�����ô����
		try {
			thread.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		for (int i = 0; i < 30; i++) {
            System.out.println("���߳�,i:"+i);
		}
	}

}
