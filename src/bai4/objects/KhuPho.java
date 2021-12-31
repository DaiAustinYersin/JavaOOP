/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4.objects;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DaiAustinYersin
 */
public class KhuPho {
    
    List<HoGiaDinh> listHoGD;

    public KhuPho() {
        listHoGD = new ArrayList<>();
    }

    public List<HoGiaDinh> getListHoGD() {
        return listHoGD;
    }

    public void setListHoGD(List<HoGiaDinh> listHoGD) {
        this.listHoGD = listHoGD;
    }
    
    public void themHoGD(HoGiaDinh hgd) {
        listHoGD.add(hgd);
    }
    
}
