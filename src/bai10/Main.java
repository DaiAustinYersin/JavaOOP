/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai10;

import java.util.Scanner;

/**
 *
 * @author DaiAustinYersin
 */
public class Main {

    public static void main(String[] args) {
        PhuongThuc pt = new PhuongThuc();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập văn bản: ");
        String text = sc.nextLine();
        System.out.print("Số từ của văn bản: " + pt.diemSoTu(text));
        System.out.print("\nSố ký tự A không phân biệt hoa thường: " + pt.diemSoKyTu_A(text));
        System.out.print("\nChuẩn hóa văn bản: " + pt.chuanHoaVanBan(text));
    }
}
