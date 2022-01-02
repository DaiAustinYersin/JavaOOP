/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5;

import bai5.objects.KhachSan;
import bai5.objects.Nguoi;
import bai5.objects.Phong;
import bai5.objects.PhongA;
import bai5.objects.PhongB;
import bai5.objects.PhongC;
import java.util.Scanner;

/**
 *
 * @author DaiAustinYersin
 */
public class Main {

    public static void main(String[] args) {
        KhachSan ks = new KhachSan();
        Scanner sc = new Scanner(System.in);
        while (true) {
            menu();
            System.out.print("Nhập chức năng: ");
            String chon = sc.nextLine();
            switch(chon) {
                case "1":
                    System.out.print("Họ tên: ");
                    String name = sc.nextLine();
                    System.out.print("Tuổi: ");
                    int age = Integer.parseInt(sc.nextLine());
                    System.out.print("CMND: ");
                    String id = sc.nextLine();
                    Phong loaiPhong;
                    while (true) {                        
                        System.out.print("Loại phòng (A,B,C): ");
                        String temp = sc.nextLine().trim().toUpperCase();
                        if (temp.length() != 1) continue;
                        switch(temp) {
                            case "A":
                                loaiPhong = new PhongA();
                                break;
                            case "B":
                                loaiPhong = new PhongB();
                                break;
                            case "C":
                                loaiPhong = new PhongC();
                            default:
                                continue;
                        }
                        break;
                    }
                    System.out.print("Số ngày thuê: ");
                    int dayNum = Integer.parseInt(sc.nextLine());
                    ks.themKhach(new Nguoi(name, age, id, loaiPhong, dayNum));
                    break;
                case "2":
                    System.out.print("Nhập cmnd: ");
                    String cmnd = sc.nextLine();
                    ks.xoaKhach(cmnd);
                    break;
                case "3":
                    ks.hienThi();
                    break;
                case "4":
                    System.exit(0);
                default:
                    System.out.println("Nhập từ 1-4");
            }
        }
    }
    
    public static void menu() {
        System.out.println("=================================================");
        System.out.println("\t1. Check-in");
        System.out.println("\t2. Check-out");
        System.out.println("\t3. Hiển thị thông tin");
        System.out.println("\t4. Thoát");
        System.out.println("=================================================");
    }
}
