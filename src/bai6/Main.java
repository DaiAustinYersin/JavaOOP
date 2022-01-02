/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6;

import bai6.objects.HocSinh;
import bai6.objects.Truong;
import java.util.Scanner;

/**
 *
 * @author DaiAustinYersin
 */
public class Main {

    public static void main(String[] args) {
        Truong tr = new Truong();
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
                    System.out.print("Quê quán: ");
                    String hometown = sc.nextLine();
                    System.out.print("Lớp: ");
                    int classRoom = Integer.parseInt(sc.nextLine());
                    tr.themMoi(new HocSinh(name, age, hometown, classRoom));
                    break;
                case "2":
                    tr.hienThiHS_20tuoi();
                    break;
                case "3":
                    tr.hienThiHS_23tuoi_queDaNang();
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
        System.out.println("\t1. Thêm học sinh mới.");
        System.out.println("\t2. Hiện thị các học sinh 20 tuổi.");
        System.out.println("\t3. Cho biết số lượng các học sinh có tuổi là 23 và quê ở DN.");
        System.out.println("\t4. Thoát.");
        System.out.println("=================================================");
    }
}
