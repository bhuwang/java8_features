/**
 * 
 */
package com.bhuwan.java8demo.lamda;

/**
 * @author bhuwan
 *
 */
public class GreetConcurrent {

    /**
     * @param args
     */
    public static void main(String[] args) {
        new Thread(GreetConcurrent::sayHello).start();
        System.out.println("English Thread: Hello");
    }

    private static void sayHello() {
        System.out.println("Nepali Thread: Namaste!!");
    }
}
