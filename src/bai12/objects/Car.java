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
public class Car extends Vehicle {

    private int seatNum;
    private String engineType;

    public Car(int seatNum, String engineType, String ID, String manufacturer, int manufactureYear, double price, String color) {
        super(ID, manufacturer, manufactureYear, price, color);
        this.seatNum = seatNum;
        this.engineType = engineType;
    }

    public int getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(int seatNum) {
        this.seatNum = seatNum;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Car{" + "ID=" + ID + ", manufacturer=" + manufacturer + ", manufactureYear=" + manufactureYear + ", price=" + price + ", color=" + color + ", seatNum=" + seatNum + ", engineType=" + engineType + '}';
    }

}
