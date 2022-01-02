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
public class PhongC extends Phong {
    
    public PhongC() {
        super('C', 100);
    }

    @Override
    public String toString() {
        return "PhongC{" + "loaiPhong=" + loaiPhong + ", giaPhong=" + giaPhong + '}';
    }
    
}
