/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeepackage;

/**
 *
 * @author Mobile App Develop
 */
public class Employee_Contact {
    private String email;
    private String phone; 
    
    public Employee_Contact(String email, String phone) {
        this.email = email;
        this.phone = phone;
    }
    @Override
    public String toString() {
        return "Employee_Contact{" + "email=" + email + ", phone=" + phone + '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    
    
}
