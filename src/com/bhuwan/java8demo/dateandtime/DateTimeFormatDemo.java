/**
 * 
 */
package com.bhuwan.java8demo.dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author bhuwan
 *
 */
public class DateTimeFormatDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(DateTimeFormatter.ISO_DATE_TIME.format(LocalDateTime.now()));
        
        System.out.println(DateTimeFormatter.ISO_LOCAL_DATE.format(LocalDate.now()));
    }

}
