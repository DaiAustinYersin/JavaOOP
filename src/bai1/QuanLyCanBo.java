package bai1;

import bai1.objects.CongNhan;
import bai1.objects.CanBo;
import bai1.objects.KySu;
import bai1.objects.NhanVien;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QuanLyCanBo {
    
    private List<CanBo> list;

    public QuanLyCanBo() {
        list = new ArrayList<>();
    }

    void init() {
        list.add(new CongNhan("A", 19, 'M', "BN", 2));
        list.add(new KySu("B", 20, 'F', "HN", "..."));
        list.add(new NhanVien("C", 21, 'O', "HCM", "..."));
    }
    
    public void themMoi(CanBo cb) {
        this.list.add(cb);
    }

    public List<CanBo> timKiemHoTen(String hoTen) {
        return this.list.stream().filter(cb -> cb.getHoTen().contains(hoTen)).collect(Collectors.toList());
    }

    public void thongTinDS() {
        this.list.forEach(System.out::println);
    }
}
