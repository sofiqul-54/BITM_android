/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package address;

import java.util.ArrayList;

/**
 *
 * @author Mobile App Develop
 */
public class Address {
    
 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        
       Person person1=new Person();
        person1.firstName="Md.";
        person1.middleName="Sajjad";
        person1.lastName="Hossain";
        
           Person person2=new Person();
        person2.firstName="Md.";
        person2.middleName="Ahsanul";
        person2.lastName="Kabir";
        
        
        ArrayList<Person> personList=new ArrayList<>();
        
        personList.add(person1);
        personList.add(person2);
        
        for(Person aPerson:personList){
        
        System.out.println(aPerson.getFullName());
        }
     
        
        for(int i=1;i<10;i+=4){
        
        System.out.println(i);
        }
        
        
        int [] array=new int[5];
        
        for(int i=0;i<5;i++){
          array[i]=i;
        }
        
        for(int i:array){
        System.out.println(array[i]);
        }
        
        
    }
    
}
