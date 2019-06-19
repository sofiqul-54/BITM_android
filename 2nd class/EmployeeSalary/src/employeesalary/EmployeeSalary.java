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
public class EmployeeSalary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BaseSalaryEmp baseSaEmp=new BaseSalaryEmp(10000.0, "khalid", "1234567", "Amman", "123n") {
   
            @Override
            public double setTotalSalary(double baseSalary) {
                System.out.println(baseSalary);
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
            
           
        
    }
    
}
