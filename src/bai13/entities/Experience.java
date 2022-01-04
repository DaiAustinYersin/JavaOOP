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
public class Experience extends Employee {
    
    private int experience_year;
    private String majorSkill;

    public Experience(int experience_year, String majorSkill, String ID, String FullName, LocalDate birthDay, String phone, String email, int employee_type, List<Certificate> certificates) {
        super(ID, FullName, birthDay, phone, email, employee_type, certificates);
        this.experience_year = experience_year;
        this.majorSkill = majorSkill;
    }

    public int getExperience_year() {
        return experience_year;
    }

    public void setExperience_year(int experience_year) {
        this.experience_year = experience_year;
    }

    public String getMajorSkill() {
        return majorSkill;
    }

    public void setMajorSkill(String majorSkill) {
        this.majorSkill = majorSkill;
    }

    @Override
    public void showInfor() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Experience{" + "ID=" + ID + ", FullName=" + FullName + ", birthDay=" + birthDay + ", phone=" + phone + ", email=" + email + ", employee_type=" + employee_type + ", certificates=" + certificates + "experience_year=" + experience_year + ", majorSkill=" + majorSkill + '}';
    }
    
}
