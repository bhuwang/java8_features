/**
 * 
 */
package com.bhuwan.java8demo.lamda.functionalinterfaces;

import java.util.Arrays;
import java.util.List;

/**
 * A boolean value property of an object
 * 
 * @author bhuwan
 *
 */
public class PredicateDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Bhuwan", "Gautam", "Suman", "Gurung", "Sudeep", "Deepak", "Dipak", "Richan", "Pratik");

        list.removeIf(s -> s.contains("ee"));
        System.out.println(list);

        // or
        // list.stream().map(String::toUpperCase).forEach(System.out::println);

    }

}
