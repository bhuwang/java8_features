/**
 * 
 */
package com.bhuwan.java8demo.lamda.functionalinterfaces.supplier;

import java.util.logging.Logger;

/**
 * Use whenever you want to supply an instance of a T
 * 
 * @author bhuwan
 *
 */
public class CrazyLogger {

    private static final Logger logger = Logger.getLogger(CrazyLogger.class.getName());

    /**
     * @param args
     */
    public static void main(String[] args) {
        CrazyLogger demo = new CrazyLogger();
        int loopCount = 100_000_000;

        /*
         * Log using without supplier
         */
        long time = System.currentTimeMillis();
        for (int i = 0; i < loopCount; i++) {
            demo.foo();
        }
        time = System.currentTimeMillis() - time;
        System.out.println("Without Supplier: " + time);

        /*
         * Log using supplier
         */
        time = System.currentTimeMillis();
        for (int i = 0; i < loopCount; i++) {
            demo.bar();
        }
        time = System.currentTimeMillis() - time;
        System.out.println("Using Supplier: " + time);
    }

    public void foo() {
        logger.fine("since 1970 " + System.currentTimeMillis());
    }

    public void bar() {
        logger.fine(() -> "since 1970 " + System.currentTimeMillis());
    }

}
