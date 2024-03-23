package com.coding.java8;

import java.util.stream.IntStream;

public class ThreadStartRunCompare {
	
	/*
	 * Can we overload run method?
	 * yes but passing parameter and removing @overriden run(int j) but its of no use
	 * because when start() is called it checks for 
	 * run(){ 
	 * if(target!=null){
	 * target.run();
	 * }
	 * so overloaded method just works as a normal java method
	 * 
	 * */
	/*
	 * Can we override start method?
	 * yes but then it will only act as java method and not create any new thread so no use
	 * 
	 * */
	public static void main(String[] args) {
		Thread t1= new Thread(()->{
		IntStream.rangeClosed(1, 10).forEach( i -> {
			//Thread.currentThread().start(); if we try to do start inside run method it will give illegal state exception
			System.out.println("Thread : Child "+Thread.currentThread().getName()+":"+i);
		});
		});
		t1.setName("Child Thread");
		//if we uset1.start() without overrriding run() we will not get any output because itnernally run check for Runnable target
		//run(){
		// if(target!=null){
		// target.run(); this gets called
		//}}
		
		//what happens when we do start and when we directly call run?
		t1.start(); // when start() is called a new thread is created and a run is assigned to work concurrently. Here o/p will show both main and child thread work together
		//t1.run(); // if we directly do run() then it works as a normal method and o/p shows first  child is printing as per method call on main thread
		
		IntStream.rangeClosed(1, 10).forEach( i -> {
			System.out.println("Thread Main: "+Thread.currentThread().getName()+":"+i);
		});
		
		// t1.start(); // if we call 2 times it will give java.lang.IllegalThreadStateException we can't restart the running thread
		}

}
