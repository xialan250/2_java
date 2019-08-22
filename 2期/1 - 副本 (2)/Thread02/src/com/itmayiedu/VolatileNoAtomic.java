
package com.itmayiedu;

import java.util.concurrent.atomic.AtomicInteger;

public class VolatileNoAtomic extends Thread {
    // ��Ҫ10���߳�ͬʱ����count   static���ιؼ��֣� ����ھ�̬���� ֻ����һ�Σ����е��߳��ж�����
//	private  volatile static int count = 0;
	private static AtomicInteger count = new AtomicInteger(0);
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
//			count++;
			count.incrementAndGet();
		}
		//System.out.println(getName()+","+count);
		System.out.println(getName()+","+count.get());
	}
	public static void main(String[] args) {
		 // ����10���߳�
		VolatileNoAtomic[] volatileNoAtomicList=new VolatileNoAtomic[10];
		for (int i = 0; i < volatileNoAtomicList.length; i++) {
			volatileNoAtomicList[i]=new VolatileNoAtomic();
		}
		for (int i = 0; i < volatileNoAtomicList.length; i++) {
			volatileNoAtomicList[i].start();
		}
	}
}
