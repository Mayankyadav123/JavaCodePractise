package com.coding.Multithreading;

public class Deaddemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Object ob1= new Object();
		final Object ob2= new Object();
		
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				synchronized (ob1) {
					System.out.println("t1 locked ob1");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized (ob2) {
						System.out.println("t1 locked ob2");
					}
				}
			}
		});
		
		Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				synchronized (ob2) {
					System.out.println("t2 locked ob2");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized (ob1) {
						System.out.println("t2 locked ob1");
					}
				}
			}
		});
		t1.start();
		t2.start();
	}
	
	

}
