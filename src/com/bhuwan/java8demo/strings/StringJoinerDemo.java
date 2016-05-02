/**
 * 
 */
package com.bhuwan.java8demo.strings;

import java.util.StringJoiner;
import java.util.stream.Stream;

/**
 * @author bhuwan
 *
 */
public class StringJoinerDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {

        // hello world upper case and print
        Stream.of("hello world").map(String::toUpperCase).forEach(System.out::println);

        // StringJoiner with separator- jdk8 way
        StringJoiner joiner = new StringJoiner(", ");
        joiner.add("One").add("Two").add("Three").add("Four");
        System.out.println(joiner);

        // StringJoiner with separator, prefix, suffix
        StringJoiner join = new StringJoiner(", ", "{", "}");
        join.add("One").add("Two").add("Three").add("Four");
        System.out.println(join);

        // Using String.join() method
        String s = String.join(", ", "One", "Two", "Three", "Four");
        System.out.println(s);
    }

}
