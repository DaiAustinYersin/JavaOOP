/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai14;

import bai14.entities.GoodStudent;
import bai14.entities.NormalStudent;
import bai14.entities.Student;
import bai14.services.StudentManagement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author DaiAustinYersin
 */
public class Main {
    
    

    public static void main(String[] args) {
        StudentManagement sm = new StudentManagement();
        Scanner sc = new Scanner(System.in);
        List<Student> list_Admitted = new ArrayList<>();
        List<GoodStudent> list_goodStudent = sm.goodStudent_list();
        List<NormalStudent> list_normalStudent = sm.normalStudent_list();
        System.out.print("The number of student need to recruit (11-15): ");
        int num = Integer.parseInt(sc.nextLine());
        if (num < ApplicationNum.MAX.getValue() || num > ApplicationNum.MIN.getValue()) {
            System.out.println("Must be in range (11,15)");
            return;
        }
        if (num < list_goodStudent.size()) {
            Collections.sort(list_goodStudent, (GoodStudent s1, GoodStudent s2) -> {
                Double gpa1 = s1.getGpa();
                Double gpa2 = s2.getGpa();
                if (gpa1 == gpa2) {
                    return s1.getFullName().compareTo(s2.getFullName());
                } else {
                    return gpa2.compareTo(gpa1);
                }
            });
            list_Admitted = list_goodStudent.stream().collect(Collectors.toList());
        } else if (num == list_goodStudent.size()){
            list_Admitted = list_goodStudent.stream().collect(Collectors.toList());
        } else {
            list_Admitted.addAll(list_goodStudent);
            Collections.sort(list_normalStudent, (NormalStudent s1, NormalStudent s2) -> {
                Integer gpa1 = s1.getEnglishScore();
                Integer gpa2 = s2.getEnglishScore();
                if (gpa1 == gpa2) {
                    return s1.getFullName().compareTo(s2.getFullName());
                } else {
                    return gpa2.compareTo(gpa1);
                }
            });
            num -= list_Admitted.size();
            list_Admitted.addAll(list_normalStudent.stream().sorted(((NormalStudent s1, NormalStudent s2) -> {
                Integer gpa1 = s1.getEnglishScore();
                Integer gpa2 = s2.getEnglishScore();
                if (gpa1 == gpa2) {
                    return s1.getFullName().compareTo(s2.getFullName());
                } else {
                    return gpa2.compareTo(gpa1);
                }
            })).limit(num).collect(Collectors.toList()));
        }
        
        list_Admitted.stream().forEach(Student::showInfor);
    }
}
