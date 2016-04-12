/**
 * 
 */
package com.bhuwan.java8demo.dateandtime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 * @author bhuwan
 *
 */
public class DateAdjusterDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        // get the date of next Sunday
        LocalDate nextSun = now.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
        System.out.println("Next sunday on: "+nextSun);
        
        
        LocalDate firstDayOfMonth = now.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println("First day of month: "+firstDayOfMonth);
        
        LocalDate lastDayOfMonth = now.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("Last day of month: "+lastDayOfMonth);
        
        
        LocalDate firstDayOfNextMonth = now.with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println("First day of month: "+firstDayOfNextMonth);
    }

}
