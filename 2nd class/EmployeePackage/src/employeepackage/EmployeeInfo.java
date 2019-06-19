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
public class EmployeeInfo {
    private String name;
    private String age;
    
    private Employee_Account empAcc;
    private Employee_Contact empCon;
    private Employee_Desig empDesig;

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

    public Employee_Account getEmpAcc() {
        return empAcc;
    }

    public void setEmpAcc(Employee_Account empAcc) {
        this.empAcc = empAcc;
    }

    public Employee_Contact getEmpCon() {
        return empCon;
    }

    public void setEmpCon(Employee_Contact empCon) {
        this.empCon = empCon;
    }

    public Employee_Desig getEmpDesig() {
        return empDesig;
    }

    public void setEmpDesig(Employee_Desig empDesig) {
        this.empDesig = empDesig;
    }

    @Override
    public String toString() {
        return "EmployeeInfo{" + "name=" + name + ", age=" + age + '}';
    }

    

    public EmployeeInfo(String name, String age) {
        this.name = name;
        this.age = age;
    }

    
    }
    
    

    
