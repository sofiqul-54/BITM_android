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
public class test {
    public static void main(String[] args) {
        Employee e1 = new Employee("Robin","20");
        System.out.println(e1);
        System.out.println("");
        
        e1.setEmpadd(new EmpAddress ("Dhaka","1207","road no. 2","123456"));
        System.out.println(e1.getEmpadd());
        System.out.println("");
        
        e1.setEmpcon(new EmpContact ("mail@mail.com", "142536"));
        System.out.println(e1.getEmpcon());
        System.out.println("");
        
        e1.setEmploan(new EmpLoan("50000 tk.","9%","6 Months"));
        System.out.println(e1.getEmploan());
        System.out.println("");
        
        ArrayList<Course> courses = new ArrayList<Course>();
        
        courses.add(new Course("Computer Graphics", 3, 3.80));
        courses.add(new Course("Network", 3, 3.70));
        
        e1.setCourseList(courses);
        
        for(Course c: courses){
            System.out.println(c);
        }
        
        
        
    }
}
