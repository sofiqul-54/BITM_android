/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeesalary;

/**
 *
 * @author Mobile App Develop
 */
public class Employee {
    private String eName;
    private String phone;
    private String ceo;
    private String neid;

    public Employee(String eName, String phone, String ceo, String neid) {
        this.eName = eName;
        this.phone = phone;
        this.ceo = ceo;
        this.neid = neid;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCeo() {
        return ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }

    public String getNeid() {
        return neid;
    }

    public void setNeid(String neid) {
        this.neid = neid;
    }

    @Override
    public String toString() {
        return "Employee{" + "eName=" + eName + ", phone=" + phone + ", ceo=" + ceo + ", neid=" + neid + '}';
    }
    
    
}
