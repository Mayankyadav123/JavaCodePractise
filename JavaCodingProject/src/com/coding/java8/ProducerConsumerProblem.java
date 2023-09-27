package com.coding.java8;

import java.util.LinkedList;

public class ProducerConsumerProblem {

	
	
	public static void main(String args[]) throws InterruptedException {
		final PC pc = new PC();
		Thread t1= new Thread(()->{
			try {
				pc.produce();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		Thread t2= new Thread(()->{
			try {
				pc.consume();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
	}
	
	public static class PC {
		
		LinkedList<Integer> sharedList =  new LinkedList<Integer>();
		int capacity=2;

		public void produce() throws InterruptedException {
			int value=0;
			while(true) { //until wait condition we keep producing hence while true
				synchronized(this) {
					if(sharedList.size()==capacity) {
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
					if(sharedList.size()==0) {
						wait();
					}
					int value=sharedList.removeFirst();
					System.out.println("Consumer Consumed:"+value);
					notify();
					Thread.sleep(1000);
				}
			}
		}
		
	}
	
	
	
}
