/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai9.objects;

/**
 *
 * @author DaiAustinYersin
 */
public class KhachHang {

    private String hoTenChuHo;
    private int soNha;
    private String maSoCongToDien;

    public KhachHang(String hoTenChuHo, int soNha, String maSoCongToDien) {
        this.hoTenChuHo = hoTenChuHo;
        this.soNha = soNha;
        this.maSoCongToDien = maSoCongToDien;
    }

    public String getHoTenChuHo() {
        return hoTenChuHo;
    }

    public void setHoTenChuHo(String hoTenChuHo) {
        this.hoTenChuHo = hoTenChuHo;
    }

    public int getSoNha() {
        return soNha;
    }

    public void setSoNha(int soNha) {
        this.soNha = soNha;
    }

    public String getMaSoCongToDien() {
        return maSoCongToDien;
    }

    public void setMaSoCongToDien(String maSoCongToDien) {
        this.maSoCongToDien = maSoCongToDien;
    }

    @Override
    public String toString() {
        return "KhachHang{" + "hoTenChuHo=" + hoTenChuHo + ", soNha=" + soNha + ", maSoCongToDien=" + maSoCongToDien + '}';
    }

}
