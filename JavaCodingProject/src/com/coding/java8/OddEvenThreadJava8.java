package com.coding.java8;

public class OddEvenThreadJava8 {
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
		OddEvenThreadJava8 ed = new OddEvenThreadJava8();
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

		t2.join();  // if we add it after t2.start and then t1.start() then main thread will wait for t2 complete and only then release lock
		t1.join();

/*
 * Thread.join() is working fine. What do you expect it to do here? There are three threads involved in your program: the main thread (the one that's executing main() in the first place), thread t1, 
 * and thread t2. (I know you called the other thread "two", but that's inconsistent and silly. I'm going to call it t2.) Anyway, when you call t1.join() from within the main method, which is executed by
 *  the main thread, that has the effect of causing the main thread to pause and wait until t1 is complete. It has no effect at all on t2.
*If you want to cause t2 to wait for t1 using join(), you would need to insert a call to t1.join() inside the run() method executed by t2. 
*Which would require that you pass a t1 reference to t2, which you don't have right now. More coding, fairly basic stuff, but kind of silly. 
*If you want t2 to wait for t1 to finish, it would be much simpler to just not start t2 until t1 is done. Or don't use start() at all - just call t1.run(), then t2.run(). 
*Here you're not using threads really at all, you're just calling the run() method directly. But that seems fine for what you actually want to do. 
*If you don't want the two threads running at the same time, you probably shouldn't bother using threads at all here.
 */
	}	

}
