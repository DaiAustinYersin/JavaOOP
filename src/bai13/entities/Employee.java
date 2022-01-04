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
public abstract class Employee {

    protected String ID, FullName;
    protected LocalDate birthDay;
    protected String phone, email;
    protected int employee_type;
//    0: Experience, 1: Fresher , 2: Intern
    protected List<Certificate> certificates;

    public static int employee_Count = 0;

    public Employee(String ID, String FullName, LocalDate birthDay, String phone, String email, int employee_type, List<Certificate> certificates) {
        this.ID = ID;
        this.FullName = FullName;
        this.birthDay = birthDay;
        this.phone = phone;
        this.email = email;
        this.employee_type = employee_type;
        this.certificates = certificates;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEmployee_type() {
        return employee_type;
    }

    public void setEmployee_type(int employee_type) {
        this.employee_type = employee_type;
    }

    public List<Certificate> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<Certificate> certificates) {
        this.certificates = certificates;
    }

    public abstract void showInfor();

    @Override
    public String toString() {
        return "Employee{" + "ID=" + ID + ", FullName=" + FullName + ", birthDay=" + birthDay + ", phone=" + phone + ", email=" + email + ", employee_type=" + employee_type + ", certificates=" + certificates + '}';
    }

}
