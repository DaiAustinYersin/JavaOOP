/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai8;

import bai8.objects.SinhVien;
import bai8.objects.TheMuon;
import java.util.Scanner;

/**
 *
 * @author DaiAustinYersin
 */
public class Main {

    public static void main(String[] args) {
        QuanLyTheMuon ql = new QuanLyTheMuon();
        Scanner sc = new Scanner(System.in);
        while (true) {
            menu();
            System.out.print("Nhập chức năng: ");
            String func = sc.nextLine();
            switch (func) {
                case "1":
                    String id;
                    while (true) {                        
                        System.out.print("Mã thẻ mượn: ");
                        id = sc.nextLine();
                        if (ql.checkID(id)) {
                            break;
                        }
                    }
                    System.out.print("Ngày mượn: ");
                    int start = Integer.parseInt(sc.nextLine());
                    System.out.print("Ngày trả: ");
                    int end = Integer.parseInt(sc.nextLine());
                    System.out.print("Mã sách: ");
                    String maSach = sc.nextLine();
                    System.out.print("Họ tên: ");
                    String name = sc.nextLine();
                    System.out.print("Tuổi: ");
                    int tuoi = Integer.parseInt(sc.nextLine());
                    System.out.print("Lớp: ");
                    String lop = sc.nextLine();
                    ql.themMoi(new TheMuon(id, new SinhVien(name, tuoi, lop), start, end, maSach));
                    break;
                case "2":
                    System.out.print("Nhập mã phiếu cần xóa: ");
                    String maPhieu = sc.nextLine();
                    ql.xoa(maPhieu);
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
        System.out.println("\t1. Thêm thẻ mượn");
        System.out.println("\t2. Xóa thẻ mượn");
        System.out.println("\t3. Hiển thị");
        System.out.println("\t4. Thoát");
        System.out.println("=================================================");
    }
}
