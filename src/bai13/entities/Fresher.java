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
public class Fresher extends Employee {

    private LocalDate graduation_date;
    private String graduation_rank;
    private String education_school;

    public Fresher(LocalDate graduation_date, String graduation_rank, String education_school, String ID, String FullName, LocalDate birthDay, String phone, String email, int employee_type, List<Certificate> certificates) {
        super(ID, FullName, birthDay, phone, email, employee_type, certificates);
        this.graduation_date = graduation_date;
        this.graduation_rank = graduation_rank;
        this.education_school = education_school;
    }

    public LocalDate getGraduation_date() {
        return graduation_date;
    }

    public void setGraduation_date(LocalDate graduation_date) {
        this.graduation_date = graduation_date;
    }

    public String getGraduation_rank() {
        return graduation_rank;
    }

    public void setGraduation_rank(String graduation_rank) {
        this.graduation_rank = graduation_rank;
    }

    public String getEducation_school() {
        return education_school;
    }

    public void setEducation_school(String education_school) {
        this.education_school = education_school;
    }

    @Override
    public void showInfor() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Fresher{" + "ID=" + ID + ", FullName=" + FullName + ", birthDay=" + birthDay + ", phone=" + phone + ", email=" + email + ", employee_type=" + employee_type + ", certificates=" + certificates + "graduation_date=" + graduation_date + ", graduation_rank=" + graduation_rank + ", education_school=" + education_school + '}';
    }

}
