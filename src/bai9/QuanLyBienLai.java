/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai9;

import bai9.objects.BienLai;
import bai9.objects.KhachHang;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DaiAustinYersin
 */
public class QuanLyBienLai {
    
    private List<BienLai> list;

    public QuanLyBienLai() {
        list = new ArrayList<>();
        khoiTao();
    }
    
    private void khoiTao() {
        list.add(new BienLai(new KhachHang("Anh", 123, "001"), 7283, 7938));
        list.add(new BienLai(new KhachHang("Bac", 456, "002"), 7193, 7458));
        list.add(new BienLai(new KhachHang("Can", 789, "003"), 7083, 7638));
    }
    
    public void them(BienLai bl) {
        list.add(bl);
    }
    
    public boolean xoa(String id) {
        BienLai bill = list.stream().filter(bl -> bl.getHoSuDung().getMaSoCongToDien().equals(id)).findFirst().orElse(null);
        if (bill != null) {
            list.remove(bill);
            return true;
        } else {
            System.out.println("Mã số công tơ ko tồn tại");
            return false;
        }
    }
    
    public void hienThi() {
        list.stream().forEach(System.out::println);
    }
}
