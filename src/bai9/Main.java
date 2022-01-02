/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai9;

import bai9.objects.BienLai;
import bai9.objects.KhachHang;
import java.util.Scanner;

/**
 *
 * @author DaiAustinYersin
 */
public class Main {

    public static void main(String[] args) {
        QuanLyBienLai ql = new QuanLyBienLai();
        Scanner sc = new Scanner(System.in);
        while (true) {
            menu();
            System.out.print("Nhập chức năng: ");
            String func = sc.nextLine();
            switch (func) {
                case "1":
                    System.out.print("Họ tên chủ hộ: ");
                    String name = sc.nextLine();
                    System.out.print("Số nhà: ");
                    int soNha = Integer.parseInt(sc.nextLine());
                    System.out.print("Mã số công tơ: ");
                    String maSoCT = sc.nextLine();
                    System.out.print("Chỉ số điện cũ: ");
                    int old = Integer.parseInt(sc.nextLine());
                    System.out.print("Chỉ số điện mới: ");
                    int moi = Integer.parseInt(sc.nextLine());
                    ql.them(new BienLai(new KhachHang(name, soNha, maSoCT), old, moi));
                    break;
                case "2":
                    System.out.print("Nhập mã số công tơ cần xóa: ");
                    String maSoCongTo = sc.nextLine();
                    ql.xoa(maSoCongTo);
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
        System.out.println("\t1. Thêm biên lai");
        System.out.println("\t2. Xóa biên lai");
        System.out.println("\t3. Hiển thị");
        System.out.println("\t4. Thoát");
        System.out.println("=================================================");
    }
}
