/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai8;

import bai8.objects.SinhVien;
import bai8.objects.TheMuon;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author DaiAustinYersin
 */
public class QuanLyTheMuon {
    
    private List<TheMuon> list;

    public QuanLyTheMuon() {
        list = new ArrayList<>();
        khoiTao();
    }
    
    private void khoiTao() {
        list.add(new TheMuon("TM01", new SinhVien("Anh", 19, "IT"), 3, 10, "S01"));
        list.add(new TheMuon("TM02", new SinhVien("Bac", 20, "DES"), 2, 16, "S02"));
        list.add(new TheMuon("TM03", new SinhVien("Can", 21, "MOB"), 10, 17, "S03"));
    }
    
    public boolean checkID(String id) {
        TheMuon the = list.stream().filter(t -> t.getMaPhieu().equals(id)).findFirst().orElse(null);
        if (the == null) {
            return true;
        } else {
            System.out.println("Mã phiếu đã tồn tại");
            return false;
        }
    }
    
    public void themMoi(TheMuon the) {
        list.add(the);
    }
    
    public boolean xoa(String id) {
        TheMuon the = list.stream().filter(t -> t.getMaPhieu().equals(id)).findFirst().orElse(null);
        if (the != null) {
            list.remove(id);
            return true;
        } else {
            System.out.println("Mã phiếu không tồn tại");
            return false;
        }
    }
    
    public void hienThi() {
        list.stream().forEach(System.out::println);
    }
    
}
