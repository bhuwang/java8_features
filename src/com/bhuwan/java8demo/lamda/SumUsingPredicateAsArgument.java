/**
 * 
 */
package com.bhuwan.java8demo.lamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Passing behavior as a method argument.
 * 
 * @author bhuwan
 *
 */
public class SumUsingPredicateAsArgument {

    /**
     * @param args
     */
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 4, 8, 2);
        // sum all the numbers, no filter
        System.out.println(sum(list, n -> true));

        // sum only odd numbers
        System.out.println(sum(list, n -> n % 2 != 0));

        // sum numbers greater than 5
        System.out.println(sum(list, n -> n > 5));
    }

    public static int sum(List<Integer> numbers, Predicate<Integer> predicate) {
        // in case of parallel stream instead of sequential
        // numbers.parallelStream().filter(predicate).mapToInt(i -> i).sum();
        return numbers.stream().filter(predicate).mapToInt(i -> i).sum();
    }

}
