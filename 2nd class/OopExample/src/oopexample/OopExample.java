/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopexample;

/**
 *
 * @author Mobile App Develop
 */
public class OopExample {

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.firstName = "Md.";
        person1.middleName = "Eshan";
        person1.lastName = "Bhuiyan";

        String fulName = person1.getFullName();
        System.out.println(fulName);

        Person person3 = person1;
        person3.firstName = "Mahedi";
        String changeName = person1.getFullName();

        System.out.println(changeName);
        System.out.println(fulName);
    }

}
