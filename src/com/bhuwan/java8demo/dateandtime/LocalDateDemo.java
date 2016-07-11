/**
 * 
 */
package com.bhuwan.java8demo.dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.ChronoField;
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

        System.out.println("Current Date and Time: " + LocalDateTime.now());

        LocalDate dateOfBirth = LocalDate.of(1982, Month.APRIL, 14);
        System.out.println("My BirthDate: " + dateOfBirth);

        Period period = dateOfBirth.until(now);
        System.out.println("I am : " + period.getYears() + " years old.");

        // temporal means chronounit
        long days = dateOfBirth.until(now, ChronoUnit.DAYS);
        System.out.println("I am : " + days + " days old.");

        System.out.println("is this year, " + now.get(ChronoField.YEAR) + " a leap year: " + now.isLeapYear());
        System.out.println("Era is: " + now.getEra());
        System.out.print("Us Date Format: ");

        System.out.println("Current Date by Zone ID: " + LocalDateTime.now(ZoneId.of("Asia/Kathmandu")));

        // Getting date from the base date i.e 01/01/1970
        LocalDate dateFromBase = LocalDate.ofEpochDay(365);
        System.out.println("365th day from base date= " + dateFromBase);

        LocalDate hundredDay2016 = LocalDate.ofYearDay(2016, 100);
        System.out.println("100th day of 2016 = " + hundredDay2016);
    }

}
