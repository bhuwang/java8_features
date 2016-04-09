/**
 * 
 */
package com.bhuwan.java8demo.stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.bhuwan.java8demo.methodreferences.Employee;

/**
 * @author bhuwan
 *
 */
public class CollectorsDemoTwo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        try (BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(CollectorsDemoTwo.class.getResourceAsStream("employee.txt")));
                Stream<String> stream = bufferedReader.lines();) {
            stream.map(line -> {
                String[] s = line.split(" ");
                Employee emp = new Employee(Integer.valueOf(s[1]), s[0]);
                employees.add(emp);
                return emp;
            }).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }

        System.out.println();
        System.out.println("Employee whose age >= 25, and find the person with the min of age amgnost");
        Optional<Employee> min = employees.stream().filter(employee -> employee.getAge() >= 25).min(Comparator.comparing(Employee::getAge));
        System.out.println(min);

        System.out.println();
        System.out.println("Employee whose age >= 25, and find the person with the max of age amgnost");
        Optional<Employee> max = employees.stream().filter(employee -> employee.getAge() >= 25).max(Comparator.comparing(Employee::getAge));
        System.out.println(max);
        
        System.out.println();
        System.out.println("Group by age");
        Map<Integer, List<Employee>> collect2 = employees.stream().collect(Collectors.groupingBy(Employee::getAge));
        System.out.println(collect2.toString());

        System.out.println();
        System.out.println("Group by age and count");
        Map<Integer, Long> collect = employees.stream().collect(Collectors.groupingBy(Employee::getAge, Collectors.counting()));
        System.out.println(collect.toString());
    }
}
