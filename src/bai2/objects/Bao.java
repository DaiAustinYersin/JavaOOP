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
public class Bao extends TaiLieu {

    private int ngayPhatHanh;

    public Bao() {
    }

    public Bao(int ngayPhatHanh, String id, String nhaXuatBan, int soBanPhatHanh) {
        super(id, nhaXuatBan, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public int getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(int ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public String toString() {
        return "Bao{" + "id=" + id + ", nhaXuatBan=" + nhaXuatBan + ", soBanPhatHanh=" + soBanPhatHanh + ", ngayPhatHanh=" + ngayPhatHanh + '}';
    }
}
