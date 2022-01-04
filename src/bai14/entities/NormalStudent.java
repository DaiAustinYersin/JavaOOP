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
public class NormalStudent extends Student {

    private int englishScore;
    private double entryTestScore;

    public NormalStudent(int englishScore, double entryTestScore, String fullName, LocalDate doB, boolean sex, String phoneNumber, String universityName, String gradeLevel) {
        super(fullName, doB, sex, phoneNumber, universityName, gradeLevel);
        this.englishScore = englishScore;
        this.entryTestScore = entryTestScore;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(int englishScore) {
        this.englishScore = englishScore;
    }

    public double getEntryTestScore() {
        return entryTestScore;
    }

    public void setEntryTestScore(double entryTestScore) {
        this.entryTestScore = entryTestScore;
    }

    @Override
    public void showInfor() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "NormalStudent{" + "fullName=" + fullName + ", doB=" + doB + ", sex=" + sex + ", phoneNumber=" + phoneNumber + ", universityName=" + universityName + ", gradeLevel=" + gradeLevel + "englishScore=" + englishScore + ", entryTestScore=" + entryTestScore + '}';
    }

}
