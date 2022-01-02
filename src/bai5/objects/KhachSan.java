/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5.objects;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author DaiAustinYersin
 */
public class KhachSan {
    
    private List<Nguoi> list;

    public KhachSan() {
        list = new ArrayList<>();
        khoiTao();
    }
    
    private void khoiTao() {
        list.add(new Nguoi("Van", 23, "123", new PhongC(), 5));
        list.add(new Nguoi("Linh", 45, "456", new PhongB(), 4));
        list.add(new Nguoi("Bac", 52, "789", new PhongA(), 3));
    }
    
    public void themKhach(Nguoi nguoi) {
        list.add(nguoi);
    }
    
    public boolean xoaKhach(String cmnd) {
        Nguoi ng = list.stream().filter(nguoi -> nguoi.getCmnd().equals(cmnd)).findFirst().orElse(null);
        if (ng != null) {
            list.remove(ng);
            return true;
        } else {
            System.out.println("Khách không tồn tại");
            return false;
        }
    }
    
    public void hienThi() {
        list.stream().forEach(System.out::println);
    }
    
}
