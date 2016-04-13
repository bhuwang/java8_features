/**
 * 
 */
package com.bhuwan.java8demo.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.bhuwan.java8demo.methodreferences.Employee;

/**
 * @author bhuwan
 *
 */
public class JDK8WayDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Nimesh Mishra", 15, 23));
        employees.add(new Employee("Bhuwan Gautam", 11, 33));
        employees.add(new Employee("Suman Gurung", 12, 24));
        employees.add(new Employee("Yaju Pradhan", 13, 29));
        employees.add(new Employee("Nimesh Mishra", 15, 25));
        employees.add(new Employee("Kiran Mishra", 16, 36));

        Comparator<Employee> nameComparator = Comparator.comparing(Employee::getName).thenComparing(Employee::getAge);

        System.out.println("Order by name and age asc");
        Collections.sort(employees, nameComparator);
        System.out.println(employees.toString());

        // you can just use comparator.reversed() method to reverse the comparator operation
        System.out.println();
        System.out.println("Order by name and age desc");
        Collections.sort(employees, nameComparator.reversed());
        System.out.println(employees.toString());

        // Natural Order
        System.out.println();
        List<String> names = Arrays.asList("Bhuwan", "Prisha", "Priyanka", "Pratiksha", "Prakriti", "Pratik", "Aditi", "Aswini");
        Collections.sort(names, Comparator.naturalOrder());
        System.out.println(names);

    }

}
