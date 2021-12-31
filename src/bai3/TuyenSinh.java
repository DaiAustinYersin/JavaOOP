/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import bai3.objects.KhoiA;
import bai3.objects.KhoiB;
import bai3.objects.KhoiC;
import bai3.objects.ThiSinh;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author DaiAustinYersin
 */
public class TuyenSinh {
    
    private List<ThiSinh> list;

    public TuyenSinh() {
        list = new ArrayList<>();
    }
    
    public void init() {
        list.add(new KhoiA("A001", "Nguyễn Văn A", "Hà Nội", 3));
        list.add(new KhoiB("B001", "Nguyễn Thị B", "Tuyên Quang", 1));
        list.add(new KhoiC("C001", "Lê Ngọc C", "Huế", 2));
    }
    
    public boolean checkSBD(String id) {
        if (list.stream().filter(ts -> ts.getSoBaoDanh().equals(id)).findFirst().orElse(null) == null) {
            return true;
        } else {
            System.out.println("Số báo danh đã tồn tại");
            return false;
        }
    }
    
    public void themMoi(ThiSinh ts) {
        list.add(ts);
    }
    
    public void hienThi() {
        list.stream().forEach(System.out::println);
    }
    
    public void timKiem(String id) {
        list.stream().filter(ts -> ts.getSoBaoDanh().contains(id.trim())).collect(Collectors.toList()).forEach(System.out::println);
    }
    
}
