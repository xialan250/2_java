
package com.itmayiedu;

import java.util.concurrent.atomic.AtomicInteger;

public class VolatileNoAtomic_2 extends Thread {
    // ��Ҫ10���߳�ͬʱ����count   static���ιؼ��֣� ����ھ�̬���� ֻ����һ�Σ����е��߳��ж�����
	private volatile static int count = 0;
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			count++;
		}
		System.out.println(getName()+","+count);
	}
	public static void main(String[] args) {
		 // ����10���߳�
		VolatileNoAtomic_2[] volatileNoAtomicList=new VolatileNoAtomic_2[10];
		for (int i = 0; i < volatileNoAtomicList.length; i++) {
			volatileNoAtomicList[i]=new VolatileNoAtomic_2();
		}
		for (int i = 0; i < volatileNoAtomicList.length; i++) {
			volatileNoAtomicList[i].start();
		}
	}
}
