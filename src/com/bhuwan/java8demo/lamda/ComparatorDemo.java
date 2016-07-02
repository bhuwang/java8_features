/**
 * 
 */
package com.bhuwan.java8demo.lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author bhuwan
 *
 */
public class ComparatorDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {

        /*
         * Classical way of doing
         */
        Comparator<String> comp = new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };

        List<String> list = Arrays.asList("******", "***", "*****", "********", "**");
        Collections.sort(list, comp);

        System.out.println("Using classical way: Anonymous inner class");
        for (String s : list) {
            System.out.println(s);
        }

        /*
         * Using Lamda Expression
         */
        // Comparator<String> comparator = (String first, String second) -> Integer.compare(first.length(), second.length());

        // or you can just omit the explicit String type in the argument.
        // you can just declare the variable without its type declared.
        // for ascending order
        // Comparator<String> comparator = (first, second) -> Integer.compare(first.length(), second.length());

        // for descending order
        Comparator<String> comparator = (first, second) -> Integer.compare(second.length(), first.length());

        Collections.sort(list, comparator);
        System.out.println("Using Lamda way");
        for (String s : list) {
            System.out.println(s);
        }
    }

}
