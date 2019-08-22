
package com.itmayiedu.d;

class ResNumber {
	public int count = 0;

	public int getCount() {
		count = count+1;
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
//		ResNumber resNumber = new ResNumber();
//		ThreadLocaDemo t1 = new ThreadLocaDemo(resNumber);
//		ThreadLocaDemo t2 = new ThreadLocaDemo(resNumber);
//		ThreadLocaDemo t3 = new ThreadLocaDemo(resNumber);
//		
//		t1.start();
//		t2.start();
//		t3.start();
		
		
		ResNumber resNumber1 = new ResNumber();
		ResNumber resNumber2 = new ResNumber();
		ResNumber resNumber3 = new ResNumber();
		ThreadLocaDemo t1 = new ThreadLocaDemo(resNumber1);
		ThreadLocaDemo t2 = new ThreadLocaDemo(resNumber2);
		ThreadLocaDemo t3 = new ThreadLocaDemo(resNumber3);
		
		t1.start();
		t2.start();
		t3.start();		
	}

}
