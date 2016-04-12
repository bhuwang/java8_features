/**
 * 
 */
package com.bhuwan.java8demo.dateandtime;

import java.time.Duration;
import java.time.Instant;

/**
 * @author bhuwan
 *
 */
public class InstantDemo {

    public static void main(String[] args) {
        System.out.println("Current Date:" + Instant.now());

        Duration duration = Duration.between(Instant.now().minusMillis(122000), Instant.now());
        System.out.println("Duration: " + duration.toMillis());
        System.out.println("isZero: " + duration.isZero());
        System.out.println("isNegative: " + duration.isNegative());

    }
}
