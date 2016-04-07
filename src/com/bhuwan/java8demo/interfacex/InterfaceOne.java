/**
 * 
 */
package com.bhuwan.java8demo.interfacex;

/**
 * @author bhuwan
 *
 */
public interface InterfaceOne {

    public Integer sum(int a, int b);

    public Integer product(int a, int b);

    default void log(String message) {
        System.out.println("Interface one#log method logging with interface one: " + message);
    }

    default void log2(String message) {
        System.out.println("Interface one#log2 method logging with interface one: " + message);
    }

    static void print(String message) {
        System.out.println("Interface one#print method logging message with interface one: " + message);
    }

    static void print2(String message) {
        System.out.println("Interface one#print2 method logging message with interface one: " + message);
    }

}
