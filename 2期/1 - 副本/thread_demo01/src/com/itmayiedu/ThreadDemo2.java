
package com.itmayiedu;



class CreateThreadDemo02 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			System.out.println("���߳� run,i:" + i);
		}

	}

}

/**
 * 
 * @classDesc: ��������:(��δ������߳�)
 * @author: ��ʤ��
 * @createTime: 2017��12��2�� ����9:51:39
 * @version: v1.0
 * @copyright:���Ͽ���(ÿ��ѧԺ)�Ϻ�ÿ�ؽ����Ƽ����޹�˾��Ʒ
 * @website:www.itmayiedu.com����www.meiteedu.com
 * @weixin:�ٷ�΢�ź� ÿ��ѧԺ
 * @QQ:644064779 QQȺ:116295598
 */
public class ThreadDemo2 {

	/**
	 * ʲô�ǽ��̣� ���̾����������е�Ӧ�ó��򣬽������̵߳ļ��ϡ� ʲô���̣߳��߳̾���һ��ִ��·����һ��������ִ�е�Ԫ�� ʲô�Ƕ��߳�
	 * Ϊ����߳���Ч�� ��������Щ��ʽ�� 1��ʹ�ü̳�Therad�෽ʽ �̳�Thread����дrun���� 2��ʹ��ʵ��runlabe�ӿڷ�ʽ
	 * 3��ʹ�������ڲ��෽ʽ 4��callable 5��ʹ���̳߳ش����̡߳�
	 */
	public static void main(String[] args) {
		CreateThreadDemo02 t1 = new CreateThreadDemo02();
		Thread thread = new Thread(t1);
		thread.start();
		for (int i = 0; i < 30; i++) {
			System.out.println("���߳� i:" + i);
		}
	
	}

}
