/**
 * 
 */
package com.bhuwan.java8demo.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author bhuwan
 *
 */
public class SortingDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Bhuwan", "Suresh", "Naresh", "Bipen", "Richan", "12345");
        System.out.println("Descending order");
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        System.out.println();
        System.out.println("Ascending order");
        list.stream().sorted().forEach(System.out::println);

        // Using traiditional approach
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);
    }

}
