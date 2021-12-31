/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4.objects;

import java.util.List;

/**
 *
 * @author DaiAustinYersin
 */
public class HoGiaDinh {

    private List<Nguoi> listThanhVien;
    private String soNha;

    public HoGiaDinh() {
    }

    public HoGiaDinh(List<Nguoi> listThanhVien, String soNha) {
        this.listThanhVien = listThanhVien;
        this.soNha = soNha;
    }

    public List<Nguoi> getListThanhVien() {
        return listThanhVien;
    }

    public void setListThanhVien(List<Nguoi> listThanhVien) {
        this.listThanhVien = listThanhVien;
    }

    public String getSoNha() {
        return soNha;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    @Override
    public String toString() {
        return "HoGiaDinh{" + "soThanhVien=" + listThanhVien.size() + ", soNha=" + soNha + ", \nlistThanhVien=" + listThanhVien + '}';
    }

    public boolean checkCMND(String cmnd) {
        Nguoi nguoi = listThanhVien.stream().filter(n -> n.getCMND().equals(cmnd)).findFirst().orElse(null);
        if (nguoi == null) {
            return true;
        } else {
            System.out.println("CMND đã tồn tại");
            return false;
        }
    }

}
