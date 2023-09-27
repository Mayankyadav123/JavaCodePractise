package com.coding.java8;

public class DeadLock {
	

	public static void main(String[] args) {
		
		final Object resource1= new Object();
		final Object resource2= new Object();
		
		// TODO Auto-generated method stub
		Thread t1 = new Thread(()->{
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
					System.out.println("t1 locked resource2");
				}
			}
		});
		
		Thread t2 = new Thread(()->{
			synchronized (resource2) {
				System.out.println("Holdin lock 2");
				System.out.println("Thread2: locked resource2");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (resource1) {
					System.out.println("t2 locked resource1");
				}
			}
		});

		
	}

}
