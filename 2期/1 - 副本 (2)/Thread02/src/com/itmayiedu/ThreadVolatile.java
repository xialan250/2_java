
package com.itmayiedu;

class ThreadVolatileDemo extends Thread {
	public boolean flag = true;

	@Override
	public void run() {
		System.out.println("���߳̿�ʼִ��...");
		while (flag) {
		}
		System.out.println("���߳�ִ�н���...");
	}
	public void setFlag(boolean flag){
		this.flag=flag;
	}

}

public class ThreadVolatile {
	public static void main(String[] args) throws InterruptedException {
//        ThreadVolatileDemo threadVolatileDemo = new ThreadVolatileDemo();
//        threadVolatileDemo.start();
//        threadVolatileDemo.setFlag(false);
        
        ThreadVolatileDemo threadVolatileDemo = new ThreadVolatileDemo();
        threadVolatileDemo.start();
        Thread.sleep(3000);
        threadVolatileDemo.setFlag(false);
	    System.out.println("flag�ѽ��޸�false!");
	    Thread.sleep(1000);
	    System.out.println(threadVolatileDemo.flag);        
		
		
//              ThreadVolatileDemo threadVolatileDemo = new ThreadVolatileDemo();
//              threadVolatileDemo.start();
////              threadVolatileDemo.setFlag(false);
//              Thread.sleep(3000);
//              //���߳��޸Ĺ���ȫ�ֱ���Ϊfalse
//              threadVolatileDemo.setFlag(false);
//              System.out.println("flag�ѽ��޸�false!");
//              Thread.sleep(1000);
//              System.out.println(threadVolatileDemo.flag);
	}
}
