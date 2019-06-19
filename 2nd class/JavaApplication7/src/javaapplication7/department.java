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
public class department {
    private String departmenthead;
    private String departmentname;

    public department(String departmenthead, String departmentname) {
        this.departmenthead = departmenthead;
        this.departmentname = departmentname;
    }

    public String getDepartmenthead() {
        return departmenthead;
    }

    public void setDepartmenthead(String departmenthead) {
        this.departmenthead = departmenthead;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

    @Override
    public String toString() {
        return "department{" + "departmenthead=" + departmenthead + ", departmentname=" + departmentname + '}';
    }
    
    
    
    
}
