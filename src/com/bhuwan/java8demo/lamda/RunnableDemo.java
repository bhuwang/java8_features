/**
 * 
 */
package com.bhuwan.java8demo.lamda;

/**
 * @author bhuwan
 *
 */
public class RunnableDemo {

    /**
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {

        // Using Lamda Expression for multi-block implementation
        Runnable runnable = () -> {
            System.out.println("Thread name: " + Thread.currentThread().getName());
            for (int i = 0; i < 10; i++) {
                System.out.println("Count: " + i);
            }
        };

        Thread t1 = new Thread(runnable);
        t1.start();
        t1.join();
    }

}
