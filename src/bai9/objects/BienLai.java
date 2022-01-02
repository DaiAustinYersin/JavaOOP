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
public class BienLai {

    private KhachHang hoSuDung;
    private int chiSoDienCu;
    private int chiSoDienMoi;

    public BienLai(KhachHang hoSuDung, int chiSoDienCu, int chiSoDienMoi) {
        this.hoSuDung = hoSuDung;
        this.chiSoDienCu = chiSoDienCu;
        this.chiSoDienMoi = chiSoDienMoi;
    }

    public KhachHang getHoSuDung() {
        return hoSuDung;
    }

    public void setHoSuDung(KhachHang hoSuDung) {
        this.hoSuDung = hoSuDung;
    }

    public int getChiSoDienCu() {
        return chiSoDienCu;
    }

    public void setChiSoDienCu(int chiSoDienCu) {
        this.chiSoDienCu = chiSoDienCu;
    }

    public int getChiSoDienMoi() {
        return chiSoDienMoi;
    }

    public void setChiSoDienMoi(int chiSoDienMoi) {
        this.chiSoDienMoi = chiSoDienMoi;
    }
    
    public double tinhTienPhaiTra() {
        return (chiSoDienMoi - chiSoDienCu) * 5;
    }

    @Override
    public String toString() {
        return "BienLai{" + "hoSuDung=" + hoSuDung + ", chiSoDienCu=" + chiSoDienCu + ", chiSoDienMoi=" + chiSoDienMoi + ", tienPhaiTra=" + tinhTienPhaiTra() + '}';
    }

}
