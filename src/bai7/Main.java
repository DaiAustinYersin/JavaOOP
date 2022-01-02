/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai7;

import bai7.objects.CBGV;
import java.util.Scanner;

/**
 *
 * @author DaiAustinYersin
 */
public class Main {

    public static void main(String[] args) {
        QuanLyGiaoVien ql = new QuanLyGiaoVien();
        Scanner sc = new Scanner(System.in);
        while (true) {
            menu();
            System.out.print("Nhập chức năng: ");
            String func = sc.nextLine();
            switch (func) {
                case "1":
                    System.out.print("Mã giáo viên: ");
                    String id = sc.nextLine();
                    System.out.print("Họ tên: ");
                    String name = sc.nextLine();
                    System.out.print("Tuổi: ");
                    int tuoi = Integer.parseInt(sc.nextLine());
                    System.out.print("Quê quán: ");
                    String hometown = sc.nextLine();
                    System.out.print("Lương cứng: ");
                    double luongCung = Double.parseDouble(sc.nextLine());
                    System.out.print("Lương thưởng: ");
                    double luongThuong = Double.parseDouble(sc.nextLine());
                    System.out.print("Tiền phạt: ");
                    double tienPhat = Double.parseDouble(sc.nextLine());
                    System.out.println("Lương thực nhận: " + (luongCung + luongThuong - tienPhat));
                    ql.themMoi(new CBGV(luongCung, luongThuong, tienPhat, id, name, tuoi, hometown));
                    break;
                case "2":
                    System.out.print("Nhập mã giáo viên cần xóa: ");
                    String maGV = sc.nextLine();
                    ql.xoa(maGV);
                    break;
                case "3":
                    ql.hienThi();
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
        System.out.println("\t1. Thêm giáo viên");
        System.out.println("\t2. Xóa giáo viên");
        System.out.println("\t3. Hiển thị");
        System.out.println("\t4. Thoát");
        System.out.println("=================================================");
    }

}
