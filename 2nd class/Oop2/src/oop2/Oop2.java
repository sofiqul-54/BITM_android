/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2;

/**
 *
 * @author Mobile App Develop
 */
public class Oop2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person person = new Person("abc", "abc@gmail.com", 25);

        System.out.println(person.getEmail());
        System.out.println(person.getAddress());
        person.setAddress("Dhanmodi");
       Person newPerson=new Person("abc","s@gmail.com",28,"dhaka");
        System.out.println(newPerson.getAddress());
    }

}
