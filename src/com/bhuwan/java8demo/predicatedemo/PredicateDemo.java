/**
 * 
 */
package com.bhuwan.java8demo.predicatedemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author bhuwan
 *
 */
public class PredicateDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Bhuwan", "Prisha", "Priyanka", "Pratiksha", "Prakriti", "Pratik", "Aditi", "Aswini");
        List<String> result = new ArrayList<String>();

        Predicate<String> isStartWithLetterP = name -> name.startsWith("P");
        Predicate<String> isStartWithLetterA = name -> name.startsWith("A");

        names.forEach(name -> {
            if ((isStartWithLetterP.and(isStartWithLetterA)).test(name)) {
                result.add(name);
            }
        });

        System.out.println("Size of the result list: " + result.size());
    }

}
