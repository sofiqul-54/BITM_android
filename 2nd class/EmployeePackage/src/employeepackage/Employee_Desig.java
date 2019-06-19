/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeepackage;

/**
 *
 * @author Mobile App Develop
 */
public class Employee_Desig {
    private String designation;
    private String salary;

    public Employee_Desig(String designation, String salary) {
        this.designation = designation;
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee_Desig{" + "designation=" + designation + ", salary=" + salary + '}';
    }
    
}
