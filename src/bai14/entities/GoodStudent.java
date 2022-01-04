/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai14.entities;

import java.time.LocalDate;

/**
 *
 * @author DaiAustinYersin
 */
public class GoodStudent extends Student {

    private double gpa;
    private String bestRewardName;

    public GoodStudent(double gpa, String bestRewardName, String fullName, LocalDate doB, boolean sex, String phoneNumber, String universityName, String gradeLevel) {
        super(fullName, doB, sex, phoneNumber, universityName, gradeLevel);
        this.gpa = gpa;
        this.bestRewardName = bestRewardName;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getBestRewardName() {
        return bestRewardName;
    }

    public void setBestRewardName(String bestRewardName) {
        this.bestRewardName = bestRewardName;
    }

    @Override
    public void showInfor() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "GoodStudent{" + "fullName=" + fullName + ", doB=" + doB + ", sex=" + sex + ", phoneNumber=" + phoneNumber + ", universityName=" + universityName + ", gradeLevel=" + gradeLevel + "gpa=" + gpa + ", bestRewardName=" + bestRewardName + '}';
    }

}
