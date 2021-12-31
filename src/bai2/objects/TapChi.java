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
public class TapChi extends TaiLieu{
    
    private int soPhatHanh;
    private int thangPhatHanh;

    public TapChi() {
    }

    public TapChi(int soPhatHanh, int thangPhatHanh, String id, String nhaXuatBan, int soBanPhatHanh) {
        super(id, nhaXuatBan, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public String toString() {
        return "TapChi{" + "id=" + id + ", nhaXuatBan=" + nhaXuatBan + ", soBanPhatHanh=" + soBanPhatHanh + ", soPhatHanh=" + soPhatHanh + ", thangPhatHanh=" + thangPhatHanh + '}';
    }
}
