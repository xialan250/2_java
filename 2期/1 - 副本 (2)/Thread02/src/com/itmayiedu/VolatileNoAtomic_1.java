
package com.itmayiedu;

import java.util.concurrent.atomic.AtomicInteger;

public class VolatileNoAtomic_1 extends Thread {
    // ��Ҫ10���߳�ͬʱ����count   static���ιؼ��֣� ����ھ�̬���� ֻ����һ�Σ����е��߳��ж�����
	private  int count = 0;
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			count++;
		}
		System.out.println(getName()+","+count);
	}
	public static void main(String[] args) {
		 // ����10���߳�
		VolatileNoAtomic_1[] volatileNoAtomicList=new VolatileNoAtomic_1[10];
		for (int i = 0; i < volatileNoAtomicList.length; i++) {
			volatileNoAtomicList[i]=new VolatileNoAtomic_1();
		}
		for (int i = 0; i < volatileNoAtomicList.length; i++) {
			volatileNoAtomicList[i].start();
		}
	}
}
