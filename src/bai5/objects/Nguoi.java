/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5.objects;

/**
 *
 * @author DaiAustinYersin
 */
public class Nguoi {

    private String hoTen;
    private int tuoi;
    private String cmnd;
    private Phong loaiPhong;
    private int soNgayThue;

    public Nguoi(String hoTen, int tuoi, String cmnd, Phong loaiPhong, int soNgayThue) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.cmnd = cmnd;
        this.loaiPhong = loaiPhong;
        this.soNgayThue = soNgayThue;
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

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public Phong getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(Phong loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public int getSoNgayThue() {
        return soNgayThue;
    }

    public void setSoNgayThue(int soNgayThue) {
        this.soNgayThue = soNgayThue;
    }
    
    private double tinhTienThue() {
        return getLoaiPhong().getGiaPhong() * getSoNgayThue();
    }

    @Override
    public String toString() {
        return "Nguoi{" + "hoTen=" + hoTen + ", tuoi=" + tuoi + ", cmnd=" + cmnd + ", loaiPhong=" + loaiPhong + ", soNgayThue=" + soNgayThue + ", tienThue=" + tinhTienThue() + '}';
    }

}
