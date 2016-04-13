/**
 * 
 */
package com.bhuwan.java8demo.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.bhuwan.java8demo.methodreferences.Employee;

/**
 * @author bhuwan
 *
 */
public class JDK7WayDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();employees.add(new Employee("Nimesh Mishra", 15));
        employees.add(new Employee("Bhuwan Gautam", 11));
        employees.add(new Employee("Suman Gurung", 12));
        employees.add(new Employee("Yaju Pradhan", 13));
        employees.add(new Employee("Nimesh Mishra", 15));
        employees.add(new Employee("Kiran Mishra", 16));

        Comparator<Employee> nameComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                return emp1.getName().compareTo(emp2.getName());
            }
        };

        Collections.sort(employees, nameComparator);

        System.out.println(employees.toString());
    }

}
