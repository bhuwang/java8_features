/**
 * 
 */
package com.bhuwan.java8demo.stream;

import java.util.stream.Stream;

/**
 * @author bhuwan
 *
 */
public class ReduceDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(2, 4, 6, 5);
        System.out.println(stream.reduce((i, j) -> i * j).get());
    }

}
