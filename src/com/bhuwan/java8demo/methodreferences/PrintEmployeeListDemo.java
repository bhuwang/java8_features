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
        employees.forEach(emp->System.out.println(emp));
        
        System.out.println();
        employees.forEach(System.out::println);
        
        System.out.println();
        employees.forEach(Employee::printEmployeeInfo);

    }
}

class Employee {
    private String name;
    private Integer empId;

    public void printEmployeeInfo() {
        System.out.println(this);
    }

    public Employee(String name, Integer empId) {
        this.name = name;
        this.empId = empId;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the empId
     */
    public Integer getEmpId() {
        return empId;
    }

    /**
     * @param empId
     *            the empId to set
     */
    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Employee [name=" + name + ", empId=" + empId + "]";
    }
}
