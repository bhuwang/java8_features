/**
 * 
 */
package com.bhuwan.java8demo.dateandtime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * @author bhuwan
 *
 */
public class LocalDateDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println("Current Date: " + now);

        LocalDate dateOfBirth = LocalDate.of(1982, Month.APRIL, 14);
        System.out.println("My BirthDate: " + dateOfBirth);

        Period period = dateOfBirth.until(now);
        System.out.println("I am : " + period.getYears() + " years old.");
        
        
        // temporal means chronounit
        long days = dateOfBirth.until(now, ChronoUnit.DAYS);
        System.out.println("I am : " + days + " days old.");
    }

}
