/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai12;

import bai12.objects.Car;
import bai12.objects.Motorbike;
import bai12.objects.Truck;
import java.util.Scanner;

/**
 *
 * @author DaiAustinYersin
 */
public class Main {

    public static void main(String[] args) {
        VehicleManagement vm = new VehicleManagement();
        Scanner sc = new Scanner(System.in);
        while (true) {
            menu();
            System.out.print("Input function: ");
            String func = sc.nextLine();
            switch (func) {
                case "1": {
                    System.out.print("Type of vehicle (1. Car | 2. Motorbike | 3. Truck): ");
                    String type = sc.nextLine();
                    String id;
                    while (true) {
                        System.out.print("ID: ");
                        id = sc.nextLine();
                        if (vm.checkID(id)) {
                            break;
                        }
                    }
                    System.out.print("Manufacturer: ");
                    String manufacture = sc.nextLine();
                    System.out.print("Manufacture of year: ");
                    int year = Integer.parseInt(sc.nextLine());
                    System.out.print("Price: ");
                    double price = Double.parseDouble(sc.nextLine());
                    System.out.print("Color: ");
                    String color = sc.nextLine();
                    switch (type) {
                        case "1":
                            System.out.print("Number of seat: ");
                            int seatNum = Integer.parseInt(sc.nextLine());
                            System.out.print("Engine type: ");
                            String engineType = sc.nextLine();
                            vm.add(new Car(seatNum, engineType, id, manufacture, year, price, color));
                            break;
                        case "2":
                            System.out.print("Wattage: ");
                            double wattage = Double.parseDouble(sc.nextLine());
                            vm.add(new Motorbike(wattage, id, manufacture, year, price, color));
                            break;
                        case "3":
                            System.out.print("Referee: ");
                            String referee = sc.nextLine();
                            vm.add(new Truck(referee, id, manufacture, year, price, color));
                            break;
                        default:
                            System.out.println("Input from 1 to 3");
                    }
                    break;
                }
                case "2": {
                    System.out.print("ID need to be deleted: ");
                    String id = sc.nextLine();
                    vm.delete(id);
                    break;
                }
                case "3": {
                    System.out.print("Find by (1. Manufacturer | 2. Color): ");
                    String choice = sc.nextLine();
                    switch (choice) {
                        case "1":
                            System.out.print("Manufacturer: ");
                            String manufacturer = sc.nextLine();
                            vm.findByManufacturer(manufacturer);
                            break;
                        case "2":
                            System.out.print("Color: ");
                            String color = sc.nextLine();
                            vm.findByColor(color);
                            break;
                        default:
                            System.out.println("Input from 1 to 2");
                    }
                    break;
                }
                case "4": {
                    vm.show();
                    break;
                }
                case "5":
                    System.exit(0);
                default:
                    System.out.println("Input from 1 to 5");
            }
        }
    }

    public static void menu() {
        System.out.println("=================================================");
        System.out.println("\t1. Thêm các phương tiện thuộc các loại trên.");
        System.out.println("\t2. Xoá(theo ID) các phương tiện thuộc các loại trên.");
        System.out.println("\t3. Tìm phương tiện theo hãng sản xuất, màu.");
        System.out.println("\t4. Hiển thị phương tiện.");
        System.out.println("\t5. Thoát chương trình.");
        System.out.println("=================================================");
    }

}
