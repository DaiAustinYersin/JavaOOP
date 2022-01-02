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
public class PhongB extends Phong {
    
    public PhongB() {
        super('B', 300);
    }

    @Override
    public String toString() {
        return "PhongB{" + "loaiPhong=" + loaiPhong + ", giaPhong=" + giaPhong + '}';
    }
    
}
