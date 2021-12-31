/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4.objects;

/**
 *
 * @author DaiAustinYersin
 */
public class Nguoi {

    private String hoTen;
    private int tuoi;
    private String ngheNghiep;
    private String CMND;

    public Nguoi() {
    }

    public Nguoi(String hoTen, int tuoi, String ngheNghiep, String CMND) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.ngheNghiep = ngheNghiep;
        this.CMND = CMND;
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

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    @Override
    public String toString() {
        return "Nguoi{" + "hoTen=" + hoTen + ", tuoi=" + tuoi + ", ngheNghiep=" + ngheNghiep + ", CMND=" + CMND + '}';
    }

}
