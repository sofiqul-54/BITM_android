/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeesalary;

/**
 *
 * @author Mobile App Develop
 */
public  abstract class  BaseSalaryEmp extends Employee {
       private double baseSalary;
       private double totalSalary;

    public BaseSalaryEmp(double baseSalary, String eName, String phone, String ceo, String neid) {
        super(eName, phone, ceo, neid);
        this.baseSalary = baseSalary;
       
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    
    public abstract double setTotalSalary(double baseSalary);
   

       
}
