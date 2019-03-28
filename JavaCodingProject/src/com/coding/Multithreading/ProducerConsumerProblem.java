package com.coding.Multithreading;

import java.util.LinkedList;

public class ProducerConsumerProblem {

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
		
		//So that t1 finishes before t2
		t1.join();
		t2.join();
	}
	
	public static class PC{
		LinkedList<Integer> sharedList=new LinkedList<Integer>();
		int capacity=2;
		
		public void produce() throws InterruptedException {
			int value=0;
			while(true) {
				//only one thread can access at a time
				synchronized (this) {
					//wait if full
					if(sharedList.size()==capacity) {
						try {
							wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					System.out.println("Producer produced="+value);
					sharedList.add(value++);
					
					notify();
					Thread.sleep(1000);
				}
			}
		}
		public void consume() throws InterruptedException {
			while(true) {
				synchronized (this) {
					//wait if empty
					if(sharedList.size()==0) {
						try {
							wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					int value=sharedList.removeFirst();
					System.out.println("Consumer consumed="+value);
					
					notify();
					Thread.sleep(1000);
				}
			}
		}
		
	}

}
