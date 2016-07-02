/**
 * 
 */
package com.bhuwan.java8demo.lamda;

import java.util.Arrays;
import java.util.List;

/**
 * write a method to find out the first odd number in the range 3 to 11 and return square of it.
 * 
 * @author bhuwan
 *
 */
public class LazyDemoWithLamda {

    /**
     * @param args
     */
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(0, 2, 99, 33, 4, 6, 7, 9, 54, 10);
        // if you remove the findFirst() and get() then you will see the result of lazy evaluation.
        System.out.println(list.stream().filter(LazyDemoWithLamda::isOdd).filter(LazyDemoWithLamda::greaterThan3)
                .filter(LazyDemoWithLamda::lessThan11).map(LazyDemoWithLamda::squareIt).findFirst().get());

        // write a method to find out the max odd number in the range 3 to 11 and return square of it.
        /*
         * list.stream().filter(LazyDemoWithLamda::isOdd).filter(LazyDemoWithLamda::greaterThan3)
         * .filter(LazyDemoWithLamda::lessThan11).max(Comparator.naturalOrder()).map(LazyDemoWithLamda::squareIt)
         */
    }

    public static boolean isOdd(int number) {
        System.out.println("inside isOdd method: " + number);
        return number % 2 != 0;
    }

    public static boolean greaterThan3(int number) {
        System.out.println("inside greaterThan3 method: " + number);
        return number > 3;
    }

    public static boolean lessThan11(int number) {
        System.out.println("inside lessThan11 method: " + number);
        return number < 11;
    }

    public static int squareIt(int number) {
        System.out.println("inside squareIt method: " + number);
        return number * number;
    }
}
