/**
 * 
 */
package com.bhuwan.java8demo.methodreferences;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bhuwan
 *
 */
public class PrintEmployeeListDemo {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Bhuwan Gautam", 11));
        employees.add(new Employee("Suman Gurung", 12));
        employees.add(new Employee("Yaju Pradhan", 13));
        employees.add(new Employee("Nimesh Mishra", 15));

        // using method references
        employees.forEach(emp -> System.out.println(emp));

        System.out.println();
        employees.forEach(System.out::println);

        System.out.println();
        employees.forEach(Employee::printEmployeeInfo);

    }
}
