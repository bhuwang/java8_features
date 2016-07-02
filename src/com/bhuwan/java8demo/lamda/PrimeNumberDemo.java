/**
 * 
 */
package com.bhuwan.java8demo.lamda;

import java.util.stream.IntStream;

/**
 * @author bhuwan
 *
 */
public class PrimeNumberDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(isPrime(2));
        System.out.println(isPrime(3));
        System.out.println(isPrime(5));
        System.out.println(isPrime(12));
        System.out.println(isPrime(23));
        System.out.println(isPrime(37));
        System.out.println(isPrime(49));
        System.out.println(isPrime(52));
    }

    public static boolean isPrime(int number) {
        return IntStream.range(2, number).noneMatch(index -> number % index == 0) && number > 2;
    }
}
