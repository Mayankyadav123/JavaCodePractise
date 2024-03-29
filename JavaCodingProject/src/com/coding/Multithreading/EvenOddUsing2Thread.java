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
					System.out.println("++");
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
					System.out.println("--");
					ed.printEven();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		t2.start(); // create seperate thread pool if use run it will work with main threadpool
		t1.start();

		t2.join(); //this is getting called first but due to condition going to wait state
		t1.join();


	}	

}
