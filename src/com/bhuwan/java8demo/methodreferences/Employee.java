/**
 * 
 */
package com.bhuwan.java8demo.methodreferences;

/**
 * @author bhuwan
 *
 */
public class Employee {
    private String name;
    private Integer empId;
    private int age;

    public void printEmployeeInfo() {
        System.out.println(this);
    }

    public Employee() {
    }
    
    public Employee(String name, Integer empId) {
        this.name = name;
        this.empId = empId;
    }
    
    public Employee(String name, Integer empId, Integer age) {
        this.name = name;
        this.empId = empId;
        this.age = age;
    }
    
    public Employee(Integer age, String name) {
        this.name = name;
        this.age = age;
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

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age
     *            the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Employee [name=" + name + ", age=" + age + "]";
    }
}
