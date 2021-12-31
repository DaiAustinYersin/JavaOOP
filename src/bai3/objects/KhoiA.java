/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3.objects;

/**
 *
 * @author DaiAustinYersin
 */
public class KhoiA extends ThiSinh {

    protected static final String TOAN = "Toán";
    protected static final String LY = "Lý";
    protected static final String HOA = "Hóa";

    public KhoiA() {
    }

    public KhoiA(String soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }

    @Override
    public String toString() {
        return "KhoiA{" + "soBaoDanh=" + soBaoDanh + ", hoTen=" + hoTen + ", diaChi=" + diaChi + ", mucUuTien=" + mucUuTien + ", monThi=" + TOAN + "-" + LY + "-" + HOA + '}';
    }

}
