/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import bai4.objects.HoGiaDinh;
import bai4.objects.KhuPho;
import bai4.objects.Nguoi;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DaiAustinYersin
 */
public class Main {

    public static void main(String[] args) {
        KhuPho khuPho = new KhuPho();
        HoGiaDinh hoGiaDinh = new HoGiaDinh();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số hộ gia đình: ");
        int soHoGD = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < soHoGD; i++) {
            System.out.print("Nhập số nhà: ");
            String soNha = sc.nextLine();
            System.out.print("Nhập số thành viên: ");
            int soTV = Integer.parseInt(sc.nextLine());
            List<Nguoi> listTV = new ArrayList<>();
            for (int j = 0; j < soTV; j++) {
                System.out.print("Nhập họ tên: ");
                String hoTen = sc.nextLine();
                System.out.print("Nhập tuổi: ");
                int tuoi = Integer.parseInt(sc.nextLine());
                System.out.print("Nhập nghề ngiệp: ");
                String ngheNghiep = sc.nextLine();
                System.out.print("Nhập CMND: ");
                String cmnd = sc.nextLine();
                if (hoGiaDinh.getListThanhVien() != null) {
                    if (!hoGiaDinh.checkCMND(cmnd)) {
                        return;
                    }
                }
                Nguoi nguoi = new Nguoi(hoTen, tuoi, ngheNghiep, cmnd);
                listTV.add(nguoi);
            }
            hoGiaDinh = new HoGiaDinh(listTV, soNha);
            khuPho.themHoGD(hoGiaDinh);
        }
        khuPho.getListHoGD().stream().forEach(System.out::println);
    }
}
