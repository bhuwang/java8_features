/**
 * 
 */
package com.bhuwan.java8demo.lamda.functionalinterfaces;

import java.util.Arrays;
import java.util.List;

/**
 * Provide an action to be performed on an objet
 * 
 * @author bhuwan
 *
 */
public class ConsumerDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Bhuwan", "Gautam", "Suman", "Gurung", "Sudeep", "Deepak", "Dipak", "Richan", "Pratik");

        // list.forEach(s -> System.out.println(s.toUpperCase()));

        // or
        list.stream().map(String::toUpperCase).forEach(System.out::println);
    }

}
