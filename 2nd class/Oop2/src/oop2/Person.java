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
public class Person {
    private String name;
    private String email;
    private int age;
    private String address;

    public Person() {
    }
   

    public Person(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
      
    }

    public Person(String name, String email, int age, String address) {
        this(name,email,age);
        this.address = address;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
    
    
}
