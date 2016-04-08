/**
 * 
 */
package com.bhuwan.java8demo.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @author bhuwan
 *
 */
public class IntermediatoryOperationDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Stream<String> namesStream = Stream.of("Bhuwan", "Prisha", "Priyanka", "Pratiksha", "Prakriti", "Pratik", "Aditi", "Aswini");

        // define predicate
        Predicate<String> p1 = name -> name.length() > 7;
        Predicate<String> p2 = Predicate.isEqual("Prisha");

        // define a empty list
        List<String> result = new ArrayList<>();

        /*
         * peek is a intermediary [all the methods which returns Stream is an Intermediary] operation, hence the result should be 0.
         * 
         */
        // namesStream.peek(System.out::println).filter(p1.or(p2)).peek(result::add);

        // forEach is a final operation, hence the result should be >1
        namesStream.peek(System.out::println).filter(p1.or(p2)).forEach(result::add);

        // display result list size
        System.out.println("Size is: " + result.size());

    }

}
