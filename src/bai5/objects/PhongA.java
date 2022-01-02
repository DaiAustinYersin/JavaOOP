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
public class PhongA extends Phong {
    
    public PhongA() {
        super('A', 500);
    }

    @Override
    public String toString() {
        return "PhongA{" + "loaiPhong=" + loaiPhong + ", giaPhong=" + giaPhong + '}';
    }
    
}
