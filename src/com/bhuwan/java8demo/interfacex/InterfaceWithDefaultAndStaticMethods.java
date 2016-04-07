package com.bhuwan.java8demo.interfacex;

/**
 * @author bhuwan
 *
 */
public class InterfaceWithDefaultAndStaticMethods implements InterfaceOne, InterfaceTwo {

    public static void main(String[] args) {
        InterfaceTwo.print("Helloo from interface Bhuwan");
    }

    @Override
    public Integer sum(int a, int b) {
        // TODO Auto-generated method stub
        return null;
    }

    public void print(String message) {
        System.out.println("Hello from impl class");
    }

    @Override
    public Integer product(int a, int b) {
        // TODO Auto-generated method stub
        return null;
    }

    // if you do not override below two methods your code wont compile
    // this way you can resolve the diamond problem
    @Override
    public void log(String message) {
        // TODO Auto-generated method stub
        InterfaceOne.super.log(message);
    }

    @Override
    public void log2(String message) {
        // TODO Auto-generated method stub
        InterfaceOne.super.log2(message);
    }
}
