package com.coding.java8;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;


// Using ExecutorService
public class OddEvenThreadCompletableFuture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        
        IntStream.rangeClosed(1,10)
        				.forEach(num -> {
        					CompletableFuture<Integer> oddCompletableFuture = CompletableFuture.completedFuture(num)
        							.thenApplyAsync(x -> {
                                        if (x % 2 != 0) {
                                            System.out.println("Thread Name " + Thread.currentThread().getName() + " : " + x);
                                        }
                                        try {
											Thread.currentThread().sleep(1000);
											//Thread.sleep(1000);
										} catch (InterruptedException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
                                        return num;
        							},executorService);
                            oddCompletableFuture.join();
                            CompletableFuture<Integer> evenCompletableFuture = CompletableFuture.completedFuture(num)
                                    .thenApplyAsync(x -> {
                                        if (x % 2 == 0) {
                                            System.out.println("Thread Name " + Thread.currentThread().getName() + " : " + x);
                                        }
//                                        try {
//											Thread.currentThread().sleep(100);
//										} catch (InterruptedException e) {
//											// TODO Auto-generated catch block
//											e.printStackTrace();
//										}
                                        return num;
                                    }, executorService);
                            evenCompletableFuture.join();
        				});
        executorService.shutdown();
	}
}
