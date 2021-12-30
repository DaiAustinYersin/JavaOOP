/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2.objects;

/**
 *
 * @author DaiAustinYersin
 */
public class TaiLieu {

    protected String id;
    protected String nhaXuatBan;
    protected int soBanPhatHanh;

    public TaiLieu() {
    }

    public TaiLieu(String id, String nhaXuatBan, int soBanPhatHanh) {
        this.id = id;
        this.nhaXuatBan = nhaXuatBan;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public int getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void setSoBanPhatHanh(int soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }

    @Override
    public String toString() {
        return "TaiLieu{" + "id=" + id + ", nhaXuatBan=" + nhaXuatBan + ", soBanPhatHanh=" + soBanPhatHanh + '}';
    }
}
