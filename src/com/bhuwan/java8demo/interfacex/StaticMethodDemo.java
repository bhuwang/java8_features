/**
 * 
 */
package com.bhuwan.java8demo.interfacex;

/**
 * @author bhuwan
 *
 */
@FunctionalInterface
public interface StaticMethodDemo {

    public void m1();

    default void printData(String str) {
        System.out.println("Interface printData method: " + str);
    }

    static boolean isNull(String str) {
        System.out.println("Interface isNull method: " + str);
        return str == null ? true : "".equals(str) ? true : false;
    }

    // you cannot hide the super class object methods
    /*
     * static int hashCode() {
     * 
     * }
     */

}
