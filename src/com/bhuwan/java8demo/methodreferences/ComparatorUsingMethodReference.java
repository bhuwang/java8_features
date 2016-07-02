/**
 * 
 */
package com.bhuwan.java8demo.methodreferences;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author bhuwan
 *
 */
public class ComparatorUsingMethodReference {

    /**
     * @param args
     */
    public static void main(String[] args) {

        // Using -> key
        // Comparator<Integer> comparator = (first, second) -> Integer.compare(first, second);

        // or simply using double column.
        Comparator<Integer> comparator = Integer::compare;

        List<Integer> list = Arrays.asList(12, 34, 544, 13, 2, 65);
        Collections.sort(list, comparator);

        // CASE 1: lamda way without method reference
        list.forEach(integer -> System.out.println(integer));

        // CASE 2: lamda using method reference
        System.out.println();
        list.forEach(System.out::println);
    }

}
