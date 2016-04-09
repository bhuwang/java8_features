/**
 * 
 */
package com.bhuwan.java8demo.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.bhuwan.java8demo.methodreferences.Employee;

/**
 * @author bhuwan
 *
 */
public class CollectorsDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Bhuwan Gautam", 11, 33));
        employees.add(new Employee("Suman Gurung", 12, 25));
        employees.add(new Employee("Yaju Pradhan", 13, 33));
        employees.add(new Employee("Nimesh Mishra", 15, 25));

        // create a string with employee whose age > 29, get all the names concatenated and separated by ,
        String collect =
                employees.stream().filter(employee -> employee.getAge() >= 29).map(Employee::getName).collect(Collectors.joining(", "));
        System.out.println(collect);

        // create a string with employee whose age > 29, get all the names in list
        employees.stream().filter(employee -> employee.getAge() >= 29).map(Employee::getName).collect(Collectors.toList())
                .forEach(System.out::println);

        // create a string with employee whose age >= 25, get all the employees group by their ages
        Map<Integer, List<Employee>> collect2 = employees.stream().filter(employee -> employee.getAge() >= 25).collect(Collectors.groupingBy(Employee::getAge));
        System.out.println(collect2.toString());
        
    }
}
