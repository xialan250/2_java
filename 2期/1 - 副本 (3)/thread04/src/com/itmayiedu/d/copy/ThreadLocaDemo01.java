
package com.itmayiedu.d.copy;

class ResNumber {
	public int count = 0;
	
	public static ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>(){
		protected Integer initialValue() {
			return 0;
			
		};
	};

	public int getCount() {
		count = threadLocal.get() + 1;
//		count = count+1;
		threadLocal.set(count);
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	
}

class ThreadLocaDemo extends Thread {
	private ResNumber resNumber;
	
	public ThreadLocaDemo(ResNumber resNumber) {
		this.resNumber = resNumber;
	}
	
	@Override
	public void run() {
		for(int i=0; i<3; i++) {
			System.out.println(getId()+", number:"+resNumber.getCount());
		}
	}
}


public class ThreadLocaDemo01 {

	public static void main(String[] args) {
		ResNumber resNumber = new ResNumber();
		ThreadLocaDemo t1 = new ThreadLocaDemo(resNumber);
		ThreadLocaDemo t2 = new ThreadLocaDemo(resNumber);
		ThreadLocaDemo t3 = new ThreadLocaDemo(resNumber);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
