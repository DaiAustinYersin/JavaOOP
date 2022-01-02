/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai7;

import bai7.objects.CBGV;
import bai7.objects.Nguoi;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DaiAustinYersin
 */
public class QuanLyGiaoVien {
    
    private List<Nguoi> list;

    public QuanLyGiaoVien() {
        list = new ArrayList<>();
        khoiTao();
    }
    
    private void khoiTao() {
        list.add(new CBGV(4_000_000, 2_000_000, 500_000, "GV01", "Anh", 32, "HN"));
        list.add(new CBGV(3_500_000, 1_500_000, 300_000, "GV02", "Bac", 29, "BN"));
        list.add(new CBGV(3_000_000, 1_000_000, 100_000, "GV03", "Can", 27, "BG"));
    }
    
    public void themMoi(Nguoi ng) {
        list.add(ng);
    }
    
    public boolean xoa(String id) {
        Nguoi ng = list.stream().filter(n -> n.getMaGV().equals(id)).findFirst().orElse(null);
        if (ng != null) {
            list.remove(ng);
            return true;
        } else {
            System.out.println("Mã giáo viên không tồn tại");
            return false;
        }
    }
    
    public void hienThi() {
        list.stream().forEach(System.out::println);
    }
    
}
