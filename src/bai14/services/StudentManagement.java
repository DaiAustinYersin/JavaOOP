/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai14.services;

import bai14.entities.GoodStudent;
import bai14.entities.NormalStudent;
import bai14.entities.Student;
import bai14.exceptions.InvalidDOBException;
import bai14.exceptions.InvalidFullNameException;
import bai14.exceptions.InvalidPhoneNumberException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 *
 * @author DaiAustinYersin
 */
public class StudentManagement {
    
    Scanner sc = new Scanner(System.in);
    private List<Student> list_All;
    private List<GoodStudent> list_goodStudent;
    private List<NormalStudent> list_normalStudent;

    public StudentManagement() {
        list_All = new ArrayList<>();
        list_goodStudent = new ArrayList<>();
        list_normalStudent = new ArrayList<>();
        init();
    }
    
    private void init() {
        list_All.add(new GoodStudent(9.1, "resfes", "Anh", LocalDate.parse("2002-11-12"), true, "0123456789", "fpt", "Good"));
        list_All.add(new GoodStudent(8.2, "resfes", "Bac", LocalDate.parse("2002-11-12"), true, "0123456789", "fpt", "Good"));
        list_All.add(new GoodStudent(9.3, "resfes", "Can", LocalDate.parse("2002-11-12"), true, "0123456789", "fpt", "Good"));
        list_All.add(new GoodStudent(8.6, "resfes", "Dung", LocalDate.parse("2002-11-12"), false, "0123456789", "fpt", "Good"));
        list_All.add(new GoodStudent(8.2, "resfes", "Hanh", LocalDate.parse("2002-11-12"), false, "0123456789", "fpt", "Good"));
        list_All.add(new GoodStudent(9.4, "resfes", "Khanh", LocalDate.parse("2002-11-12"), true, "0123456789", "fpt", "Good"));
        list_All.add(new GoodStudent(8.8, "resfes", "Khang", LocalDate.parse("2002-11-12"), true, "0123456789", "fpt", "Good"));
        list_All.add(new GoodStudent(8.9, "resfes", "Hoi", LocalDate.parse("2002-11-12"), true, "0123456789", "fpt", "Good"));
        list_All.add(new GoodStudent(9.2, "resfes", "Lua", LocalDate.parse("2002-11-12"), false, "0123456789", "fpt", "Good"));
        list_All.add(new GoodStudent(9.5, "resfes", "Trang", LocalDate.parse("2002-11-12"), false, "0123456789", "fpt", "Good"));
        list_All.add(new GoodStudent(9.1, "resfes", "Trong", LocalDate.parse("2002-11-12"), false, "0123456789", "fpt", "Good"));
        list_All.add(new GoodStudent(8.9, "resfes", "Dai", LocalDate.parse("2002-11-12"), false, "0123456789", "fpt", "Good"));
        list_All.add(new GoodStudent(8.4, "resfes", "Tuyet", LocalDate.parse("2002-11-12"), false, "0123456789", "fpt", "Good"));
        list_All.add(new GoodStudent(8.6, "resfes", "Vuong", LocalDate.parse("2002-11-12"), false, "0123456789", "fpt", "Good"));
        list_All.add(new NormalStudent(440, 7.6, "Hoa", LocalDate.parse("2002-05-04"), false, "0123456789", "fpoly", "Normal"));
        list_All.add(new NormalStudent(540, 7.1, "Van", LocalDate.parse("2002-05-04"), true, "0123456789", "fpoly", "Normal"));
        list_All.add(new NormalStudent(430, 7.5, "Vu", LocalDate.parse("2002-05-04"), true, "0123456789", "fpoly", "Normal"));
        list_All.add(new NormalStudent(640, 7.3, "Nguyet", LocalDate.parse("2002-05-04"), false, "0123456789", "fpoly", "Normal"));
        list_All.add(new NormalStudent(410, 7.2, "Luong", LocalDate.parse("2002-05-04"), true, "0123456789", "fpoly", "Normal"));
        list_All.add(new NormalStudent(500, 7.8, "Bich", LocalDate.parse("2002-05-04"), false, "0123456789", "fpoly", "Normal"));
        list_All.add(new NormalStudent(430, 7.9, "Ngoc", LocalDate.parse("2002-05-04"), false, "0123456789", "fpoly", "Normal"));
        list_All.add(new NormalStudent(420, 7.5, "Cham", LocalDate.parse("2002-05-04"), false, "0123456789", "fpoly", "Normal"));
        list_All.add(new NormalStudent(400, 7.4, "Quan", LocalDate.parse("2002-05-04"), true, "0123456789", "fpoly", "Normal"));
        list_All.add(new NormalStudent(490, 7.3, "Son", LocalDate.parse("2002-05-04"), true, "0123456789", "fpoly", "Normal"));
        list_All.add(new NormalStudent(590, 7.5, "Viet", LocalDate.parse("2002-05-04"), true, "0123456789", "fpoly", "Normal"));
        
        list_goodStudent.add(new GoodStudent(9.1, "resfes", "Anh", LocalDate.parse("2002-11-12"), true, "0123456789", "fpt", "Good"));
        list_goodStudent.add(new GoodStudent(8.2, "resfes", "Bac", LocalDate.parse("2002-11-12"), true, "0123456789", "fpt", "Good"));
        list_goodStudent.add(new GoodStudent(9.3, "resfes", "Can", LocalDate.parse("2002-11-12"), true, "0123456789", "fpt", "Good"));
        list_goodStudent.add(new GoodStudent(8.6, "resfes", "Dung", LocalDate.parse("2002-11-12"), false, "0123456789", "fpt", "Good"));
        list_goodStudent.add(new GoodStudent(8.2, "resfes", "Hanh", LocalDate.parse("2002-11-12"), false, "0123456789", "fpt", "Good"));
        list_goodStudent.add(new GoodStudent(9.4, "resfes", "Khanh", LocalDate.parse("2002-11-12"), true, "0123456789", "fpt", "Good"));
//        list_goodStudent.add(new GoodStudent(8.8, "resfes", "Khang", LocalDate.parse("2002-11-12"), true, "0123456789", "fpt", "Good"));
//        list_goodStudent.add(new GoodStudent(8.9, "resfes", "Hoi", LocalDate.parse("2002-11-12"), true, "0123456789", "fpt", "Good"));
//        list_goodStudent.add(new GoodStudent(9.2, "resfes", "Lua", LocalDate.parse("2002-11-12"), false, "0123456789", "fpt", "Good"));
//        list_goodStudent.add(new GoodStudent(9.5, "resfes", "Trang", LocalDate.parse("2002-11-12"), false, "0123456789", "fpt", "Good"));
//        list_goodStudent.add(new GoodStudent(9.1, "resfes", "Trong", LocalDate.parse("2002-11-12"), false, "0123456789", "fpt", "Good"));
//        list_goodStudent.add(new GoodStudent(8.9, "resfes", "Dai", LocalDate.parse("2002-11-12"), false, "0123456789", "fpt", "Good"));
//        list_goodStudent.add(new GoodStudent(8.4, "resfes", "Tuyet", LocalDate.parse("2002-11-12"), false, "0123456789", "fpt", "Good"));
//        list_goodStudent.add(new GoodStudent(8.6, "resfes", "Vuong", LocalDate.parse("2002-11-12"), false, "0123456789", "fpt", "Good"));

        list_normalStudent.add(new NormalStudent(440, 7.6, "Hoa", LocalDate.parse("2002-05-04"), false, "0123456789", "fpoly", "Normal"));
        list_normalStudent.add(new NormalStudent(500, 7.8, "Bich", LocalDate.parse("2002-05-04"), false, "0123456789", "fpoly", "Normal"));
        list_normalStudent.add(new NormalStudent(430, 7.9, "Ngoc", LocalDate.parse("2002-05-04"), false, "0123456789", "fpoly", "Normal"));
        list_normalStudent.add(new NormalStudent(420, 7.5, "Cham", LocalDate.parse("2002-05-04"), false, "0123456789", "fpoly", "Normal"));
        list_normalStudent.add(new NormalStudent(400, 7.4, "Quan", LocalDate.parse("2002-05-04"), true, "0123456789", "fpoly", "Normal"));
        list_normalStudent.add(new NormalStudent(490, 7.3, "Son", LocalDate.parse("2002-05-04"), true, "0123456789", "fpoly", "Normal"));
        list_normalStudent.add(new NormalStudent(590, 7.5, "Viet", LocalDate.parse("2002-05-04"), true, "0123456789", "fpoly", "Normal"));
    }
    
    public int studentAll_count() {
        return list_All.size();
    }
    
    public List<GoodStudent> goodStudent_list() {
        return list_goodStudent.stream().filter(std -> std instanceof GoodStudent).collect(Collectors.toList());
    }
    
    public List<NormalStudent> normalStudent_list() {
        return list_normalStudent.stream().filter(std -> std instanceof NormalStudent).collect(Collectors.toList());
    }

    public void add(String level) {
        Student std = null;
        if (level.equals("Good")) {
            std = addGoodStudent();
        } else {
            std = addNormalStudent();
        }
        
        try {
            checkData(std);
        } catch (InvalidFullNameException | InvalidDOBException | InvalidPhoneNumberException ex) {
            ex.printStackTrace();
            return;
        } catch (Exception e) {
            System.out.println("Input files have unknow errors !!!");
            return;
        }
        
        list_All.add(std);
        list_All.stream().forEach(Student::showInfor);
    }
    
    private GoodStudent addGoodStudent() {
        System.out.print("Fullname: ");
        String name = sc.nextLine();
        System.out.print("Date of birth: ");
        LocalDate date = LocalDate.parse(sc.nextLine());
        System.out.print("Sex: ");
        boolean sex = "Male".equalsIgnoreCase(sc.nextLine());
        System.out.print("Phone Number: ");
        String phone = sc.nextLine();
        System.out.print("University name: ");
        String uniNam = sc.nextLine();
        
        System.out.print("GPA: ");
        double gpa = Double.parseDouble(sc.nextLine());
        System.out.print("Best reward name: ");
        String reward = sc.nextLine();
        
        return new GoodStudent(gpa, reward, name, date, sex, phone, uniNam, "Good");
    }
    
    private NormalStudent addNormalStudent() {
        System.out.print("Fullname: ");
        String name = sc.nextLine();
        System.out.print("Date of birth: ");
        LocalDate date = LocalDate.parse(sc.nextLine());
        System.out.print("Sex: ");
        boolean sex = "Male".equalsIgnoreCase(sc.nextLine());
        System.out.print("Phone Number: ");
        String phone = sc.nextLine();
        System.out.print("University name: ");
        String uniNam = sc.nextLine();
        
        System.out.print("English score: ");
        int toeic = Integer.parseInt(sc.nextLine());
        System.out.print("Entry test score ");
        double entryTest = Double.parseDouble(sc.nextLine());
        
        return new NormalStudent(toeic, entryTest, name, date, sex, phone, uniNam, "Medium");
    }
    
    private void checkData(Student std) throws InvalidFullNameException, InvalidDOBException, InvalidPhoneNumberException {
        StudentValidator.checkFullName(std.getFullName());
        StudentValidator.checkDoB(std.getDoB());
        StudentValidator.checkPhoneNumber(std.getPhoneNumber());
    }
    
}
