/**
 * 
 */
package com.bhuwan.java8demo.stream;

import java.util.stream.Stream;

/**
 * @author bhuwan
 *
 */
public class MapFilterDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(2, 3, 5, 4, 7);
        // add 3 to all the number and filter the number which are only divisible by 5 and print.
        // stream.map(num -> num + 3).filter(num -> num % 5 == 0).forEach(System.out::println);

        // add 3 to all the number and find only first number which is divisible by 5 and print else print 0.
        System.out.println(stream.map(num -> num + 3).filter(num -> num % 5 == 0).findFirst().orElse(0));

    }

}
