/**
 * 
 */
package com.bhuwan.java8demo.interfacex;

/**
 * @author bhuwan
 *
 */
public class StaticMethodDemoImpl implements StaticMethodDemo {

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.java8demo.interfacex.StaticMethodDemo#m1()
     */
    @Override
    public void m1() {

    }

    public boolean isNull(String str) {
        System.out.println("Impl isNull method: " + str);
        return str == null ? true : "".equals(str) ? true : false;
    }

    public static void main(String[] args) {
        StaticMethodDemoImpl demo = new StaticMethodDemoImpl();
        demo.printData("");
        demo.isNull("Bhuwan");
        // call interface isNull using below
        StaticMethodDemo.isNull("Cup of tea");

    }

}
