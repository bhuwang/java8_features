/**
 * 
 */
package com.bhuwan.java8demo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @author bhuwan
 *
 */
public class StreamDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Bhuwan", "Prisha", "Priyanka", "Pratiksha", "Prakriti", "Pratik", "Aditi", "Aswini");
        Stream<String> stream = names.stream();

        // define predicate
        Predicate<String> startWithLetterP = name -> name.startsWith("P");
        Predicate<String> startWithLetterB = name -> name.startsWith("B");

        Stream<String> filter = stream.filter(startWithLetterP.or(startWithLetterB));

        filter.forEach(System.out::println);
    }

}
