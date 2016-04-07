/**
 * 
 */
package com.bhuwan.java8demo.interfacex;

/**
 * @author bhuwan
 *
 */
public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        // before java 8
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("using old runnable annonymous functionF");
            }
        };
        runnable.run();
        // call using lamda way
        Runnable run = () -> System.out.println("lamda way of display functional interface.");
        run.run();

        // call custom functional interface using lamda way
        CustomEmployeeInterface employee = () -> System.out.println("Display employee information here.");
        employee.displayEmployee();
    }
}
