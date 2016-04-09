/**
 * 
 */
package com.bhuwan.java8demo.stream;

import java.util.Arrays;
import java.util.List;

/**
 * @author bhuwan
 *
 */
public class FlatMapExampleDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(2, 5, 6);
        List<Integer> list3 = Arrays.asList(7, 8);

        // create list of list
        List<List<Integer>> list = Arrays.asList(list1, list2, list3);

        // create stream
        list.stream().forEach(System.out::println);

        // print the size of each list
        list.stream().map(List::size).forEach(System.out::println);

        // use flat map to display all the elements inside the list.
        list.stream().flatMap(List::stream).forEach(System.out::print);
    }

}
