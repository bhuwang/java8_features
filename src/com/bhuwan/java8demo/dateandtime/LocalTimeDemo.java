/**
 * 
 */
package com.bhuwan.java8demo.dateandtime;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * @author bhuwan
 *
 */
public class LocalTimeDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println("Local time is: " + now);

        // create local time instance
        LocalTime betdTime = LocalTime.of(23, 59);
        System.out.println("Time is: " + betdTime);
        
        System.out.println("after 2 hrs of bedTime: "+betdTime.plus(2, ChronoUnit.HOURS));
        
        System.out.println("after 2 hrs of bedTime: "+betdTime.plusHours(2));
    }

}
