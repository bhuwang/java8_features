/**
 * 
 */
package com.bhuwan.java8demo.numbers;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author bhuwan
 *
 */
public class Java8NumbersDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        long max = Long.max(45, 97);
        System.out.println("max of 45 and 97 is: " + max);

        List<Integer> numbers = Arrays.asList(2, 33, 12, 43, 11, 2, 3, 44, 234, 8, 22, 65, 3, 6, 85, 9);
        numbers.stream().map(num -> num + " ").forEach(System.out::print);
        Optional<Integer> max2 = numbers.stream().reduce(Integer::max);
        System.out.println();
        System.out.println("max: " + max2);

        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        System.out.println("min: " + min);
    }

}
