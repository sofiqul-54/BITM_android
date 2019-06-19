/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopexampl;

/**
 *
 * @author Mobile App Develop
 */
public class OOPExampl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Person person1=new Person();
        person1.firstName="Hafsa";
        person1.middleName="Haque";
        person1.lastName="Sathi";
        
        System.out.println(person1.getFullName());
        
        Person person2=new Person();
        person2.firstName="Marjana ";
        person2.middleName="Ahmed";
        person2.lastName="Juthi";
        
        System.out.println(person2.getFullName());
        
        
       Person person3=person1;
        
        person3.lastName="Tamanna";
        
        System.out.println(person1.getFullName());
        
        person1=null;
        System.out.println(person3.getFullName());
        
    }
    
}
