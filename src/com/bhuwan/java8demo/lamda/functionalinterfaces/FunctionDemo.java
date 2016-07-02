/**
 * 
 */
package com.bhuwan.java8demo.lamda.functionalinterfaces;

import java.util.Arrays;
import java.util.List;

/**
 * Transforming a T to an R
 * 
 * @author bhuwan
 *
 */
public class FunctionDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Bhuwan", "Gautam", "Suman", "Gurung", "Sudeep", "Deepak", "Dipak", "Richan", "Pratik");

        System.out.println(list.stream().count());
    }

}
