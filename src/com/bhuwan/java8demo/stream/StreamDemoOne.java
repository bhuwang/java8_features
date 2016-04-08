/**
 * 
 */
package com.bhuwan.java8demo.stream;

import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @author bhuwan
 *
 */
public class StreamDemoOne {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Stream<String> namesStream = Stream.of("Bhuwan", "Prisha", "Priyanka", "Pratiksha", "Prakriti", "Pratik", "Aditi", "Aswini");

        // define predicate
        Predicate<String> p1 = name -> name.length() > 7;
        Predicate<String> p2 = Predicate.isEqual("Prisha");

        // apply filter
        namesStream.filter(p1.or(p2)).forEach(System.out::println);
    }
}
