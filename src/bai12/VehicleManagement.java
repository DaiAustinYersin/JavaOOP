/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai12;

import bai12.objects.Car;
import bai12.objects.Motorbike;
import bai12.objects.Truck;
import bai12.objects.Vehicle;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author DaiAustinYersin
 */
public class VehicleManagement {

    private List<Vehicle> list;

    public VehicleManagement() {
        list = new ArrayList<>();
        list.add(new Car(4, "Type1", "C01", "Vinfast", 2021, 25000, "Red"));
        list.add(new Motorbike(200, "M01", "Honda", 2018, 2500, "White"));
        list.add(new Truck("Anh", "T01", "Truong Hai", 2019, 5100, "Green"));
    }

    public boolean checkID(String id) {
        if (list.stream().filter(v -> v.getID().equalsIgnoreCase(id)).findFirst().orElse(null) == null) {
            return true;
        } else {
            System.out.println("ID đã tồn tại");
            return false;
        }
    }

    public void add(Vehicle vehicle) {
        list.add(vehicle);
    }

    public boolean delete(String id) {
        Vehicle vehicle = list.stream().filter(v -> v.getID().equals(id)).findFirst().orElse(null);
        if (vehicle != null) {
            list.remove(vehicle);
            return true;
        } else {
            System.out.println("ID không tồn tại");
            return false;
        }
    }
    
    public void show() {
        list.stream().forEach(System.out::println);
    }
    
    public void findByManufacturer(String txt) {
        list.stream().filter(v -> v.getManufacturer().contains(txt)).collect(Collectors.toList()).stream().forEach(System.out::println);
    }
    
    public void findByColor(String txt) {
        list.stream().filter(v -> v.getColor().contains(txt)).collect(Collectors.toList()).stream().forEach(System.out::println);
    }
    
}
