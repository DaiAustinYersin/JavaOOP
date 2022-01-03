/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai10;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DaiAustinYersin
 */
public class PhuongThuc {
    
    public int diemSoTu(String str) {
        return str.length();
    }
    
    public int diemSoKyTu_A(String str) {
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }
        return (int) list.stream().filter(n -> n.equals('a') || n.equals('A')).count();
    }
    
    public String chuanHoaVanBan(String str) {
        return str.trim().replaceAll(" +", " ");
    }
    
}
