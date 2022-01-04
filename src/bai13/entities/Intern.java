/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai13.entities;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author DaiAustinYersin
 */
public class Intern extends Employee {

    private String major;
    private int semester;
    private String school_name;

    public Intern(String major, int semester, String school_name, String ID, String FullName, LocalDate birthDay, String phone, String email, int employee_type, List<Certificate> certificates) {
        super(ID, FullName, birthDay, phone, email, employee_type, certificates);
        this.major = major;
        this.semester = semester;
        this.school_name = school_name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getSchool_name() {
        return school_name;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }

    @Override
    public void showInfor() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Intern{" + "ID=" + ID + ", FullName=" + FullName + ", birthDay=" + birthDay + ", phone=" + phone + ", email=" + email + ", employee_type=" + employee_type + ", certificates=" + certificates + "major=" + major + ", semester=" + semester + ", school_name=" + school_name + '}';
    }

}
