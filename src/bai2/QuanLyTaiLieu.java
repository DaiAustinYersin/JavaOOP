/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import bai2.objects.Bao;
import bai2.objects.Sach;
import bai2.objects.TaiLieu;
import bai2.objects.TapChi;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author DaiAustinYersin
 */
public class QuanLyTaiLieu {
    
    List<TaiLieu> list;

    public QuanLyTaiLieu() {
        list = new LinkedList<>();
    }
    
    public void init() {
        list.add(new Sach("A", 100, "A100", "Kim Đồng", 1000));
        list.add(new TapChi(100, 3, "B1001", "Phụ Nữ", 2000));
        list.add(new Bao(23, "C2030", "Giáo dục", 20));
    }
    
    public void themMoi(TaiLieu doc) {
        list.add(doc);
    }
    
    public boolean checkID(String id) {
        TaiLieu doc =  list.stream().filter(tl -> tl.getId().equals(id)).findFirst().orElse(null);
        if (doc != null) {
            return false;
        } else {
            return true;
        }
    }
    
    public boolean xoa(String id) {
        TaiLieu doc =  list.stream().filter(tl -> tl.getId().equals(id)).findFirst().orElse(null);
        if (doc != null) {
            list.remove(doc);
            return true;
        } else {
            return false;
        }
    }
    
    public void hienThi() {
        list.stream().forEach(System.out::println);
    }
    
    public void timKiem(int loaiTL) {
        switch(loaiTL) {
            case 1:
                list.stream().filter(tl -> tl instanceof Sach).forEach(System.out::println);
                break;
            case 2:
                list.stream().filter(tl -> tl instanceof TapChi).forEach(System.out::println);
                break;
            case 3:
                list.stream().filter(tl -> tl instanceof Bao).forEach(System.out::println);
                break;
        }
    }
    
}
