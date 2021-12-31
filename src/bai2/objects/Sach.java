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
public class Sach extends TaiLieu {

    private String tacGia;
    private int soTrang;

    public Sach() {
    }

    public Sach(String tacGia, int soTrang, String id, String nhaXuatBan, int soBanPhatHanh) {
        super(id, nhaXuatBan, soBanPhatHanh);
        this.tacGia = tacGia;
        this.soTrang = soTrang;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return "Sach{" + "id=" + id + ", nhaXuatBan=" + nhaXuatBan + ", soBanPhatHanh=" + soBanPhatHanh + ", tacGia=" + tacGia + ", soTrang=" + soTrang + '}';
    }
}
