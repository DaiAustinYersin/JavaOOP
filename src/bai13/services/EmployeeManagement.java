/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai13.services;

import bai13.entities.Certificate;
import bai13.entities.Employee;
import bai13.entities.Experience;
import bai13.entities.Fresher;
import bai13.entities.Intern;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author DaiAustinYersin
 */
public class EmployeeManagement {

    private List<Employee> list;

    public EmployeeManagement() {
        list = new ArrayList<>();
        list.add(new Experience(2, "Java", "E01", "Anh", LocalDate.parse("1998-01-04"), "0123456789", "anh@gmail.com", 0, Arrays.asList(new Certificate("C01", "Java", "Good", LocalDate.parse("2017-01-02")))));
        list.add(new Fresher(LocalDate.parse("2020-04-05"), "Medium", "FPoly", "E02", "Bac", LocalDate.parse("2001-04-05"), "0987654321", "bac@gmail.com", 1, Arrays.asList(new Certificate("C02", "Design", "Excellent", LocalDate.parse("2018-07-18")))));
        list.add(new Intern("PR", 3, "FPT", "E03", "Can", LocalDate.parse("2020-02-13"), "086428642", "can@gmail.com", 3, Arrays.asList(new Certificate("C03", "PR", "Good", LocalDate.parse("2019-05-30")))));
    }

    public boolean checkID(String id) {
        if (list.stream().filter(e -> e.getID().equalsIgnoreCase(id)).findFirst().orElse(null) == null) {
            return true;
        } else {
            System.out.println("ID đã tồn tại");
            return false;
        }
    }

    public void add(Employee e) {
        list.add(e);
    }
    
    public List<Employee> findAll() {
        return list;
    }
    
    public void showAll() {
        list.stream().forEach(Employee::showInfor);
    }

    public Employee findByID(String id) {
        return list.stream().filter(e -> e.getID().equals(id)).findFirst().orElse(null);
    }

    public boolean delete(String id) {
        Employee emp = list.stream().filter(e -> e.getID().equalsIgnoreCase(id)).findFirst().orElse(null);
        if (emp != null) {
            return true;
        } else {
            System.out.println("ID không tồn tại");
            return false;
        }
    }

    public List<Employee> findByType(int type) {
        return list.stream().filter(emp -> {
            switch (type) {
                case 0:
                    return emp instanceof Experience;
                case 1:
                    return emp instanceof Fresher;
                case 2:
                    return emp instanceof Intern;
                default:
                    return false;
            }
        }).collect(Collectors.toList());
    }

}
