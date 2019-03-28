package com.coding.threading;

public class Deadlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Object resource1= new Object();
		final Object resource2= new Object();
		Thread t1= new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				synchronized (resource1) {
					System.out.println("Holdin lock 1");
					System.out.println("Thread1: locked resource1");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized (resource2) {
					System.out.println("Thread1: locked resource2 after resource1");	
					}
				}
			}
		});
		
		Thread t2= new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				synchronized (resource2) {
					System.out.println("Holdin lock 2");
					System.out.println("Thread2: locked resource 2");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized(resource1) {
						System.out.println("Thread2: locked resource 1 after resource 2");
					}
				}
			}
		});
		t1.start();
		t2.start();
		
	}
}



