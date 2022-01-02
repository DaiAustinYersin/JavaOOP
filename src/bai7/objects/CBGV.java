/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai7.objects;

/**
 *
 * @author DaiAustinYersin
 */
public class CBGV extends Nguoi {

    private double luongCung, luongThuong, tienPhat;

    public CBGV(double luongCung, double luongThuong, double tienPhat, String maGV, String hoTen, int tuoi, String queQuan) {
        super(maGV, hoTen, tuoi, queQuan);
        this.luongCung = luongCung;
        this.luongThuong = luongThuong;
        this.tienPhat = tienPhat;
    }

    public double getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(double luongCung) {
        this.luongCung = luongCung;
    }

    public double getLuongThuong() {
        return luongThuong;
    }

    public void setLuongThuong(double luongThuong) {
        this.luongThuong = luongThuong;
    }

    public double getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(double tienPhat) {
        this.tienPhat = tienPhat;
    }
    
    public double tinhLuongThucNhan() {
        return luongCung + luongThuong - tienPhat;
    }

    @Override
    public String toString() {
        return "CBGV{" + "maGV=" + maGV + ", hoTen=" + hoTen + ", tuoi=" + tuoi + ", queQuan=" + queQuan + "luongCung=" + luongCung + ", luongThuong=" + luongThuong + ", tienPhat=" + tienPhat + ", luongThucNhan=" + tinhLuongThucNhan() + '}';
    }

}
