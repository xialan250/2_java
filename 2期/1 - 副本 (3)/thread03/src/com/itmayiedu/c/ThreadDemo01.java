
package com.itmayiedu.c;

class Res {
	public String userName;
	public String sex;
	public boolean flag = false;
}

class InputThread extends Thread {
	private Res res;

	public InputThread(Res res) {
		this.res = res;
	}

	@Override
	public void run() {
		int count = 0;
		while (true) {
			synchronized (res) {
				if (res.flag) {
					try {
						res.wait();
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
			if (count == 0) {
				res.userName = "��ʤ��";
				res.sex = "��";
			} else {
				res.userName = "С��";
				res.sex = "Ů";
			}
			count = (count + 1) % 2;
			res.flag = true;
			res.notify();

			}
		}
	}
}

class OutThrad extends Thread {
	private Res res;

	public OutThrad(Res res) {
		this.res = res;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (res) {
				if (!res.flag) {
					try {
						res.wait();
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
				System.out.println(res.userName + "," + res.sex);
				res.flag = false;
				res.notify();

			}
		}

	}
}

public class ThreadDemo01 {

	public static void main(String[] args) {
		Res res = new Res();
		InputThread inputThread = new InputThread(res);
		OutThrad outThrad = new OutThrad(res);
		inputThread.start();
		outThrad.start();
	}

}
