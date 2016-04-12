/**
 * 
 */
package com.bhuwan.java8demo.dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

/**
 * @author bhuwan
 *
 */
public class ZoneTimeDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();

        // print available time zones
        availableZoneIds.stream().forEach(System.out::println);

        System.out.println();
        System.out.println("Printing custom zone id::");
        ZoneId nepalKathmandu = ZoneId.of("Asia/Kathmandu");
        System.out.println(nepalKathmandu);
        
        
        System.out.println();
        System.out.println("My Brithday with Zone Time: ");
        ZonedDateTime myBday = ZonedDateTime.of(LocalDateTime.of(LocalDate.of(982, Month.APRIL, 14),LocalTime.of(2, 52)), nepalKathmandu);
        System.out.println(myBday);
        
        // after one year of my birthday date.
        ZonedDateTime plus = myBday.plus(Period.ofYears(1));
        System.out.println(plus);
        
        ZonedDateTime withZoneSameInstant = plus.withZoneSameInstant(ZoneId.of("US/Central"));
        System.out.println(withZoneSameInstant);
    }

}
