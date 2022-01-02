/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5.objects;

/**
 *
 * @author DaiAustinYersin
 */
public class Phong {

    protected char loaiPhong;
    protected double giaPhong;

    public Phong(char loaiPhong, double giaPhong) {
        this.loaiPhong = loaiPhong;
        this.giaPhong = giaPhong;
    }

    public char getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(char loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public double getGiaPhong() {
        return giaPhong;
    }

    public void setGiaPhong(double giaPhong) {
        this.giaPhong = giaPhong;
    }

}
