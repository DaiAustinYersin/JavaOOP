/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai11;

import bai11.objects.SoPhuc;
import java.util.Scanner;

/**
 *
 * @author DaiAustinYersin
 */
public class PhuongThuc {

    Scanner sc = new Scanner(System.in);

    public SoPhuc nhapSoPhuc() {
        System.out.print("Phần thực: ");
        double thuc = Double.parseDouble(sc.nextLine());
        System.out.print("Phần ảo: ");
        double ao = Double.parseDouble(sc.nextLine());
        return new SoPhuc(thuc, ao);
    }
    
    public void hienThi(SoPhuc complex) {
        System.out.println(complex);
    }
    
    public SoPhuc cong2SoPhuc(SoPhuc c1, SoPhuc c2) {
        return new SoPhuc(c1.getPhanThuc() + c2.getPhanThuc(), c1.getPhanAo() + c2.getPhanAo());
    }
    
    public SoPhuc nhan2SoPhuc(SoPhuc c1, SoPhuc c2) {
        return new SoPhuc(c1.getPhanThuc() * c2.getPhanThuc() - c1.getPhanAo() * c2.getPhanAo(), c1.getPhanThuc() * c2.getPhanAo() + c1.getPhanAo() * c2.getPhanThuc());
    }

}
