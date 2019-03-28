package com.coding.Multithreading;

public class EvenOddUsing2Thread {

	boolean odd;
	int max = 10;
	int count = 1;

	public void printOdd() throws InterruptedException {
		synchronized (this) {
			while (count < max) {
				if (!odd) {
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
				System.out.println("Odd thread: "+count);
				count++;
				odd=false;
				notify();
				Thread.sleep(1000);
			}
		}
	}

	public void printEven() throws InterruptedException {
		synchronized (this) {
			while (count < max) {
				if (odd) {
					wait();
				}
				System.out.println("Even Thread:"+count);
				odd=true;
				count++;
				notify();
				Thread.sleep(1000);
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		EvenOddUsing2Thread ed = new EvenOddUsing2Thread();
		ed.odd=true;
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					ed.printOdd();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					ed.printEven();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		t1.start();
		t2.start();

		t1.join();
		t2.join();


	}	

}
