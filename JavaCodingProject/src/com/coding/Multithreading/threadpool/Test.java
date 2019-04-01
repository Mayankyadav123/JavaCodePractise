package com.coding.Multithreading.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
	public static final int MAX_T=3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r1=new Task("T1");
		Runnable r2=new Task("T2");
		Runnable r3=new Task("T3");
		Runnable r4=new Task("T4");
		Runnable r5=new Task("T5");
	//	Executors.newCachedThreadPool(threadFactory)
		ExecutorService pool=Executors.newFixedThreadPool(MAX_T);
		pool.execute(r1);
		pool.execute(r2);
		pool.execute(r3);
		pool.execute(r4);
		pool.execute(r5);

		pool.shutdown();
	}

}
