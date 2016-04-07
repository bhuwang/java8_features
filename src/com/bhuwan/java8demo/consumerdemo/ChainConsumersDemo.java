/**
 * 
 */
package com.bhuwan.java8demo.consumerdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author bhuwan
 *
 */
public class ChainConsumersDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Bhuwan", "Prisha", "Priyanka", "Pratiksha", "Prakriti", "Pratik", "Aditi", "Aswini");
        List<String> result = new ArrayList<String>();

        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = result::add;

        names.forEach(c1.andThen(c2));

        System.out.println("Size of the result list: " + result.size());

    }

}
