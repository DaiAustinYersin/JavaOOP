/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6.objects;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DaiAustinYersin
 */
public class Truong {
    
    private List<HocSinh> list;

    public Truong() {
        list = new ArrayList<>();
        khoiTao();
    }
    
    private void khoiTao() {
        list.add(new HocSinh("Anh", 20, "BN", 10));
        list.add(new HocSinh("Bac", 23, "BG", 12));
        list.add(new HocSinh("Can", 22, "BN", 11));
        list.add(new HocSinh("Dau", 23, "HN", 12));
        list.add(new HocSinh("Long", 20, "VP", 10));
    }
    
    public void themMoi(HocSinh hs) {
        list.add(hs);
    }
    
    public void hienThiHS_20tuoi() {
        list.stream().filter(hs -> hs.getTuoi() == 20).forEach(System.out::println);
    }
    
    public void hienThiHS_23tuoi_queDaNang() {
        list.stream().filter(hs -> hs.getTuoi() == 23 && hs.getQueQuan().contains("DN")).forEach(System.out::println);
    }
    
}
