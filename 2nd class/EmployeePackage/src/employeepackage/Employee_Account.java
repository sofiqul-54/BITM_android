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
public class Employee_Account {
    private String userid;
    private String pass;

    @Override
    public String toString() {
        return "Employee_Account{" + "userid=" + userid + ", pass=" + pass + '}';
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Employee_Account(String userid, String pass) {
        this.userid = userid;
        this.pass = pass;
    }
    
}
