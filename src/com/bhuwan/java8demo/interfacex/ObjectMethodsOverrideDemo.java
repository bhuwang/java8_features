/**
 * 
 */
package com.bhuwan.java8demo.interfacex;

/**
 * @author bhuwan
 *
 */
@FunctionalInterface
public interface ObjectMethodsOverrideDemo {

    void m1();

    default void m2() {

    }

    // you cannot define super class objects as default or static.
    /*
     * static String toString() {
     * 
     * }
     */
}
