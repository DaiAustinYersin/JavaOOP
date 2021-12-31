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
public class KhoiC extends ThiSinh {

    protected static final String VAN = "Văn";
    protected static final String SU = "Sử";
    protected static final String DIA = "Địa";

    public KhoiC() {
    }

    public KhoiC(String soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }

    @Override
    public String toString() {
        return "KhoiC{" + "soBaoDanh=" + soBaoDanh + ", hoTen=" + hoTen + ", diaChi=" + diaChi + ", mucUuTien=" + mucUuTien + ", monThi=" + VAN + "-" + SU + "-" + DIA + '}';
    }

}
