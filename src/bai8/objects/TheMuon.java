/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai8.objects;

import java.util.Date;

/**
 *
 * @author DaiAustinYersin
 */
public class TheMuon {

    private String maPhieu;
    private SinhVien nguoiMuon;
    private int ngayMuon;
    private int ngayTra;
    private String maSach;

    public TheMuon(String maPhieu, SinhVien nguoiMuon, int ngayMuon, int ngayTra, String maSach) {
        this.maPhieu = maPhieu;
        this.nguoiMuon = nguoiMuon;
        this.ngayMuon = ngayMuon;
        this.ngayTra = ngayTra;
        this.maSach = maSach;
    }

    public String getMaPhieu() {
        return maPhieu;
    }

    public void setMaPhieu(String maPhieu) {
        this.maPhieu = maPhieu;
    }

    public SinhVien getNguoiMuon() {
        return nguoiMuon;
    }

    public void setNguoiMuon(SinhVien nguoiMuon) {
        this.nguoiMuon = nguoiMuon;
    }

    public int getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(int ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public int getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(int ngayTra) {
        this.ngayTra = ngayTra;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    @Override
    public String toString() {
        return "TheMuon{" + "maPhieu=" + maPhieu + ", nguoiMuon=" + nguoiMuon + ", ngayMuon=" + ngayMuon + ", hanTra=" + ngayTra + ", maSach=" + maSach + '}';
    }

}
