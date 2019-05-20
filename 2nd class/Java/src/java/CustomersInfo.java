/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java;

/**
 *
 * @author Mobile App Develop
 */
public class CustomersInfo {

    String name;
    String email;
    int phone;

    public CustomersInfo() {
        System.out.println("blank");
        
    }
    
    public CustomersInfo(String name, String email, int phone){
    
    }
    
    
    
    public void displayInfo() {
        System.out.println(name);
        System.out.println(email);
        System.out.println(phone);
    }
    
    
    
    
    
   

}
