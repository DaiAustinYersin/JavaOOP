/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai12.objects;

/**
 *
 * @author DaiAustinYersin
 */
public class Truck extends Vehicle {

    private String referee;

    public Truck(String referee, String ID, String manufacturer, int manufactureYear, double price, String color) {
        super(ID, manufacturer, manufactureYear, price, color);
        this.referee = referee;
    }

    public String getReferee() {
        return referee;
    }

    public void setReferee(String referee) {
        this.referee = referee;
    }

    @Override
    public String toString() {
        return "Truck{" + "ID=" + ID + ", manufacturer=" + manufacturer + ", manufactureYear=" + manufactureYear + ", price=" + price + ", color=" + color + ", referee=" + referee + '}';
    }

}
