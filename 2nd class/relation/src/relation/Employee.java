/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relation;

import java.util.ArrayList;

/**
 *
 * @author Mobile App Develop
 */
public class Employee {
    private String name;
    private String age;
    
    private EmpAddress empadd;
    private EmpContact empcon;
    private EmpLoan emploan;
    private ArrayList<Course> courseList ;
    
    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }

    
    //setter getter for address, contact, loan
    public EmpAddress getEmpadd() {
        return empadd;
    }

    public void setEmpadd(EmpAddress empadd) {
        this.empadd = empadd;
    }

    public EmpContact getEmpcon() {
        return empcon;
    }

    public void setEmpcon(EmpContact empcon) {
        this.empcon = empcon;
    }

    public EmpLoan getEmploan() {
        return emploan;
    }

    public void setEmploan(EmpLoan emploan) {
        this.emploan = emploan;
    }
    
    //
    
    
    //setter getter for name, age
    public Employee(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    
    //
    
    
    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", age=" + age + '}';
    }
    
    
}
