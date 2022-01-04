/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai13;

import bai13.entities.Certificate;
import bai13.entities.Employee;
import bai13.entities.Experience;
import bai13.entities.Fresher;
import bai13.entities.Intern;
import bai13.services.EmployeeManagement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DaiAustinYersin
 */
public class Main {

    public static void main(String[] args) {
        EmployeeManagement em = new EmployeeManagement();
        Scanner sc = new Scanner(System.in);
        while (true) {
            menu();
            System.out.print("Choose a function: ");
            String choice = sc.nextLine();
            switch (choice) {
                case "1": {
                    System.out.print("Choose type of employee to add (1. Experience | 2. Fresher | 3. Intern): ");
                    String type = sc.nextLine();
                    String id = null;
                    while (true) {
                        System.out.print("ID: ");
                        id = sc.nextLine();
                        if (em.checkID(id)) {
                            break;
                        }
                    }
                    System.out.print("Fullname: ");
                    String fullName = sc.nextLine();
                    System.out.print("Birthday: ");
                    LocalDate dob = LocalDate.parse(sc.nextLine());
                    System.out.print("Phone: ");
                    String phone = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    System.out.print("Number of certificate: ");
                    int num = Integer.parseInt(sc.nextLine());
                    List<Certificate> certificates = new ArrayList<>();
                    for (int i = 0; i < num; i++) {
                        System.out.print("Certificate ID: ");
                        String ID = sc.nextLine();
                        System.out.print("Certificate Name: ");
                        String name = sc.nextLine();
                        System.out.print("Certificate Rank: ");
                        String rank = sc.nextLine();
                        System.out.print("Certificate Date: ");
                        LocalDate date = LocalDate.parse(sc.nextLine());
                        certificates.add(new Certificate(ID, name, rank, date));
                    }
                    switch (type) {
                        case "1":
                            System.out.print("Year of experience: ");
                            int year = Integer.parseInt(sc.nextLine());
                            System.out.print("Major skill: ");
                            String skill = sc.nextLine();
                            em.add(new Experience(year, skill, id, fullName, dob, phone, email, 0, certificates));
                            break;
                        case "2":
                            System.out.print("Graduation date: ");
                            LocalDate date = LocalDate.parse(sc.nextLine());
                            System.out.print("Graduation rank: ");
                            String rank = sc.nextLine();
                            System.out.print("Education school: ");
                            String school = sc.nextLine();
                            em.add(new Fresher(date, rank, school, id, fullName, dob, phone, email, 1, certificates));
                            break;
                        case "3":
                            System.out.print("Major: ");
                            String major = sc.nextLine();
                            System.out.print("Semester: ");
                            int semester = Integer.parseInt(sc.nextLine());
                            System.out.print("School name: ");
                            String schoolName = sc.nextLine();
                            em.add(new Intern(major, semester, schoolName, id, fullName, dob, phone, email, 2, certificates));
                            break;
                    }
                    break;
                }
                case "2": {
                    System.out.print("ID of employee need editing: ");
                    String id = sc.nextLine();
                    Employee emp = em.findByID(id);
                    if (emp != null) {
                        System.out.print("Do you want to edit fullname? (1. Yes | 0. No): ");
                        if ("1".equals(sc.nextLine().trim())) {
                            System.out.print("Fullname: ");
                            emp.setFullName(sc.nextLine());
                        }
                        System.out.print("Do you want to edit birthday? (1. Yes | 0. No): ");
                        if ("1".equals(sc.nextLine().trim())) {
                            System.out.print("Birthday: ");
                            emp.setBirthDay(LocalDate.parse(sc.nextLine()));
                        }
                        System.out.print("Do you want to edit phone? (1. Yes | 0. No): ");
                        if ("1".equals(sc.nextLine().trim())) {
                            System.out.print("Phone: ");
                            emp.setPhone(sc.nextLine());
                        }
                        System.out.print("Do you want to edit email? (1. Yes | 0. No): ");
                        if ("1".equals(sc.nextLine().trim())) {
                            System.out.print("Email: ");
                            emp.setEmail(sc.nextLine());
                        }
                    } else {
                        System.out.println("ID doesn't exist");
                    }
                    break;
                }
                case "3":
                    System.out.print("ID of employee need deleting: ");
                    String id = sc.nextLine();
                    em.delete(id);
                    break;
                case "4":
                    System.out.print("Type of employee (0. Experience | 1. Fresher | 2. Intern): ");
                    em.findByType(Integer.parseInt(sc.nextLine())).forEach(Employee::showInfor);
                    break;
                case "5":
                    em.showAll();
                    break;
                case "6":
                    System.exit(0);
                default:
                    System.out.println("Input from 1-6");
            }
        }
    }

    private static void menu() {
        System.out.println("=============================================");
        System.out.println("\t1. Add a new employee");
        System.out.println("\t2. Update an employee");
        System.out.println("\t3. Delete a employee");
        System.out.println("\t4. Find list of employee by type");
        System.out.println("\t5. List all employees");
        System.out.println("\t6. Exit");
        System.out.println("=============================================");
    }

}
