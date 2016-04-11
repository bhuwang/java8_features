/**
 * 
 */
package com.bhuwan.java8demo.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

/**
 * @author bhuwan
 *
 */
public class ReaderDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(ReaderDemo.class.getResourceAsStream("cities.txt")));
                Stream<String> stream = reader.lines();) {
            stream.filter(line -> line.contains("Pokhara")).findFirst().ifPresent(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        } 
    }

}
