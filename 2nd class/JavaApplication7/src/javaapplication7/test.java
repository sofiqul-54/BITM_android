/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author Mobile App Develop
 */
public class test {
    public static void main(String[] args) {
        student s1 = new student("Robin", "20");
        s1.setContact(new Contact("Dhaka", "1207", "1123456","gmail"));
        
        System.out.println(s1);
        System.out.println(s1.getContact());
        
        System.out.println(s1.getContact().getCity());
    }
}
