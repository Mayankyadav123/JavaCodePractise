package com.coding.java8;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

//Wrong Implementation need to review
public class OddEvenThreadUsingCS {
    private static Object object = new Object();

    private static IntPredicate evenCondition = e -> e % 2 == 0;
    private static IntPredicate oddCondition = e -> e % 2 != 0;


    public static void main(String[] args) throws InterruptedException {
        CompletableFuture.runAsync(() -> OddEvenThreadUsingCS.printResults(oddCondition));
        CompletableFuture.runAsync(() -> OddEvenThreadUsingCS.printResults(evenCondition));
        Thread.sleep(1000);
    }

    public static void printResults(IntPredicate condition) {
        IntStream.rangeClosed(1, 10)
                .filter(condition)
                .forEach(OddEvenThreadUsingCS::execute);
    }


    public static void execute(int i) {
        synchronized (object) {
            try {
                System.out.println("Thread Name " + Thread.currentThread().getName() + " : " + i);
                object.notify();
                object.wait();
            } catch (InterruptedException ex) {
                //error log
            }
        }
    }
}