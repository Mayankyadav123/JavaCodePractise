package com.coding.Multithreading;

import java.util.LinkedList;

public class PcDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		final PC pc=new PC();
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					pc.produce();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		Thread t2= new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					pc.consume();
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
	
	
	public static class PC{
		LinkedList<Integer> sharedList= new LinkedList<Integer>();
		int capacity=3;
		
		public void produce() throws InterruptedException {
			int value=1;
			while(true) {
				synchronized (this) {
					while(sharedList.size()==capacity) {
						wait();
					}
					System.out.println("Producer Produced:"+value);
					sharedList.add(value++);
					notify();
					Thread.sleep(1000);
				}
			}
		}
		
		public void consume() throws InterruptedException {
			while(true) {
				synchronized (this) {
					while(sharedList.size()==0) {
						wait();
					}
					int value=sharedList.removeFirst();
					System.out.println("Consumer consumed:"+value);
					notify();
					Thread.sleep(1000);
					
				}
			}
		}
	}

}
