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

        // Using Lamda Expression
        // Comparator<String> comparator = (String first, String second) -> Integer.compare(first.length(), second.length());

        // or you can just omit the explicit String type in the argument.
        // you can just declare the variable without its type declared.
        Comparator<String> comparator = (first, second) -> Integer.compare(first.length(), second.length());

        List<String> list = Arrays.asList("******", "***", "*****", "********", "**");
        Collections.sort(list, comparator);

        for (String s : list) {
            System.out.println(s);
        }
    }

}
