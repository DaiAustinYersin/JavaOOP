/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai11;

import bai11.objects.SoPhuc;

/**
 *
 * @author DaiAustinYersin
 */
public class Main {

    public static void main(String[] args) {
        PhuongThuc pt = new PhuongThuc();
        SoPhuc c1 = pt.nhapSoPhuc();
        pt.hienThi(c1);
        SoPhuc c2 = pt.nhapSoPhuc();
        pt.hienThi(c2);
        System.out.print("Tổng 2 số phức: " + pt.cong2SoPhuc(c1, c2));
        System.out.print("\nTích 2 số phức: " + pt.nhan2SoPhuc(c1, c2));
    }
}
