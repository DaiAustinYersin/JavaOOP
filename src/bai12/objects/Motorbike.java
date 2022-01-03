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
public class Motorbike extends Vehicle {

    private double wattage;

    public Motorbike(double wattage, String ID, String manufacturer, int manufactureYear, double price, String color) {
        super(ID, manufacturer, manufactureYear, price, color);
        this.wattage = wattage;
    }

    public double getWattage() {
        return wattage;
    }

    public void setWattage(double wattage) {
        this.wattage = wattage;
    }

    @Override
    public String toString() {
        return "Motorbike{" + "ID=" + ID + ", manufacturer=" + manufacturer + ", manufactureYear=" + manufactureYear + ", price=" + price + ", color=" + color + ", wattage=" + wattage + '}';
    }

}
