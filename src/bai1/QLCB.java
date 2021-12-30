package bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class QLCB {
    
    private List<CanBo> list;

    public QLCB() {
        list = new ArrayList<>();
    }

    Scanner sc = new Scanner(System.in);

    void init() {
        list.add(new CongNhan("A", 19, 'M', "BN", 2));
        list.add(new KySu("B", 20, 'F', "HN", "..."));
        list.add(new NhanVien("C", 21, 'O', "HCM", "..."));
    }
    
    public void themMoi(CanBo cb) {
        this.list.add(cb);
    }

    public List<CanBo> timKiemHoTen(String hoTen) {
        return this.list.stream().filter(o -> o.getHoTen().contains(hoTen)).collect(Collectors.toList());
    }

    public void thongTinDS() {
        this.list.forEach(System.out::println);
    }
}
