
package com.itmayiedu;

public class Test005 {

	/**
	 * 锟矫伙拷锟竭筹拷 锟斤拷锟斤拷锟竭程达拷锟斤拷锟斤拷锟竭程★拷 锟斤拷锟截伙拷锟竭筹拷 锟截伙拷锟竭筹拷 锟斤拷锟斤拷锟竭筹拷一锟斤拷锟斤拷锟劫★拷
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 30; i++) {
					try {
						Thread.sleep(300);
					} catch (Exception e) {
						// TODO: handle exception
					}
					System.out.println("锟斤拷锟竭筹拷,i:" + i);
				}
			}
		});
		 //锟斤拷锟竭筹拷为锟截伙拷锟竭筹拷 锟斤拷锟斤拷锟竭筹拷一锟斤拷锟斤拷锟斤拷
		t1.setDaemon(true);
		t1.start();
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(300);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println("锟斤拷锟竭筹拷,i:" + i);
		}
		System.out.println("锟斤拷锟竭筹拷执锟斤拷锟斤拷锟�.....");
	}

}
