
package com.itmayiedu;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.TimeUnit;

public class Test005 {

	public static void main(String[] args) throws InterruptedException {
		// �޽�
		ConcurrentLinkedDeque concurrentLinkedDeque = new ConcurrentLinkedDeque();
		concurrentLinkedDeque.offer("����");
		concurrentLinkedDeque.offer("����");
//		System.out.println(concurrentLinkedDeque.size());
//		System.out.println(concurrentLinkedDeque.poll());
//		System.out.println(concurrentLinkedDeque.peek());
//		System.out.println(concurrentLinkedDeque.size());
		
		
		
		ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(3);
		arrayBlockingQueue.add("����");
		arrayBlockingQueue.add("����");
		arrayBlockingQueue.add("����");
		//���������Ķ���
		boolean offer = arrayBlockingQueue.offer("��������", 2, TimeUnit.SECONDS);
		System.out.println(arrayBlockingQueue.size()+"---"+offer);
		System.out.println(arrayBlockingQueue.poll());
		System.out.println(arrayBlockingQueue.poll());
		System.out.println(arrayBlockingQueue.poll());
		System.out.println(arrayBlockingQueue.poll());
	}

}
