
package com.itmayiedu;

import java.util.concurrent.atomic.AtomicInteger;

public class VolatileNoAtomic_1 extends Thread {
    // 需要10个线程同时共享count   static修饰关键字， 存放在静态区， 只会存放一次，所有的线程中都共享，
	private  int count = 0;
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			count++;
		}
		System.out.println(getName()+","+count);
	}
	public static void main(String[] args) {
		 // 创建10个线程
		VolatileNoAtomic_1[] volatileNoAtomicList=new VolatileNoAtomic_1[10];
		for (int i = 0; i < volatileNoAtomicList.length; i++) {
			volatileNoAtomicList[i]=new VolatileNoAtomic_1();
		}
		for (int i = 0; i < volatileNoAtomicList.length; i++) {
			volatileNoAtomicList[i].start();
		}
	}
}
