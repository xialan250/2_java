
package com.itmayiedu;

/***
 * 
 * @classDesc: ��������:(ʹ�ó��õ��߳�apidemo)
 * @author: ��ʤ��
 * @createTime: 2017��12��2�� ����10:32:57
 * @version: v1.0
 * @copyright:���Ͽ���(ÿ��ѧԺ)�Ϻ�ÿ�ؽ����Ƽ����޹�˾��Ʒ
 * @website:www.itmayiedu.com����www.meiteedu.com
 * @weixin:�ٷ�΢�ź� ÿ��ѧԺ
 * @QQ:644064779 QQȺ:116295598
 */
class CreateThread05 implements Runnable {
  
	// getId() �̵߳�id Ψһ�� �����ظ���
	@Override
	public void run() {

		for (int i = 0; i < 20; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		
			
		//	System.out.println("�߳�id:" + getId() + ":���߳� ,i:" + i + "name:" + getName());
			System.out.println("�߳�id:" + Thread.currentThread().getId() + ":���߳� ,i:" + i + "name:" +Thread.currentThread().getName());
		    if(i==5){
		    	 Thread.currentThread().stop();// ����ȫ����������ʹ�á�
		    }
		
		}

	}
}

public class ThreadDemo04 {

	public static void main(String[] args) {
		// ��ȡ���̵߳�id
		// �κ�һ������϶���һ�����߳�
//		System.out.println("���߳�:" + Thread.currentThread().getId() + ",name:" + Thread.currentThread().getName());
//		CreateThread05 t1 = new CreateThread05();
//		t1.start();
		// for (int i = 0; i < 3; i++) {
		//
		// }
		//	Thread.currentThread()��ȡ����ǰ�̵߳�
	    CreateThread05 t1 = new CreateThread05();
	    Thread thread = new Thread(t1,"���߳�");
	    thread.start();

	}

}
