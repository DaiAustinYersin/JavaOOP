/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import bai3.objects.KhoiA;
import bai3.objects.KhoiB;
import bai3.objects.KhoiC;
import java.util.Scanner;

/**
 *
 * @author DaiAustinYersin
 */
public class Main {

    public static void main(String[] args) {
        TuyenSinh ql = new TuyenSinh();
        Scanner sc = new Scanner(System.in);
        ql.init();

        while (true) {
            menu();
            System.out.print("Chọn chức năng: ");
            String chon = sc.nextLine();
            String id, hoTen, diaChi;
            int mucUuTien;
            switch (chon) {
                case "1":
                    System.out.println("1. Thêm mới thí sinh.");
                    System.out.print("Chọn khối cần thêm (a. Khối A | b. Khối B | c. Khối C): ");
                    String khoi = sc.nextLine();
                    switch (khoi) {
                        case "a": {
                            while (true) {
                                System.out.print("Số báo danh: ");
                                id = sc.nextLine();
                                if (ql.checkSBD(id)) {
                                    break;
                                }
                            }
                            System.out.print("Họ tên: ");
                            hoTen = sc.nextLine();
                            System.out.print("Địa chỉ: ");
                            diaChi = sc.nextLine();
                            while (true) {
                                try {
                                    System.out.print("Mức ưu tiên (1,2,3): ");
                                    mucUuTien = Integer.parseInt(sc.nextLine());
                                    if ("123".contains(mucUuTien + "")) {
                                        break;
                                    }
                                } catch (NumberFormatException e) {
                                    System.out.println("Phải nhập số");
                                }
                            }
                            ql.themMoi(new KhoiA(id, hoTen, diaChi, mucUuTien));
                            break;
                        }
                        case "b": {
                            while (true) {
                                System.out.print("Số báo danh: ");
                                id = sc.nextLine();
                                if (ql.checkSBD(id)) {
                                    break;
                                }
                            }
                            System.out.print("Họ tên: ");
                            hoTen = sc.nextLine();
                            System.out.print("Địa chỉ: ");
                            diaChi = sc.nextLine();
                            while (true) {
                                try {
                                    System.out.print("Mức ưu tiên (1,2,3): ");
                                    mucUuTien = Integer.parseInt(sc.nextLine());
                                    if ("123".contains(mucUuTien + "")) {
                                        break;
                                    }
                                } catch (NumberFormatException e) {
                                    System.out.println("Phải nhập số");
                                }
                            }
                            ql.themMoi(new KhoiB(id, hoTen, diaChi, mucUuTien));
                            break;
                        }
                        case "c": {
                            while (true) {
                                System.out.print("Số báo danh: ");
                                id = sc.nextLine();
                                if (ql.checkSBD(id)) {
                                    break;
                                }
                            }
                            System.out.print("Họ tên: ");
                            hoTen = sc.nextLine();
                            System.out.print("Địa chỉ: ");
                            diaChi = sc.nextLine();
                            while (true) {
                                try {
                                    System.out.print("Mức ưu tiên (1,2,3): ");
                                    mucUuTien = Integer.parseInt(sc.nextLine());
                                    if ("123".contains(mucUuTien + "")) {
                                        break;
                                    }
                                } catch (NumberFormatException e) {
                                    System.out.println("Phải nhập số");
                                }
                            }
                            ql.themMoi(new KhoiC(id, hoTen, diaChi, mucUuTien));
                            break;
                        }
                    }
                    break;
                case "2":
                    System.out.println("2. Hiện thị thông tin của thí sinh và khối thi của thí sinh.");
                    ql.hienThi();
                    break;
                case "3":
                    System.out.println("3. Tìm kiếm theo số báo danh.");
                    System.out.print("Nhập số báo danh cần tìm: ");
                    String sbd = sc.nextLine();
                    ql.timKiem(sbd);
                    
                    break;
                case "4":
                    System.exit(0);
                default:
                    System.out.println("Vui lòng chọn từ 1-4");
            }
        }
    }

    public static void menu() {
        System.out.println("=================================================");
        System.out.println("\t1. Thêm mới thí sinh.");
        System.out.println("\t2. Hiện thị thông tin của thí sinh và khối thi của thí sinh.");
        System.out.println("\t3. Tìm kiếm theo số báo danh.");
        System.out.println("\t4. Thoát khỏi chương trình.");
        System.out.println("=================================================");
    }

}
