/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6.objects;

/**
 *
 * @author DaiAustinYersin
 */
public class HocSinh {

    private String hoTen;
    private int tuoi;
    private String queQuan;
    private int lop;

    public HocSinh(String hoTen, int tuoi, String queQuan, int lop) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.queQuan = queQuan;
        this.lop = lop;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public int getLop() {
        return lop;
    }

    public void setLop(int lop) {
        this.lop = lop;
    }

    @Override
    public String toString() {
        return "HocSinh{" + "hoTen=" + hoTen + ", tuoi=" + tuoi + ", queQuan=" + queQuan + ", lop=" + lop + '}';
    }

}
