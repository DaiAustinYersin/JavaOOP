/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai7.objects;

/**
 *
 * @author DaiAustinYersin
 */
public class Nguoi {

    protected String maGV;
    protected String hoTen;
    protected int tuoi;
    protected String queQuan;

    public Nguoi(String maGV, String hoTen, int tuoi, String queQuan) {
        this.maGV = maGV;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.queQuan = queQuan;
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
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

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    @Override
    public String toString() {
        return "Nguoi{" + "maGV=" + maGV + ", hoTen=" + hoTen + ", tuoi=" + tuoi + ", queQuan=" + queQuan + '}';
    }

}
