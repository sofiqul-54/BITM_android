/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relation;

/**
 *
 * @author Mobile App Develop
 */
public class Course {
    private String course_name;
    private int credit;
    private double gpa;

    public Course(String course_name, int credit, double gpa) {
        this.course_name = course_name;
        this.credit = credit;
        this.gpa = gpa;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Course{" + "course_name=" + course_name + ", credit=" + credit + ", gpa=" + gpa + '}';
    }

    
}
